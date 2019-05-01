package typings
package navigoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  var as: java.lang.String
  def uses(params: navigoLib.navigoMod.Params, query: java.lang.String): scala.Unit
}

object Anon_As {
  @scala.inline
  def apply(as: java.lang.String, uses: (navigoLib.navigoMod.Params, java.lang.String) => scala.Unit): Anon_As = {
    val __obj = js.Dynamic.literal(as = as, uses = js.Any.fromFunction2(uses))
  
    __obj.asInstanceOf[Anon_As]
  }
}

