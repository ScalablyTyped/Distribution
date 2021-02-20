package typings.openseadragon.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "MouseTracker")
@js.native
class MouseTracker protected () extends StObject {
  def this(options: MouseTrackerOptions) = this()
  
  def blurHandler(event: OSDEvent[_]): Unit = js.native
  
  var clickDistThreshold: Double = js.native
  
  def clickHandler(event: OSDEvent[_]): Unit = js.native
  
  var clickTimeThreshold: Double = js.native
  
  var dblClickDistThreshold: Double = js.native
  
  def dblClickHandler(event: OSDEvent[_]): Unit = js.native
  
  var dblClickTimeThreshold: Double = js.native
  
  def destroy(): Unit = js.native
  
  def dragEndHandler(event: OSDEvent[_]): Unit = js.native
  
  def dragHandler(event: OSDEvent[_]): Unit = js.native
  
  var element: Element = js.native
  
  def enterHandler(event: OSDEvent[_]): Unit = js.native
  
  def exitHandler(event: OSDEvent[_]): Unit = js.native
  
  def focusHandler(event: OSDEvent[_]): Unit = js.native
  
  def getActivePointerCount(): Double = js.native
  
  def getActivePointersListByType(`type`: String): GesturePointList = js.native
  
  def getActivePointersListsExceptType(`type`: String): js.Array[GesturePointList] = js.native
  
  def keyDownHandler(event: OSDEvent[_]): Unit = js.native
  
  def keyHandler(event: OSDEvent[_]): Unit = js.native
  
  def keyUpHandler(event: OSDEvent[_]): Unit = js.native
  
  def moveHandler(event: OSDEvent[_]): Unit = js.native
  
  def nonPrimaryPressHandler(event: OSDEvent[_]): Unit = js.native
  
  def nonPrimaryReleaseHandler(event: OSDEvent[_]): Unit = js.native
  
  def pinchHandler(event: OSDEvent[_]): Unit = js.native
  
  def pressHandler(event: OSDEvent[_]): Unit = js.native
  
  def releaseHandler(event: OSDEvent[_]): Unit = js.native
  
  def scrollHandler(event: OSDEvent[_]): Unit = js.native
  
  def setTracking(track: Boolean): js.Any = js.native
  
  def stopHandler(event: OSDEvent[_]): Unit = js.native
}
