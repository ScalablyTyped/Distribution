package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableRowCollection.toJSON()". */
trait TableRowCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[TableRowData]] = js.undefined
}

object TableRowCollectionData {
  @scala.inline
  def apply(items: js.Array[TableRowData] = null): TableRowCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TableRowCollectionData]
  }
}

