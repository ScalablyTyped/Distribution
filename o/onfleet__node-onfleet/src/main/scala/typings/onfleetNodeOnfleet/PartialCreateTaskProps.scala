package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.recipientsMod.CreateRecipientProps
import typings.onfleetNodeOnfleet.tasksMod.TaskAutoAssign
import typings.onfleetNodeOnfleet.tasksMod.TaskCompletionRequirements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Tasks.CreateTaskProps> */
trait PartialCreateTaskProps extends js.Object {
  var autoAssign: js.UndefOr[TaskAutoAssign] = js.undefined
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
  def apply(
    autoAssign: TaskAutoAssign = null,
    capacity: Int | Double = null,
    completeAfter: Int | Double = null,
    completeBefore: Int | Double = null,
    dependencies: js.Array[String] = null,
    destination: String | CreateDestinationProps = null,
    executor: String = null,
    merchant: String = null,
    metadata: js.Array[OnfleetMetadata] = null,
    notes: String = null,
    pickupTask: js.UndefOr[Boolean] = js.undefined,
    quantity: Int | Double = null,
    recipientName: String = null,
    recipientNotes: String = null,
    recipientSkipSMSNotifications: js.UndefOr[Boolean] = js.undefined,
    recipients: js.Array[CreateRecipientProps | String] = null,
    requirements: TaskCompletionRequirements = null
  ): PartialCreateTaskProps = {
    val __obj = js.Dynamic.literal()
    if (autoAssign != null) __obj.updateDynamic("autoAssign")(autoAssign.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (completeAfter != null) __obj.updateDynamic("completeAfter")(completeAfter.asInstanceOf[js.Any])
    if (completeBefore != null) __obj.updateDynamic("completeBefore")(completeBefore.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (executor != null) __obj.updateDynamic("executor")(executor.asInstanceOf[js.Any])
    if (merchant != null) __obj.updateDynamic("merchant")(merchant.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(pickupTask)) __obj.updateDynamic("pickupTask")(pickupTask.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (recipientName != null) __obj.updateDynamic("recipientName")(recipientName.asInstanceOf[js.Any])
    if (recipientNotes != null) __obj.updateDynamic("recipientNotes")(recipientNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(recipientSkipSMSNotifications)) __obj.updateDynamic("recipientSkipSMSNotifications")(recipientSkipSMSNotifications.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCreateTaskProps]
  }
}

