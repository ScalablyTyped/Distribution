package typings.pnpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsiderBuiltinsExtensions extends js.Object {
  var considerBuiltins: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_ConsiderBuiltinsExtensions {
  @scala.inline
  def apply(considerBuiltins: js.UndefOr[Boolean] = js.undefined, extensions: js.Array[String] = null): Anon_ConsiderBuiltinsExtensions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(considerBuiltins)) __obj.updateDynamic("considerBuiltins")(considerBuiltins)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[Anon_ConsiderBuiltinsExtensions]
  }
}

