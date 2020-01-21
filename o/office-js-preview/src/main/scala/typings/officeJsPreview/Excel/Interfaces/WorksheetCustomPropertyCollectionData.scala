package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `worksheetCustomPropertyCollection.toJSON()`. */
trait WorksheetCustomPropertyCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[WorksheetCustomPropertyData]] = js.undefined
}

object WorksheetCustomPropertyCollectionData {
  @scala.inline
  def apply(items: js.Array[WorksheetCustomPropertyData] = null): WorksheetCustomPropertyCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetCustomPropertyCollectionData]
  }
}

