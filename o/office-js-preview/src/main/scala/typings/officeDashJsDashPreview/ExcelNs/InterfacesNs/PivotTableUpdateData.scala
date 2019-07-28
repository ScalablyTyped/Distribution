package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotTable object, for use in "pivotTable.set({ ... })". */
trait PivotTableUpdateData extends js.Object {
  /**
    *
    * Specifies whether the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies whether the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.undefined
}

object PivotTableUpdateData {
  @scala.inline
  def apply(
    enableDataValueEditing: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    useCustomSortLists: js.UndefOr[Boolean] = js.undefined
  ): PivotTableUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableDataValueEditing)) __obj.updateDynamic("enableDataValueEditing")(enableDataValueEditing)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(useCustomSortLists)) __obj.updateDynamic("useCustomSortLists")(useCustomSortLists)
    __obj.asInstanceOf[PivotTableUpdateData]
  }
}

