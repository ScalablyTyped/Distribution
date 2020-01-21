package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSettingBase64 extends OmaSetting {
  // File name associated with the Value property (.cer
  var fileName: js.UndefOr[String] = js.undefined
  // Value. (Base64 encoded string)
  var value: js.UndefOr[String] = js.undefined
}

object OmaSettingBase64 {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    fileName: String = null,
    omaUri: String = null,
    value: String = null
  ): OmaSettingBase64 = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmaSettingBase64]
  }
}

