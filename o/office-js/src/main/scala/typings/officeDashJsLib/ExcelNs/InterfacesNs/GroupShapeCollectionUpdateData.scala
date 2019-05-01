package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the GroupShapeCollection object, for use in "groupShapeCollection.set({ ... })". */
trait GroupShapeCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ShapeData]] = js.undefined
}

object GroupShapeCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ShapeData] = null): GroupShapeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[GroupShapeCollectionUpdateData]
  }
}

