package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StringDictionary
import typings.pixiJs.PIXI.utils.EventEmitter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interaction manager deals with mouse, touch and pointer events.
  *
  * Any DisplayObject can be interactive if its `interactive` property is set to true.
  *
  * This manager also supports multitouch.
  *
  * An instance of this class is automatically created by default, and can be found at `renderer.plugins.interaction`
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@js.native
trait InteractionManager extends EventEmitter {
  
  /**
    * Should default browser actions automatically be prevented.
    * Does not apply to pointer events for backwards compatibility
    * preventDefault on pointer events stops mouse events from firing
    * Thus, for every pointer event, there will always be either a mouse of touch event alongside it.
    *
    * @member {boolean} PIXI.InteractionManager#autoPreventDefault
    * @default true
    */
  var autoPreventDefault: Boolean = js.native
  
  /**
    * The mode of the cursor that is being used.
    * The value of this is a key from the cursorStyles dictionary.
    *
    * @member {string} PIXI.InteractionManager#currentCursorMode
    */
  var currentCursorMode: String = js.native
  
  /**
    * Dictionary of how different cursor modes are handled. Strings are handled as CSS cursor
    * values, objects are handled as dictionaries of CSS values for interactionDOMElement,
    * and functions are called instead of changing the CSS.
    * Default CSS cursor values are provided for 'default' and 'pointer' modes.
    * @member {Object.<string, Object>} PIXI.InteractionManager#cursorStyles
    */
  var cursorStyles: StringDictionary[js.Any] = js.native
  
  /**
    * Destroys the interaction manager
    *
    */
  def destroy(): Unit = js.native
  
  /**
    * An event data object to handle all the event tracking/dispatching
    *
    * @member {object} PIXI.InteractionManager#eventData
    */
  var eventData: js.Any = js.native
  
  /**
    * Have events been attached to the dom element?
    *
    * @protected
    * @member {boolean} PIXI.InteractionManager#eventsAdded
    */
  var eventsAdded: Boolean = js.native
  
  /**
    * Hit tests a point against the display tree, returning the first interactive object that is hit.
    *
    * @param {PIXI.Point} globalPoint - A point to hit test with, in global space.
    * @param {PIXI.Container} [root] - The root display object to start from. If omitted, defaults
    * to the last rendered root of the associated renderer.
    * @return {PIXI.DisplayObject} The hit display object, if any.
    */
  def hitTest(globalPoint: Point): DisplayObject = js.native
  def hitTest(globalPoint: Point, root: Container): DisplayObject = js.native
  
  /**
    * The DOM element to bind to.
    *
    * @protected
    * @member {HTMLElement} PIXI.InteractionManager#interactionDOMElement
    */
  var interactionDOMElement: HTMLElement = js.native
  
  /**
    * Maximum requency in milliseconds at which pointer over/out states will be checked by {@link tickerUpdate}.
    *
    * @member {number} PIXI.InteractionManager#interactionFrequency
    * @default 10
    */
  var interactionFrequency: Double = js.native
  
  /**
    * Last rendered object or temp object
    * @readonly
    * @protected
    * @member {PIXI.DisplayObject}
    */
  val lastObjectRendered: DisplayObject = js.native
  
  /**
    * Maps x and y coords from a DOM object and maps them correctly to the PixiJS view. The
    * resulting value is stored in the point. This takes into account the fact that the DOM
    * element could be scaled and positioned anywhere on the screen.
    *
    * @param  {PIXI.IPointData} point - the point that the result will be stored in
    * @param  {number} x - the x coord of the position to map
    * @param  {number} y - the y coord of the position to map
    */
  def mapPositionToPoint(point: IPointData, x: Double, y: Double): Unit = js.native
  
  /**
    * The mouse data
    *
    * @member {PIXI.InteractionData} PIXI.InteractionManager#mouse
    */
  var mouse: InteractionData = js.native
  
  /**
    * Is the mouse hovering over the renderer?
    *
    * @protected
    * @member {boolean} PIXI.InteractionManager#mouseOverRenderer
    */
  var mouseOverRenderer: Boolean = js.native
  
  /**
    * This property determines if mousemove and touchmove events are fired only when the cursor
    * is over the object.
    * Setting to true will make things work more in line with how the DOM version works.
    * Setting to false can make things easier for things like dragging
    * It is currently set to false as this is how PixiJS used to work. This will be set to true in
    * future versions of pixi.
    *
    * @member {boolean} PIXI.InteractionManager#moveWhenInside
    * @default false
    */
  var moveWhenInside: Boolean = js.native
  
  /**
    * This function is provides a neat way of crawling through the scene graph and running a
    * specified function on all interactive objects it finds. It will also take care of hit
    * testing the interactive objects and passes the hit across in the function.
    *
    * @protected
    * @param {PIXI.InteractionEvent} interactionEvent - event containing the point that
    *  is tested for collision
    * @param {PIXI.Container|PIXI.Sprite|PIXI.TilingSprite} displayObject - the displayObject
    *  that will be hit test (recursively crawls its children)
    * @param {Function} [func] - the function that will be called on each interactive object. The
    *  interactionEvent, displayObject and hit will be passed to the function
    * @param {boolean} [hitTest] - indicates whether we want to calculate hits
    *  or just iterate through all interactive objects
    */
  /* protected */ def processInteractive(interactionEvent: InteractionEvent, displayObject: Container): Unit = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Container,
    func: js.UndefOr[scala.Nothing],
    hitTest: Boolean
  ): Unit = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Container,
    func: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Container,
    func: js.Function1[/* repeated */ js.Any, _],
    hitTest: Boolean
  ): Unit = js.native
  /* protected */ def processInteractive(interactionEvent: InteractionEvent, displayObject: Sprite): Unit = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Sprite,
    func: js.UndefOr[scala.Nothing],
    hitTest: Boolean
  ): Unit = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Sprite,
    func: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Sprite,
    func: js.Function1[/* repeated */ js.Any, _],
    hitTest: Boolean
  ): Unit = js.native
  /* protected */ def processInteractive(interactionEvent: InteractionEvent, displayObject: TilingSprite): Unit = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: TilingSprite,
    func: js.UndefOr[scala.Nothing],
    hitTest: Boolean
  ): Unit = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: TilingSprite,
    func: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: TilingSprite,
    func: js.Function1[/* repeated */ js.Any, _],
    hitTest: Boolean
  ): Unit = js.native
  
  /**
    * The renderer this interaction manager works for.
    *
    * @member {PIXI.AbstractRenderer} PIXI.InteractionManager#renderer
    */
  var renderer: AbstractRenderer = js.native
  
  /**
    * The current resolution / device pixel ratio.
    *
    * @member {number} PIXI.InteractionManager#resolution
    * @default 1
    */
  var resolution: Double = js.native
  
  /**
    * Sets the current cursor mode, handling any callbacks or CSS style changes.
    *
    * @param {string} mode - cursor mode, a key from the cursorStyles dictionary
    */
  def setCursorMode(mode: String): Unit = js.native
  
  /**
    * Sets the DOM element which will receive mouse/touch events. This is useful for when you have
    * other DOM elements on top of the renderers Canvas element. With this you'll be bale to delegate
    * another DOM element to receive those events.
    *
    * @param {HTMLElement} element - the DOM element which will receive mouse and touch events.
    * @param {number} [resolution=1] - The resolution / device pixel ratio of the new element (relative to the canvas).
    */
  def setTargetElement(element: HTMLElement): Unit = js.native
  def setTargetElement(element: HTMLElement, resolution: Double): Unit = js.native
  
  /**
    * Does the device support pointer events
    * https://www.w3.org/Submission/pointer-events/
    *
    * @readonly
    * @member {boolean} PIXI.InteractionManager#supportsPointerEvents
    */
  val supportsPointerEvents: Boolean = js.native
  
  /**
    * Does the device support touch events
    * https://www.w3.org/TR/touch-events/
    *
    * @readonly
    * @member {boolean} PIXI.InteractionManager#supportsTouchEvents
    */
  val supportsTouchEvents: Boolean = js.native
  
  /**
    * Has the system ticker been added?
    *
    * @protected
    * @member {boolean} PIXI.InteractionManager#tickerAdded
    */
  var tickerAdded: Boolean = js.native
  
  /**
    * Updates the state of interactive objects if at least {@link interactionFrequency}
    * milliseconds have passed since the last invocation.
    *
    * Invoked by a throttled ticker update from {@link PIXI.Ticker.system}.
    *
    * @param {number} deltaTime - time delta since the last call
    */
  def tickerUpdate(deltaTime: Double): Unit = js.native
  
  /**
    * Updates the state of interactive objects.
    */
  def update(): Unit = js.native
  
  /**
    * Should the InteractionManager automatically add {@link tickerUpdate} to {@link PIXI.Ticker.system}.
    *
    * @member {boolean}
    * @default true
    */
  var useSystemTicker: Boolean = js.native
}
