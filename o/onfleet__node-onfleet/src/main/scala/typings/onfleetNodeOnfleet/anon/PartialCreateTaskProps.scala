package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.recipientsMod.CreateRecipientProps
import typings.onfleetNodeOnfleet.tasksMod.Barcode
import typings.onfleetNodeOnfleet.tasksMod.TaskAutoAssign
import typings.onfleetNodeOnfleet.tasksMod.TaskCompletionRequirements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Tasks.CreateTaskProps> */
trait PartialCreateTaskProps extends StObject {
  
  var autoAssign: js.UndefOr[TaskAutoAssign] = js.undefined
  
  var barcodes: js.UndefOr[js.Array[Barcode]] = js.undefined
  
  var capacity: js.UndefOr[Double] = js.undefined
  
  var completeAfter: js.UndefOr[Double] = js.undefined
  
  var completeBefore: js.UndefOr[Double] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var destination: js.UndefOr[String | CreateDestinationProps] = js.undefined
  
  var executor: js.UndefOr[String] = js.undefined
  
  var merchant: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var pickupTask: js.UndefOr[Boolean] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var recipientName: js.UndefOr[String] = js.undefined
  
  var recipientNotes: js.UndefOr[String] = js.undefined
  
  var recipientSkipSMSNotifications: js.UndefOr[Boolean] = js.undefined
  
  var recipients: js.UndefOr[js.Array[CreateRecipientProps | String]] = js.undefined
  
  var requirements: js.UndefOr[TaskCompletionRequirements] = js.undefined
}
object PartialCreateTaskProps {
  
  @scala.inline
  def apply(): PartialCreateTaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateTaskProps]
  }
  
  @scala.inline
  implicit class PartialCreateTaskPropsMutableBuilder[Self <: PartialCreateTaskProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoAssign(value: TaskAutoAssign): Self = StObject.set(x, "autoAssign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAssignUndefined: Self = StObject.set(x, "autoAssign", js.undefined)
    
    @scala.inline
    def setBarcodes(value: js.Array[Barcode]): Self = StObject.set(x, "barcodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarcodesUndefined: Self = StObject.set(x, "barcodes", js.undefined)
    
    @scala.inline
    def setBarcodesVarargs(value: Barcode*): Self = StObject.set(x, "barcodes", js.Array(value :_*))
    
    @scala.inline
    def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    @scala.inline
    def setCompleteAfter(value: Double): Self = StObject.set(x, "completeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteAfterUndefined: Self = StObject.set(x, "completeAfter", js.undefined)
    
    @scala.inline
    def setCompleteBefore(value: Double): Self = StObject.set(x, "completeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteBeforeUndefined: Self = StObject.set(x, "completeBefore", js.undefined)
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDestination(value: String | CreateDestinationProps): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setExecutor(value: String): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutorUndefined: Self = StObject.set(x, "executor", js.undefined)
    
    @scala.inline
    def setMerchant(value: String): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantUndefined: Self = StObject.set(x, "merchant", js.undefined)
    
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
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNameUndefined: Self = StObject.set(x, "recipientName", js.undefined)
    
    @scala.inline
    def setRecipientNotes(value: String): Self = StObject.set(x, "recipientNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNotesUndefined: Self = StObject.set(x, "recipientNotes", js.undefined)
    
    @scala.inline
    def setRecipientSkipSMSNotifications(value: Boolean): Self = StObject.set(x, "recipientSkipSMSNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientSkipSMSNotificationsUndefined: Self = StObject.set(x, "recipientSkipSMSNotifications", js.undefined)
    
    @scala.inline
    def setRecipients(value: js.Array[CreateRecipientProps | String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: (CreateRecipientProps | String)*): Self = StObject.set(x, "recipients", js.Array(value :_*))
    
    @scala.inline
    def setRequirements(value: TaskCompletionRequirements): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
  }
}
