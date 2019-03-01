package typings
package pathDashParserLib.pathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPartialTestOptions extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var delimited: js.UndefOr[scala.Boolean] = js.undefined
  var queryParams: js.UndefOr[searchDashParamsLib.typingsEncodeMod.IOptions] = js.undefined
}

object IPartialTestOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    delimited: js.UndefOr[scala.Boolean] = js.undefined,
    queryParams: searchDashParamsLib.typingsEncodeMod.IOptions = null
  ): IPartialTestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[IPartialTestOptions]
  }
}

