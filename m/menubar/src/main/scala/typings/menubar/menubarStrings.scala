package typings.menubar

import typings.menubar.MenubarNs.Position
import typings.menubar.MenubarNs.TrayBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object menubarStrings {
  @js.native
  sealed trait bottomCenter extends Position
  
  @js.native
  sealed trait bottomLeft extends Position
  
  @js.native
  sealed trait bottomRight extends Position
  
  @js.native
  sealed trait center extends Position
  
  @js.native
  sealed trait topCenter extends Position
  
  @js.native
  sealed trait topLeft extends Position
  
  @js.native
  sealed trait topRight extends Position
  
  @js.native
  sealed trait trayBottomCenter
    extends Position
       with TrayBounds
  
  @js.native
  sealed trait trayBottomLeft
    extends Position
       with TrayBounds
  
  @js.native
  sealed trait trayBottomRight
    extends Position
       with TrayBounds
  
  @js.native
  sealed trait trayCenter
    extends Position
       with TrayBounds
  
  @js.native
  sealed trait trayLeft
    extends Position
       with TrayBounds
  
  @js.native
  sealed trait trayRight
    extends Position
       with TrayBounds
  
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

