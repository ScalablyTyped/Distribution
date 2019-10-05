package typings.mfiles.MFiles

import typings.mfiles.mfilesNumbers.`0`
import typings.mfiles.mfilesNumbers.`16`
import typings.mfiles.mfilesNumbers.`1`
import typings.mfiles.mfilesNumbers.`2`
import typings.mfiles.mfilesNumbers.`32`
import typings.mfiles.mfilesNumbers.`4`
import typings.mfiles.mfilesNumbers.`64`
import typings.mfiles.mfilesNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mfiles.mfilesNumbers.`0`
  - typings.mfiles.mfilesNumbers.`1`
  - typings.mfiles.mfilesNumbers.`2`
  - typings.mfiles.mfilesNumbers.`4`
  - typings.mfiles.mfilesNumbers.`8`
  - typings.mfiles.mfilesNumbers.`16`
  - typings.mfiles.mfilesNumbers.`32`
  - typings.mfiles.mfilesNumbers.`64`
*/
trait MFObjectOperationFlags extends js.Object

object MFObjectOperationFlags {
  @scala.inline
  def ChangeACLInAllVersions: `32` = this.cast(32)
  @scala.inline
  def DisallowNameChange: `4` = this.cast(4)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def RequireChangeSecurityAccess: `8` = this.cast(8)
  @scala.inline
  def RequireEditAccess: `2` = this.cast(2)
  @scala.inline
  def RequireFullAccess: `16` = this.cast(16)
  @scala.inline
  def RequireReadAccess: `1` = this.cast(1)
  @scala.inline
  def RequireSomeAccess: `64` = this.cast(64)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

