package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pageBreakCollection.toJSON()". */
trait PageBreakCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[PageBreakData]] = js.undefined
}

object PageBreakCollectionData {
  @scala.inline
  def apply(items: js.Array[PageBreakData] = null): PageBreakCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PageBreakCollectionData]
  }
}

