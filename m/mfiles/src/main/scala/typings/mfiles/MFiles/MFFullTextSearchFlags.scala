package typings.mfiles.MFiles

import typings.mfiles.mfilesNumbers.`0`
import typings.mfiles.mfilesNumbers.`131072`
import typings.mfiles.mfilesNumbers.`262144`
import typings.mfiles.mfilesNumbers.`268435456`
import typings.mfiles.mfilesNumbers.`4`
import typings.mfiles.mfilesNumbers.`536870912`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mfiles.mfilesNumbers.`0`
  - typings.mfiles.mfilesNumbers.`4`
  - typings.mfiles.mfilesNumbers.`131072`
  - typings.mfiles.mfilesNumbers.`262144`
  - typings.mfiles.mfilesNumbers.`268435456`
  - typings.mfiles.mfilesNumbers.`536870912`
*/
trait MFFullTextSearchFlags extends js.Object

object MFFullTextSearchFlags {
  @scala.inline
  def LookInFileData: `536870912` = this.cast(536870912)
  @scala.inline
  def LookInMetaData: `268435456` = this.cast(268435456)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def Stemming: `4` = this.cast(4)
  @scala.inline
  def TypeAllWords: `131072` = this.cast(131072)
  @scala.inline
  def TypeAnyWords: `262144` = this.cast(262144)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

