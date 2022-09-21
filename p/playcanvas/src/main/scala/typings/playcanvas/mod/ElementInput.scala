package typings.playcanvas.mod

import typings.playcanvas.anon.UseMouse
import typings.playcanvas.anon.X
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles mouse and touch events for {@link ElementComponent}s. When input events occur on an
  * ElementComponent this fires the appropriate events on the ElementComponent.
  */
@JSImport("playcanvas", "ElementInput")
@js.native
open class ElementInput protected () extends StObject {
  /**
    * Create a new ElementInput instance.
    *
    * @param {Element} domElement - The DOM element.
    * @param {object} [options] - Optional arguments.
    * @param {boolean} [options.useMouse] - Whether to allow mouse input. Defaults to true.
    * @param {boolean} [options.useTouch] - Whether to allow touch input. Defaults to true.
    * @param {boolean} [options.useXr] - Whether to allow XR input sources. Defaults to true.
    */
  def this(domElement: Element) = this()
  def this(domElement: Element, options: UseMouse) = this()
  
  var _app: Any = js.native
  
  var _attached: Boolean = js.native
  
  def _buildHitCorners(element: Any, screenOrWorldCorners: Any, scaleX: Any, scaleY: Any, scaleZ: Any): Any = js.native
  
  def _calcMouseCoords(event: Any): Unit = js.native
  
  def _calcTouchCoords(touch: Any): X = js.native
  
  def _calculateRay3d(x: Any, y: Any, camera: Any, ray: Any): Boolean = js.native
  
  def _calculateRayScreen(x: Any, y: Any, camera: Any, ray: Any): Boolean = js.native
  
  def _calculateScaleToScreen(element: Any): Vec3 = js.native
  
  def _calculateScaleToWorld(element: Any): Vec3 = js.native
  
  def _checkElement(ray: Any, element: Any, screen: Any): Double = js.native
  
  def _determineTouchedElements(event: Any): js.Object = js.native
  
  var _downHandler: Any = js.native
  
  var _elements: js.Array[Any] = js.native
  
  var _enabled: Boolean = js.native
  
  def _fireEvent(name: Any, evt: Any): Unit = js.native
  
  def _getTargetElement(camera: Any, x: Any, y: Any): Any = js.native
  
  def _getTargetElementByRay(ray: Any, camera: Any): Any = js.native
  
  def _handleDown(event: Any): Unit = js.native
  
  def _handleMove(event: Any): Unit = js.native
  
  def _handleTouchEnd(event: Any): Unit = js.native
  
  def _handleTouchMove(event: Any): Unit = js.native
  
  def _handleTouchStart(event: Any): Unit = js.native
  
  def _handleUp(event: Any): Unit = js.native
  
  def _handleWheel(event: Any): Unit = js.native
  
  var _hoveredElement: Any = js.native
  
  var _lastX: Double = js.native
  
  var _lastY: Double = js.native
  
  var _moveHandler: Any = js.native
  
  def _onElementMouseEvent(eventType: Any, event: Any): Unit = js.native
  
  def _onElementSelectEvent(eventType: Any, inputSource: Any, event: Any): Unit = js.native
  
  def _onSelectEnd(inputSource: Any, event: Any): Unit = js.native
  
  def _onSelectStart(inputSource: Any, event: Any): Unit = js.native
  
  def _onXrEnd(): Unit = js.native
  
  def _onXrInputRemove(inputSource: Any): Unit = js.native
  
  def _onXrStart(): Unit = js.native
  
  def _onXrUpdate(): Unit = js.native
  
  var _pressedElement: Any = js.native
  
  var _selectEventsAttached: Boolean = js.native
  
  def _sortElements(a: Any, b: Any): Any = js.native
  
  var _sortHandler: Any = js.native
  
  var _target: Element = js.native
  
  var _touchcancelHandler: Any = js.native
  
  var _touchendHandler: Any = js.native
  
  var _touchmoveHandler: Any = js.native
  
  var _touchstartHandler: Any = js.native
  
  var _upHandler: Any = js.native
  
  var _useMouse: Boolean = js.native
  
  var _useTouch: Boolean = js.native
  
  var _useXr: Boolean = js.native
  
  var _wheelHandler: Any = js.native
  
  /**
    * Add a {@link ElementComponent} to the internal list of ElementComponents that are being
    * checked for input.
    *
    * @param {ElementComponent} element - The ElementComponent.
    */
  def addElement(element: ElementComponent): Unit = js.native
  
  def app: Any = js.native
  def app_=(arg: Any): Unit = js.native
  
  /**
    * Attach mouse and touch events to a DOM element.
    *
    * @param {Element} domElement - The DOM element.
    */
  def attach(domElement: Element): Unit = js.native
  
  def attachSelectEvents(): Unit = js.native
  
  /**
    * Remove mouse and touch events from the DOM element that it is attached to.
    */
  def detach(): Unit = js.native
  
  def enabled: Boolean = js.native
  def enabled_=(arg: Boolean): Unit = js.native
  
  /**
    * Remove a {@link ElementComponent} from the internal list of ElementComponents that are being
    * checked for input.
    *
    * @param {ElementComponent} element - The ElementComponent.
    */
  def removeElement(element: ElementComponent): Unit = js.native
}
