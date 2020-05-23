package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSettingStringXml extends OmaSetting {
  // File name associated with the Value property (.xml).
  var fileName: js.UndefOr[String] = js.undefined
  // Value. (UTF8 encoded byte array)
  var value: js.UndefOr[Double] = js.undefined
}

object OmaSettingStringXml {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    fileName: String = null,
    omaUri: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): OmaSettingStringXml = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmaSettingStringXml]
  }
}

