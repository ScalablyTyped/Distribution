package typings.node

import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: pkcs1 | pkcs8
}

object AnonType {
  @scala.inline
  def apply(`type`: pkcs1 | pkcs8): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

