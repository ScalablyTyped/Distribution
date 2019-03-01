package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraryData extends js.Object {
  var items: js.UndefOr[js.Array[LibraryItem]] = js.undefined
}

object LibraryData {
  @scala.inline
  def apply(items: js.Array[LibraryItem] = null): LibraryData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[LibraryData]
  }
}

