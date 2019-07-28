package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "namedItemCollection.toJSON()". */
trait NamedItemCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[NamedItemData]] = js.undefined
}

object NamedItemCollectionData {
  @scala.inline
  def apply(items: js.Array[NamedItemData] = null): NamedItemCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[NamedItemCollectionData]
  }
}

