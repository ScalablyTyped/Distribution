package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSettingStringXml extends OmaSetting {
  /** File name associated with the Value property (.xml). */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** Value. (UTF8 encoded byte array) */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object OmaSettingStringXml {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    fileName: java.lang.String = null,
    omaUri: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): OmaSettingStringXml = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmaSettingStringXml]
  }
}

