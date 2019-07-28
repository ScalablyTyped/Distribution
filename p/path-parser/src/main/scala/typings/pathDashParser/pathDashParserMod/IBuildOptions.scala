package typings.pathDashParser.pathDashParserMod

import typings.searchDashParams.typingsEncodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuildOptions extends js.Object {
  var ignoreConstraints: js.UndefOr[Boolean] = js.undefined
  var ignoreSearch: js.UndefOr[Boolean] = js.undefined
  var queryParams: js.UndefOr[IOptions] = js.undefined
}

object IBuildOptions {
  @scala.inline
  def apply(
    ignoreConstraints: js.UndefOr[Boolean] = js.undefined,
    ignoreSearch: js.UndefOr[Boolean] = js.undefined,
    queryParams: IOptions = null
  ): IBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreConstraints)) __obj.updateDynamic("ignoreConstraints")(ignoreConstraints)
    if (!js.isUndefined(ignoreSearch)) __obj.updateDynamic("ignoreSearch")(ignoreSearch)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[IBuildOptions]
  }
}

