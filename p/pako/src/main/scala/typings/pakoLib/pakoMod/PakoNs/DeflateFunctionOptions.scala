package typings
package pakoLib.pakoMod.PakoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeflateFunctionOptions extends js.Object {
  var dictionary: js.UndefOr[js.Any] = js.undefined
  var level: js.UndefOr[
    pakoLib.pakoLibNumbers.`-1` | pakoLib.pakoLibNumbers.`0` | pakoLib.pakoLibNumbers.`1` | pakoLib.pakoLibNumbers.`2` | pakoLib.pakoLibNumbers.`3` | pakoLib.pakoLibNumbers.`4` | pakoLib.pakoLibNumbers.`5` | pakoLib.pakoLibNumbers.`6` | pakoLib.pakoLibNumbers.`7` | pakoLib.pakoLibNumbers.`8` | pakoLib.pakoLibNumbers.`9`
  ] = js.undefined
  var memLevel: js.UndefOr[scala.Double] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var strategy: js.UndefOr[StrategyValues] = js.undefined
  var to: js.UndefOr[pakoLib.pakoLibStrings.string] = js.undefined
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

object DeflateFunctionOptions {
  @scala.inline
  def apply(
    dictionary: js.Any = null,
    level: pakoLib.pakoLibNumbers.`-1` | pakoLib.pakoLibNumbers.`0` | pakoLib.pakoLibNumbers.`1` | pakoLib.pakoLibNumbers.`2` | pakoLib.pakoLibNumbers.`3` | pakoLib.pakoLibNumbers.`4` | pakoLib.pakoLibNumbers.`5` | pakoLib.pakoLibNumbers.`6` | pakoLib.pakoLibNumbers.`7` | pakoLib.pakoLibNumbers.`8` | pakoLib.pakoLibNumbers.`9` = null,
    memLevel: scala.Int | scala.Double = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    strategy: StrategyValues = null,
    to: pakoLib.pakoLibStrings.string = null,
    windowBits: scala.Int | scala.Double = null
  ): DeflateFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy)
    if (to != null) __obj.updateDynamic("to")(to)
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeflateFunctionOptions]
  }
}

