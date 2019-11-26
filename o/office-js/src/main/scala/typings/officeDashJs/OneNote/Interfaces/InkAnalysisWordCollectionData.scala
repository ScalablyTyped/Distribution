package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisWordCollection.toJSON()". */
trait InkAnalysisWordCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[InkAnalysisWordData]] = js.undefined
}

object InkAnalysisWordCollectionData {
  @scala.inline
  def apply(items: js.Array[InkAnalysisWordData] = null): InkAnalysisWordCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkAnalysisWordCollectionData]
  }
}

