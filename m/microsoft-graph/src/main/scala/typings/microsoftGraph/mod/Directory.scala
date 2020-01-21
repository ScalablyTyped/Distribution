package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directory extends Entity {
  // Recently deleted items. Read-only. Nullable.
  var deletedItems: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
}

object Directory {
  @scala.inline
  def apply(deletedItems: js.Array[DirectoryObject] = null, id: String = null): Directory = {
    val __obj = js.Dynamic.literal()
    if (deletedItems != null) __obj.updateDynamic("deletedItems")(deletedItems.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directory]
  }
}

