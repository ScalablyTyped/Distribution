package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `namedSheetViewCollection.toJSON()`. */
trait NamedSheetViewCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[NamedSheetViewData]] = js.undefined
}

object NamedSheetViewCollectionData {
  @scala.inline
  def apply(items: js.Array[NamedSheetViewData] = null): NamedSheetViewCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSheetViewCollectionData]
  }
}

