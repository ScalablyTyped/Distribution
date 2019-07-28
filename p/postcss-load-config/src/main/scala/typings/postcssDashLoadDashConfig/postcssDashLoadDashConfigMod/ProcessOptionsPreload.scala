package typings.postcssDashLoadDashConfig.postcssDashLoadDashConfigMod

import typings.postcss.postcssMod.Parser
import typings.postcss.postcssMod.Stringifier
import typings.postcss.postcssMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// In the ConfigContext, these three options can be instances of the
// appropriate class, or strings. If they are strings, postcss-load-config will
// require() them and pass the instances along.
trait ProcessOptionsPreload extends js.Object {
  var parser: js.UndefOr[String | Parser] = js.undefined
  var stringifier: js.UndefOr[String | Stringifier] = js.undefined
  var syntax: js.UndefOr[String | Syntax] = js.undefined
}

object ProcessOptionsPreload {
  @scala.inline
  def apply(
    parser: String | Parser = null,
    stringifier: String | Stringifier = null,
    syntax: String | Syntax = null
  ): ProcessOptionsPreload = {
    val __obj = js.Dynamic.literal()
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (stringifier != null) __obj.updateDynamic("stringifier")(stringifier.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOptionsPreload]
  }
}

