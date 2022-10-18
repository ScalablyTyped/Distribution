package typings.onfleetNodeOnfleet.resourcesTasksMod

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.resourcesDestinationsMod.CreateDestinationProps
import typings.onfleetNodeOnfleet.resourcesRecipientsMod.CreateRecipientProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTaskProps extends StObject {
  
  var autoAssign: js.UndefOr[TaskAutoAssign] = js.undefined
  
  var barcodes: js.UndefOr[js.Array[Barcode]] = js.undefined
  
  var capacity: js.UndefOr[Double] = js.undefined
  
  var completeAfter: js.UndefOr[Double] = js.undefined
  
  var completeBefore: js.UndefOr[Double] = js.undefined
  
  var container: js.UndefOr[TaskContainer] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var destination: String | CreateDestinationProps
  
  var executor: js.UndefOr[String] = js.undefined
  
  var merchant: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var pickupTask: js.UndefOr[Boolean] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var recipientName: js.UndefOr[String] = js.undefined
  
  var recipientNotes: js.UndefOr[String] = js.undefined
  
  var recipientSkipSMSNotifications: js.UndefOr[Boolean] = js.undefined
  
  var recipients: js.Array[CreateRecipientProps | String]
  
  var requirements: js.UndefOr[TaskCompletionRequirements] = js.undefined
}
object CreateTaskProps {
  
  inline def apply(destination: String | CreateDestinationProps, recipients: js.Array[CreateRecipientProps | String]): CreateTaskProps = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskProps]
  }
  
  extension [Self <: CreateTaskProps](x: Self) {
    
    inline def setAutoAssign(value: TaskAutoAssign): Self = StObject.set(x, "autoAssign", value.asInstanceOf[js.Any])
    
    inline def setAutoAssignUndefined: Self = StObject.set(x, "autoAssign", js.undefined)
    
    inline def setBarcodes(value: js.Array[Barcode]): Self = StObject.set(x, "barcodes", value.asInstanceOf[js.Any])
    
    inline def setBarcodesUndefined: Self = StObject.set(x, "barcodes", js.undefined)
    
    inline def setBarcodesVarargs(value: Barcode*): Self = StObject.set(x, "barcodes", js.Array(value*))
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setCompleteAfter(value: Double): Self = StObject.set(x, "completeAfter", value.asInstanceOf[js.Any])
    
    inline def setCompleteAfterUndefined: Self = StObject.set(x, "completeAfter", js.undefined)
    
    inline def setCompleteBefore(value: Double): Self = StObject.set(x, "completeBefore", value.asInstanceOf[js.Any])
    
    inline def setCompleteBeforeUndefined: Self = StObject.set(x, "completeBefore", js.undefined)
    
    inline def setContainer(value: TaskContainer): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDestination(value: String | CreateDestinationProps): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setExecutor(value: String): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
    
    inline def setExecutorUndefined: Self = StObject.set(x, "executor", js.undefined)
    
    inline def setMerchant(value: String): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
    
    inline def setMerchantUndefined: Self = StObject.set(x, "merchant", js.undefined)
    
    inline def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPickupTask(value: Boolean): Self = StObject.set(x, "pickupTask", value.asInstanceOf[js.Any])
    
    inline def setPickupTaskUndefined: Self = StObject.set(x, "pickupTask", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    inline def setRecipientNameUndefined: Self = StObject.set(x, "recipientName", js.undefined)
    
    inline def setRecipientNotes(value: String): Self = StObject.set(x, "recipientNotes", value.asInstanceOf[js.Any])
    
    inline def setRecipientNotesUndefined: Self = StObject.set(x, "recipientNotes", js.undefined)
    
    inline def setRecipientSkipSMSNotifications(value: Boolean): Self = StObject.set(x, "recipientSkipSMSNotifications", value.asInstanceOf[js.Any])
    
    inline def setRecipientSkipSMSNotificationsUndefined: Self = StObject.set(x, "recipientSkipSMSNotifications", js.undefined)
    
    inline def setRecipients(value: js.Array[CreateRecipientProps | String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsVarargs(value: (CreateRecipientProps | String)*): Self = StObject.set(x, "recipients", js.Array(value*))
    
    inline def setRequirements(value: TaskCompletionRequirements): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
  }
}
