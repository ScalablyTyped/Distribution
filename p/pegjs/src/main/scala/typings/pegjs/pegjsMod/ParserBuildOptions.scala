package typings.pegjs.pegjsMod

import typings.pegjs.pegjsStrings.parser
import typings.pegjs.pegjsStrings.size
import typings.pegjs.pegjsStrings.speed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBuildOptions extends BuildOptionsBase {
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: js.UndefOr[parser] = js.undefined
}

object ParserBuildOptions {
  @scala.inline
  def apply(
    allowedStartRules: js.Array[String] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    optimize: speed | size = null,
    output: parser = null,
    plugins: js.Array[_] = null,
    trace: js.UndefOr[Boolean] = js.undefined
  ): ParserBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedStartRules != null) __obj.updateDynamic("allowedStartRules")(allowedStartRules)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (optimize != null) __obj.updateDynamic("optimize")(optimize.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[ParserBuildOptions]
  }
}

