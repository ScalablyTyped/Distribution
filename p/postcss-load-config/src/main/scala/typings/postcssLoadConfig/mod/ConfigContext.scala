package typings.postcssLoadConfig.mod

import typings.postcss.mod.Parser
import typings.postcss.mod.SourceMapOptions
import typings.postcss.mod.Stringifier
import typings.postcss.mod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The full shape of the ConfigContext.
/* Inlined postcss-load-config.postcss-load-config.Context & postcss-load-config.postcss-load-config.ProcessOptionsPreload & postcss-load-config.postcss-load-config.RemainingProcessOptions */
trait ConfigContext extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
  var parser: js.UndefOr[String | Parser] = js.undefined
  var stringifier: js.UndefOr[String | Stringifier] = js.undefined
  var syntax: js.UndefOr[String | Syntax] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object ConfigContext {
  @scala.inline
  def apply(
    cwd: String = null,
    env: String = null,
    from: String = null,
    map: SourceMapOptions | Boolean = null,
    parser: String | Parser = null,
    stringifier: String | Stringifier = null,
    syntax: String | Syntax = null,
    to: String = null
  ): ConfigContext = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (stringifier != null) __obj.updateDynamic("stringifier")(stringifier.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigContext]
  }
}

