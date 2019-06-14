package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mfilesLib.mfilesLibNumbers.`0`
  - mfilesLib.mfilesLibNumbers.`1`
  - mfilesLib.mfilesLibNumbers.`2`
*/
trait MFDBEngine extends js.Object

object MFDBEngine {
  @scala.inline
  def Firebird: mfilesLib.mfilesLibNumbers.`1` = this.cast(1)
  @scala.inline
  def MSSQLServer: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  def None: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

