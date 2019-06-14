package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mfilesLib.mfilesLibNumbers.`0`
  - mfilesLib.mfilesLibNumbers.`1`
  - mfilesLib.mfilesLibNumbers.`2`
  - mfilesLib.mfilesLibNumbers.`3`
*/
trait MFAuthType extends js.Object

object MFAuthType {
  @scala.inline
  def LoggedOnWindowsUser: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  def SpecificMFilesUser: mfilesLib.mfilesLibNumbers.`3` = this.cast(3)
  @scala.inline
  def SpecificWindowsUser: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  def Unknown: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

