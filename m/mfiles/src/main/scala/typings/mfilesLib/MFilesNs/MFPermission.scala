package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mfilesLib.mfilesLibNumbers.`0`
  - mfilesLib.mfilesLibNumbers.`1`
  - mfilesLib.mfilesLibNumbers.`2`
*/
trait MFPermission extends js.Object

object MFPermission {
  @scala.inline
  def Allow: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  def Deny: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def NotSet: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

