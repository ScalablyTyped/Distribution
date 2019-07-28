package typings.mfiles.MFilesNs

import typings.mfiles.mfilesNumbers.`0`
import typings.mfiles.mfilesNumbers.`16`
import typings.mfiles.mfilesNumbers.`1`
import typings.mfiles.mfilesNumbers.`2`
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
  - typings.mfiles.mfilesNumbers.`64`
*/
trait MFSpecialObjectFlag extends js.Object

object MFSpecialObjectFlag {
  @scala.inline
  def Conflict: `16` = this.cast(16)
  @scala.inline
  def Deleted: `2` = this.cast(2)
  @scala.inline
  def HasSharedFiles: `8` = this.cast(8)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def Normal: `64` = this.cast(64)
  @scala.inline
  def RecentlyAccessedByValid: `4` = this.cast(4)
  @scala.inline
  def Shortcut: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

