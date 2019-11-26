package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalRangeBorderCollection.toJSON()`. */
trait ConditionalRangeBorderCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.undefined
}

object ConditionalRangeBorderCollectionData {
  @scala.inline
  def apply(items: js.Array[ConditionalRangeBorderData] = null): ConditionalRangeBorderCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRangeBorderCollectionData]
  }
}

