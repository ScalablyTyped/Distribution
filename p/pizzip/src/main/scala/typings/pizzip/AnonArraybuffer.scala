package typings.pizzip

import typings.pizzip.pizzipStrings.arraybuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArraybuffer extends js.Object {
  var `type`: arraybuffer
}

object AnonArraybuffer {
  @scala.inline
  def apply(`type`: arraybuffer): AnonArraybuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArraybuffer]
  }
}

