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
  - mfilesLib.mfilesLibNumbers.`64`
*/
trait MFSpecialObjectFlag extends js.Object

object MFSpecialObjectFlag {
  @scala.inline
  def Conflict: mfilesLib.mfilesLibNumbers.`16` = this.cast(16)
  @scala.inline
  def Deleted: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  def HasSharedFiles: mfilesLib.mfilesLibNumbers.`8` = this.cast(8)
  @scala.inline
  def None: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def Normal: mfilesLib.mfilesLibNumbers.`64` = this.cast(64)
  @scala.inline
  def RecentlyAccessedByValid: mfilesLib.mfilesLibNumbers.`4` = this.cast(4)
  @scala.inline
  def Shortcut: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

