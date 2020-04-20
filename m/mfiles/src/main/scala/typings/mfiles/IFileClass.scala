package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileClass extends js.Object {
  var DisplayName: String
  val DotAndExtension: String
  val Extension: String
  val FileClass: String
  def Clone(): IFileClass
  def LoadByExtension(Extension: String): Unit
  def LoadByFileClass(Extension: String, FileClass: String): Unit
  def SetFileClassInfo(DotAndFileExtension: String, FileClass: String, FileClassDisplayName: String): Unit
}

object IFileClass {
  @scala.inline
  def apply(
    Clone: () => IFileClass,
    DisplayName: String,
    DotAndExtension: String,
    Extension: String,
    FileClass: String,
    LoadByExtension: String => Unit,
    LoadByFileClass: (String, String) => Unit,
    SetFileClassInfo: (String, String, String) => Unit
  ): IFileClass = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DisplayName = DisplayName.asInstanceOf[js.Any], DotAndExtension = DotAndExtension.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], FileClass = FileClass.asInstanceOf[js.Any], LoadByExtension = js.Any.fromFunction1(LoadByExtension), LoadByFileClass = js.Any.fromFunction2(LoadByFileClass), SetFileClassInfo = js.Any.fromFunction3(SetFileClassInfo))
    __obj.asInstanceOf[IFileClass]
  }
}

