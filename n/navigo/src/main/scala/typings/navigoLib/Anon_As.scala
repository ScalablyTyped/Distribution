package typings
package navigoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  var as: java.lang.String
  def uses(params: Params, query: java.lang.String): scala.Unit
}

object Anon_As {
  @scala.inline
  def apply(as: java.lang.String, uses: js.Function2[Params, java.lang.String, scala.Unit]): Anon_As = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[Anon_As]
  }
}

