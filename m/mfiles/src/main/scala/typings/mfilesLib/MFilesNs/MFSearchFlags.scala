package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mfilesLib.mfilesLibNumbers.`0`
  - mfilesLib.mfilesLibNumbers.`1`
  - mfilesLib.mfilesLibNumbers.`2`
  - mfilesLib.mfilesLibNumbers.`4`
  - mfilesLib.mfilesLibNumbers.`16`
*/
trait MFSearchFlags extends js.Object

object MFSearchFlags {
  @scala.inline
  def DisableRelevancyRanking: mfilesLib.mfilesLibNumbers.`16` = this.cast(16)
  @scala.inline
  def LookAllObjectTypes: mfilesLib.mfilesLibNumbers.`4` = this.cast(4)
  @scala.inline
  def LookInAllVersions: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  def None: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def ReturnLatestVisibleVersion: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

