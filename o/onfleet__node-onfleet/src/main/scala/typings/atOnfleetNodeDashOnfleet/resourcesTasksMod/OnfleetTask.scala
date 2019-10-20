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

trait OnfleetTask extends js.Object {
  var completeAfter: Double
  var completeBefore: Double
  var completionDetails: Anon_Actions
  var container: Anon_Organization
  var creator: String
  var dependencies: js.Array[String]
  var destination: OnfleetDestination
  var didAutoAssign: Boolean
  var executor: String
  var feedback: js.Array[_]
  var id: String
  var identity: Anon_Checksum
  var merchant: String
  var metadata: js.Array[OnfleetMetadata]
  var notes: String
  var organization: String
  var overrides: Anon_RecipientName
  var pickupTask: Boolean
  var quantity: Double
  var recipients: js.Array[OnfleetRecipient]
  var serviceTime: Double
  var shortId: String
  var state: Double
  var timeCreated: Double
  var timeLastModified: Double
  var trackingURL: String
  var trackingViewed: Boolean
  var worker: String | Null
}

object OnfleetTask {
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
    worker: String = null
  ): OnfleetTask = {
    val __obj = js.Dynamic.literal(completeAfter = completeAfter, completeBefore = completeBefore, completionDetails = completionDetails, container = container, creator = creator, dependencies = dependencies, destination = destination, didAutoAssign = didAutoAssign, executor = executor, feedback = feedback, id = id, identity = identity, merchant = merchant, metadata = metadata, notes = notes, organization = organization, overrides = overrides, pickupTask = pickupTask, quantity = quantity, recipients = recipients, serviceTime = serviceTime, shortId = shortId, state = state, timeCreated = timeCreated, timeLastModified = timeLastModified, trackingURL = trackingURL, trackingViewed = trackingViewed)
    if (worker != null) __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[OnfleetTask]
  }
}

