package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "sectionCollection.toJSON()". */
trait SectionCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[SectionData]] = js.undefined
}

object SectionCollectionData {
  @scala.inline
  def apply(items: js.Array[SectionData] = null): SectionCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionCollectionData]
  }
}

