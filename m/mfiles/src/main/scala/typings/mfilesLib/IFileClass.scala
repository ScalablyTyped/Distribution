package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileClass extends js.Object {
  var DisplayName: java.lang.String
  val DotAndExtension: java.lang.String
  val Extension: java.lang.String
  val FileClass: java.lang.String
  def Clone(): IFileClass
  def LoadByExtension(Extension: java.lang.String): scala.Unit
  def LoadByFileClass(Extension: java.lang.String, FileClass: java.lang.String): scala.Unit
  def SetFileClassInfo(
    DotAndFileExtension: java.lang.String,
    FileClass: java.lang.String,
    FileClassDisplayName: java.lang.String
  ): scala.Unit
}

