package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the WorksheetCustomPropertyCollection object, for use in `worksheetCustomPropertyCollection.set({ ... })`. */
trait WorksheetCustomPropertyCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[WorksheetCustomPropertyData]] = js.undefined
}

object WorksheetCustomPropertyCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[WorksheetCustomPropertyData] = null): WorksheetCustomPropertyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetCustomPropertyCollectionUpdateData]
  }
}

