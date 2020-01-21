package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the StyleCollection object, for use in `styleCollection.set({ ... })`. */
trait StyleCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[StyleData]] = js.undefined
}

object StyleCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[StyleData] = null): StyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleCollectionUpdateData]
  }
}

