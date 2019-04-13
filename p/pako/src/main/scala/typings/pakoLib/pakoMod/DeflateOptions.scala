package typings
package pakoLib.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeflateOptions extends js.Object {
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var dictionary: js.UndefOr[js.Any] = js.undefined
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[Header] = js.undefined
  var level: js.UndefOr[
    pakoLib.pakoLibNumbers.`-1` | pakoLib.pakoLibNumbers.`0` | pakoLib.pakoLibNumbers.`1` | pakoLib.pakoLibNumbers.`2` | pakoLib.pakoLibNumbers.`3` | pakoLib.pakoLibNumbers.`4` | pakoLib.pakoLibNumbers.`5` | pakoLib.pakoLibNumbers.`6` | pakoLib.pakoLibNumbers.`7` | pakoLib.pakoLibNumbers.`8` | pakoLib.pakoLibNumbers.`9`
  ] = js.undefined
  var memLevel: js.UndefOr[scala.Double] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var strategy: js.UndefOr[StrategyValues] = js.undefined
  var to: js.UndefOr[pakoLib.pakoLibStrings.string] = js.undefined
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

object DeflateOptions {
  @scala.inline
  def apply(
    chunkSize: scala.Int | scala.Double = null,
    dictionary: js.Any = null,
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    header: Header = null,
    level: pakoLib.pakoLibNumbers.`-1` | pakoLib.pakoLibNumbers.`0` | pakoLib.pakoLibNumbers.`1` | pakoLib.pakoLibNumbers.`2` | pakoLib.pakoLibNumbers.`3` | pakoLib.pakoLibNumbers.`4` | pakoLib.pakoLibNumbers.`5` | pakoLib.pakoLibNumbers.`6` | pakoLib.pakoLibNumbers.`7` | pakoLib.pakoLibNumbers.`8` | pakoLib.pakoLibNumbers.`9` = null,
    memLevel: scala.Int | scala.Double = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    strategy: StrategyValues = null,
    to: pakoLib.pakoLibStrings.string = null,
    windowBits: scala.Int | scala.Double = null
  ): DeflateOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (header != null) __obj.updateDynamic("header")(header)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy)
    if (to != null) __obj.updateDynamic("to")(to)
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeflateOptions]
  }
}

