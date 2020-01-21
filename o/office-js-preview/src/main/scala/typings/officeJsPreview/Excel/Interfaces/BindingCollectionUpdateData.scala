package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the BindingCollection object, for use in `bindingCollection.set({ ... })`. */
trait BindingCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[BindingData]] = js.undefined
}

object BindingCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[BindingData] = null): BindingCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingCollectionUpdateData]
  }
}

