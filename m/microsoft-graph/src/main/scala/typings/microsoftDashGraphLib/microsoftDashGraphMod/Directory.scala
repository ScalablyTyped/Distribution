package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directory extends Entity {
  /** Recently deleted items. Read-only. Nullable. */
  var deletedItems: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
}

object Directory {
  @scala.inline
  def apply(deletedItems: js.Array[DirectoryObject] = null, id: java.lang.String = null): Directory = {
    val __obj = js.Dynamic.literal()
    if (deletedItems != null) __obj.updateDynamic("deletedItems")(deletedItems)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Directory]
  }
}

