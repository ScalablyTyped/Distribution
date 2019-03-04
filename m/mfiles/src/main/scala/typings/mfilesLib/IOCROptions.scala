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
    val __obj = js.Dynamic.literal(Clone = Clone, PrimaryLanguage = PrimaryLanguage, SecondaryLanguage = SecondaryLanguage)
  
    __obj.asInstanceOf[IOCROptions]
  }
}

