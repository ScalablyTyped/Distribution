package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkStrokeCollection.toJSON()". */
trait InkStrokeCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[InkStrokeData]] = js.undefined
}

object InkStrokeCollectionData {
  @scala.inline
  def apply(items: js.Array[InkStrokeData] = null): InkStrokeCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[InkStrokeCollectionData]
  }
}

