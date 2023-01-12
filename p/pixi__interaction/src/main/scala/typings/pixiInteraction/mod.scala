package typings.pixiInteraction

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiDisplay.mod.DisplayObject
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiInteraction.anon.ReadonlyInteractionTracki
import typings.pixiMath.libIpointdataMod.IPointData
import typings.pixiMath.mod.Point
import typings.pixiUtils.libTypesMod.Dict
import typings.pixiUtils.mod.EventEmitter
import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.Touch
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/interaction", "InteractionData")
  @js.native
  open class InteractionData () extends StObject {
    
    /**
      * Indicates which button was pressed on the mouse or pointer device to trigger the event.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/button
      */
    var button: Double = js.native
    
    /**
      * Indicates which buttons are pressed on the mouse or pointer device when the event is triggered.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/buttons
      */
    var buttons: Double = js.native
    
    def copyEvent(event: InteractivePointerEvent): Unit = js.native
    /**
      * Copies properties from normalized event data.
      * @param {Touch|MouseEvent|PointerEvent} event - The normalized event data
      */
    def copyEvent(event: Touch): Unit = js.native
    
    /**
      * This will return the local coordinates of the specified displayObject for this InteractionData
      * @param displayObject - The DisplayObject that you would like the local
      *  coords off
      * @param point - A Point object in which to store the value, optional (otherwise
      *  will create a new point)
      * @param globalPos - A Point object containing your custom global coords, optional
      *  (otherwise will use the current global coords)
      * @returns - A point containing the coordinates of the InteractionData position relative
      *  to the DisplayObject
      */
    def getLocalPosition[P /* <: IPointData */](displayObject: DisplayObject): P = js.native
    def getLocalPosition[P /* <: IPointData */](displayObject: DisplayObject, point: P): P = js.native
    def getLocalPosition[P /* <: IPointData */](displayObject: DisplayObject, point: P, globalPos: IPointData): P = js.native
    def getLocalPosition[P /* <: IPointData */](displayObject: DisplayObject, point: Unit, globalPos: IPointData): P = js.native
    
    /** This point stores the global coords of where the touch/mouse event happened. */
    var global: Point = js.native
    
    /**
      * The height of the pointer's contact along the y-axis, measured in CSS pixels.
      * radiusY of TouchEvents will be represented by this value.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/height
      */
    var height: Double = js.native
    
    /** Unique identifier for this interaction. */
    var identifier: Double = js.native
    
    /**
      * Indicates whether or not the pointer device that created the event is the primary pointer.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/isPrimary
      */
    var isPrimary: Boolean = js.native
    
    /**
      * When passed to an event handler, this will be the original DOM Event that was captured
      * @see https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent
      * @see https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent
      * @member {MouseEvent|TouchEvent|PointerEvent}
      */
    var originalEvent: InteractivePointerEvent = js.native
    
    /**
      * The unique identifier of the pointer. It will be the same as `identifier`.
      * @readonly
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/pointerId
      */
    def pointerId: Double = js.native
    
    /**
      * The type of pointer that triggered the event.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/pointerType
      */
    var pointerType: String = js.native
    
    /**
      * Pressure applied by the pointing device during the event. A Touch's force property
      * will be represented by this value.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/pressure
      */
    var pressure: Double = js.native
    
    /** Resets the data for pooling. */
    def reset(): Unit = js.native
    
    /**
      * From TouchEvents (not PointerEvents triggered by touches), the rotationAngle of the Touch.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Touch/rotationAngle
      */
    var rotationAngle: Double = js.native
    
    /**
      * Barrel pressure on a stylus pointer.
      * @see https://w3c.github.io/pointerevents/#pointerevent-interface
      */
    var tangentialPressure: Double = js.native
    
    /** The target Sprite that was interacted with. */
    var target: DisplayObject = js.native
    
    /**
      * The angle, in degrees, between the pointer device and the screen.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/tiltX
      */
    var tiltX: Double = js.native
    
    /**
      * The angle, in degrees, between the pointer device and the screen.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/tiltY
      */
    var tiltY: Double = js.native
    
    /**
      * Twist of a stylus pointer.
      * @see https://w3c.github.io/pointerevents/#pointerevent-interface
      */
    var twist: Double = js.native
    
    /**
      * The width of the pointer's contact along the x-axis, measured in CSS pixels.
      * radiusX of TouchEvents will be represented by this value.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/width
      */
    var width: Double = js.native
  }
  
  @JSImport("@pixi/interaction", "InteractionEvent")
  @js.native
  open class InteractionEvent () extends StObject {
    
    /** The object whose event listener’s callback is currently being invoked. */
    var currentTarget: DisplayObject = js.native
    
    /** {@link InteractionData} related to this event */
    var data: InteractionData = js.native
    
    /** Resets the event. */
    def reset(): Unit = js.native
    
    /** Prevents event from reaching any objects other than the current object. */
    def stopPropagation(): Unit = js.native
    
    /**
      * Whether we already reached the element we want to
      * stop propagating at. This is important for delayed events,
      * where we start over deeper in the tree again.
      * @private
      */
    var stopPropagationHint: Boolean = js.native
    
    /**
      * Whether this event will continue propagating in the tree.
      *
      * Remaining events for the {@link stopsPropagatingAt} object
      * will still be dispatched.
      */
    var stopped: Boolean = js.native
    
    /**
      * At which object this event stops propagating.
      * @private
      */
    var stopsPropagatingAt: DisplayObject = js.native
    
    /**
      * The object which caused this event to be dispatched.
      * For listener callback see {@link PIXI.InteractionEvent.currentTarget}.
      */
    var target: DisplayObject = js.native
    
    /** Type of the event. */
    var `type`: String = js.native
  }
  
  @JSImport("@pixi/interaction", "InteractionManager")
  @js.native
  open class InteractionManager protected ()
    extends EventEmitter[String | js.Symbol, Any] {
    /**
      * @param {PIXI.CanvasRenderer|PIXI.Renderer} renderer - A reference to the current renderer
      * @param options - The options for the manager.
      * @param {boolean} [options.autoPreventDefault=true] - Should the manager automatically prevent default browser actions.
      * @param {number} [options.interactionFrequency=10] - Maximum frequency (ms) at pointer over/out states will be checked.
      * @param {number} [options.useSystemTicker=true] - Whether to add {@link tickerUpdate} to {@link PIXI.Ticker.system}.
      */
    def this(renderer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractRenderer */ Any) = this()
    def this(
      renderer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractRenderer */ Any,
      options: InteractionManagerOptions
    ) = this()
    
    /* private */ var _deltaTime: Any = js.native
    
    /* private */ var _didMove: Any = js.native
    
    /**
      * An options object specifies characteristics about the event listener.
      * @member {Object<string, boolean>}
      */
    /* private */ val _eventListenerOptions: Any = js.native
    
    /** Used as a last rendered object in case renderer doesnt have _lastObjectRendered. */
    /* private */ var _tempDisplayObject: Any = js.native
    
    /* private */ var _useSystemTicker: Any = js.native
    
    /**
      * Actively tracked InteractionData
      * @private
      * @member {Object<number, PIXI.InteractionData>}
      */
    val activeInteractionData: NumberDictionary[InteractionData] = js.native
    
    /** Registers all the DOM events. */
    /* private */ var addEvents: Any = js.native
    
    /** Adds the ticker listener. */
    /* private */ var addTickerListener: Any = js.native
    
    /**
      * Should default browser actions automatically be prevented.
      * Does not apply to pointer events for backwards compatibility as
      * preventDefault on pointer events stops mouse events from firing.
      * Thus, for every pointer event, there will always be either a mouse of touch event alongside it.
      * @default true
      */
    var autoPreventDefault: Boolean = js.native
    
    /**
      * Configure an InteractionEvent to wrap a DOM PointerEvent and InteractionData
      * @param interactionEvent - The event to be configured
      * @param pointerEvent - The DOM event that will be paired with the InteractionEvent
      * @param interactionData - The InteractionData that will be paired
      *        with the InteractionEvent
      * @returns - the interaction event that was passed in
      */
    /* private */ var configureInteractionEventForDOMEvent: Any = js.native
    
    /** The mode of the cursor that is being used. The value of this is a key from the cursorStyles dictionary. */
    var currentCursorMode: String = js.native
    
    /**
      * Internal cached let.
      * @private
      */
    var cursor: String = js.native
    
    /**
      * Dictionary of how different cursor modes are handled. Strings are handled as CSS cursor
      * values, objects are handled as dictionaries of CSS values for interactionDOMElement,
      * and functions are called instead of changing the CSS.
      * Default CSS cursor values are provided for 'default' and 'pointer' modes.
      * @member {Object<string, Object>}
      */
    var cursorStyles: Dict[String | (js.Function1[/* mode */ String, Unit]) | CSSStyleDeclaration] = js.native
    
    /**
      * Puts a event on a queue to be dispatched later. This is used to guarantee correct
      * ordering of over/out events.
      * @param displayObject - the display object in question
      * @param eventString - the name of the event (e.g, mousedown)
      * @param eventData - the event data object
      */
    /* private */ var delayDispatchEvent: Any = js.native
    
    /**
      * Delayed pointer events. Used to guarantee correct ordering of over/out events.
      * @private
      */
    var delayedEvents: js.Array[DelayedEvent] = js.native
    
    /** Destroys the interaction manager. */
    def destroy(): Unit = js.native
    
    /**
      * Dispatches an event on the display object that was interacted with.
      * @param displayObject - the display object in question
      * @param eventString - the name of the event (e.g, mousedown)
      * @param eventData - the event data object
      */
    /* private */ var dispatchEvent: Any = js.native
    
    /** An event data object to handle all the event tracking/dispatching. */
    var eventData: InteractionEvent = js.native
    
    /** Have events been attached to the dom element? */
    /* protected */ var eventsAdded: Boolean = js.native
    
    /**
      * Get InteractionData for a given pointerId. Store that data as well.
      * @param event - Normalized pointer event, output from normalizeToPointerData.
      * @returns - Interaction data for the given pointer identifier.
      */
    /* private */ var getInteractionDataForPointerId: Any = js.native
    
    /**
      * Hit tests a point against the display tree, returning the first interactive object that is hit.
      * @param globalPoint - A point to hit test with, in global space.
      * @param root - The root display object to start from. If omitted, defaults
      * to the last rendered root of the associated renderer.
      * @returns - The hit display object, if any.
      */
    def hitTest(globalPoint: Point): DisplayObject = js.native
    def hitTest(globalPoint: Point, root: DisplayObject): DisplayObject = js.native
    
    /** The DOM element to bind to. */
    /* protected */ var interactionDOMElement: HTMLElement = js.native
    
    /**
      * Pool of unused InteractionData
      * @private
      */
    var interactionDataPool: js.Array[InteractionData] = js.native
    
    /**
      * Maximum frequency in milliseconds at which pointer over/out states will be checked by {@link tickerUpdate}.
      * @default 10
      */
    var interactionFrequency: Double = js.native
    
    /**
      * Last rendered object or temp object.
      * @readonly
      * @protected
      */
    def lastObjectRendered: DisplayObject = js.native
    
    /**
      * Maps x and y coords from a DOM object and maps them correctly to the PixiJS view. The
      * resulting value is stored in the point. This takes into account the fact that the DOM
      * element could be scaled and positioned anywhere on the screen.
      * @param point - the point that the result will be stored in
      * @param x - the x coord of the position to map
      * @param y - the y coord of the position to map
      */
    def mapPositionToPoint(point: IPointData, x: Double, y: Double): Unit = js.native
    
    /** The mouse data. */
    var mouse: InteractionData = js.native
    
    /** Is the mouse hovering over the renderer? If working in worker mouse considered to be over renderer by default. */
    /* protected */ var mouseOverRenderer: Boolean = js.native
    
    /**
      * This property determines if mousemove and touchmove events are fired only when the cursor
      * is over the object.
      * Setting to true will make things work more in line with how the DOM version works.
      * Setting to false can make things easier for things like dragging
      * It is currently set to false as this is how PixiJS used to work. This will be set to true in
      * future versions of pixi.
      * @default false
      */
    var moveWhenInside: Boolean = js.native
    
    /**
      * Ensures that the original event object contains all data that a regular pointer event would have
      * @param {TouchEvent|MouseEvent|PointerEvent} event - The original event data from a touch or mouse event
      * @returns - An array containing a single normalized pointer event, in the case of a pointer
      *  or mouse event, or a multiple normalized pointer events if there are multiple changed touches
      */
    /* private */ var normalizeToPointerData: Any = js.native
    
    /**
      * Is called when the pointer button is cancelled
      * @param event - The DOM event of a pointer button being released
      */
    /* private */ var onPointerCancel: Any = js.native
    
    /**
      * Is called when the pointer button is released on the renderer element
      * @param originalEvent - The DOM event of a pointer button being released
      * @param cancelled - true if the pointer is cancelled
      * @param func - Function passed to {@link processInteractive}
      */
    /* private */ var onPointerComplete: Any = js.native
    
    /**
      * Is called when the pointer button is pressed down on the renderer element
      * @param originalEvent - The DOM event of a pointer button being pressed down
      */
    /* private */ var onPointerDown: Any = js.native
    
    /**
      * Is called when the pointer moves across the renderer element
      * @param originalEvent - The DOM event of a pointer moving
      */
    /* private */ var onPointerMove: Any = js.native
    
    /**
      * Is called when the pointer is moved out of the renderer element
      * @private
      * @param {PointerEvent} originalEvent - The DOM event of a pointer being moved out
      */
    /* private */ var onPointerOut: Any = js.native
    
    /**
      * Is called when the pointer is moved into the renderer element.
      * @param originalEvent - The DOM event of a pointer button being moved into the renderer view.
      */
    /* private */ var onPointerOver: Any = js.native
    
    /**
      * Is called when the pointer button is released on the renderer element
      * @param event - The DOM event of a pointer button being released
      */
    /* private */ var onPointerUp: Any = js.native
    
    /**
      * This function is provides a neat way of crawling through the scene graph and running a
      * specified function on all interactive objects it finds. It will also take care of hit
      * testing the interactive objects and passes the hit across in the function.
      * @protected
      * @param interactionEvent - event containing the point that
      *  is tested for collision
      * @param displayObject - the displayObject
      *  that will be hit test (recursively crawls its children)
      * @param func - the function that will be called on each interactive object. The
      *  interactionEvent, displayObject and hit will be passed to the function
      * @param hitTest - indicates whether we want to calculate hits
      *  or just iterate through all interactive objects
      */
    def processInteractive(interactionEvent: InteractionEvent, displayObject: DisplayObject): Unit = js.native
    def processInteractive(interactionEvent: InteractionEvent, displayObject: DisplayObject, func: Unit, hitTest: Boolean): Unit = js.native
    def processInteractive(interactionEvent: InteractionEvent, displayObject: DisplayObject, func: InteractionCallback): Unit = js.native
    def processInteractive(
      interactionEvent: InteractionEvent,
      displayObject: DisplayObject,
      func: InteractionCallback,
      hitTest: Boolean
    ): Unit = js.native
    
    /**
      * Processes the result of the pointer cancel check and dispatches the event if need be
      * @param interactionEvent - The interaction event wrapping the DOM event
      * @param displayObject - The display object that was tested
      */
    /* private */ var processPointerCancel: Any = js.native
    
    /**
      * Processes the result of the pointer down check and dispatches the event if need be
      * @param interactionEvent - The interaction event wrapping the DOM event
      * @param displayObject - The display object that was tested
      * @param hit - the result of the hit test on the display object
      */
    /* private */ var processPointerDown: Any = js.native
    
    /**
      * Processes the result of the pointer move check and dispatches the event if need be
      * @param interactionEvent - The interaction event wrapping the DOM event
      * @param displayObject - The display object that was tested
      * @param hit - the result of the hit test on the display object
      */
    /* private */ var processPointerMove: Any = js.native
    
    /**
      * Processes the result of the pointer over/out check and dispatches the event if need be.
      * @param interactionEvent - The interaction event wrapping the DOM event
      * @param displayObject - The display object that was tested
      * @param hit - the result of the hit test on the display object
      */
    /* private */ var processPointerOverOut: Any = js.native
    
    /**
      * Processes the result of the pointer up check and dispatches the event if need be
      * @param interactionEvent - The interaction event wrapping the DOM event
      * @param displayObject - The display object that was tested
      * @param hit - the result of the hit test on the display object
      */
    /* private */ var processPointerUp: Any = js.native
    
    /**
      * Return unused InteractionData to the pool, for a given pointerId
      * @param pointerId - Identifier from a pointer event
      */
    /* private */ var releaseInteractionDataForPointerId: Any = js.native
    
    /** Removes all the DOM events that were previously registered. */
    /* private */ var removeEvents: Any = js.native
    
    /** Removes the ticker listener. */
    /* private */ var removeTickerListener: Any = js.native
    
    /** The renderer this interaction manager works for. */
    var renderer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractRenderer */ Any = js.native
    
    /**
      * The current resolution / device pixel ratio.
      * @default 1
      */
    var resolution: Double = js.native
    
    /**
      * TreeSearch component that is used to hitTest stage tree.
      * @private
      */
    var search: TreeSearch = js.native
    
    /**
      * Sets the current cursor mode, handling any callbacks or CSS style changes.
      * @param mode - cursor mode, a key from the cursorStyles dictionary
      */
    def setCursorMode(mode: String): Unit = js.native
    
    /**
      * Sets the DOM element which will receive mouse/touch events. This is useful for when you have
      * other DOM elements on top of the renderers Canvas element. With this you'll be bale to delegate
      * another DOM element to receive those events.
      * @param element - the DOM element which will receive mouse and touch events.
      * @param resolution - The resolution / device pixel ratio of the new element (relative to the canvas).
      */
    def setTargetElement(element: HTMLElement): Unit = js.native
    def setTargetElement(element: HTMLElement, resolution: Double): Unit = js.native
    
    /** Does the device support pointer events https://www.w3.org/Submission/pointer-events/ */
    val supportsPointerEvents: Boolean = js.native
    
    /** Does the device support touch events https://www.w3.org/TR/touch-events/ */
    val supportsTouchEvents: Boolean = js.native
    
    /** Has the system ticker been added? */
    /* protected */ var tickerAdded: Boolean = js.native
    
    /**
      * Updates the state of interactive objects if at least {@link interactionFrequency}
      * milliseconds have passed since the last invocation.
      *
      * Invoked by a throttled ticker update from {@link PIXI.Ticker.system}.
      * @param deltaTime - time delta since the last call
      */
    def tickerUpdate(deltaTime: Double): Unit = js.native
    
    /** Updates the state of interactive objects. */
    def update(): Unit = js.native
    
    /**
      * Should the InteractionManager automatically add {@link tickerUpdate} to {@link PIXI.Ticker.system}.
      * @default true
      */
    def useSystemTicker: Boolean = js.native
    def useSystemTicker_=(useSystemTicker: Boolean): Unit = js.native
  }
  /* static members */
  object InteractionManager {
    
    /** @ignore */
    @JSImport("@pixi/interaction", "InteractionManager.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  @JSImport("@pixi/interaction", "InteractionTrackingData")
  @js.native
  open class InteractionTrackingData protected () extends StObject {
    /**
      * @param {number} pointerId - Unique pointer id of the event
      * @private
      */
    def this(pointerId: Double) = this()
    
    /**
      *
      * @private
      * @param {number} flag - The interaction flag to set
      * @param {boolean} yn - Should the flag be set or unset
      */
    /* private */ var _doSet: Any = js.native
    
    /* private */ var _flags: Any = js.native
    
    /* private */ val _pointerId: Any = js.native
    
    /**
      * State of the tracking data, expressed as bit flags
      * @private
      * @member {number}
      */
    def flags: Double = js.native
    def flags_=(flags: Double): Unit = js.native
    
    /**
      * Did the left mouse button come down in the DisplayObject?
      * @private
      * @member {boolean}
      */
    def leftDown: Boolean = js.native
    def leftDown_=(yn: Boolean): Unit = js.native
    
    /**
      * Is the tracked event inactive (not over or down)?
      * @private
      * @member {number}
      */
    def none: Boolean = js.native
    
    /**
      * Is the tracked event over the DisplayObject?
      * @private
      * @member {boolean}
      */
    def over: Boolean = js.native
    def over_=(yn: Boolean): Unit = js.native
    
    /**
      * Unique pointer id of the event
      * @readonly
      * @private
      * @member {number}
      */
    def pointerId: Double = js.native
    
    /**
      * Did the right mouse button come down in the DisplayObject?
      * @private
      * @member {boolean}
      */
    def rightDown: Boolean = js.native
    def rightDown_=(yn: Boolean): Unit = js.native
  }
  /* static members */
  object InteractionTrackingData {
    
    @JSImport("@pixi/interaction", "InteractionTrackingData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/interaction", "InteractionTrackingData.FLAGS")
    @js.native
    def FLAGS: ReadonlyInteractionTracki = js.native
    inline def FLAGS_=(x: ReadonlyInteractionTracki): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAGS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/interaction", "interactiveTarget")
  @js.native
  val interactiveTarget: InteractiveTarget_ = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiInteraction.pixiInteractionStrings.auto
    - typings.pixiInteraction.pixiInteractionStrings.default
    - typings.pixiInteraction.pixiInteractionStrings.none
    - typings.pixiInteraction.pixiInteractionStrings.`context-menu`
    - typings.pixiInteraction.pixiInteractionStrings.help
    - typings.pixiInteraction.pixiInteractionStrings.pointer
    - typings.pixiInteraction.pixiInteractionStrings.progress
    - typings.pixiInteraction.pixiInteractionStrings.wait
    - typings.pixiInteraction.pixiInteractionStrings.cell
    - typings.pixiInteraction.pixiInteractionStrings.crosshair
    - typings.pixiInteraction.pixiInteractionStrings.text
    - typings.pixiInteraction.pixiInteractionStrings.`vertical-text`
    - typings.pixiInteraction.pixiInteractionStrings.alias
    - typings.pixiInteraction.pixiInteractionStrings.copy
    - typings.pixiInteraction.pixiInteractionStrings.move
    - typings.pixiInteraction.pixiInteractionStrings.`no-drop`
    - typings.pixiInteraction.pixiInteractionStrings.`not-allowed`
    - typings.pixiInteraction.pixiInteractionStrings.`e-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`n-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`ne-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`nw-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`s-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`se-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`sw-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`w-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`ns-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`ew-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`nesw-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`col-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`nwse-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`row-resize`
    - typings.pixiInteraction.pixiInteractionStrings.`all-scroll`
    - typings.pixiInteraction.pixiInteractionStrings.`zoom-in`
    - typings.pixiInteraction.pixiInteractionStrings.`zoom-out`
    - typings.pixiInteraction.pixiInteractionStrings.grab
    - typings.pixiInteraction.pixiInteractionStrings.grabbing
  */
  trait Cursor extends StObject
  object Cursor {
    
    inline def default: typings.pixiInteraction.pixiInteractionStrings.default = "default".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.default]
    
    inline def alias: typings.pixiInteraction.pixiInteractionStrings.alias = "alias".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.alias]
    
    inline def `all-scroll`: typings.pixiInteraction.pixiInteractionStrings.`all-scroll` = "all-scroll".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`all-scroll`]
    
    inline def auto: typings.pixiInteraction.pixiInteractionStrings.auto = "auto".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.auto]
    
    inline def cell: typings.pixiInteraction.pixiInteractionStrings.cell = "cell".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.cell]
    
    inline def `col-resize`: typings.pixiInteraction.pixiInteractionStrings.`col-resize` = "col-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`col-resize`]
    
    inline def `context-menu`: typings.pixiInteraction.pixiInteractionStrings.`context-menu` = "context-menu".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`context-menu`]
    
    inline def copy: typings.pixiInteraction.pixiInteractionStrings.copy = "copy".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.copy]
    
    inline def crosshair: typings.pixiInteraction.pixiInteractionStrings.crosshair = "crosshair".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.crosshair]
    
    inline def `e-resize`: typings.pixiInteraction.pixiInteractionStrings.`e-resize` = "e-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`e-resize`]
    
    inline def `ew-resize`: typings.pixiInteraction.pixiInteractionStrings.`ew-resize` = "ew-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`ew-resize`]
    
    inline def grab: typings.pixiInteraction.pixiInteractionStrings.grab = "grab".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.grab]
    
    inline def grabbing: typings.pixiInteraction.pixiInteractionStrings.grabbing = "grabbing".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.grabbing]
    
    inline def help: typings.pixiInteraction.pixiInteractionStrings.help = "help".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.help]
    
    inline def move: typings.pixiInteraction.pixiInteractionStrings.move = "move".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.move]
    
    inline def `n-resize`: typings.pixiInteraction.pixiInteractionStrings.`n-resize` = "n-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`n-resize`]
    
    inline def `ne-resize`: typings.pixiInteraction.pixiInteractionStrings.`ne-resize` = "ne-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`ne-resize`]
    
    inline def `nesw-resize`: typings.pixiInteraction.pixiInteractionStrings.`nesw-resize` = "nesw-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`nesw-resize`]
    
    inline def `no-drop`: typings.pixiInteraction.pixiInteractionStrings.`no-drop` = "no-drop".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`no-drop`]
    
    inline def none: typings.pixiInteraction.pixiInteractionStrings.none = "none".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.none]
    
    inline def `not-allowed`: typings.pixiInteraction.pixiInteractionStrings.`not-allowed` = "not-allowed".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`not-allowed`]
    
    inline def `ns-resize`: typings.pixiInteraction.pixiInteractionStrings.`ns-resize` = "ns-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`ns-resize`]
    
    inline def `nw-resize`: typings.pixiInteraction.pixiInteractionStrings.`nw-resize` = "nw-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`nw-resize`]
    
    inline def `nwse-resize`: typings.pixiInteraction.pixiInteractionStrings.`nwse-resize` = "nwse-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`nwse-resize`]
    
    inline def pointer: typings.pixiInteraction.pixiInteractionStrings.pointer = "pointer".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.pointer]
    
    inline def progress: typings.pixiInteraction.pixiInteractionStrings.progress = "progress".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.progress]
    
    inline def `row-resize`: typings.pixiInteraction.pixiInteractionStrings.`row-resize` = "row-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`row-resize`]
    
    inline def `s-resize`: typings.pixiInteraction.pixiInteractionStrings.`s-resize` = "s-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`s-resize`]
    
    inline def `se-resize`: typings.pixiInteraction.pixiInteractionStrings.`se-resize` = "se-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`se-resize`]
    
    inline def `sw-resize`: typings.pixiInteraction.pixiInteractionStrings.`sw-resize` = "sw-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`sw-resize`]
    
    inline def text: typings.pixiInteraction.pixiInteractionStrings.text = "text".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.text]
    
    inline def `vertical-text`: typings.pixiInteraction.pixiInteractionStrings.`vertical-text` = "vertical-text".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`vertical-text`]
    
    inline def `w-resize`: typings.pixiInteraction.pixiInteractionStrings.`w-resize` = "w-resize".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`w-resize`]
    
    inline def `zoom-in`: typings.pixiInteraction.pixiInteractionStrings.`zoom-in` = "zoom-in".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`zoom-in`]
    
    inline def `zoom-out`: typings.pixiInteraction.pixiInteractionStrings.`zoom-out` = "zoom-out".asInstanceOf[typings.pixiInteraction.pixiInteractionStrings.`zoom-out`]
  }
  
  trait DelayedEvent extends StObject {
    
    var displayObject: DisplayObject
    
    var eventData: InteractionEvent
    
    var eventString: String
  }
  object DelayedEvent {
    
    inline def apply(displayObject: DisplayObject, eventData: InteractionEvent, eventString: String): DelayedEvent = {
      val __obj = js.Dynamic.literal(displayObject = displayObject.asInstanceOf[js.Any], eventData = eventData.asInstanceOf[js.Any], eventString = eventString.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelayedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DelayedEvent] (val x: Self) extends AnyVal {
      
      inline def setDisplayObject(value: DisplayObject): Self = StObject.set(x, "displayObject", value.asInstanceOf[js.Any])
      
      inline def setEventData(value: InteractionEvent): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      inline def setEventString(value: String): Self = StObject.set(x, "eventString", value.asInstanceOf[js.Any])
    }
  }
  
  trait IHitArea extends StObject {
    
    def contains(x: Double, y: Double): Boolean
  }
  object IHitArea {
    
    inline def apply(contains: (Double, Double) => Boolean): IHitArea = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains))
      __obj.asInstanceOf[IHitArea]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHitArea] (val x: Self) extends AnyVal {
      
      inline def setContains(value: (Double, Double) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    }
  }
  
  type InteractionCallback = js.Function3[
    /* interactionEvent */ InteractionEvent, 
    /* displayObject */ DisplayObject, 
    /* hit */ js.UndefOr[Boolean], 
    Unit
  ]
  
  trait InteractionManagerOptions extends StObject {
    
    var autoPreventDefault: js.UndefOr[Boolean] = js.undefined
    
    var interactionFrequency: js.UndefOr[Double] = js.undefined
    
    var useSystemTicker: js.UndefOr[Boolean] = js.undefined
  }
  object InteractionManagerOptions {
    
    inline def apply(): InteractionManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractionManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoPreventDefault(value: Boolean): Self = StObject.set(x, "autoPreventDefault", value.asInstanceOf[js.Any])
      
      inline def setAutoPreventDefaultUndefined: Self = StObject.set(x, "autoPreventDefault", js.undefined)
      
      inline def setInteractionFrequency(value: Double): Self = StObject.set(x, "interactionFrequency", value.asInstanceOf[js.Any])
      
      inline def setInteractionFrequencyUndefined: Self = StObject.set(x, "interactionFrequency", js.undefined)
      
      inline def setUseSystemTicker(value: Boolean): Self = StObject.set(x, "useSystemTicker", value.asInstanceOf[js.Any])
      
      inline def setUseSystemTickerUndefined: Self = StObject.set(x, "useSystemTicker", js.undefined)
    }
  }
  
  trait InteractionTrackingFlags extends StObject {
    
    var LEFT_DOWN: Double
    
    var NONE: Double
    
    var OVER: Double
    
    var RIGHT_DOWN: Double
  }
  object InteractionTrackingFlags {
    
    inline def apply(LEFT_DOWN: Double, NONE: Double, OVER: Double, RIGHT_DOWN: Double): InteractionTrackingFlags = {
      val __obj = js.Dynamic.literal(LEFT_DOWN = LEFT_DOWN.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], OVER = OVER.asInstanceOf[js.Any], RIGHT_DOWN = RIGHT_DOWN.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionTrackingFlags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractionTrackingFlags] (val x: Self) extends AnyVal {
      
      inline def setLEFT_DOWN(value: Double): Self = StObject.set(x, "LEFT_DOWN", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setOVER(value: Double): Self = StObject.set(x, "OVER", value.asInstanceOf[js.Any])
      
      inline def setRIGHT_DOWN(value: Double): Self = StObject.set(x, "RIGHT_DOWN", value.asInstanceOf[js.Any])
    }
  }
  
  type InteractivePointerEvent = PointerEvent | TouchEvent | MouseEvent
  
  trait InteractiveTarget_ extends StObject {
    
    var _trackedPointers: NumberDictionary[InteractionTrackingData]
    
    var buttonMode: Boolean
    
    var cursor: Cursor | String
    
    var hitArea: IHitArea | Null
    
    var interactive: Boolean
    
    var interactiveChildren: Boolean
    
    var trackedPointers: NumberDictionary[InteractionTrackingData]
  }
  object InteractiveTarget_ {
    
    inline def apply(
      _trackedPointers: NumberDictionary[InteractionTrackingData],
      buttonMode: Boolean,
      cursor: Cursor | String,
      interactive: Boolean,
      interactiveChildren: Boolean,
      trackedPointers: NumberDictionary[InteractionTrackingData]
    ): InteractiveTarget_ = {
      val __obj = js.Dynamic.literal(_trackedPointers = _trackedPointers.asInstanceOf[js.Any], buttonMode = buttonMode.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], interactiveChildren = interactiveChildren.asInstanceOf[js.Any], trackedPointers = trackedPointers.asInstanceOf[js.Any], hitArea = null)
      __obj.asInstanceOf[InteractiveTarget_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractiveTarget_] (val x: Self) extends AnyVal {
      
      inline def setButtonMode(value: Boolean): Self = StObject.set(x, "buttonMode", value.asInstanceOf[js.Any])
      
      inline def setCursor(value: Cursor | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setHitArea(value: IHitArea): Self = StObject.set(x, "hitArea", value.asInstanceOf[js.Any])
      
      inline def setHitAreaNull: Self = StObject.set(x, "hitArea", null)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveChildren(value: Boolean): Self = StObject.set(x, "interactiveChildren", value.asInstanceOf[js.Any])
      
      inline def setTrackedPointers(value: NumberDictionary[InteractionTrackingData]): Self = StObject.set(x, "trackedPointers", value.asInstanceOf[js.Any])
      
      inline def set_trackedPointers(value: NumberDictionary[InteractionTrackingData]): Self = StObject.set(x, "_trackedPointers", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Strategy how to search through stage tree for interactive objects
    * @memberof PIXI
    */
  @js.native
  trait TreeSearch extends StObject {
    
    /* private */ val _tempPoint: Any = js.native
    
    /**
      * This function is provides a neat way of crawling through the scene graph and running a
      * specified function on all interactive objects it finds. It will also take care of hit
      * testing the interactive objects and passes the hit across in the function.
      * @private
      * @param interactionEvent - event containing the point that
      *  is tested for collision
      * @param displayObject - the displayObject
      *  that will be hit test (recursively crawls its children)
      * @param func - the function that will be called on each interactive object. The
      *  interactionEvent, displayObject and hit will be passed to the function
      * @param hitTest - this indicates if the objects inside should be hit test against the point
      * @returns - Returns true if the displayObject hit the point
      */
    def findHit(interactionEvent: InteractionEvent, displayObject: DisplayObject): Unit = js.native
    def findHit(interactionEvent: InteractionEvent, displayObject: DisplayObject, func: Unit, hitTest: Boolean): Unit = js.native
    def findHit(interactionEvent: InteractionEvent, displayObject: DisplayObject, func: InteractionCallback): Unit = js.native
    def findHit(
      interactionEvent: InteractionEvent,
      displayObject: DisplayObject,
      func: InteractionCallback,
      hitTest: Boolean
    ): Unit = js.native
    
    /**
      * Recursive implementation for findHit
      * @private
      * @param interactionEvent - event containing the point that
      *  is tested for collision
      * @param displayObject - the displayObject
      *  that will be hit test (recursively crawls its children)
      * @param func - the function that will be called on each interactive object. The
      *  interactionEvent, displayObject and hit will be passed to the function
      * @param hitTest - this indicates if the objects inside should be hit test against the point
      * @param interactive - Whether the displayObject is interactive
      * @returns - Returns true if the displayObject hit the point
      */
    def recursiveFindHit(interactionEvent: InteractionEvent, displayObject: DisplayObject): Boolean = js.native
    def recursiveFindHit(interactionEvent: InteractionEvent, displayObject: DisplayObject, func: Unit, hitTest: Boolean): Boolean = js.native
    def recursiveFindHit(
      interactionEvent: InteractionEvent,
      displayObject: DisplayObject,
      func: Unit,
      hitTest: Boolean,
      interactive: Boolean
    ): Boolean = js.native
    def recursiveFindHit(
      interactionEvent: InteractionEvent,
      displayObject: DisplayObject,
      func: Unit,
      hitTest: Unit,
      interactive: Boolean
    ): Boolean = js.native
    def recursiveFindHit(interactionEvent: InteractionEvent, displayObject: DisplayObject, func: InteractionCallback): Boolean = js.native
    def recursiveFindHit(
      interactionEvent: InteractionEvent,
      displayObject: DisplayObject,
      func: InteractionCallback,
      hitTest: Boolean
    ): Boolean = js.native
    def recursiveFindHit(
      interactionEvent: InteractionEvent,
      displayObject: DisplayObject,
      func: InteractionCallback,
      hitTest: Boolean,
      interactive: Boolean
    ): Boolean = js.native
    def recursiveFindHit(
      interactionEvent: InteractionEvent,
      displayObject: DisplayObject,
      func: InteractionCallback,
      hitTest: Unit,
      interactive: Boolean
    ): Boolean = js.native
  }
}
