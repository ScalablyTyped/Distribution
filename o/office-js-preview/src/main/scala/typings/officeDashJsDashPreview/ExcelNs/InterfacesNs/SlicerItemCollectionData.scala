package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "slicerItemCollection.toJSON()". */
trait SlicerItemCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[SlicerItemData]] = js.undefined
}

object SlicerItemCollectionData {
  @scala.inline
  def apply(items: js.Array[SlicerItemData] = null): SlicerItemCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[SlicerItemCollectionData]
  }
}

