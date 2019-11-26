package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CustomXmlPartCollection object, for use in `customXmlPartCollection.set({ ... })`. */
trait CustomXmlPartCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
}

object CustomXmlPartCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[CustomXmlPartData] = null): CustomXmlPartCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXmlPartCollectionUpdateData]
  }
}

