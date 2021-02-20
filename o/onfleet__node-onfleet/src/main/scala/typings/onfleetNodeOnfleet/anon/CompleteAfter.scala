package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.recipientsMod.OnfleetRecipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteAfter extends StObject {
  
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
  implicit class CompleteAfterMutableBuilder[Self <: CompleteAfter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleteAfter(value: Double): Self = StObject.set(x, "completeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteAfterUndefined: Self = StObject.set(x, "completeAfter", js.undefined)
    
    @scala.inline
    def setCompleteBefore(value: Double): Self = StObject.set(x, "completeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteBeforeUndefined: Self = StObject.set(x, "completeBefore", js.undefined)
    
    @scala.inline
    def setDestination(value: String | CreateDestinationProps): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPickupTask(value: Boolean): Self = StObject.set(x, "pickupTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickupTaskUndefined: Self = StObject.set(x, "pickupTask", js.undefined)
    
    @scala.inline
    def setRecipients(value: OnfleetRecipient | js.Array[OnfleetRecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: OnfleetRecipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
    
    @scala.inline
    def setServiceTime(value: Double): Self = StObject.set(x, "serviceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceTimeUndefined: Self = StObject.set(x, "serviceTime", js.undefined)
  }
}
