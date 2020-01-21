package typings.pizzip

import typings.pizzip.pizzipStrings.blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlob extends js.Object {
  var `type`: blob
}

object AnonBlob {
  @scala.inline
  def apply(`type`: blob): AnonBlob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlob]
  }
}

