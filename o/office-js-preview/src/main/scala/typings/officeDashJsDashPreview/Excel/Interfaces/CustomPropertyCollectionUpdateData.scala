package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CustomPropertyCollection object, for use in `customPropertyCollection.set({ ... })`. */
trait CustomPropertyCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[CustomPropertyData]] = js.undefined
}

object CustomPropertyCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[CustomPropertyData] = null): CustomPropertyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[CustomPropertyCollectionUpdateData]
  }
}

