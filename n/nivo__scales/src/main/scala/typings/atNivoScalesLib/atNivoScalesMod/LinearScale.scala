package typings
package atNivoScalesLib.atNivoScalesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearScale extends Scale {
  var max: js.UndefOr[atNivoScalesLib.atNivoScalesLibStrings.auto | scala.Double] = js.undefined
  var min: js.UndefOr[atNivoScalesLib.atNivoScalesLibStrings.auto | scala.Double] = js.undefined
  var stacked: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: atNivoScalesLib.atNivoScalesLibStrings.linear
}

object LinearScale {
  @scala.inline
  def apply(
    `type`: atNivoScalesLib.atNivoScalesLibStrings.linear,
    max: atNivoScalesLib.atNivoScalesLibStrings.auto | scala.Double = null,
    min: atNivoScalesLib.atNivoScalesLibStrings.auto | scala.Double = null,
    stacked: js.UndefOr[scala.Boolean] = js.undefined
  ): LinearScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked)
    __obj.asInstanceOf[LinearScale]
  }
}

