package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisParagraphCollection.toJSON()". */
trait InkAnalysisParagraphCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[InkAnalysisParagraphData]] = js.undefined
}

object InkAnalysisParagraphCollectionData {
  @scala.inline
  def apply(items: js.Array[InkAnalysisParagraphData] = null): InkAnalysisParagraphCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkAnalysisParagraphCollectionData]
  }
}

