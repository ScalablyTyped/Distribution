package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `styleCollection.toJSON()`. */
trait StyleCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[StyleData]] = js.undefined
}

object StyleCollectionData {
  @scala.inline
  def apply(items: js.Array[StyleData] = null): StyleCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleCollectionData]
  }
}

