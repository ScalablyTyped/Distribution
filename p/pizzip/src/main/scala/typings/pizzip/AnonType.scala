package typings.pizzip

import typings.pizzip.pizzipStrings.uint8array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: uint8array
}

object AnonType {
  @scala.inline
  def apply(`type`: uint8array): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

