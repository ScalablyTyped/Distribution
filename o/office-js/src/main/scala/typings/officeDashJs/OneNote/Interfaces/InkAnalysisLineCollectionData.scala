package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisLineCollection.toJSON()". */
trait InkAnalysisLineCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[InkAnalysisLineData]] = js.undefined
}

object InkAnalysisLineCollectionData {
  @scala.inline
  def apply(items: js.Array[InkAnalysisLineData] = null): InkAnalysisLineCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkAnalysisLineCollectionData]
  }
}

