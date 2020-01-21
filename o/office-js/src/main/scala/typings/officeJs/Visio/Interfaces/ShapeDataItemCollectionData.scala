package typings.officeJs.Visio.Interfaces

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
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeDataItemCollectionData]
  }
}

