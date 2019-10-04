package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `tableStyleCollection.toJSON()`. */
trait TableStyleCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[TableStyleData]] = js.undefined
}

object TableStyleCollectionData {
  @scala.inline
  def apply(items: js.Array[TableStyleData] = null): TableStyleCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TableStyleCollectionData]
  }
}

