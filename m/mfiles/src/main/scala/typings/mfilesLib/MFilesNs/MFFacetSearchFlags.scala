package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mfilesLib.mfilesLibNumbers.`0`
  - mfilesLib.mfilesLibNumbers.`2`
  - mfilesLib.mfilesLibNumbers.`4`
  - mfilesLib.mfilesLibNumbers.`8`
  - mfilesLib.mfilesLibNumbers.`16`
  - mfilesLib.mfilesLibNumbers.`32`
  - mfilesLib.mfilesLibNumbers.`64`
*/
trait MFFacetSearchFlags extends js.Object

object MFFacetSearchFlags {
  @scala.inline
  def AscendingOrder: mfilesLib.mfilesLibNumbers.`32` = this.cast(32)
  @scala.inline
  def IgnoreFacetGroupPermissions: mfilesLib.mfilesLibNumbers.`4` = this.cast(4)
  @scala.inline
  def IgnoreFacetValuePermissions: mfilesLib.mfilesLibNumbers.`8` = this.cast(8)
  @scala.inline
  def IgnoreSearchPermissions: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  def None: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def OverrideByConfiguration: mfilesLib.mfilesLibNumbers.`64` = this.cast(64)
  @scala.inline
  def SortFacetValues: mfilesLib.mfilesLibNumbers.`16` = this.cast(16)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

