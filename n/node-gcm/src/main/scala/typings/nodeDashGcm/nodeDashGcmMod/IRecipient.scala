package typings.nodeDashGcm.nodeDashGcmMod

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
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (notificationKey != null) __obj.updateDynamic("notificationKey")(notificationKey)
    if (registrationIds != null) __obj.updateDynamic("registrationIds")(registrationIds)
    if (registrationTokens != null) __obj.updateDynamic("registrationTokens")(registrationTokens)
    if (to != null) __obj.updateDynamic("to")(to)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[IRecipient]
  }
}

