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
  - mfilesLib.mfilesLibNumbers.`4`
*/
trait MFTriggerType extends js.Object

object MFTriggerType {
  @scala.inline
  def Daily: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  def MonthlyDOW: mfilesLib.mfilesLibNumbers.`4` = this.cast(4)
  @scala.inline
  def MonthlyDate: mfilesLib.mfilesLibNumbers.`3` = this.cast(3)
  @scala.inline
  def Once: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def Weekly: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

