package typings
package pegjsLib.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptionsBase extends js.Object {
  /** rules the parser will be allowed to start parsing from (default: the first rule in the grammar) */
  var allowedStartRules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** if `true`, makes the parser cache results, avoiding exponential parsing time in pathological cases but making the parser slower (default: `false`) */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /** selects between optimizing the generated parser for parsing speed (`"speed"`) or code size (`"size"`) (default: `"speed"`) */
  var optimize: js.UndefOr[pegjsLib.pegjsLibStrings.speed | pegjsLib.pegjsLibStrings.size] = js.undefined
  /** plugins to use */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /** makes the parser trace its progress (default: `false`) */
  var trace: js.UndefOr[scala.Boolean] = js.undefined
}

object BuildOptionsBase {
  @scala.inline
  def apply(
    allowedStartRules: js.Array[java.lang.String] = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    optimize: pegjsLib.pegjsLibStrings.speed | pegjsLib.pegjsLibStrings.size = null,
    plugins: js.Array[_] = null,
    trace: js.UndefOr[scala.Boolean] = js.undefined
  ): BuildOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (allowedStartRules != null) __obj.updateDynamic("allowedStartRules")(allowedStartRules)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (optimize != null) __obj.updateDynamic("optimize")(optimize.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[BuildOptionsBase]
  }
}

