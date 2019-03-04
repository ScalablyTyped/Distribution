package typings
package pegjsLib.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFormatAmdCommonjs extends BuildOptionsBase {
  /** parser dependencies, the value is an object which maps variables used to access the dependencies in the parser to module IDs used to load them; valid only when `format` is set to `"amd"`, `"commonjs"`, or `"umd"` (default: `{}`) */
  var dependencies: js.UndefOr[js.Any] = js.undefined
  /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
  var format: pegjsLib.pegjsLibStrings.amd | pegjsLib.pegjsLibStrings.commonjs
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: pegjsLib.pegjsLibStrings.source
}

object OutputFormatAmdCommonjs {
  @scala.inline
  def apply(
    format: pegjsLib.pegjsLibStrings.amd | pegjsLib.pegjsLibStrings.commonjs,
    output: pegjsLib.pegjsLibStrings.source,
    allowedStartRules: js.Array[java.lang.String] = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    dependencies: js.Any = null,
    optimize: pegjsLib.pegjsLibStrings.speed | pegjsLib.pegjsLibStrings.size = null,
    plugins: js.Array[_] = null,
    trace: js.UndefOr[scala.Boolean] = js.undefined
  ): OutputFormatAmdCommonjs = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], output = output)
    if (allowedStartRules != null) __obj.updateDynamic("allowedStartRules")(allowedStartRules)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (optimize != null) __obj.updateDynamic("optimize")(optimize.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[OutputFormatAmdCommonjs]
  }
}

