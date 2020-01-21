package typings.pizzip

import typings.pizzip.pizzipStrings.nodebuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodebuffer extends js.Object {
  var `type`: nodebuffer
}

object AnonNodebuffer {
  @scala.inline
  def apply(`type`: nodebuffer): AnonNodebuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNodebuffer]
  }
}

