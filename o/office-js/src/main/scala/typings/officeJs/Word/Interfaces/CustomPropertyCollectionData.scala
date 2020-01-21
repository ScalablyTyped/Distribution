package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "customPropertyCollection.toJSON()". */
trait CustomPropertyCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[CustomPropertyData]] = js.undefined
}

object CustomPropertyCollectionData {
  @scala.inline
  def apply(items: js.Array[CustomPropertyData] = null): CustomPropertyCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyCollectionData]
  }
}

