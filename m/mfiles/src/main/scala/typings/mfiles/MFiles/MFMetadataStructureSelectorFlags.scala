package typings.mfiles.MFiles

import typings.mfiles.mfilesNumbers.`0`
import typings.mfiles.mfilesNumbers.`1`
import typings.mfiles.mfilesNumbers.`2`
import typings.mfiles.mfilesNumbers.`4`
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
*/
trait MFMetadataStructureSelectorFlags extends js.Object

object MFMetadataStructureSelectorFlags {
  @scala.inline
  def IncludeExistingDependencies: `8` = this.cast(8)
  @scala.inline
  def IncludeNewDependencies: `4` = this.cast(4)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def SelectExisting: `2` = this.cast(2)
  @scala.inline
  def SelectNew: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

