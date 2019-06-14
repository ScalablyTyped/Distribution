package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mfilesLib.mfilesLibNumbers.`0`
  - mfilesLib.mfilesLibNumbers.`1`
  - mfilesLib.mfilesLibNumbers.`4`
  - mfilesLib.mfilesLibNumbers.`16`
  - mfilesLib.mfilesLibNumbers.`32`
  - mfilesLib.mfilesLibNumbers.`64`
  - mfilesLib.mfilesLibNumbers.`128`
  - mfilesLib.mfilesLibNumbers.`16384`
  - mfilesLib.mfilesLibNumbers.`32768`
*/
trait MFImportContentFlag extends js.Object

object MFImportContentFlag {
  @scala.inline
  def DeleteContentPackage: mfilesLib.mfilesLibNumbers.`4` = this.cast(4)
  @scala.inline
  def DoNotImportObjectDestructions: mfilesLib.mfilesLibNumbers.`64` = this.cast(64)
  @scala.inline
  def ForceNoStructureIdUpdate: mfilesLib.mfilesLibNumbers.`16384` = this.cast(16384)
  @scala.inline
  def ImportCheckoutStates: mfilesLib.mfilesLibNumbers.`16` = this.cast(16)
  @scala.inline
  def None: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def OmitDoneFile: mfilesLib.mfilesLibNumbers.`32768` = this.cast(32768)
  @scala.inline
  def ResetExportTimestamps: mfilesLib.mfilesLibNumbers.`32` = this.cast(32)
  @scala.inline
  def UseMultipleContentPackages: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  def UseNamesAsAliases: mfilesLib.mfilesLibNumbers.`128` = this.cast(128)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

