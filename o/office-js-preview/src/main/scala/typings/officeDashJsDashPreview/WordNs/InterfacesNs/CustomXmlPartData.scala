package typings.officeDashJsDashPreview.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "customXmlPart.toJSON()". */
trait CustomXmlPartData extends js.Object {
  /**
    *
    * Gets the ID of the custom XML part. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the namespace URI of the custom XML part. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var namespaceUri: js.UndefOr[String] = js.undefined
}

object CustomXmlPartData {
  @scala.inline
  def apply(id: String = null, namespaceUri: String = null): CustomXmlPartData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (namespaceUri != null) __obj.updateDynamic("namespaceUri")(namespaceUri)
    __obj.asInstanceOf[CustomXmlPartData]
  }
}

