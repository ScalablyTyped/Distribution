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

object IFileClass {
  @scala.inline
  def apply(
    Clone: () => IFileClass,
    DisplayName: java.lang.String,
    DotAndExtension: java.lang.String,
    Extension: java.lang.String,
    FileClass: java.lang.String,
    LoadByExtension: java.lang.String => scala.Unit,
    LoadByFileClass: (java.lang.String, java.lang.String) => scala.Unit,
    SetFileClassInfo: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit
  ): IFileClass = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DisplayName = DisplayName, DotAndExtension = DotAndExtension, Extension = Extension, FileClass = FileClass, LoadByExtension = js.Any.fromFunction1(LoadByExtension), LoadByFileClass = js.Any.fromFunction2(LoadByFileClass), SetFileClassInfo = js.Any.fromFunction3(SetFileClassInfo))
  
    __obj.asInstanceOf[IFileClass]
  }
}

