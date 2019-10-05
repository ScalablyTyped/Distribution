package typings.mfiles.MFiles

import typings.mfiles.mfilesNumbers.`0`
import typings.mfiles.mfilesNumbers.`128`
import typings.mfiles.mfilesNumbers.`16384`
import typings.mfiles.mfilesNumbers.`16`
import typings.mfiles.mfilesNumbers.`1`
import typings.mfiles.mfilesNumbers.`32768`
import typings.mfiles.mfilesNumbers.`32`
import typings.mfiles.mfilesNumbers.`4`
import typings.mfiles.mfilesNumbers.`64`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mfiles.mfilesNumbers.`0`
  - typings.mfiles.mfilesNumbers.`1`
  - typings.mfiles.mfilesNumbers.`4`
  - typings.mfiles.mfilesNumbers.`16`
  - typings.mfiles.mfilesNumbers.`32`
  - typings.mfiles.mfilesNumbers.`64`
  - typings.mfiles.mfilesNumbers.`128`
  - typings.mfiles.mfilesNumbers.`16384`
  - typings.mfiles.mfilesNumbers.`32768`
*/
trait MFImportContentFlag extends js.Object

object MFImportContentFlag {
  @scala.inline
  def DeleteContentPackage: `4` = this.cast(4)
  @scala.inline
  def DoNotImportObjectDestructions: `64` = this.cast(64)
  @scala.inline
  def ForceNoStructureIdUpdate: `16384` = this.cast(16384)
  @scala.inline
  def ImportCheckoutStates: `16` = this.cast(16)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def OmitDoneFile: `32768` = this.cast(32768)
  @scala.inline
  def ResetExportTimestamps: `32` = this.cast(32)
  @scala.inline
  def UseMultipleContentPackages: `1` = this.cast(1)
  @scala.inline
  def UseNamesAsAliases: `128` = this.cast(128)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

