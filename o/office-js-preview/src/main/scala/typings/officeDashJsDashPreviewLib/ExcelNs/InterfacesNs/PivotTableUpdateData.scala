package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotTable object, for use in "pivotTable.set({ ... })". */
trait PivotTableUpdateData extends js.Object {
  /**
    *
    * True if the PivotTable should use custom lists when sorting.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var enableDataValueEditing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * True if the PivotTable should use custom lists when sorting.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var useCustomSortLists: js.UndefOr[scala.Boolean] = js.undefined
}

object PivotTableUpdateData {
  @scala.inline
  def apply(
    enableDataValueEditing: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    useCustomSortLists: js.UndefOr[scala.Boolean] = js.undefined
  ): PivotTableUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableDataValueEditing)) __obj.updateDynamic("enableDataValueEditing")(enableDataValueEditing)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(useCustomSortLists)) __obj.updateDynamic("useCustomSortLists")(useCustomSortLists)
    __obj.asInstanceOf[PivotTableUpdateData]
  }
}

