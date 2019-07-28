package typings.pegjs.pegjsMod

import typings.pegjs.pegjsStrings.bare
import typings.pegjs.pegjsStrings.size
import typings.pegjs.pegjsStrings.source
import typings.pegjs.pegjsStrings.speed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFormatBare extends BuildOptionsBase {
  /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
  var format: js.UndefOr[bare] = js.undefined
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: source
}

object OutputFormatBare {
  @scala.inline
  def apply(
    output: source,
    allowedStartRules: js.Array[String] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    format: bare = null,
    optimize: speed | size = null,
    plugins: js.Array[_] = null,
    trace: js.UndefOr[Boolean] = js.undefined
  ): OutputFormatBare = {
    val __obj = js.Dynamic.literal(output = output)
    if (allowedStartRules != null) __obj.updateDynamic("allowedStartRules")(allowedStartRules)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (format != null) __obj.updateDynamic("format")(format)
    if (optimize != null) __obj.updateDynamic("optimize")(optimize.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[OutputFormatBare]
  }
}

