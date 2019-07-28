package typings.node

import typings.node.nodeStrings.pkcs8
import typings.node.nodeStrings.sec1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pkcs8Sec1 extends js.Object {
  var `type`: sec1 | pkcs8
}

object Anon_Pkcs8Sec1 {
  @scala.inline
  def apply(`type`: sec1 | pkcs8): Anon_Pkcs8Sec1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Pkcs8Sec1]
  }
}

