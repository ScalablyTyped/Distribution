package typings.officeDashJs.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisLineCollection object, for use in "inkAnalysisLineCollection.set({ ... })". */
trait InkAnalysisLineCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InkAnalysisLineData]] = js.undefined
}

object InkAnalysisLineCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[InkAnalysisLineData] = null): InkAnalysisLineCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[InkAnalysisLineCollectionUpdateData]
  }
}

