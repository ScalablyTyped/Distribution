package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shell extends js.Object {
  def openExternal(uri: java.lang.String): scala.Unit
  def openItem(file_path: java.lang.String): scala.Unit
  def showItemInFolder(file_path: java.lang.String): scala.Unit
}

object Shell {
  @scala.inline
  def apply(
    openExternal: js.Function1[java.lang.String, scala.Unit],
    openItem: js.Function1[java.lang.String, scala.Unit],
    showItemInFolder: js.Function1[java.lang.String, scala.Unit]
  ): Shell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openExternal")(openExternal)
    __obj.updateDynamic("openItem")(openItem)
    __obj.updateDynamic("showItemInFolder")(showItemInFolder)
    __obj.asInstanceOf[Shell]
  }
}

