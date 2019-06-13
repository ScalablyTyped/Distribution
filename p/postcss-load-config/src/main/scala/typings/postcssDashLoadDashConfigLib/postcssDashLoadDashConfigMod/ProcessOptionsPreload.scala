package typings
package postcssDashLoadDashConfigLib.postcssDashLoadDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// In the ConfigContext, these three options can be instances of the
// appropriate class, or strings. If they are strings, postcss-load-config will
// require() them and pass the instances along.
trait ProcessOptionsPreload extends js.Object {
  var parser: js.UndefOr[java.lang.String | postcssLib.postcssMod.Parse | postcssLib.postcssMod.Syntax] = js.undefined
  var stringifier: js.UndefOr[
    java.lang.String | postcssLib.postcssMod.Stringify | postcssLib.postcssMod.Syntax
  ] = js.undefined
  var syntax: js.UndefOr[java.lang.String | postcssLib.postcssMod.Syntax] = js.undefined
}

object ProcessOptionsPreload {
  @scala.inline
  def apply(
    parser: java.lang.String | postcssLib.postcssMod.Parse | postcssLib.postcssMod.Syntax = null,
    stringifier: java.lang.String | postcssLib.postcssMod.Stringify | postcssLib.postcssMod.Syntax = null,
    syntax: java.lang.String | postcssLib.postcssMod.Syntax = null
  ): ProcessOptionsPreload = {
    val __obj = js.Dynamic.literal()
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (stringifier != null) __obj.updateDynamic("stringifier")(stringifier.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOptionsPreload]
  }
}

