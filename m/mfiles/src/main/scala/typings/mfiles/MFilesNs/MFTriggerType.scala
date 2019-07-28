package typings.mfiles.MFilesNs

import typings.mfiles.mfilesNumbers.`0`
import typings.mfiles.mfilesNumbers.`1`
import typings.mfiles.mfilesNumbers.`2`
import typings.mfiles.mfilesNumbers.`3`
import typings.mfiles.mfilesNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mfiles.mfilesNumbers.`0`
  - typings.mfiles.mfilesNumbers.`1`
  - typings.mfiles.mfilesNumbers.`2`
  - typings.mfiles.mfilesNumbers.`3`
  - typings.mfiles.mfilesNumbers.`4`
*/
trait MFTriggerType extends js.Object

object MFTriggerType {
  @scala.inline
  def Daily: `1` = this.cast(1)
  @scala.inline
  def MonthlyDOW: `4` = this.cast(4)
  @scala.inline
  def MonthlyDate: `3` = this.cast(3)
  @scala.inline
  def Once: `0` = this.cast(0)
  @scala.inline
  def Weekly: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

