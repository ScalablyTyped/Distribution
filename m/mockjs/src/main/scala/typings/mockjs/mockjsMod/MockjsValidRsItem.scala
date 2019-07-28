package typings.mockjs.mockjsMod

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
    val __obj = js.Dynamic.literal(action = action, actual = actual, expected = expected, message = message, path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MockjsValidRsItem]
  }
}

