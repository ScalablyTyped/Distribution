package typings
package pathDashParserLib.pathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuildOptions extends js.Object {
  var ignoreConstraints: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreSearch: js.UndefOr[scala.Boolean] = js.undefined
  var queryParams: js.UndefOr[searchDashParamsLib.typingsEncodeMod.IOptions] = js.undefined
}

object IBuildOptions {
  @scala.inline
  def apply(
    ignoreConstraints: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreSearch: js.UndefOr[scala.Boolean] = js.undefined,
    queryParams: searchDashParamsLib.typingsEncodeMod.IOptions = null
  ): IBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreConstraints)) __obj.updateDynamic("ignoreConstraints")(ignoreConstraints)
    if (!js.isUndefined(ignoreSearch)) __obj.updateDynamic("ignoreSearch")(ignoreSearch)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[IBuildOptions]
  }
}

