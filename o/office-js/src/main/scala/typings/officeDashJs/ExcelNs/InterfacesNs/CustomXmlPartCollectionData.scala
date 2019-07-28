package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "customXmlPartCollection.toJSON()". */
trait CustomXmlPartCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
}

object CustomXmlPartCollectionData {
  @scala.inline
  def apply(items: js.Array[CustomXmlPartData] = null): CustomXmlPartCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[CustomXmlPartCollectionData]
  }
}

