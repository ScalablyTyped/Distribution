package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "customXmlPart.toJSON()". */
trait CustomXmlPartData extends js.Object {
  /**
    *
    * The custom XML part's ID. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The custom XML part's namespace URI. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var namespaceUri: js.UndefOr[java.lang.String] = js.undefined
}

object CustomXmlPartData {
  @scala.inline
  def apply(id: java.lang.String = null, namespaceUri: java.lang.String = null): CustomXmlPartData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (namespaceUri != null) __obj.updateDynamic("namespaceUri")(namespaceUri)
    __obj.asInstanceOf[CustomXmlPartData]
  }
}

