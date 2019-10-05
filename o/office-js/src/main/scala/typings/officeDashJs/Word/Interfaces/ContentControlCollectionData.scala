package typings.officeDashJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "contentControlCollection.toJSON()". */
trait ContentControlCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ContentControlData]] = js.undefined
}

object ContentControlCollectionData {
  @scala.inline
  def apply(items: js.Array[ContentControlData] = null): ContentControlCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ContentControlCollectionData]
  }
}

