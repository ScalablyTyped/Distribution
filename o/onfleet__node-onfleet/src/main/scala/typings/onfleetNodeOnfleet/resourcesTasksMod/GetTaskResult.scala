package typings.onfleetNodeOnfleet.resourcesTasksMod

import typings.onfleetNodeOnfleet.anon.Checksum
import typings.onfleetNodeOnfleet.anon.RecipientName
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.resourcesDestinationsMod.OnfleetDestination
import typings.onfleetNodeOnfleet.resourcesRecipientsMod.OnfleetRecipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTaskResult
  extends StObject
     with OnfleetTask {
  
  var estimatedCompletionTime: Double | Null
  
  var eta: Double | Null
}
object GetTaskResult {
  
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
  ): GetTaskResult = {
    val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any], estimatedCompletionTime = null, eta = null, worker = null)
    __obj.asInstanceOf[GetTaskResult]
  }
  
  extension [Self <: GetTaskResult](x: Self) {
    
    inline def setEstimatedCompletionTime(value: Double): Self = StObject.set(x, "estimatedCompletionTime", value.asInstanceOf[js.Any])
    
    inline def setEstimatedCompletionTimeNull: Self = StObject.set(x, "estimatedCompletionTime", null)
    
    inline def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    
    inline def setEtaNull: Self = StObject.set(x, "eta", null)
  }
}
