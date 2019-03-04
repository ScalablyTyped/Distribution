package typings
package picturefillLib.picturefillMod.PicturefillNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateArg extends js.Object {
  var elements: stdLib.NodeList | js.Array[ElementNullable]
  var reevaluate: js.UndefOr[scala.Boolean] = js.undefined
}

object EvaluateArg {
  @scala.inline
  def apply(
    elements: stdLib.NodeList | js.Array[ElementNullable],
    reevaluate: js.UndefOr[scala.Boolean] = js.undefined
  ): EvaluateArg = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    if (!js.isUndefined(reevaluate)) __obj.updateDynamic("reevaluate")(reevaluate)
    __obj.asInstanceOf[EvaluateArg]
  }
}

