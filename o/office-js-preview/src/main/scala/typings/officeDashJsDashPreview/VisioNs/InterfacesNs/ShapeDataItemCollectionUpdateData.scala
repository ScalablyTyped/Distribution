package typings.officeDashJsDashPreview.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeDataItemCollection object, for use in "shapeDataItemCollection.set({ ... })". */
trait ShapeDataItemCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ShapeDataItemData]] = js.undefined
}

object ShapeDataItemCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ShapeDataItemData] = null): ShapeDataItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ShapeDataItemCollectionUpdateData]
  }
}

