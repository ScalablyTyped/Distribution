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
  - mfilesLib.mfilesLibNumbers.`16`
  - mfilesLib.mfilesLibNumbers.`32`
  - mfilesLib.mfilesLibNumbers.`64`
*/
trait MFObjectOperationFlags extends js.Object

object MFObjectOperationFlags {
  @scala.inline
  def ChangeACLInAllVersions: mfilesLib.mfilesLibNumbers.`32` = this.cast(32)
  @scala.inline
  def DisallowNameChange: mfilesLib.mfilesLibNumbers.`4` = this.cast(4)
  @scala.inline
  def None: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def RequireChangeSecurityAccess: mfilesLib.mfilesLibNumbers.`8` = this.cast(8)
  @scala.inline
  def RequireEditAccess: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  def RequireFullAccess: mfilesLib.mfilesLibNumbers.`16` = this.cast(16)
  @scala.inline
  def RequireReadAccess: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  def RequireSomeAccess: mfilesLib.mfilesLibNumbers.`64` = this.cast(64)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

