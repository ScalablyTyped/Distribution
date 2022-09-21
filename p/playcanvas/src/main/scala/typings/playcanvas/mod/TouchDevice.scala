package typings.playcanvas.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attach a TouchDevice to an element and it will receive and fire events when the element is
  * touched. See also {@link Touch} and {@link TouchEvent}.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "TouchDevice")
@js.native
open class TouchDevice protected () extends EventHandler {
  /**
    * Create a new touch device and attach it to an element.
    *
    * @param {Element} element - The element to attach listen for events on.
    */
  def this(element: Element) = this()
  
  var _cancelHandler: Any = js.native
  
  var _element: Element = js.native
  
  var _endHandler: Any = js.native
  
  def _handleTouchCancel(e: Any): Unit = js.native
  
  def _handleTouchEnd(e: Any): Unit = js.native
  
  def _handleTouchMove(e: Any): Unit = js.native
  
  def _handleTouchStart(e: Any): Unit = js.native
  
  var _moveHandler: Any = js.native
  
  var _startHandler: Any = js.native
  
  /**
    * Attach a device to an element in the DOM. If the device is already attached to an element
    * this method will detach it first.
    *
    * @param {Element} element - The element to attach to.
    */
  def attach(element: Element): Unit = js.native
  
  /**
    * Detach a device from the element it is attached to.
    */
  def detach(): Unit = js.native
}
