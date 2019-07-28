package typings.paper.paperNs

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.View")
@js.native
class View () extends Base {
  /**
    * Controls whether the view is automatically updated in the next animation frame on changes, or whether you prefer to manually call update() or requestUpdate() after changes. Note that this is true by default, except for Node.js, where manual updates make more sense.
    */
  var autoUpdate: Boolean = js.native
  /**
    * The bounds of the currently visible area in project coordinates.
    * Read only.
    */
  var bounds: Rectangle = js.native
  /**
    * The center of the visible area in project coordinates.
    */
  var center: Point = js.native
  /**
    * The underlying native element.
    * Read Only.
    */
  val element: HTMLCanvasElement = js.native
  /**
    * The view’s transformation matrix, defining the view onto the project’s contents (position, zoom level, rotation, etc).
    */
  var matrix: Matrix = js.native
  /**
    * The ratio between physical pixels and device-independent pixels (DIPs) of the underlying canvas / device.
    * It is 1 for normal displays, and 2 or more for high-resolution displays.
    * Read only.
    */
  val pixelRatio: Double = js.native
  /**
    * The resoltuion of the underlying canvas / device in pixel per inch (DPI).
    * It is 72 for normal displays, and 144 for high-resolution displays with a pixel-ratio of 2.
    * Read only.
    */
  val resolution: Double = js.native
  /**
    * The current rotation angle of the view, as described by its matrix.
    */
  var rotation: Double = js.native
  /**
    * The current scale factor of the view, as described by its matrix.
    */
  var scaling: Point = js.native
  /**
    * The size of the visible area in project coordinates.
    * Read only.
    */
  val size: Size = js.native
  /**
    * The size of the view. Changing the view's size will resize it's underlying element.
    */
  var viewSize: Size = js.native
  /**
    * The zoom factor by which the project coordinates are magnified.
    */
  var zoom: Double = js.native
  /**
    * Draws the view when using paper.js directly in JavaScript
    */
  def draw(): Unit = js.native
  /**
    * Emit an event on the view.
    * @param type - the event type: ‘frame’, ‘resize’, ‘mousedown’, ‘mouseup’, ‘mousedrag’, ‘click’, ‘doubleclick’, ‘mousemove’, ‘mouseenter’, ‘mouseleave’
    * @param event - an object literal containing properties describing the event.
    */
  def emit(`type`: String, event: js.Any): Boolean = js.native
  /**
    * Determines and returns the event location in project coordinate space.
    * @param event - the native event object for which to determine the location.
    */
  def getEventPoint(event: Event): Point = js.native
  /**
    * Checks whether the view is inserted into the browser DOM.
    */
  def isInserted(): Boolean = js.native
  /**
    * Checks whether the view is currently visible within the current browser viewport.
    */
  def isVisible(): Boolean = js.native
  /**
    * Detach one or more event handlers from the view.
    * @param param -  an object literal containing one or more of the following properties: frame, resize
    */
  def off(param: js.Any): Item = js.native
  /**
    * Detach an event handler from the view.
    * @param type - the event type: ‘frame’, ‘resize’, ‘mousedown’, ‘mouseup’, ‘mousedrag’, ‘click’, ‘doubleclick’, ‘mousemove’, ‘mouseenter’, ‘mouseleave’
    * @param callback - The function to be detached
    */
  def off(
    `type`: String,
    callback: js.Function1[(/* event */ Event) | (/* event */ IFrameEvent), Boolean | Unit]
  ): Item = js.native
  /**
    * Attach one or more event handlers to the view.
    */
  def on(param: js.Any): Item = js.native
  /**
    * Attach an event handler to the view.
    * @param type - the event type: ‘frame’, ‘resize’, ‘mousedown’, ‘mouseup’, ‘mousedrag’, ‘click’, ‘doubleclick’, ‘mousemove’, ‘mouseenter’, ‘mouseleave’
    * @param callback - The function to be called when the event occurs
    */
  def on(
    `type`: String,
    callback: js.Function1[(/* event */ Event) | (/* event */ IFrameEvent), Boolean | Unit]
  ): Item = js.native
  /**
    * The function to be called when the mouse clicks on the item. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onClick(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse double clicks on the item. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onDoubleClick(event: MouseEvent): Unit | Boolean = js.native
  /**
    * Handler function to be called on each frame of an animation.
    * The function receives an event object which contains information about the frame event:
    */
  def onFrame(event: IFrameEvent): Unit = js.native
  /**
    * The function to be called when the mouse button is pushed down on the item. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseDown(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse position changes while the mouse is being dragged. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseDrag(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse moves over the item. This function will only be called again, once the mouse moved outside of the item first. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseEnter(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse moves out of the item.
    * The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseLeave(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called repeatedly when the mouse moves on top of the item. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseMove(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse button is released over the item.
    * The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseUp(event: MouseEvent): Unit | Boolean = js.native
  /**
    * Handler function that is called whenever a view is resized.
    */
  def onResize(event: Event): Unit = js.native
  /**
    * Makes all animation pause by removing the view to the request animation loop.
    */
  def pause(): Unit = js.native
  /**
    * Makes all animation play by adding the view to the request animation loop.
    */
  def play(): Unit = js.native
  /**
    * Converts the passed point from project coordinate space to view coordinate space, which is measured in browser pixels in relation to the position of the view element.
    * @param point - the point in project coordinates to be converted
    */
  def projectToView(point: Point): Point = js.native
  /**
    * Removes this view from the project and frees the associated element.
    */
  def remove(): Unit = js.native
  /**
    * Requests an update of the view if there are changes through the browser’s requestAnimationFrame() mechanism for smooth animation. Note that when using built-in event handlers for interaction, animation and load events, updates are automatically invoked for you automatically at the end.
    */
  def requestUpdate(): Unit = js.native
  /**
    * Check if the view has one or more event handlers of the specified type.
    * @param type - the event type: ‘frame’, ‘resize’, ‘mousedown’, ‘mouseup’, ‘mousedrag’, ‘click’, ‘doubleclick’, ‘mousemove’, ‘mouseenter’, ‘mouseleave’
    */
  def responds(`type`: String): Boolean = js.native
  /**
    * Rotates the view by a given angle around the given center point.
    * Angles are oriented clockwise and measured in degrees.
    * @param angle - the rotation angle
    * @param center [optional] - default: view.center
    */
  def rotate(angle: Double): Unit = js.native
  def rotate(angle: Double, center: Point): Unit = js.native
  /**
    * Scales the view by the given values from its center point, or optionally from a supplied point.
    * @param hor - the horizontal scale factor
    * @param ver - the vertical scale factor
    * @param center [optional] - default: view.center
    */
  def scale(hor: Double, ver: Double): Unit = js.native
  def scale(hor: Double, ver: Double, center: Point): Unit = js.native
  /**
    * Scales the view by the given value from its center point, or optionally from a supplied point.
    * @param scale -  the scale factor
    * @param center [optional] - default: view.center
    */
  def scale(scale: Double): Unit = js.native
  def scale(scale: Double, center: Point): Unit = js.native
  /**
    * Scrolls the view by the given vector.
    * @param point - the vector to scroll by
    */
  def scrollBy(point: Point): Unit = js.native
  /**
    * Shears the view by the given values from its center point, or optionally from a supplied point.
    * @param hor - the horizontal shear factor
    * @param ver - the vertical shear factor
    * @param center [optional] - default: view.center
    */
  def shear(hor: Double, ver: Double): Unit = js.native
  def shear(hor: Double, ver: Double, center: Point): Unit = js.native
  /**
    * Shears the view by the given value from its center point, or optionally from a supplied point.
    * @param shear -  the shear factor
    * @param center [optional] - default: view.center
    */
  def shear(shear: Point): Unit = js.native
  def shear(shear: Point, center: Point): Unit = js.native
  /**
    * Skews the view by the given values from its center point, or optionally from a supplied point.
    * @param hor - the horizontal skew angle in degrees
    * @param ver - the vertical skew angle in degrees
    * @param center [optional] - default: view.center
    */
  def skew(hor: Double, ver: Double): Unit = js.native
  def skew(hor: Double, ver: Double, center: Point): Unit = js.native
  /**
    * Skews the view by the given value from its center point, or optionally from a supplied point.
    * @param skew -  the horziontal and vertical skew angles in degrees
    * @param center [optional] - default: view.center
    */
  def skew(skew: Point): Unit = js.native
  def skew(skew: Point, center: Point): Unit = js.native
  /**
    * Translates (scrolls) the view by the given offset vector.
    * @param delta - the offset to translate the view by
    */
  def translate(delta: Point): Unit = js.native
  /**
    * Updates the view if there are changes. Note that when using built-in event hanlders for interaction, animation and load events, this method is invoked for you automatically at the end.
    */
  def update(): Unit = js.native
  /**
    * Converts the passed point from view coordinate space to project coordinate space.
    * @param point - the point in view coordinates to be converted
    */
  def viewToProject(point: Point): Point = js.native
}

