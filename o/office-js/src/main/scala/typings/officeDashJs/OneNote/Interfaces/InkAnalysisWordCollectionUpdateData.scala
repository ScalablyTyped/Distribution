package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisWordCollection object, for use in "inkAnalysisWordCollection.set({ ... })". */
trait InkAnalysisWordCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InkAnalysisWordData]] = js.undefined
}

object InkAnalysisWordCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[InkAnalysisWordData] = null): InkAnalysisWordCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[InkAnalysisWordCollectionUpdateData]
  }
}

