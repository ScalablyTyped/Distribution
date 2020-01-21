package typings.pnpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsiderBuiltinsExtensions extends js.Object {
  var considerBuiltins: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonConsiderBuiltinsExtensions {
  @scala.inline
  def apply(considerBuiltins: js.UndefOr[Boolean] = js.undefined, extensions: js.Array[String] = null): AnonConsiderBuiltinsExtensions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(considerBuiltins)) __obj.updateDynamic("considerBuiltins")(considerBuiltins.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConsiderBuiltinsExtensions]
  }
}

