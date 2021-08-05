package typings.menubar

import typings.electron.mod.Tray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWindowPositionMod {
  
  @JSImport("menubar/lib/util/getWindowPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWindowPosition(tray: Tray): WindowPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowPosition")(tray.asInstanceOf[js.Any]).asInstanceOf[WindowPosition]
  
  inline def taskbarLocation(tray: Tray): TaskbarLocation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("taskbarLocation")(tray.asInstanceOf[js.Any]).asInstanceOf[TaskbarLocation_]
  
  /* Rewritten from type alias, can be one of: 
    - typings.menubar.menubarStrings.top
    - typings.menubar.menubarStrings.bottom
    - typings.menubar.menubarStrings.left
    - typings.menubar.menubarStrings.right
  */
  trait TaskbarLocation_ extends StObject
  object TaskbarLocation_ {
    
    inline def bottom: typings.menubar.menubarStrings.bottom = "bottom".asInstanceOf[typings.menubar.menubarStrings.bottom]
    
    inline def left: typings.menubar.menubarStrings.left = "left".asInstanceOf[typings.menubar.menubarStrings.left]
    
    inline def right: typings.menubar.menubarStrings.right = "right".asInstanceOf[typings.menubar.menubarStrings.right]
    
    inline def top: typings.menubar.menubarStrings.top = "top".asInstanceOf[typings.menubar.menubarStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.menubar.menubarStrings.trayCenter
    - typings.menubar.menubarStrings.topRight
    - typings.menubar.menubarStrings.trayBottomCenter
    - typings.menubar.menubarStrings.trayBottomLeft
    - typings.menubar.menubarStrings.bottomRight
  */
  trait WindowPosition extends StObject
  object WindowPosition {
    
    inline def bottomRight: typings.menubar.menubarStrings.bottomRight = "bottomRight".asInstanceOf[typings.menubar.menubarStrings.bottomRight]
    
    inline def topRight: typings.menubar.menubarStrings.topRight = "topRight".asInstanceOf[typings.menubar.menubarStrings.topRight]
    
    inline def trayBottomCenter: typings.menubar.menubarStrings.trayBottomCenter = "trayBottomCenter".asInstanceOf[typings.menubar.menubarStrings.trayBottomCenter]
    
    inline def trayBottomLeft: typings.menubar.menubarStrings.trayBottomLeft = "trayBottomLeft".asInstanceOf[typings.menubar.menubarStrings.trayBottomLeft]
    
    inline def trayCenter: typings.menubar.menubarStrings.trayCenter = "trayCenter".asInstanceOf[typings.menubar.menubarStrings.trayCenter]
  }
}
