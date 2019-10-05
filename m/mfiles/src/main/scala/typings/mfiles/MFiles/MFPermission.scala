package typings.mfiles.MFiles

import typings.mfiles.mfilesNumbers.`0`
import typings.mfiles.mfilesNumbers.`1`
import typings.mfiles.mfilesNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mfiles.mfilesNumbers.`0`
  - typings.mfiles.mfilesNumbers.`1`
  - typings.mfiles.mfilesNumbers.`2`
*/
trait MFPermission extends js.Object

object MFPermission {
  @scala.inline
  def Allow: `1` = this.cast(1)
  @scala.inline
  def Deny: `0` = this.cast(0)
  @scala.inline
  def NotSet: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

