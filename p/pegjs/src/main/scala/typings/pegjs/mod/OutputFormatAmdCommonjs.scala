package typings.pegjs.mod

import typings.pegjs.pegjsStrings.amd
import typings.pegjs.pegjsStrings.commonjs
import typings.pegjs.pegjsStrings.size
import typings.pegjs.pegjsStrings.source
import typings.pegjs.pegjsStrings.speed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFormatAmdCommonjs extends BuildOptionsBase {
  /** parser dependencies, the value is an object which maps variables used to access the dependencies in the parser to module IDs used to load them; valid only when `format` is set to `"amd"`, `"commonjs"`, or `"umd"` (default: `{}`) */
  var dependencies: js.UndefOr[js.Any] = js.undefined
  /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
  var format: amd | commonjs
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: source
}

object OutputFormatAmdCommonjs {
  @scala.inline
  def apply(
    format: amd | commonjs,
    output: source,
    allowedStartRules: js.Array[String] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    dependencies: js.Any = null,
    optimize: speed | size = null,
    plugins: js.Array[_] = null,
    trace: js.UndefOr[Boolean] = js.undefined
  ): OutputFormatAmdCommonjs = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    if (allowedStartRules != null) __obj.updateDynamic("allowedStartRules")(allowedStartRules.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (optimize != null) __obj.updateDynamic("optimize")(optimize.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFormatAmdCommonjs]
  }
}

