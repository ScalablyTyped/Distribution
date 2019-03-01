package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ListCollection object, for use in "listCollection.set({ ... })". */
trait ListCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ListData]] = js.undefined
}

object ListCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ListData] = null): ListCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ListCollectionUpdateData]
  }
}

