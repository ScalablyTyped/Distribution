package typings
package nodeDashJoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exp extends js.Object {
  var exp: scala.Boolean | nodeDashJoseLib.nodeDashJoseMod.JWSNs.Exp
}

object Anon_Exp {
  @scala.inline
  def apply(exp: scala.Boolean | nodeDashJoseLib.nodeDashJoseMod.JWSNs.Exp): Anon_Exp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exp")(exp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Exp]
  }
}

