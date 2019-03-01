package typings
package mockjsLib.mockjsMod.mockjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockjsValidRsItem extends js.Object {
  var action: S
  var actual: S
  var expected: S
  var message: S
  var path: js.Array[S]
  var `type`: S
}

object MockjsValidRsItem {
  @scala.inline
  def apply(action: S, actual: S, expected: S, message: S, path: js.Array[S], `type`: S): MockjsValidRsItem = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("actual")(actual)
    __obj.updateDynamic("expected")(expected)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[MockjsValidRsItem]
  }
}

