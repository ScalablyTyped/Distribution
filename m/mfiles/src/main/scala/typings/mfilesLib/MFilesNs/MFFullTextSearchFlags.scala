package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mfilesLib.mfilesLibNumbers.`0`
  - mfilesLib.mfilesLibNumbers.`4`
  - mfilesLib.mfilesLibNumbers.`131072`
  - mfilesLib.mfilesLibNumbers.`262144`
  - mfilesLib.mfilesLibNumbers.`268435456`
  - mfilesLib.mfilesLibNumbers.`536870912`
*/
trait MFFullTextSearchFlags extends js.Object

object MFFullTextSearchFlags {
  @scala.inline
  def LookInFileData: mfilesLib.mfilesLibNumbers.`536870912` = this.cast(536870912)
  @scala.inline
  def LookInMetaData: mfilesLib.mfilesLibNumbers.`268435456` = this.cast(268435456)
  @scala.inline
  def None: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def Stemming: mfilesLib.mfilesLibNumbers.`4` = this.cast(4)
  @scala.inline
  def TypeAllWords: mfilesLib.mfilesLibNumbers.`131072` = this.cast(131072)
  @scala.inline
  def TypeAnyWords: mfilesLib.mfilesLibNumbers.`262144` = this.cast(262144)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

