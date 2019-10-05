package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `slicerStyleCollection.toJSON()`. */
trait SlicerStyleCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[SlicerStyleData]] = js.undefined
}

object SlicerStyleCollectionData {
  @scala.inline
  def apply(items: js.Array[SlicerStyleData] = null): SlicerStyleCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[SlicerStyleCollectionData]
  }
}

