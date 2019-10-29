package typings.menubar

import typings.electron.electronMod.Tray
import typings.menubar.libUtilGetWindowPositionMod.TaskbarLocation
import typings.menubar.libUtilGetWindowPositionMod.WindowPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar/lib/util/getWindowPosition", JSImport.Namespace)
@js.native
object libUtilGetWindowPositionMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.menubar.menubarStrings.top
    - typings.menubar.menubarStrings.bottom
    - typings.menubar.menubarStrings.left
    - typings.menubar.menubarStrings.right
  */
  trait TaskbarLocation extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.menubar.menubarStrings.trayCenter
    - typings.menubar.menubarStrings.topRight
    - typings.menubar.menubarStrings.trayBottomCenter
    - typings.menubar.menubarStrings.trayBottomLeft
    - typings.menubar.menubarStrings.bottomRight
  */
  trait WindowPosition extends js.Object
  
  def getWindowPosition(tray: Tray): WindowPosition = js.native
  def taskbarLocation(tray: Tray): TaskbarLocation = js.native
}

