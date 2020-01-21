package typings.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "hyperlinkCollection.toJSON()". */
trait HyperlinkCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[HyperlinkData]] = js.undefined
}

object HyperlinkCollectionData {
  @scala.inline
  def apply(items: js.Array[HyperlinkData] = null): HyperlinkCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkCollectionData]
  }
}

