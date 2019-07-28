package typings.node

import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pkcs1 extends js.Object {
  var `type`: pkcs1 | pkcs8
}

object Anon_Pkcs1 {
  @scala.inline
  def apply(`type`: pkcs1 | pkcs8): Anon_Pkcs1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Pkcs1]
  }
}

