package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "notebookCollection.toJSON()". */
trait NotebookCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[NotebookData]] = js.undefined
}

object NotebookCollectionData {
  @scala.inline
  def apply(items: js.Array[NotebookData] = null): NotebookCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCollectionData]
  }
}

