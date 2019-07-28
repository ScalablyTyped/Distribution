package typings.officeDashJsDashPreview.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CustomXmlPartScopedCollection object, for use in "customXmlPartScopedCollection.set({ ... })". */
trait CustomXmlPartScopedCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
}

object CustomXmlPartScopedCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[CustomXmlPartData] = null): CustomXmlPartScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[CustomXmlPartScopedCollectionUpdateData]
  }
}

