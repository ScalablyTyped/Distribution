package typings.parseDashDomain.parseDashDomainMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var customTlds: js.UndefOr[RegExp | js.Array[String]] = js.undefined
  var privateTlds: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(customTlds: RegExp | js.Array[String] = null, privateTlds: js.UndefOr[Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (customTlds != null) __obj.updateDynamic("customTlds")(customTlds.asInstanceOf[js.Any])
    if (!js.isUndefined(privateTlds)) __obj.updateDynamic("privateTlds")(privateTlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

