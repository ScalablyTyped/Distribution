package typings.onfleetNodeOnfleet.resourcesTasksMod

import typings.onfleetNodeOnfleet.anon.Captured
import typings.onfleetNodeOnfleet.anon.Checksum
import typings.onfleetNodeOnfleet.anon.RecipientName
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.resourcesDestinationsMod.OnfleetDestination
import typings.onfleetNodeOnfleet.resourcesRecipientsMod.OnfleetRecipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnfleetTask extends StObject {
  
  var barcodes: js.UndefOr[Captured] = js.undefined
  
  var completeAfter: Double
  
  var completeBefore: Double
  
  var completionDetails: TaskCompletionDetails
  
  var container: TaskContainer
  
  var creator: String
  
  var dependencies: js.Array[String]
  
  var destination: OnfleetDestination
  
  var didAutoAssign: Boolean
  
  var executor: String
  
  var feedback: js.Array[Any]
  
  var id: String
  
  var identity: Checksum
  
  var merchant: String
  
  var metadata: js.Array[OnfleetMetadata]
  
  var notes: String
  
  var organization: String
  
  var overrides: RecipientName
  
  var pickupTask: Boolean
  
  var quantity: Double
  
  var recipients: js.Array[OnfleetRecipient]
  
  var serviceTime: Double
  
  var shortId: String
  
  var state: TaskState
  
  var timeCreated: Double
  
  var timeLastModified: Double
  
  var trackingURL: String
  
  var trackingViewed: Boolean
  
  var worker: String | Null
}
object OnfleetTask {
  
  inline def apply(
    completeAfter: Double,
    completeBefore: Double,
    completionDetails: TaskCompletionDetails,
    container: TaskContainer,
    creator: String,
    dependencies: js.Array[String],
    destination: OnfleetDestination,
    didAutoAssign: Boolean,
    executor: String,
    feedback: js.Array[Any],
    id: String,
    identity: Checksum,
    merchant: String,
    metadata: js.Array[OnfleetMetadata],
    notes: String,
    organization: String,
    overrides: RecipientName,
    pickupTask: Boolean,
    quantity: Double,
    recipients: js.Array[OnfleetRecipient],
    serviceTime: Double,
    shortId: String,
    state: TaskState,
    timeCreated: Double,
    timeLastModified: Double,
    trackingURL: String,
    trackingViewed: Boolean
  ): OnfleetTask = {
    val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any], worker = null)
    __obj.asInstanceOf[OnfleetTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnfleetTask] (val x: Self) extends AnyVal {
    
    inline def setBarcodes(value: Captured): Self = StObject.set(x, "barcodes", value.asInstanceOf[js.Any])
    
    inline def setBarcodesUndefined: Self = StObject.set(x, "barcodes", js.undefined)
    
    inline def setCompleteAfter(value: Double): Self = StObject.set(x, "completeAfter", value.asInstanceOf[js.Any])
    
    inline def setCompleteBefore(value: Double): Self = StObject.set(x, "completeBefore", value.asInstanceOf[js.Any])
    
    inline def setCompletionDetails(value: TaskCompletionDetails): Self = StObject.set(x, "completionDetails", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: TaskContainer): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDestination(value: OnfleetDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDidAutoAssign(value: Boolean): Self = StObject.set(x, "didAutoAssign", value.asInstanceOf[js.Any])
    
    inline def setExecutor(value: String): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
    
    inline def setFeedback(value: js.Array[Any]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackVarargs(value: Any*): Self = StObject.set(x, "feedback", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: Checksum): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setMerchant(value: String): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: RecipientName): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setPickupTask(value: Boolean): Self = StObject.set(x, "pickupTask", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setRecipients(value: js.Array[OnfleetRecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsVarargs(value: OnfleetRecipient*): Self = StObject.set(x, "recipients", js.Array(value*))
    
    inline def setServiceTime(value: Double): Self = StObject.set(x, "serviceTime", value.asInstanceOf[js.Any])
    
    inline def setShortId(value: String): Self = StObject.set(x, "shortId", value.asInstanceOf[js.Any])
    
    inline def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
    
    inline def setTrackingURL(value: String): Self = StObject.set(x, "trackingURL", value.asInstanceOf[js.Any])
    
    inline def setTrackingViewed(value: Boolean): Self = StObject.set(x, "trackingViewed", value.asInstanceOf[js.Any])
    
    inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerNull: Self = StObject.set(x, "worker", null)
  }
}
