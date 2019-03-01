package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableColumnCollection.toJSON()". */
trait TableColumnCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[TableColumnData]] = js.undefined
}

object TableColumnCollectionData {
  @scala.inline
  def apply(items: js.Array[TableColumnData] = null): TableColumnCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TableColumnCollectionData]
  }
}

