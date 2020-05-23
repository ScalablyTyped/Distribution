package typings.nivoScales.mod

import typings.nivoScales.nivoScalesStrings.auto
import typings.nivoScales.nivoScalesStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogScale extends Scale {
  var base: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[auto | Double] = js.undefined
  var min: js.UndefOr[auto | Double] = js.undefined
  var `type`: log
}

object LogScale {
  @scala.inline
  def apply(
    `type`: log,
    base: js.UndefOr[Double] = js.undefined,
    max: auto | Double = null,
    min: auto | Double = null
  ): LogScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(base)) __obj.updateDynamic("base")(base.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogScale]
  }
}

