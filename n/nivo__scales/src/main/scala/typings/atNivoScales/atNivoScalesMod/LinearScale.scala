package typings.atNivoScales.atNivoScalesMod

import typings.atNivoScales.atNivoScalesStrings.auto
import typings.atNivoScales.atNivoScalesStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearScale extends Scale {
  var max: js.UndefOr[auto | Double] = js.undefined
  var min: js.UndefOr[auto | Double] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var stacked: js.UndefOr[Boolean] = js.undefined
  var `type`: linear
}

object LinearScale {
  @scala.inline
  def apply(
    `type`: linear,
    max: auto | Double = null,
    min: auto | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    stacked: js.UndefOr[Boolean] = js.undefined
  ): LinearScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearScale]
  }
}

