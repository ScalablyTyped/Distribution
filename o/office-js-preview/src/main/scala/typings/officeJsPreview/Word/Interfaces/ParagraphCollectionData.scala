package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `paragraphCollection.toJSON()`. */
trait ParagraphCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ParagraphData]] = js.undefined
}

object ParagraphCollectionData {
  @scala.inline
  def apply(items: js.Array[ParagraphData] = null): ParagraphCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphCollectionData]
  }
}

