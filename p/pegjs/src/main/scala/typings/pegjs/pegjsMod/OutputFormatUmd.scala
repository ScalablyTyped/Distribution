package typings.pegjs.pegjsMod

import typings.pegjs.pegjsStrings.size
import typings.pegjs.pegjsStrings.source
import typings.pegjs.pegjsStrings.speed
import typings.pegjs.pegjsStrings.umd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFormatUmd extends BuildOptionsBase {
  /** parser dependencies, the value is an object which maps variables used to access the dependencies in the parser to module IDs used to load them; valid only when `format` is set to `"amd"`, `"commonjs"`, or `"umd"` (default: `{}`) */
  var dependencies: js.UndefOr[js.Any] = js.undefined
  /** name of a global variable into which the parser object is assigned to when no module loader is detected; valid only when `format` is set to `"globals"` or `"umd"` (default: `null`) */
  var exportVar: js.UndefOr[js.Any] = js.undefined
  /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
  var format: umd
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: source
}

object OutputFormatUmd {
  @scala.inline
  def apply(
    format: umd,
    output: source,
    allowedStartRules: js.Array[String] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    dependencies: js.Any = null,
    exportVar: js.Any = null,
    optimize: speed | size = null,
    plugins: js.Array[_] = null,
    trace: js.UndefOr[Boolean] = js.undefined
  ): OutputFormatUmd = {
    val __obj = js.Dynamic.literal(format = format, output = output)
    if (allowedStartRules != null) __obj.updateDynamic("allowedStartRules")(allowedStartRules)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (exportVar != null) __obj.updateDynamic("exportVar")(exportVar)
    if (optimize != null) __obj.updateDynamic("optimize")(optimize.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[OutputFormatUmd]
  }
}

