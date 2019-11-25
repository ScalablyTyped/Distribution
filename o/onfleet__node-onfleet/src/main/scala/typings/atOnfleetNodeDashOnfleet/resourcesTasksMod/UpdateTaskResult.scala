package typings.atOnfleetNodeDashOnfleet.resourcesTasksMod

import typings.atOnfleetNodeDashOnfleet.Anon_Actions
import typings.atOnfleetNodeDashOnfleet.Anon_Checksum
import typings.atOnfleetNodeDashOnfleet.Anon_Organization
import typings.atOnfleetNodeDashOnfleet.Anon_RecipientName
import typings.atOnfleetNodeDashOnfleet.metadataMod.OnfleetMetadata
import typings.atOnfleetNodeDashOnfleet.resourcesDestinationsMod.OnfleetDestination
import typings.atOnfleetNodeDashOnfleet.resourcesRecipientsMod.OnfleetRecipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTaskResult extends OnfleetTask {
  var estimatedArrivalTime: Double | Null
  var estimatedCompletionTime: Double | Null
  var eta: Double
}

object UpdateTaskResult {
  @scala.inline
  def apply(
    completeAfter: Double,
    completeBefore: Double,
    completionDetails: Anon_Actions,
    container: Anon_Organization,
    creator: String,
    dependencies: js.Array[String],
    destination: OnfleetDestination,
    didAutoAssign: Boolean,
    eta: Double,
    executor: String,
    feedback: js.Array[_],
    id: String,
    identity: Anon_Checksum,
    merchant: String,
    metadata: js.Array[OnfleetMetadata],
    notes: String,
    organization: String,
    overrides: Anon_RecipientName,
    pickupTask: Boolean,
    quantity: Double,
    recipients: js.Array[OnfleetRecipient],
    serviceTime: Double,
    shortId: String,
    state: Double,
    timeCreated: Double,
    timeLastModified: Double,
    trackingURL: String,
    trackingViewed: Boolean,
    estimatedArrivalTime: Int | Double = null,
    estimatedCompletionTime: Int | Double = null,
    worker: String = null
  ): UpdateTaskResult = {
    val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any])
    if (estimatedArrivalTime != null) __obj.updateDynamic("estimatedArrivalTime")(estimatedArrivalTime.asInstanceOf[js.Any])
    if (estimatedCompletionTime != null) __obj.updateDynamic("estimatedCompletionTime")(estimatedCompletionTime.asInstanceOf[js.Any])
    if (worker != null) __obj.updateDynamic("worker")(worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskResult]
  }
}

