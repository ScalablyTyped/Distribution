package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalFormatCollection object, for use in `conditionalFormatCollection.set({ ... })`. */
trait ConditionalFormatCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ConditionalFormatData]] = js.undefined
}

object ConditionalFormatCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ConditionalFormatData] = null): ConditionalFormatCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormatCollectionUpdateData]
  }
}

