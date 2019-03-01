package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartCollection.toJSON()". */
trait ChartCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ChartData]] = js.undefined
}

object ChartCollectionData {
  @scala.inline
  def apply(items: js.Array[ChartData] = null): ChartCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ChartCollectionData]
  }
}

