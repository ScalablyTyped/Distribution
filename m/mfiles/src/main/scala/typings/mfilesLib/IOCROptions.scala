package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCROptions extends js.Object {
  var PrimaryLanguage: mfilesLib.MFilesNs.MFOCRLanguage
  var SecondaryLanguage: mfilesLib.MFilesNs.MFOCRLanguage
  def Clone(): IOCROptions
}

object IOCROptions {
  @scala.inline
  def apply(
    Clone: js.Function0[IOCROptions],
    PrimaryLanguage: mfilesLib.MFilesNs.MFOCRLanguage,
    SecondaryLanguage: mfilesLib.MFilesNs.MFOCRLanguage
  ): IOCROptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("PrimaryLanguage")(PrimaryLanguage)
    __obj.updateDynamic("SecondaryLanguage")(SecondaryLanguage)
    __obj.asInstanceOf[IOCROptions]
  }
}

