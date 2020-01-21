package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SlicerStyleCollection object, for use in `slicerStyleCollection.set({ ... })`. */
trait SlicerStyleCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[SlicerStyleData]] = js.undefined
}

object SlicerStyleCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[SlicerStyleData] = null): SlicerStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicerStyleCollectionUpdateData]
  }
}

