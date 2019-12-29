package typings.nearley.nearleyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserRule extends js.Object {
  var name: String
  var postprocess: js.UndefOr[Postprocessor] = js.undefined
  var symbols: js.Array[_]
}

object ParserRule {
  @scala.inline
  def apply(
    name: String,
    symbols: js.Array[_],
    postprocess: (/* data */ js.Array[js.Any], /* reference */ js.UndefOr[Double], /* wantedBy */ js.UndefOr[js.Object]) => Unit = null
  ): ParserRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    if (postprocess != null) __obj.updateDynamic("postprocess")(js.Any.fromFunction3(postprocess))
    __obj.asInstanceOf[ParserRule]
  }
}

