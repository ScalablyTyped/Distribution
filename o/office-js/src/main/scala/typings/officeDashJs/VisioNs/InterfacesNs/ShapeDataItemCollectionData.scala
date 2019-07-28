package typings.officeDashJs.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shapeDataItemCollection.toJSON()". */
trait ShapeDataItemCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ShapeDataItemData]] = js.undefined
}

object ShapeDataItemCollectionData {
  @scala.inline
  def apply(items: js.Array[ShapeDataItemData] = null): ShapeDataItemCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ShapeDataItemCollectionData]
  }
}

