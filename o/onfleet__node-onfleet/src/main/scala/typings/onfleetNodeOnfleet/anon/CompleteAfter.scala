package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.recipientsMod.OnfleetRecipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteAfter extends js.Object {
  
  var completeAfter: js.UndefOr[Double] = js.native
  
  var completeBefore: js.UndefOr[Double] = js.native
  
  var destination: js.UndefOr[String | CreateDestinationProps] = js.native
  
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.native
  
  var notes: js.UndefOr[String] = js.native
  
  var pickupTask: js.UndefOr[Boolean] = js.native
  
  var recipients: js.UndefOr[OnfleetRecipient | js.Array[OnfleetRecipient]] = js.native
  
  var serviceTime: js.UndefOr[Double] = js.native
}
object CompleteAfter {
  
  @scala.inline
  def apply(): CompleteAfter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteAfter]
  }
  
  @scala.inline
  implicit class CompleteAfterOps[Self <: CompleteAfter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompleteAfter(value: Double): Self = this.set("completeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteAfter: Self = this.set("completeAfter", js.undefined)
    
    @scala.inline
    def setCompleteBefore(value: Double): Self = this.set("completeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteBefore: Self = this.set("completeBefore", js.undefined)
    
    @scala.inline
    def setDestination(value: String | CreateDestinationProps): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setMetadataVarargs(value: OnfleetMetadata*): Self = this.set("metadata", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: js.Array[OnfleetMetadata]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setPickupTask(value: Boolean): Self = this.set("pickupTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupTask: Self = this.set("pickupTask", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: OnfleetRecipient*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: OnfleetRecipient | js.Array[OnfleetRecipient]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setServiceTime(value: Double): Self = this.set("serviceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceTime: Self = this.set("serviceTime", js.undefined)
  }
}
