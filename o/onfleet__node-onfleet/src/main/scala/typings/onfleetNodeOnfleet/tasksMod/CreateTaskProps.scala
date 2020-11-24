package typings.onfleetNodeOnfleet.tasksMod

import typings.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.recipientsMod.CreateRecipientProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTaskProps extends js.Object {
  
  var autoAssign: js.UndefOr[TaskAutoAssign] = js.native
  
  var barcodes: js.UndefOr[js.Array[Barcode]] = js.native
  
  var capacity: js.UndefOr[Double] = js.native
  
  var completeAfter: js.UndefOr[Double] = js.native
  
  var completeBefore: js.UndefOr[Double] = js.native
  
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  
  var destination: String | CreateDestinationProps = js.native
  
  var executor: js.UndefOr[String] = js.native
  
  var merchant: js.UndefOr[String] = js.native
  
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.native
  
  var notes: js.UndefOr[String] = js.native
  
  var pickupTask: js.UndefOr[Boolean] = js.native
  
  var quantity: js.UndefOr[Double] = js.native
  
  var recipientName: js.UndefOr[String] = js.native
  
  var recipientNotes: js.UndefOr[String] = js.native
  
  var recipientSkipSMSNotifications: js.UndefOr[Boolean] = js.native
  
  var recipients: js.Array[CreateRecipientProps | String] = js.native
  
  var requirements: js.UndefOr[TaskCompletionRequirements] = js.native
}
object CreateTaskProps {
  
  @scala.inline
  def apply(destination: String | CreateDestinationProps, recipients: js.Array[CreateRecipientProps | String]): CreateTaskProps = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskProps]
  }
  
  @scala.inline
  implicit class CreateTaskPropsOps[Self <: CreateTaskProps] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: String | CreateDestinationProps): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsVarargs(value: (CreateRecipientProps | String)*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[CreateRecipientProps | String]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAssign(value: TaskAutoAssign): Self = this.set("autoAssign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAssign: Self = this.set("autoAssign", js.undefined)
    
    @scala.inline
    def setBarcodesVarargs(value: Barcode*): Self = this.set("barcodes", js.Array(value :_*))
    
    @scala.inline
    def setBarcodes(value: js.Array[Barcode]): Self = this.set("barcodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarcodes: Self = this.set("barcodes", js.undefined)
    
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    
    @scala.inline
    def setCompleteAfter(value: Double): Self = this.set("completeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteAfter: Self = this.set("completeAfter", js.undefined)
    
    @scala.inline
    def setCompleteBefore(value: Double): Self = this.set("completeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteBefore: Self = this.set("completeBefore", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setExecutor(value: String): Self = this.set("executor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutor: Self = this.set("executor", js.undefined)
    
    @scala.inline
    def setMerchant(value: String): Self = this.set("merchant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchant: Self = this.set("merchant", js.undefined)
    
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
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setRecipientName(value: String): Self = this.set("recipientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientName: Self = this.set("recipientName", js.undefined)
    
    @scala.inline
    def setRecipientNotes(value: String): Self = this.set("recipientNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientNotes: Self = this.set("recipientNotes", js.undefined)
    
    @scala.inline
    def setRecipientSkipSMSNotifications(value: Boolean): Self = this.set("recipientSkipSMSNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientSkipSMSNotifications: Self = this.set("recipientSkipSMSNotifications", js.undefined)
    
    @scala.inline
    def setRequirements(value: TaskCompletionRequirements): Self = this.set("requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequirements: Self = this.set("requirements", js.undefined)
  }
}
