package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pkcs8Sec1 extends js.Object {
  var `type`: nodeLib.nodeLibStrings.sec1 | nodeLib.nodeLibStrings.pkcs8
}

object Anon_Pkcs8Sec1 {
  @scala.inline
  def apply(`type`: nodeLib.nodeLibStrings.sec1 | nodeLib.nodeLibStrings.pkcs8): Anon_Pkcs8Sec1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Pkcs8Sec1]
  }
}

