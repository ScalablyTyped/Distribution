package typings.node

import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPkcs1 extends js.Object {
  var `type`: pkcs1 | pkcs8
}

object AnonPkcs1 {
  @scala.inline
  def apply(`type`: pkcs1 | pkcs8): AnonPkcs1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPkcs1]
  }
}

