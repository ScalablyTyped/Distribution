package typings
package menubarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object menubarLibStrings {
  @js.native
  sealed trait bottomCenter
    extends menubarLib.MenubarNs.Position
  
  @js.native
  sealed trait bottomLeft
    extends menubarLib.MenubarNs.Position
  
  @js.native
  sealed trait bottomRight
    extends menubarLib.MenubarNs.Position
  
  @js.native
  sealed trait center
    extends menubarLib.MenubarNs.Position
  
  @js.native
  sealed trait topCenter
    extends menubarLib.MenubarNs.Position
  
  @js.native
  sealed trait topLeft
    extends menubarLib.MenubarNs.Position
  
  @js.native
  sealed trait topRight
    extends menubarLib.MenubarNs.Position
  
  @js.native
  sealed trait trayBottomCenter
    extends menubarLib.MenubarNs.Position
       with menubarLib.MenubarNs.TrayBounds
  
  @js.native
  sealed trait trayBottomLeft
    extends menubarLib.MenubarNs.Position
       with menubarLib.MenubarNs.TrayBounds
  
  @js.native
  sealed trait trayBottomRight
    extends menubarLib.MenubarNs.Position
       with menubarLib.MenubarNs.TrayBounds
  
  @js.native
  sealed trait trayCenter
    extends menubarLib.MenubarNs.Position
       with menubarLib.MenubarNs.TrayBounds
  
  @js.native
  sealed trait trayLeft
    extends menubarLib.MenubarNs.Position
       with menubarLib.MenubarNs.TrayBounds
  
  @js.native
  sealed trait trayRight
    extends menubarLib.MenubarNs.Position
       with menubarLib.MenubarNs.TrayBounds
  
  @scala.inline
  def bottomCenter: bottomCenter = "bottomCenter".asInstanceOf[bottomCenter]
  @scala.inline
  def bottomLeft: bottomLeft = "bottomLeft".asInstanceOf[bottomLeft]
  @scala.inline
  def bottomRight: bottomRight = "bottomRight".asInstanceOf[bottomRight]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def topCenter: topCenter = "topCenter".asInstanceOf[topCenter]
  @scala.inline
  def topLeft: topLeft = "topLeft".asInstanceOf[topLeft]
  @scala.inline
  def topRight: topRight = "topRight".asInstanceOf[topRight]
  @scala.inline
  def trayBottomCenter: trayBottomCenter = "trayBottomCenter".asInstanceOf[trayBottomCenter]
  @scala.inline
  def trayBottomLeft: trayBottomLeft = "trayBottomLeft".asInstanceOf[trayBottomLeft]
  @scala.inline
  def trayBottomRight: trayBottomRight = "trayBottomRight".asInstanceOf[trayBottomRight]
  @scala.inline
  def trayCenter: trayCenter = "trayCenter".asInstanceOf[trayCenter]
  @scala.inline
  def trayLeft: trayLeft = "trayLeft".asInstanceOf[trayLeft]
  @scala.inline
  def trayRight: trayRight = "trayRight".asInstanceOf[trayRight]
}

