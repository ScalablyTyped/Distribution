package typings.openseadragon.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "MouseTracker")
@js.native
class MouseTracker protected () extends StObject {
  def this(options: MouseTrackerOptions) = this()
  
  def blurHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  var clickDistThreshold: Double = js.native
  
  def clickHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  var clickTimeThreshold: Double = js.native
  
  var dblClickDistThreshold: Double = js.native
  
  def dblClickHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  var dblClickTimeThreshold: Double = js.native
  
  def destroy(): Unit = js.native
  
  def dragEndHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def dragHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  var element: Element = js.native
  
  def enterHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def exitHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def focusHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def getActivePointerCount(): Double = js.native
  
  def getActivePointersListByType(`type`: String): GesturePointList = js.native
  
  def getActivePointersListsExceptType(`type`: String): js.Array[GesturePointList] = js.native
  
  def keyDownHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def keyHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def keyUpHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def moveHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def nonPrimaryPressHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def nonPrimaryReleaseHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def pinchHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def pressHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def releaseHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def scrollHandler(event: OSDEvent[js.Any]): Unit = js.native
  
  def setTracking(track: Boolean): js.Any = js.native
  
  def stopHandler(event: OSDEvent[js.Any]): Unit = js.native
}
