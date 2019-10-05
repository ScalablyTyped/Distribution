package typings.officeDashJsDashPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pageContentCollection.toJSON()". */
trait PageContentCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[PageContentData]] = js.undefined
}

object PageContentCollectionData {
  @scala.inline
  def apply(items: js.Array[PageContentData] = null): PageContentCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PageContentCollectionData]
  }
}

