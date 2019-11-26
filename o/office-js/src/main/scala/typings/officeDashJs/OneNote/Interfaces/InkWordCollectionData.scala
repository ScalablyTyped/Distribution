package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkWordCollection.toJSON()". */
trait InkWordCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[InkWordData]] = js.undefined
}

object InkWordCollectionData {
  @scala.inline
  def apply(items: js.Array[InkWordData] = null): InkWordCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkWordCollectionData]
  }
}

