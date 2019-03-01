package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flag extends js.Object {
  var flag: openpgpLib.openpgpMod.enumsNs.reasonForRevocation
  var string: java.lang.String
}

object Anon_Flag {
  @scala.inline
  def apply(flag: openpgpLib.openpgpMod.enumsNs.reasonForRevocation, string: java.lang.String): Anon_Flag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flag")(flag)
    __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[Anon_Flag]
  }
}

