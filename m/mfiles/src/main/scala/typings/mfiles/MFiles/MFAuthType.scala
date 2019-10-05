package typings.mfiles.MFiles

import typings.mfiles.mfilesNumbers.`0`
import typings.mfiles.mfilesNumbers.`1`
import typings.mfiles.mfilesNumbers.`2`
import typings.mfiles.mfilesNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mfiles.mfilesNumbers.`0`
  - typings.mfiles.mfilesNumbers.`1`
  - typings.mfiles.mfilesNumbers.`2`
  - typings.mfiles.mfilesNumbers.`3`
*/
trait MFAuthType extends js.Object

object MFAuthType {
  @scala.inline
  def LoggedOnWindowsUser: `1` = this.cast(1)
  @scala.inline
  def SpecificMFilesUser: `3` = this.cast(3)
  @scala.inline
  def SpecificWindowsUser: `2` = this.cast(2)
  @scala.inline
  def Unknown: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

