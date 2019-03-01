package typings
package nodeDashGcmLib.nodeDashGcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRecipient extends js.Object {
  var condition: js.UndefOr[java.lang.String] = js.undefined
  var notificationKey: js.UndefOr[java.lang.String] = js.undefined
  var registrationIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var registrationTokens: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
  var topic: js.UndefOr[java.lang.String] = js.undefined
}

object IRecipient {
  @scala.inline
  def apply(
    condition: java.lang.String = null,
    notificationKey: java.lang.String = null,
    registrationIds: js.Array[java.lang.String] = null,
    registrationTokens: js.Array[java.lang.String] = null,
    to: java.lang.String = null,
    topic: java.lang.String = null
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

