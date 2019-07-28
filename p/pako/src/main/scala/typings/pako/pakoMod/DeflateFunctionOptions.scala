package typings.pako.pakoMod

import typings.pako.pakoNumbers.`-1`
import typings.pako.pakoNumbers.`0`
import typings.pako.pakoNumbers.`1`
import typings.pako.pakoNumbers.`2`
import typings.pako.pakoNumbers.`3`
import typings.pako.pakoNumbers.`4`
import typings.pako.pakoNumbers.`5`
import typings.pako.pakoNumbers.`6`
import typings.pako.pakoNumbers.`7`
import typings.pako.pakoNumbers.`8`
import typings.pako.pakoNumbers.`9`
import typings.pako.pakoStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeflateFunctionOptions extends js.Object {
  var dictionary: js.UndefOr[js.Any] = js.undefined
  var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  var memLevel: js.UndefOr[Double] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var strategy: js.UndefOr[StrategyValues] = js.undefined
  var to: js.UndefOr[string] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object DeflateFunctionOptions {
  @scala.inline
  def apply(
    dictionary: js.Any = null,
    level: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    memLevel: Int | Double = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    strategy: StrategyValues = null,
    to: string = null,
    windowBits: Int | Double = null
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

