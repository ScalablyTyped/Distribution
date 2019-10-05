package typings.nwDotGui.nwDotGuiMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shell extends js.Object {
  def openExternal(uri: String): Unit
  def openItem(file_path: String): Unit
  def showItemInFolder(file_path: String): Unit
}

@JSImport("nw.gui", "Shell")
@js.native
object Shell extends TopLevel[Shell]

