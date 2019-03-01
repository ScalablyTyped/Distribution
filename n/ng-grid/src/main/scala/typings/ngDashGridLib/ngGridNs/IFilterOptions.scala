package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterOptions extends js.Object {
  var filterText: js.UndefOr[java.lang.String] = js.undefined
  var useExternalFilter: js.UndefOr[scala.Boolean] = js.undefined
}

object IFilterOptions {
  @scala.inline
  def apply(filterText: java.lang.String = null, useExternalFilter: js.UndefOr[scala.Boolean] = js.undefined): IFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (filterText != null) __obj.updateDynamic("filterText")(filterText)
    if (!js.isUndefined(useExternalFilter)) __obj.updateDynamic("useExternalFilter")(useExternalFilter)
    __obj.asInstanceOf[IFilterOptions]
  }
}

