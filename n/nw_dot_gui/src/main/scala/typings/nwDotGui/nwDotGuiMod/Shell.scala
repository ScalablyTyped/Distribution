package typings.nwDotGui.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shell extends js.Object {
  def openExternal(uri: String): Unit
  def openItem(file_path: String): Unit
  def showItemInFolder(file_path: String): Unit
}

object Shell {
  @scala.inline
  def apply(openExternal: String => Unit, openItem: String => Unit, showItemInFolder: String => Unit): Shell = {
    val __obj = js.Dynamic.literal(openExternal = js.Any.fromFunction1(openExternal), openItem = js.Any.fromFunction1(openItem), showItemInFolder = js.Any.fromFunction1(showItemInFolder))
  
    __obj.asInstanceOf[Shell]
  }
}

