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
    openExternal: java.lang.String => scala.Unit,
    openItem: java.lang.String => scala.Unit,
    showItemInFolder: java.lang.String => scala.Unit
  ): Shell = {
    val __obj = js.Dynamic.literal(openExternal = js.Any.fromFunction1(openExternal), openItem = js.Any.fromFunction1(openItem), showItemInFolder = js.Any.fromFunction1(showItemInFolder))
  
    __obj.asInstanceOf[Shell]
  }
}

