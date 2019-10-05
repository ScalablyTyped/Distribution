package typings.officeDashJsDashPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SectionCollection object, for use in "sectionCollection.set({ ... })". */
trait SectionCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[SectionData]] = js.undefined
}

object SectionCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[SectionData] = null): SectionCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[SectionCollectionUpdateData]
  }
}

