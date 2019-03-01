package typings
package pakoLib.pakoMod.PakoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeflateOptions extends js.Object {
  var dictionary: js.UndefOr[js.Any] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var memLevel: js.UndefOr[scala.Double] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var strategy: js.UndefOr[scala.Double] = js.undefined
  var to: js.UndefOr[pakoLib.pakoLibStrings.string] = js.undefined
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

object DeflateOptions {
  @scala.inline
  def apply(
    dictionary: js.Any = null,
    level: scala.Int | scala.Double = null,
    memLevel: scala.Int | scala.Double = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    strategy: scala.Int | scala.Double = null,
    to: pakoLib.pakoLibStrings.string = null,
    windowBits: scala.Int | scala.Double = null
  ): DeflateOptions = {
    val __obj = js.Dynamic.literal()
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeflateOptions]
  }
}

