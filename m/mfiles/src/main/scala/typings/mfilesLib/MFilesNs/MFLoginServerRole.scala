package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mfilesLib.mfilesLibNumbers.`0`
  - mfilesLib.mfilesLibNumbers.`1`
  - mfilesLib.mfilesLibNumbers.`2`
  - mfilesLib.mfilesLibNumbers.`4`
  - mfilesLib.mfilesLibNumbers.`8`
*/
trait MFLoginServerRole extends js.Object

object MFLoginServerRole {
  @scala.inline
  def BackupOperator: mfilesLib.mfilesLibNumbers.`4` = this.cast(4)
  @scala.inline
  def LogIn: mfilesLib.mfilesLibNumbers.`8` = this.cast(8)
  @scala.inline
  def None: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def SystemAdministrator: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  def VaultCreator: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

