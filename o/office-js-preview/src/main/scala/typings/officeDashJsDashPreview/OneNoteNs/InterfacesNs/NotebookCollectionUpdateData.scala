package typings.officeDashJsDashPreview.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the NotebookCollection object, for use in "notebookCollection.set({ ... })". */
trait NotebookCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[NotebookData]] = js.undefined
}

object NotebookCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[NotebookData] = null): NotebookCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[NotebookCollectionUpdateData]
  }
}

