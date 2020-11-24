package typings.nwGui.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shell extends js.Object {
  
  def openExternal(uri: String): Unit = js.native
  
  def openItem(file_path: String): Unit = js.native
  
  def showItemInFolder(file_path: String): Unit = js.native
}
@JSImport("nw.gui", "Shell")
@js.native
object Shell extends TopLevel[Shell]
