package typings.node

import typings.node.nodeStrings.pkcs8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPkcs8 extends js.Object {
  var `type`: pkcs8
}

object AnonPkcs8 {
  @scala.inline
  def apply(`type`: pkcs8): AnonPkcs8 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPkcs8]
  }
}

