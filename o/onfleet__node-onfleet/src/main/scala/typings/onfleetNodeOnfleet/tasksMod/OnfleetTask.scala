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

@js.native
trait OnfleetTask extends js.Object {
  var completeAfter: Double = js.native
  var completeBefore: Double = js.native
  var completionDetails: Actions = js.native
  var container: Organization = js.native
  var creator: String = js.native
  var dependencies: js.Array[String] = js.native
  var destination: OnfleetDestination = js.native
  var didAutoAssign: Boolean = js.native
  var executor: String = js.native
  var feedback: js.Array[_] = js.native
  var id: String = js.native
  var identity: Checksum = js.native
  var merchant: String = js.native
  var metadata: js.Array[OnfleetMetadata] = js.native
  var notes: String = js.native
  var organization: String = js.native
  var overrides: RecipientName = js.native
  var pickupTask: Boolean = js.native
  var quantity: Double = js.native
  var recipients: js.Array[OnfleetRecipient] = js.native
  var serviceTime: Double = js.native
  var shortId: String = js.native
  var state: Double = js.native
  var timeCreated: Double = js.native
  var timeLastModified: Double = js.native
  var trackingURL: String = js.native
  var trackingViewed: Boolean = js.native
  var worker: String | Null = js.native
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
    trackingViewed: Boolean
  ): OnfleetTask = {
    val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetTask]
  }
  @scala.inline
  implicit class OnfleetTaskOps[Self <: OnfleetTask] (val x: Self) extends AnyVal {
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
    def setCompleteAfter(value: Double): Self = this.set("completeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompleteBefore(value: Double): Self = this.set("completeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompletionDetails(value: Actions): Self = this.set("completionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: Organization): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: String): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: OnfleetDestination): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setDidAutoAssign(value: Boolean): Self = this.set("didAutoAssign", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutor(value: String): Self = this.set("executor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeedbackVarargs(value: js.Any*): Self = this.set("feedback", js.Array(value :_*))
    @scala.inline
    def setFeedback(value: js.Array[_]): Self = this.set("feedback", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Checksum): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerchant(value: String): Self = this.set("merchant", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataVarargs(value: OnfleetMetadata*): Self = this.set("metadata", js.Array(value :_*))
    @scala.inline
    def setMetadata(value: js.Array[OnfleetMetadata]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrides(value: RecipientName): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def setPickupTask(value: Boolean): Self = this.set("pickupTask", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipientsVarargs(value: OnfleetRecipient*): Self = this.set("recipients", js.Array(value :_*))
    @scala.inline
    def setRecipients(value: js.Array[OnfleetRecipient]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceTime(value: Double): Self = this.set("serviceTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortId(value: String): Self = this.set("shortId", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeCreated(value: Double): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeLastModified(value: Double): Self = this.set("timeLastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackingURL(value: String): Self = this.set("trackingURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackingViewed(value: Boolean): Self = this.set("trackingViewed", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorker(value: String): Self = this.set("worker", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkerNull: Self = this.set("worker", null)
  }
  
}

