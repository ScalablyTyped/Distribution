package typings.picomatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Close extends js.Object {
  var close: String
  var open: String
  var `type`: String
}

object Close {
  @scala.inline
  def apply(close: String, open: String, `type`: String): Close = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
}

