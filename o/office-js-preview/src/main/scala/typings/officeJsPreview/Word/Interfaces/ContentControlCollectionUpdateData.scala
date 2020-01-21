package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ContentControlCollection object, for use in "contentControlCollection.set({ ... })". */
trait ContentControlCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ContentControlData]] = js.undefined
}

object ContentControlCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ContentControlData] = null): ContentControlCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlCollectionUpdateData]
  }
}

