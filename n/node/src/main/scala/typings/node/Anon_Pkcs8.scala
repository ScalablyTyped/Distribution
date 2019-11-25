package typings.node

import typings.node.nodeStrings.pkcs8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pkcs8 extends js.Object {
  var `type`: pkcs8
}

object Anon_Pkcs8 {
  @scala.inline
  def apply(`type`: pkcs8): Anon_Pkcs8 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Pkcs8]
  }
}

