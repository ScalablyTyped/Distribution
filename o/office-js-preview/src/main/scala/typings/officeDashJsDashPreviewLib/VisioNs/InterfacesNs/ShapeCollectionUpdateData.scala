package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeCollection object, for use in "shapeCollection.set({ ... })". */
trait ShapeCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ShapeData]] = js.undefined
}

object ShapeCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ShapeData] = null): ShapeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ShapeCollectionUpdateData]
  }
}

