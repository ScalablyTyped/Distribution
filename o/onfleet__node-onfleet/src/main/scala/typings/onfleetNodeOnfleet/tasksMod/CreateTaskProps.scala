package typings.onfleetNodeOnfleet.tasksMod

import typings.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.recipientsMod.CreateRecipientProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaskProps extends js.Object {
  var autoAssign: js.UndefOr[TaskAutoAssign] = js.undefined
  var capacity: js.UndefOr[Double] = js.undefined
  var completeAfter: js.UndefOr[Double] = js.undefined
  var completeBefore: js.UndefOr[Double] = js.undefined
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
  @scala.inline
  def apply(
    destination: String | CreateDestinationProps,
    recipients: js.Array[CreateRecipientProps | String],
    autoAssign: TaskAutoAssign = null,
    capacity: js.UndefOr[Double] = js.undefined,
    completeAfter: js.UndefOr[Double] = js.undefined,
    completeBefore: js.UndefOr[Double] = js.undefined,
    dependencies: js.Array[String] = null,
    executor: String = null,
    merchant: String = null,
    metadata: js.Array[OnfleetMetadata] = null,
    notes: String = null,
    pickupTask: js.UndefOr[Boolean] = js.undefined,
    quantity: js.UndefOr[Double] = js.undefined,
    recipientName: String = null,
    recipientNotes: String = null,
    recipientSkipSMSNotifications: js.UndefOr[Boolean] = js.undefined,
    requirements: TaskCompletionRequirements = null
  ): CreateTaskProps = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any])
    if (autoAssign != null) __obj.updateDynamic("autoAssign")(autoAssign.asInstanceOf[js.Any])
    if (!js.isUndefined(capacity)) __obj.updateDynamic("capacity")(capacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(completeAfter)) __obj.updateDynamic("completeAfter")(completeAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(completeBefore)) __obj.updateDynamic("completeBefore")(completeBefore.get.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (executor != null) __obj.updateDynamic("executor")(executor.asInstanceOf[js.Any])
    if (merchant != null) __obj.updateDynamic("merchant")(merchant.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(pickupTask)) __obj.updateDynamic("pickupTask")(pickupTask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (recipientName != null) __obj.updateDynamic("recipientName")(recipientName.asInstanceOf[js.Any])
    if (recipientNotes != null) __obj.updateDynamic("recipientNotes")(recipientNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(recipientSkipSMSNotifications)) __obj.updateDynamic("recipientSkipSMSNotifications")(recipientSkipSMSNotifications.get.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskProps]
  }
}

