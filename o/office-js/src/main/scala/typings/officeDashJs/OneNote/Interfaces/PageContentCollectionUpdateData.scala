package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageContentCollection object, for use in "pageContentCollection.set({ ... })". */
trait PageContentCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PageContentData]] = js.undefined
}

object PageContentCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[PageContentData] = null): PageContentCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PageContentCollectionUpdateData]
  }
}

