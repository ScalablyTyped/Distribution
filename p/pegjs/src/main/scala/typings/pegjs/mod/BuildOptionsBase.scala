package typings.pegjs.mod

import typings.pegjs.pegjsStrings.size
import typings.pegjs.pegjsStrings.speed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptionsBase extends js.Object {
  /** rules the parser will be allowed to start parsing from (default: the first rule in the grammar) */
  var allowedStartRules: js.UndefOr[js.Array[String]] = js.undefined
  /** if `true`, makes the parser cache results, avoiding exponential parsing time in pathological cases but making the parser slower (default: `false`) */
  var cache: js.UndefOr[Boolean] = js.undefined
  /** selects between optimizing the generated parser for parsing speed (`"speed"`) or code size (`"size"`) (default: `"speed"`) */
  var optimize: js.UndefOr[speed | size] = js.undefined
  /** plugins to use */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /** makes the parser trace its progress (default: `false`) */
  var trace: js.UndefOr[Boolean] = js.undefined
}

object BuildOptionsBase {
  @scala.inline
  def apply(
    allowedStartRules: js.Array[String] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    optimize: speed | size = null,
    plugins: js.Array[_] = null,
    trace: js.UndefOr[Boolean] = js.undefined
  ): BuildOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (allowedStartRules != null) __obj.updateDynamic("allowedStartRules")(allowedStartRules.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (optimize != null) __obj.updateDynamic("optimize")(optimize.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionsBase]
  }
}

