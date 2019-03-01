package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "rangeBorderCollection.toJSON()". */
trait RangeBorderCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[RangeBorderData]] = js.undefined
}

object RangeBorderCollectionData {
  @scala.inline
  def apply(items: js.Array[RangeBorderData] = null): RangeBorderCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[RangeBorderCollectionData]
  }
}

