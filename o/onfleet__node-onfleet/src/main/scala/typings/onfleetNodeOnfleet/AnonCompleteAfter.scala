package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.recipientsMod.OnfleetRecipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleteAfter extends js.Object {
  var completeAfter: js.UndefOr[Double] = js.undefined
  var completeBefore: js.UndefOr[Double] = js.undefined
  var destination: js.UndefOr[String | CreateDestinationProps] = js.undefined
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var pickupTask: js.UndefOr[Boolean] = js.undefined
  var recipients: js.UndefOr[OnfleetRecipient | js.Array[OnfleetRecipient]] = js.undefined
  var serviceTime: js.UndefOr[Double] = js.undefined
}

object AnonCompleteAfter {
  @scala.inline
  def apply(
    completeAfter: Int | Double = null,
    completeBefore: Int | Double = null,
    destination: String | CreateDestinationProps = null,
    metadata: js.Array[OnfleetMetadata] = null,
    notes: String = null,
    pickupTask: js.UndefOr[Boolean] = js.undefined,
    recipients: OnfleetRecipient | js.Array[OnfleetRecipient] = null,
    serviceTime: Int | Double = null
  ): AnonCompleteAfter = {
    val __obj = js.Dynamic.literal()
    if (completeAfter != null) __obj.updateDynamic("completeAfter")(completeAfter.asInstanceOf[js.Any])
    if (completeBefore != null) __obj.updateDynamic("completeBefore")(completeBefore.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(pickupTask)) __obj.updateDynamic("pickupTask")(pickupTask.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (serviceTime != null) __obj.updateDynamic("serviceTime")(serviceTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompleteAfter]
  }
}

