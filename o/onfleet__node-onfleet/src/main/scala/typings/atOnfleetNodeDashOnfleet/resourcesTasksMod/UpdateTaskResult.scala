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
    val __obj = js.Dynamic.literal(completeAfter = completeAfter, completeBefore = completeBefore, completionDetails = completionDetails, container = container, creator = creator, dependencies = dependencies, destination = destination, didAutoAssign = didAutoAssign, eta = eta, executor = executor, feedback = feedback, id = id, identity = identity, merchant = merchant, metadata = metadata, notes = notes, organization = organization, overrides = overrides, pickupTask = pickupTask, quantity = quantity, recipients = recipients, serviceTime = serviceTime, shortId = shortId, state = state, timeCreated = timeCreated, timeLastModified = timeLastModified, trackingURL = trackingURL, trackingViewed = trackingViewed)
    if (estimatedArrivalTime != null) __obj.updateDynamic("estimatedArrivalTime")(estimatedArrivalTime.asInstanceOf[js.Any])
    if (estimatedCompletionTime != null) __obj.updateDynamic("estimatedCompletionTime")(estimatedCompletionTime.asInstanceOf[js.Any])
    if (worker != null) __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[UpdateTaskResult]
  }
}

