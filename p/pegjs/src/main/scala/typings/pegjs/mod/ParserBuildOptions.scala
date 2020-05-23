package typings.pegjs.mod

import typings.pegjs.pegjsStrings.size
import typings.pegjs.pegjsStrings.speed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBuildOptions extends BuildOptionsBase {
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: js.UndefOr[typings.pegjs.pegjsStrings.parser] = js.undefined
}

object ParserBuildOptions {
  @scala.inline
  def apply(
    allowedStartRules: js.Array[String] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    optimize: speed | size = null,
    output: typings.pegjs.pegjsStrings.parser = null,
    plugins: js.Array[_] = null,
    trace: js.UndefOr[Boolean] = js.undefined
  ): ParserBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedStartRules != null) __obj.updateDynamic("allowedStartRules")(allowedStartRules.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (optimize != null) __obj.updateDynamic("optimize")(optimize.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserBuildOptions]
  }
}

