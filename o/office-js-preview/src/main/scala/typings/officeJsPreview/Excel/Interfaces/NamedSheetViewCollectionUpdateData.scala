package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the NamedSheetViewCollection object, for use in `namedSheetViewCollection.set({ ... })`. */
trait NamedSheetViewCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[NamedSheetViewData]] = js.undefined
}

object NamedSheetViewCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[NamedSheetViewData] = null): NamedSheetViewCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSheetViewCollectionUpdateData]
  }
}

