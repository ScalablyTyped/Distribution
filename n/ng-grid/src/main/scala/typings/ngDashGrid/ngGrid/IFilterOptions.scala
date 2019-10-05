package typings.ngDashGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterOptions extends js.Object {
  var filterText: js.UndefOr[String] = js.undefined
  var useExternalFilter: js.UndefOr[Boolean] = js.undefined
}

object IFilterOptions {
  @scala.inline
  def apply(filterText: String = null, useExternalFilter: js.UndefOr[Boolean] = js.undefined): IFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (filterText != null) __obj.updateDynamic("filterText")(filterText)
    if (!js.isUndefined(useExternalFilter)) __obj.updateDynamic("useExternalFilter")(useExternalFilter)
    __obj.asInstanceOf[IFilterOptions]
  }
}

