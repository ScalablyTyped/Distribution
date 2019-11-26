package typings.officeDashJsDashPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InlinePictureCollection object, for use in "inlinePictureCollection.set({ ... })". */
trait InlinePictureCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
}

object InlinePictureCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[InlinePictureData] = null): InlinePictureCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinePictureCollectionUpdateData]
  }
}

