package typings
package nearleyLib.nearleyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserRule extends js.Object {
  var name: java.lang.String
  var postprocess: js.UndefOr[Postprocessor] = js.undefined
  var symbols: js.Array[_]
}

object ParserRule {
  @scala.inline
  def apply(name: java.lang.String, symbols: js.Array[_], postprocess: Postprocessor = null): ParserRule = {
    val __obj = js.Dynamic.literal(name = name, symbols = symbols)
    if (postprocess != null) __obj.updateDynamic("postprocess")(postprocess)
    __obj.asInstanceOf[ParserRule]
  }
}

