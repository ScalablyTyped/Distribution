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
    Clone: js.Function0[IFileClass],
    DisplayName: java.lang.String,
    DotAndExtension: java.lang.String,
    Extension: java.lang.String,
    FileClass: java.lang.String,
    LoadByExtension: js.Function1[java.lang.String, scala.Unit],
    LoadByFileClass: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    SetFileClassInfo: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit]
  ): IFileClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.updateDynamic("DotAndExtension")(DotAndExtension)
    __obj.updateDynamic("Extension")(Extension)
    __obj.updateDynamic("FileClass")(FileClass)
    __obj.updateDynamic("LoadByExtension")(LoadByExtension)
    __obj.updateDynamic("LoadByFileClass")(LoadByFileClass)
    __obj.updateDynamic("SetFileClassInfo")(SetFileClassInfo)
    __obj.asInstanceOf[IFileClass]
  }
}

