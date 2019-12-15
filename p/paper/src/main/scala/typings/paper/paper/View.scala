package typings.paper.paper

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The View object wraps an HTML element and handles drawing and user
  * interaction through mouse and keyboard for it. It offer means to scroll the
  * view, find the currently visible bounds in project coordinates, or the
  * center, both useful for constructing artwork that should appear centered on
  * screen.
  */
@JSGlobal("paper.View")
@js.native
class View () extends js.Object {
  /** 
    * Controls whether the view is automatically updated in the next animation
    * frame on changes, or whether you prefer to manually call
    * {@link #update} or {@link #requestUpdate} after changes.
    * Note that this is `true` by default, except for Node.js, where manual
    * updates make more sense.
    */
  var autoUpdate: Boolean = js.native
  /** 
    * The bounds of the currently visible area in project coordinates.
    */
  val bounds: Rectangle = js.native
  /** 
    * The center of the visible area in project coordinates.
    */
  var center: Point = js.native
  /** 
    * The underlying native element.
    */
  val element: HTMLCanvasElement = js.native
  /** 
    * The view's transformation matrix, defining the view onto the project's
    * contents (position, zoom level, rotation, etc).
    */
  var matrix: Matrix = js.native
  /** 
    * The function to be called when the mouse clicks on the view. The function
    * receives a {@link MouseEvent} object which contains information about the
    * mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy, reaching
    * the view at the end, unless they are stopped before with {@link
    * Event#stopPropagation()} or by returning `false` from a handler.
    * 
    * @see Item#onClick
    */
  var onClick: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse double clicks on the view. The
    * function receives a {@link MouseEvent} object which contains information
    * about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy, reaching
    * the view at the end, unless they are stopped before with {@link
    * Event#stopPropagation()} or by returning `false` from a handler.
    * 
    * @see Item#onDoubleClick
    */
  var onDoubleClick: js.Function | Null = js.native
  /** 
    * Handler function to be called on each frame of an animation.
    * The function receives an event object which contains information about
    * the frame event:
    * 
    * @see Item#onFrame
    * 
    * @option event.count {Number} the number of times the frame event was
    * fired
    * @option event.time {Number} the total amount of time passed since the
    * first frame event in seconds
    * @option event.delta {Number} the time passed in seconds since the last
    * frame event
    */
  var onFrame: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse button is pushed down on the
    * view. The function receives a {@link MouseEvent} object which contains
    * information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy, reaching
    * the view at the end, unless they are stopped before with {@link
    * Event#stopPropagation()} or by returning `false` from a handler.
    * 
    * @see Item#onMouseDown
    */
  var onMouseDown: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse position changes while the mouse
    * is being dragged over the view. The function receives a {@link
    * MouseEvent} object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy, reaching
    * the view at the end, unless they are stopped before with {@link
    * Event#stopPropagation()} or by returning `false` from a handler.
    * 
    * @see Item#onMouseDrag
    */
  var onMouseDrag: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse moves over the view. This
    * function will only be called again, once the mouse moved outside of the
    * view first. The function receives a {@link MouseEvent} object which
    * contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy, reaching
    * the view at the end, unless they are stopped before with {@link
    * Event#stopPropagation()} or by returning `false` from a handler.
    * 
    * @see Item#onMouseEnter
    */
  var onMouseEnter: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse moves out of the view.
    * The function receives a {@link MouseEvent} object which contains
    * information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy, reaching
    * the view at the end, unless they are stopped before with {@link
    * Event#stopPropagation()} or by returning `false` from a handler.
    * 
    * @see View#onMouseLeave
    */
  var onMouseLeave: js.Function | Null = js.native
  /** 
    * The function to be called repeatedly while the mouse moves over the
    * view. The function receives a {@link MouseEvent} object which contains
    * information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy, reaching
    * the view at the end, unless they are stopped before with {@link
    * Event#stopPropagation()} or by returning `false` from a handler.
    * 
    * @see Item#onMouseMove
    */
  var onMouseMove: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse button is released over the item.
    * The function receives a {@link MouseEvent} object which contains
    * information about the mouse event.
    * 
    * @see Item#onMouseUp
    */
  var onMouseUp: js.Function | Null = js.native
  /** 
    * Handler function that is called whenever a view is resized.
    */
  var onResize: js.Function | Null = js.native
  /** 
    * The ratio between physical pixels and device-independent pixels (DIPs)
    * of the underlying canvas / device.
    * It is `1` for normal displays, and `2` or more for
    * high-resolution displays.
    */
  val pixelRatio: Double = js.native
  /** 
    * The resoltuion of the underlying canvas / device in pixel per inch (DPI).
    * It is `72` for normal displays, and `144` for high-resolution
    * displays with a pixel-ratio of `2`.
    */
  val resolution: Double = js.native
  /** 
    * The current rotation angle of the view, as described by its
    * {@link #matrix}.
    */
  var rotation: Double = js.native
  /** 
    * The current scale factor of the view, as described by its
    * {@link #matrix}.
    * 
    * @see #zoom
    */
  var scaling: Point = js.native
  /** 
    * The size of the visible area in project coordinates.
    */
  val size: Size = js.native
  /** 
    * The size of the view. Changing the view's size will resize it's
    * underlying element.
    */
  var viewSize: Size = js.native
  /** 
    * The view's zoom factor by which the project coordinates are magnified.
    * 
    * @see #scaling
    */
  var zoom: Double = js.native
  /** 
    * Emit an event on the view.
    * 
    * @param type - the event type: {@values 'frame', 'resize',
    *     'mousedown', 'mouseup', 'mousedrag', 'click', 'doubleclick',
    *     'mousemove', 'mouseenter', 'mouseleave'}
    * @param event - an object literal containing properties describing
    * the event
    * 
    * @return true if the event had listeners
    */
  def emit(`type`: String, event: js.Object): Boolean = js.native
  /** 
    * Determines and returns the event location in project coordinate space.
    * 
    * @param event - the native event object for which to determine the
    *     location.
    * 
    * @return the event point in project coordinates.
    */
  def getEventPoint(event: Event): Point = js.native
  /** 
    * Checks whether the view is inserted into the browser DOM.
    * 
    * @return true if the view is inserted
    */
  def isInserted(): Boolean = js.native
  /** 
    * Checks whether the view is currently visible within the current browser
    * viewport.
    * 
    * @return true if the view is visible
    */
  def isVisible(): Boolean = js.native
  /** 
    * Detach one or more event handlers from the view.
    * 
    * @param param - an object literal containing one or more of the
    *     following properties: {@values frame, resize}
    * 
    * @return this view itself, so calls can be chained
    */
  def off(param: js.Object): View = js.native
  /** 
    * Detach an event handler from the view.
    * 
    * @param type - the event type: {@values 'frame', 'resize',
    *     'mousedown', 'mouseup', 'mousedrag', 'click', 'doubleclick',
    *     'mousemove', 'mouseenter', 'mouseleave'}
    * @param function - the function to be detached
    * 
    * @return this view itself, so calls can be chained
    */
  def off(`type`: String, callback: js.Function): View = js.native
  /** 
    * Attach one or more event handlers to the view.
    * 
    * @param param - an object literal containing one or more of the
    *     following properties: {@values frame, resize}
    * 
    * @return this view itself, so calls can be chained
    */
  def on(param: js.Object): View = js.native
  /** 
    * Attach an event handler to the view.
    * 
    * @param type - the type of event: {@values 'frame', 'resize',
    *     'mousedown', 'mouseup', 'mousedrag', 'click', 'doubleclick',
    *     'mousemove', 'mouseenter', 'mouseleave'}
    * @param function - the function to be called when the event
    *     occurs, receiving a {@link MouseEvent} or {@link Event} object as its
    *     sole argument
    * 
    * @return this view itself, so calls can be chained
    */
  def on(`type`: String, callback: js.Function): View = js.native
  /** 
    * Makes all animation pause by removing the view from the request animation
    * loop.
    */
  def pause(): Unit = js.native
  /** 
    * Makes all animation play by adding the view to the request animation
    * loop.
    */
  def play(): Unit = js.native
  /** 
    * Converts the passed point from project coordinate space to view
    * coordinate space, which is measured in browser pixels in relation to the
    * position of the view element.
    * 
    * @param point - the point in project coordinates to be converted
    * 
    * @return the point converted into view coordinates
    */
  def projectToView(point: Point): Point = js.native
  /** 
    * Removes this view from the project and frees the associated element.
    */
  def remove(): Unit = js.native
  /** 
    * Requests an update of the view if there are changes through the browser's
    * requestAnimationFrame() mechanism for smooth animation. Note that when
    * using built-in event handlers for interaction, animation and load events,
    * updates are automatically invoked for you automatically at the end.
    */
  def requestUpdate(): Unit = js.native
  /** 
    * Check if the view has one or more event handlers of the specified type.
    * 
    * @param type - the event type: {@values 'frame', 'resize',
    *     'mousedown', 'mouseup', 'mousedrag', 'click', 'doubleclick',
    *     'mousemove', 'mouseenter', 'mouseleave'}
    * 
    * @return true if the view has one or more event handlers of
    * the specified type
    */
  def responds(`type`: String): Boolean = js.native
  /** 
    * Rotates the view by a given angle around the given center point.
    * 
    * Angles are oriented clockwise and measured in degrees.
    * 
    * @see Matrix#rotate(angle[, center])
    * 
    * @param angle - the rotation angle
    */
  def rotate(angle: Double): Unit = js.native
  def rotate(angle: Double, center: Point): Unit = js.native
  /** 
    * Scales the view by the given values from its center point, or optionally
    * from a supplied point.
    * 
    * @param hor - the horizontal scale factor
    * @param ver - the vertical scale factor
    */
  def scale(hor: Double, ver: Double): Unit = js.native
  def scale(hor: Double, ver: Double, center: Point): Unit = js.native
  /** 
    * Scales the view by the given value from its center point, or optionally
    * from a supplied point.
    * 
    * @param scale - the scale factor
    */
  def scale(scale: Double): Unit = js.native
  def scale(scale: Double, center: Point): Unit = js.native
  /** 
    * Shears the view by the given values from its center point, or optionally
    * by a supplied point.
    * 
    * @see Matrix#shear(hor, ver[, center])
    * 
    * @param hor - the horizontal shear factor
    * @param ver - the vertical shear factor
    */
  def shear(hor: Double, ver: Double): Unit = js.native
  def shear(hor: Double, ver: Double, center: Point): Unit = js.native
  /** 
    * Shears the view by the given value from its center point, or optionally
    * by a supplied point.
    * 
    * @see Matrix#shear(shear[, center])
    * 
    * @param shear - the horziontal and vertical shear factors as a point
    */
  def shear(shear: Point): Unit = js.native
  def shear(shear: Point, center: Point): Unit = js.native
  /** 
    * Skews the view by the given angles from its center point, or optionally
    * by a supplied point.
    * 
    * @see Matrix#shear(hor, ver[, center])
    * 
    * @param hor - the horizontal skew angle in degrees
    * @param ver - the vertical sskew angle in degrees
    */
  def skew(hor: Double, ver: Double): Unit = js.native
  def skew(hor: Double, ver: Double, center: Point): Unit = js.native
  /** 
    * Skews the view by the given angles from its center point, or optionally
    * by a supplied point.
    * 
    * @see Matrix#shear(skew[, center])
    * 
    * @param skew - the horziontal and vertical skew angles in degrees
    */
  def skew(skew: Point): Unit = js.native
  def skew(skew: Point, center: Point): Unit = js.native
  /** 
    * Transform the view.
    * 
    * @param matrix - the matrix by which the view shall be transformed
    */
  def transform(matrix: Matrix): Unit = js.native
  /** 
    * Translates (scrolls) the view by the given offset vector.
    * 
    * @param delta - the offset to translate the view by
    */
  def translate(delta: Point): Unit = js.native
  /** 
    * Updates the view if there are changes. Note that when using built-in
    * event hanlders for interaction, animation and load events, this method is
    * invoked for you automatically at the end.
    * 
    * @return true if the view was updated
    */
  def update(): Boolean = js.native
  /** 
    * Converts the passed point from view coordinate space to project
    * coordinate space.
    * 
    * @param point - the point in view coordinates to be converted
    * 
    * @return the point converted into project coordinates
    */
  def viewToProject(point: Point): Point = js.native
}

