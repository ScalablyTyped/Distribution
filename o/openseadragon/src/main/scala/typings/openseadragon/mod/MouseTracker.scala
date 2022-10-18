package typings.openseadragon.mod

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "MouseTracker")
@js.native
open class MouseTracker protected () extends StObject {
  def this(options: MouseTrackerOptions) = this()
  
  def blurHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("blurHandler")
  var blurHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  var clickDistThreshold: Double = js.native
  
  def clickHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("clickHandler")
  var clickHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  var clickTimeThreshold: Double = js.native
  
  def contextMenuHandler(event: ContextMenuMouseTrackerEvent): Unit = js.native
  @JSName("contextMenuHandler")
  var contextMenuHandler_Original: EventHandler[ContextMenuMouseTrackerEvent] = js.native
  
  var dblClickDistThreshold: Double = js.native
  
  def dblClickHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("dblClickHandler")
  var dblClickHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  var dblClickTimeThreshold: Double = js.native
  
  def destroy(): Unit = js.native
  
  def dragEndHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("dragEndHandler")
  var dragEndHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def dragHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("dragHandler")
  var dragHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  var element: Element = js.native
  
  def enterHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("enterHandler")
  var enterHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  /**
    * @deprecated use leaveHandler instead
    */
  def exitHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  /**
    * @deprecated use leaveHandler instead
    */
  @JSName("exitHandler")
  var exitHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def focusHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("focusHandler")
  var focusHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def getActivePointerCount(): Double = js.native
  
  def getActivePointersListByType(`type`: String): GesturePointList = js.native
  
  def keyDownHandler(event: KeyMouseTrackerEvent): Unit = js.native
  @JSName("keyDownHandler")
  var keyDownHandler_Original: EventHandler[KeyMouseTrackerEvent] = js.native
  
  def keyHandler(event: KeyMouseTrackerEvent): Unit = js.native
  @JSName("keyHandler")
  var keyHandler_Original: EventHandler[KeyMouseTrackerEvent] = js.native
  
  def keyUpHandler(event: KeyMouseTrackerEvent): Unit = js.native
  @JSName("keyUpHandler")
  var keyUpHandler_Original: EventHandler[KeyMouseTrackerEvent] = js.native
  
  def leaveHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("leaveHandler")
  var leaveHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def moveHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("moveHandler")
  var moveHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def nonPrimaryPressHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("nonPrimaryPressHandler")
  var nonPrimaryPressHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def nonPrimaryReleaseHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("nonPrimaryReleaseHandler")
  var nonPrimaryReleaseHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def outHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("outHandler")
  var outHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def overHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("overHandler")
  var overHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def pinchHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("pinchHandler")
  var pinchHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def preProcessEventHandler(event: EventProcessInfo): Unit = js.native
  @JSName("preProcessEventHandler")
  var preProcessEventHandler_Original: PreprocessEventHandler = js.native
  
  def pressHandler(event: PressMouseTrackerEvent): Unit = js.native
  @JSName("pressHandler")
  var pressHandler_Original: EventHandler[PressMouseTrackerEvent] = js.native
  
  def releaseHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("releaseHandler")
  var releaseHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def scrollHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("scrollHandler")
  var scrollHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
  
  def setTracking(track: Boolean): MouseTracker = js.native
  
  def stopHandler(event: MouseTrackerEvent[Event]): Unit = js.native
  @JSName("stopHandler")
  var stopHandler_Original: EventHandler[MouseTrackerEvent[Event]] = js.native
}
