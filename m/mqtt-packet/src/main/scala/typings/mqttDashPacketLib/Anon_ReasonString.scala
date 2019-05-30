package typings
package mqttDashPacketLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReasonString extends js.Object {
  var reasonString: js.UndefOr[java.lang.String] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
}

object Anon_ReasonString {
  @scala.inline
  def apply(reasonString: java.lang.String = null, userProperties: js.Object = null): Anon_ReasonString = {
    val __obj = js.Dynamic.literal()
    if (reasonString != null) __obj.updateDynamic("reasonString")(reasonString)
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties)
    __obj.asInstanceOf[Anon_ReasonString]
  }
}

