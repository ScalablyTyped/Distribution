package typings.nodeGcm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRecipient extends js.Object {
  var condition: js.UndefOr[String] = js.undefined
  var notificationKey: js.UndefOr[String] = js.undefined
  var registrationIds: js.UndefOr[js.Array[String]] = js.undefined
  var registrationTokens: js.UndefOr[js.Array[String]] = js.undefined
  var to: js.UndefOr[String] = js.undefined
  var topic: js.UndefOr[String] = js.undefined
}

object IRecipient {
  @scala.inline
  def apply(
    condition: String = null,
    notificationKey: String = null,
    registrationIds: js.Array[String] = null,
    registrationTokens: js.Array[String] = null,
    to: String = null,
    topic: String = null
  ): IRecipient = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (notificationKey != null) __obj.updateDynamic("notificationKey")(notificationKey.asInstanceOf[js.Any])
    if (registrationIds != null) __obj.updateDynamic("registrationIds")(registrationIds.asInstanceOf[js.Any])
    if (registrationTokens != null) __obj.updateDynamic("registrationTokens")(registrationTokens.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecipient]
  }
}

