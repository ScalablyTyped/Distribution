package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the WorksheetCollection object, for use in `worksheetCollection.set({ ... })`. */
trait WorksheetCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[WorksheetData]] = js.undefined
}

object WorksheetCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[WorksheetData] = null): WorksheetCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[WorksheetCollectionUpdateData]
  }
}

