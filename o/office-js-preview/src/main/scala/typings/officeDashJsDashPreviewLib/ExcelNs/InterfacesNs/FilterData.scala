package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "filter.toJSON()". */
trait FilterData extends js.Object {
  /**
    *
    * The currently applied filter on the given column. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criteria: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.FilterCriteria] = js.undefined
}

object FilterData {
  @scala.inline
  def apply(criteria: officeDashJsDashPreviewLib.ExcelNs.FilterCriteria = null): FilterData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    __obj.asInstanceOf[FilterData]
  }
}

