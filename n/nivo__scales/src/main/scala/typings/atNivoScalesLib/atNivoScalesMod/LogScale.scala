package typings
package atNivoScalesLib.atNivoScalesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogScale extends Scale {
  var base: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[atNivoScalesLib.atNivoScalesLibStrings.auto | scala.Double] = js.undefined
  var min: js.UndefOr[atNivoScalesLib.atNivoScalesLibStrings.auto | scala.Double] = js.undefined
  var `type`: atNivoScalesLib.atNivoScalesLibStrings.log
}

object LogScale {
  @scala.inline
  def apply(
    `type`: atNivoScalesLib.atNivoScalesLibStrings.log,
    base: scala.Int | scala.Double = null,
    max: atNivoScalesLib.atNivoScalesLibStrings.auto | scala.Double = null,
    min: atNivoScalesLib.atNivoScalesLibStrings.auto | scala.Double = null
  ): LogScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogScale]
  }
}

