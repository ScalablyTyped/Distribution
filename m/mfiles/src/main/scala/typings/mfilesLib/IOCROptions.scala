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
    Clone: () => IOCROptions,
    PrimaryLanguage: mfilesLib.MFilesNs.MFOCRLanguage,
    SecondaryLanguage: mfilesLib.MFilesNs.MFOCRLanguage
  ): IOCROptions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PrimaryLanguage = PrimaryLanguage, SecondaryLanguage = SecondaryLanguage)
  
    __obj.asInstanceOf[IOCROptions]
  }
}

