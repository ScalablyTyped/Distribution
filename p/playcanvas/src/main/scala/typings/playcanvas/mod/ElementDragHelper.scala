package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class that makes it easy to create Elements that can be dragged by the mouse or touch.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "ElementDragHelper")
@js.native
open class ElementDragHelper protected () extends EventHandler {
  /**
    * Create a new ElementDragHelper instance.
    *
    * @param {ElementComponent} element - The Element that should become draggable.
    * @param {string} [axis] - Optional axis to constrain to, either 'x', 'y' or null.
    */
  def this(element: ElementComponent) = this()
  def this(element: ElementComponent, axis: String) = this()
  
  var _app: AppBase = js.native
  
  var _axis: String = js.native
  
  def _calculateDragScale(): Unit = js.native
  
  def _chooseRayOriginAndDirection(): Unit = js.native
  
  var _deltaHandlePosition: Vec3 = js.native
  
  var _deltaMousePosition: Vec3 = js.native
  
  def _determineInputPosition(event: Any): Unit = js.native
  
  var _dragCamera: Any = js.native
  
  var _dragScale: Vec3 = js.native
  
  var _dragStartHandlePosition: Vec3 = js.native
  
  var _dragStartMousePosition: Vec3 = js.native
  
  var _element: ElementComponent = js.native
  
  var _enabled: Boolean = js.native
  
  var _handleMouseUpOrTouchEnd: Any = js.native
  
  var _hasDragListeners: Boolean = js.native
  
  var _isDragging: Boolean = js.native
  
  def _onMouseDownOrTouchStart(event: Any): Unit = js.native
  
  def _onMouseUpOrTouchEnd(): Unit = js.native
  
  /**
    * This method is linked to `_element` events: `mousemove` and `touchmove`
    *
    * @param {ElementTouchEvent} event - The event.
    * @private
    */
  /* private */ var _onMove: Any = js.native
  
  /**
    * This method calculates the `Vec3` intersection point of plane/ray intersection based on
    * the mouse/touch input event. If there is no intersection, it returns `null`.
    *
    * @param {ElementTouchEvent} event - The event.
    * @returns {Vec3|null} The `Vec3` intersection point of plane/ray intersection, if there
    * is an intersection, otherwise `null`
    * @private
    */
  /* private */ var _screenToLocal: Any = js.native
  
  def _toggleDragListeners(onOrOff: Any): Unit = js.native
  
  /**
    * Fired when a new drag operation starts.
    *
    * @event ElementDragHelper#drag:start
    */
  /**
    * Fired when the current new drag operation ends.
    *
    * @event ElementDragHelper#drag:end
    */
  /**
    * Fired whenever the position of the dragged element changes.
    *
    * @event ElementDragHelper#drag:move
    * @param {Vec3} value - The current position.
    */
  def _toggleLifecycleListeners(onOrOff: Any): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def enabled: Boolean = js.native
  def enabled_=(arg: Boolean): Unit = js.native
  
  def isDragging: Boolean = js.native
}
