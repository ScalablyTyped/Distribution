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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockjsValidRsItem]
  }
}

