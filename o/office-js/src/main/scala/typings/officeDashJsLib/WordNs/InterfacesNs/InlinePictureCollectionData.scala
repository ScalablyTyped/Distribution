package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inlinePictureCollection.toJSON()". */
trait InlinePictureCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
}

object InlinePictureCollectionData {
  @scala.inline
  def apply(items: js.Array[InlinePictureData] = null): InlinePictureCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[InlinePictureCollectionData]
  }
}

