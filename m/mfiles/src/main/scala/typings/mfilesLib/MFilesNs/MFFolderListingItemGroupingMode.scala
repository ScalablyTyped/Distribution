package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mfilesLib.mfilesLibNumbers.`-1`
  - mfilesLib.mfilesLibNumbers.`0`
  - mfilesLib.mfilesLibNumbers.`1`
  - mfilesLib.mfilesLibNumbers.`1024`
*/
trait MFFolderListingItemGroupingMode extends js.Object

object MFFolderListingItemGroupingMode {
  @scala.inline
  def GroupObjectsByObjectType: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  def GroupViewsAndFoldersByType: mfilesLib.mfilesLibNumbers.`1024` = this.cast(1024)
  @scala.inline
  def NoGrouping: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def Unspecified: mfilesLib.mfilesLibNumbers.`-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

