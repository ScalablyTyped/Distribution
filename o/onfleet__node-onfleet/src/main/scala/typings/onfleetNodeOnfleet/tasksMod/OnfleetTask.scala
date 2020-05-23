package typings.onfleetNodeOnfleet.tasksMod

import typings.onfleetNodeOnfleet.anon.Actions
import typings.onfleetNodeOnfleet.anon.Checksum
import typings.onfleetNodeOnfleet.anon.Organization
import typings.onfleetNodeOnfleet.anon.RecipientName
import typings.onfleetNodeOnfleet.destinationsMod.OnfleetDestination
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.recipientsMod.OnfleetRecipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetTask extends js.Object {
  var completeAfter: Double
  var completeBefore: Double
  var completionDetails: Actions
  var container: Organization
  var creator: String
  var dependencies: js.Array[String]
  var destination: OnfleetDestination
  var didAutoAssign: Boolean
  var executor: String
  var feedback: js.Array[_]
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
    completionDetails: Actions,
    container: Organization,
    creator: String,
    dependencies: js.Array[String],
    destination: OnfleetDestination,
    didAutoAssign: Boolean,
    executor: String,
    feedback: js.Array[_],
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
    state: Double,
    timeCreated: Double,
    timeLastModified: Double,
    trackingURL: String,
    trackingViewed: Boolean,
    worker: String = null
  ): OnfleetTask = {
    val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetTask]
  }
}

