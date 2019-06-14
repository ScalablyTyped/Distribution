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
trait MFACLEnforcingMode extends js.Object

object MFACLEnforcingMode {
  @scala.inline
  def Automatic: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def None: mfilesLib.mfilesLibNumbers.`3` = this.cast(3)
  @scala.inline
  def Provided: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  def ResetToDefault: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

