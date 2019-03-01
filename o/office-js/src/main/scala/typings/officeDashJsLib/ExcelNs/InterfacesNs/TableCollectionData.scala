package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableCollection.toJSON()". */
trait TableCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[TableData]] = js.undefined
}

object TableCollectionData {
  @scala.inline
  def apply(items: js.Array[TableData] = null): TableCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TableCollectionData]
  }
}

