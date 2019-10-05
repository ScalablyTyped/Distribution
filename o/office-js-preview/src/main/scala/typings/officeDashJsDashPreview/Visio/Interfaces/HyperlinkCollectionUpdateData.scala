package typings.officeDashJsDashPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the HyperlinkCollection object, for use in "hyperlinkCollection.set({ ... })". */
trait HyperlinkCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[HyperlinkData]] = js.undefined
}

object HyperlinkCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[HyperlinkData] = null): HyperlinkCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[HyperlinkCollectionUpdateData]
  }
}

