package typings.officeDashJsDashPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pageCollection.toJSON()". */
trait PageCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[PageData]] = js.undefined
}

object PageCollectionData {
  @scala.inline
  def apply(items: js.Array[PageData] = null): PageCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageCollectionData]
  }
}

