package typings.pixiEvents

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.pixiCore.mod.Point
import typings.pixiCore.mod.utils.EventEmitter
import typings.pixiDisplay.mod.DisplayObject
import typings.pixiEvents.anon.ClickCount
import typings.pixiEvents.anon.Fn
import typings.pixiEvents.anon.Instantiable
import typings.pixiEvents.libFederatedEventMod.FederatedEvent
import typings.pixiEvents.libFederatedEventTargetMod.Cursor
import typings.pixiEvents.libFederatedEventTargetMod.FederatedEventTarget
import typings.pixiEvents.libFederatedPointerEventMod.FederatedPointerEvent
import typings.pixiEvents.libFederatedWheelEventMod.FederatedWheelEvent
import typings.std.Map
import typings.std.Record
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventBoundaryMod {
  
  @JSImport("@pixi/events/lib/EventBoundary", "EventBoundary")
  @js.native
  /**
    * @param rootTarget - The holder of the event boundary.
    */
  open class EventBoundary () extends StObject {
    def this(rootTarget: DisplayObject) = this()
    
    /**
      * Adds an event mapping for the event `type` handled by `fn`.
      *
      * Event mappings can be used to implement additional or custom events. They take an event
      * coming from the upstream scene (or directly from the {@link PIXI.EventSystem}) and dispatch new downstream events
      * generally trickling down and bubbling up to {@link PIXI.EventBoundary.rootTarget this.rootTarget}.
      *
      * To modify the semantics of existing events, the built-in mapping methods of EventBoundary should be overridden
      * instead.
      * @param type - The type of upstream event to map.
      * @param fn - The mapping method. The context of this function must be bound manually, if desired.
      */
    def addEventMapping(`type`: String, fn: js.Function1[/* e */ FederatedEvent[UIEvent], Unit]): Unit = js.native
    
    /**
      * Emits the event {@link e} to all display objects. The event is propagated in the bubbling phase always.
      *
      * This is used in the `pointermove` legacy mode.
      * @param e - The emitted event.
      * @param type - The listeners to notify.
      * @param target
      */
    def all(e: FederatedEvent[UIEvent]): Unit = js.native
    def all(e: FederatedEvent[UIEvent], `type`: String): Unit = js.native
    def all(e: FederatedEvent[UIEvent], `type`: String, target: FederatedEventTarget): Unit = js.native
    def all(e: FederatedEvent[UIEvent], `type`: Unit, target: FederatedEventTarget): Unit = js.native
    
    /**
      * Allocate a specific type of event from {@link PIXI.EventBoundary#eventPool this.eventPool}.
      *
      * This allocation is constructor-agnostic, as long as it only takes one argument - this event
      * boundary.
      * @param constructor - The event's constructor.
      */
    /* protected */ def allocateEvent[T /* <: FederatedEvent[UIEvent] */](constructor: Instantiable[T]): T = js.native
    
    /**
      * Clones the event {@code from}, with an optional {@code type} override.
      *
      * The event is allocated using {@link PIXI.EventBoundary#allocateEvent this.allocateEvent}.
      * @param from - The event to clone.
      * @param [type=from.type] - The type of the returned event.
      */
    /* protected */ def clonePointerEvent(from: FederatedPointerEvent): FederatedPointerEvent = js.native
    /* protected */ def clonePointerEvent(from: FederatedPointerEvent, `type`: String): FederatedPointerEvent = js.native
    
    /**
      * Copies base {@link PIXI.FederatedEvent} data from {@code from} into {@code to}.
      *
      * The following properties are copied:
      * + isTrusted
      * + srcElement
      * + timeStamp
      * + type
      * @param from - The event to copy data from.
      * @param to - The event to copy data into.
      */
    /* protected */ def copyData(from: FederatedEvent[UIEvent], to: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * Copies mouse {@link PIXI.FederatedMouseEvent} data from {@code from} to {@code to}.
      *
      * The following properties are copied:
      * + altKey
      * + button
      * + buttons
      * + clientX
      * + clientY
      * + metaKey
      * + movementX
      * + movementY
      * + pageX
      * + pageY
      * + x
      * + y
      * + screen
      * + global
      * @param from
      * @param to
      */
    /* protected */ def copyMouseData(from: FederatedEvent[UIEvent], to: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * Copies pointer {@link PIXI.FederatedPointerEvent} data from {@code from} into {@code to}.
      *
      * The following properties are copied:
      * + pointerId
      * + width
      * + height
      * + isPrimary
      * + pointerType
      * + pressure
      * + tangentialPressure
      * + tiltX
      * + tiltY
      * @param from
      * @param to
      */
    /* protected */ def copyPointerData(from: FederatedEvent[UIEvent], to: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * Copies wheel {@link PIXI.FederatedWheelEvent} data from {@code from} into {@code to}.
      *
      * The following properties are copied:
      * + deltaMode
      * + deltaX
      * + deltaY
      * + deltaZ
      * @param from
      * @param to
      */
    /* protected */ def copyWheelData(from: FederatedWheelEvent, to: FederatedWheelEvent): Unit = js.native
    
    /**
      * Creates an event whose {@code originalEvent} is {@code from}, with an optional `type` and `target` override.
      *
      * The event is allocated using {@link PIXI.EventBoundary#allocateEvent this.allocateEvent}.
      * @param from - The {@code originalEvent} for the returned event.
      * @param [type=from.type] - The type of the returned event.
      * @param target - The target of the returned event.
      */
    /* protected */ def createPointerEvent(from: FederatedPointerEvent): FederatedPointerEvent = js.native
    /* protected */ def createPointerEvent(from: FederatedPointerEvent, `type`: String): FederatedPointerEvent = js.native
    /* protected */ def createPointerEvent(from: FederatedPointerEvent, `type`: String, target: FederatedEventTarget): FederatedPointerEvent = js.native
    /* protected */ def createPointerEvent(from: FederatedPointerEvent, `type`: Unit, target: FederatedEventTarget): FederatedPointerEvent = js.native
    
    /**
      * Creates a wheel event whose {@code originalEvent} is {@code from}.
      *
      * The event is allocated using {@link PIXI.EventBoundary#allocateEvent this.allocateEvent}.
      * @param from - The upstream wheel event.
      */
    /* protected */ def createWheelEvent(from: FederatedWheelEvent): FederatedWheelEvent = js.native
    
    /** The cursor preferred by the event targets underneath this boundary. */
    var cursor: Cursor | String = js.native
    
    /**
      * Emits events after they were dispatched into the scene graph.
      *
      * This can be used for global events listening, regardless of the scene graph being used. It should
      * not be used by interactive libraries for normal use.
      *
      * Special events that do not bubble all the way to the root target are not emitted from here,
      * e.g. pointerenter, pointerleave, click.
      */
    var dispatch: EventEmitter[String | js.Symbol, Any] = js.native
    
    /**
      * Dispatches the given event
      * @param e
      * @param type
      */
    def dispatchEvent(e: FederatedEvent[UIEvent]): Unit = js.native
    def dispatchEvent(e: FederatedEvent[UIEvent], `type`: String): Unit = js.native
    
    /**
      * The event pool maps event constructors to an free pool of instances of those specific events.
      * @see PIXI.EventBoundary#allocateEvent
      * @see PIXI.EventBoundary#freeEvent
      */
    /* protected */ var eventPool: Map[
        Instantiable1[/* manager */ EventBoundary, FederatedEvent[UIEvent]], 
        js.Array[FederatedEvent[UIEvent]]
      ] = js.native
    
    /**
      * Finds the most specific event-target in the given propagation path that is still mounted in the scene graph.
      *
      * This is used to find the correct `pointerup` and `pointerout` target in the case that the original `pointerdown`
      * or `pointerover` target was unmounted from the scene graph.
      * @param propagationPath - The propagation path was valid in the past.
      * @returns - The most specific event-target still mounted at the same location in the scene graph.
      */
    /* protected */ def findMountedTarget(propagationPath: js.Array[FederatedEventTarget]): FederatedEventTarget = js.native
    
    /**
      * Frees the event and puts it back into the event pool.
      *
      * It is illegal to reuse the event until it is allocated again, using `this.allocateEvent`.
      *
      * It is also advised that events not allocated from {@link PIXI.EventBoundary#allocateEvent this.allocateEvent}
      * not be freed. This is because of the possibility that the same event is freed twice, which can cause
      * it to be allocated twice & result in overwriting.
      * @param event - The event to be freed.
      * @throws Error if the event is managed by another event boundary.
      */
    /* protected */ def freeEvent[T /* <: FederatedEvent[UIEvent] */](event: T): Unit = js.native
    
    /**
      * Checks whether the display object or any of its children cannot pass the hit test at all.
      *
      * {@link EventBoundary}'s implementation uses the {@link PIXI.DisplayObject.hitArea hitArea}
      * and {@link PIXI.DisplayObject._mask} for pruning.
      * @param displayObject
      * @param location
      */
    /* protected */ def hitPruneFn(displayObject: DisplayObject, location: Point): Boolean = js.native
    
    /**
      * Finds the DisplayObject that is the target of a event at the given coordinates.
      *
      * The passed (x,y) coordinates are in the world space above this event boundary.
      * @param x
      * @param y
      */
    def hitTest(x: Double, y: Double): DisplayObject = js.native
    
    /**
      * Checks whether the display object passes hit testing for the given location.
      * @param displayObject
      * @param location
      * @returns - Whether `displayObject` passes hit testing for `location`.
      */
    /* protected */ def hitTestFn(displayObject: DisplayObject, location: Point): Boolean = js.native
    
    /**
      * Recursive implementation for {@link EventBoundary.hitTest hitTest}.
      * @param currentTarget - The DisplayObject that is to be hit tested.
      * @param interactive - Flags whether `currentTarget` or one of its parents are interactive.
      * @param location - The location that is being tested for overlap.
      * @param testFn - Callback that determines whether the target passes hit testing. This callback
      *  can assume that `pruneFn` failed to prune the display object.
      * @param pruneFn - Callback that determiness whether the target and all of its children
      *  cannot pass the hit test. It is used as a preliminary optimization to prune entire subtrees
      *  of the scene graph.
      * @returns An array holding the hit testing target and all its ancestors in order. The first element
      *  is the target itself and the last is {@link EventBoundary.rootTarget rootTarget}. This is the opposite
      *  order w.r.t. the propagation path. If no hit testing target is found, null is returned.
      */
    /* protected */ def hitTestRecursive(
      currentTarget: DisplayObject,
      interactive: Boolean,
      location: Point,
      testFn: js.Function2[/* object */ DisplayObject, /* pt */ Point, Boolean]
    ): js.Array[DisplayObject] = js.native
    /* protected */ def hitTestRecursive(
      currentTarget: DisplayObject,
      interactive: Boolean,
      location: Point,
      testFn: js.Function2[/* object */ DisplayObject, /* pt */ Point, Boolean],
      pruneFn: js.Function2[/* object */ DisplayObject, /* pt */ Point, Boolean]
    ): js.Array[DisplayObject] = js.native
    
    /**
      * Maps the given upstream event through the event boundary and propagates it downstream.
      * @param e
      */
    def mapEvent(e: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * Maps the upstream `pointerdown` events to a downstream `pointerdown` event.
      *
      * `touchstart`, `rightdown`, `mousedown` events are also dispatched for specific pointer types.
      * @param from
      */
    /* protected */ def mapPointerDown(from: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * Maps the upstream `pointermove` to downstream `pointerout`, `pointerover`, and `pointermove` events, in that order.
      *
      * The tracking data for the specific pointer has an updated `overTarget`. `mouseout`, `mouseover`,
      * `mousemove`, and `touchmove` events are fired as well for specific pointer types.
      * @param from - The upstream `pointermove` event.
      */
    /* protected */ def mapPointerMove(from: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * Maps the upstream `pointerout` to downstream `pointerout`, `pointerleave` events, in that order.
      *
      * The tracking data for the specific pointer is cleared of a `overTarget`.
      * @param from - The upstream `pointerout` event.
      */
    /* protected */ def mapPointerOut(from: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * Maps the upstream `pointerover` to downstream `pointerover` and `pointerenter` events, in that order.
      *
      * The tracking data for the specific pointer gets a new `overTarget`.
      * @param from - The upstream `pointerover` event.
      */
    /* protected */ def mapPointerOver(from: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * Maps the upstream `pointerup` event to downstream `pointerup`, `pointerupoutside`, and `click`/`pointertap` events,
      * in that order.
      *
      * The `pointerupoutside` event bubbles from the original `pointerdown` target to the most specific
      * ancestor of the `pointerdown` and `pointerup` targets, which is also the `click` event's target. `touchend`,
      * `rightup`, `mouseup`, `touchendoutside`, `rightupoutside`, `mouseupoutside`, and `tap` are fired as well for
      * specific pointer types.
      * @param from - The upstream `pointerup` event.
      */
    /* protected */ def mapPointerUp(from: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * Maps the upstream `pointerupoutside` event to a downstream `pointerupoutside` event, bubbling from the original
      * `pointerdown` target to `rootTarget`.
      *
      * (The most specific ancestor of the `pointerdown` event and the `pointerup` event must the {@code EventBoundary}'s
      * root because the `pointerup` event occurred outside of the boundary.)
      *
      * `touchendoutside`, `mouseupoutside`, and `rightupoutside` events are fired as well for specific pointer
      * types. The tracking data for the specific pointer is cleared of a `pressTarget`.
      * @param from - The upstream `pointerupoutside` event.
      */
    /* protected */ def mapPointerUpOutside(from: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * Maps the upstream `wheel` event to a downstream `wheel` event.
      * @param from - The upstream `wheel` event.
      */
    /* protected */ def mapWheel(from: FederatedEvent[UIEvent]): Unit = js.native
    
    /**
      * State object for mapping methods.
      * @see PIXI.EventBoundary#trackingData
      */
    /* protected */ var mappingState: Record[String, Any] = js.native
    
    /**
      * Maps event types to forwarding handles for them.
      *
      * {@link PIXI.EventBoundary EventBoundary} provides mapping for "pointerdown", "pointermove",
      * "pointerout", "pointerleave", "pointerover", "pointerup", and "pointerupoutside" by default.
      * @see PIXI.EventBoundary#addEventMapping
      */
    /* protected */ var mappingTable: Record[String, js.Array[Fn]] = js.native
    
    /**
      * This flag would emit `pointermove`, `touchmove`, and `mousemove` events on all DisplayObjects.
      *
      * The `moveOnAll` semantics mirror those of earlier versions of PixiJS. This was disabled in favor of
      * the Pointer Event API's approach.
      */
    var moveOnAll: Boolean = js.native
    
    /**
      * Similar to {@link EventEmitter.emit}, except it stops if the `propagationImmediatelyStopped` flag
      * is set on the event.
      * @param e - The event to call each listener with.
      * @param type - The event key.
      */
    /* private */ var notifyListeners: Any = js.native
    
    /**
      * Notify all the listeners to the event's `currentTarget`.
      * @param e - The event passed to the target.
      * @param type
      */
    /* protected */ def notifyTarget(e: FederatedEvent[UIEvent]): Unit = js.native
    /* protected */ def notifyTarget(e: FederatedEvent[UIEvent], `type`: String): Unit = js.native
    
    /**
      * Propagate the passed event from from {@link EventBoundary.rootTarget this.rootTarget} to its
      * target {@code e.target}.
      * @param e - The event to propagate.
      * @param type
      */
    def propagate(e: FederatedEvent[UIEvent]): Unit = js.native
    def propagate(e: FederatedEvent[UIEvent], `type`: String): Unit = js.native
    
    /**
      * Finds the propagation path from {@link PIXI.EventBoundary.rootTarget rootTarget} to the passed
      * {@code target}. The last element in the path is {@code target}.
      * @param target
      */
    def propagationPath(target: FederatedEventTarget): js.Array[FederatedEventTarget] = js.native
    
    /**
      * The root event-target residing below the event boundary.
      *
      * All events are dispatched trickling down and bubbling up to this `rootTarget`.
      */
    var rootTarget: DisplayObject = js.native
    
    /**
      * @param id - The pointer ID.
      * @returns The tracking data stored for the given pointer. If no data exists, a blank
      *  state will be created.
      */
    /* protected */ def trackingData(id: Double): TrackingData = js.native
  }
  
  /**
    * The tracking data for each pointer held in the state of an {@link PIXI.EventBoundary}.
    *
    * ```ts
    * pressTargetsByButton: {
    *     [id: number]: FederatedEventTarget[];
    * };
    * clicksByButton: {
    *     [id: number]: {
    *         clickCount: number;
    *         target: FederatedEventTarget;
    *         timeStamp: number;
    *     };
    * };
    * overTargets: FederatedEventTarget[];
    * ```
    * @typedef {object} TrackingData
    * @property {Record.<number, PIXI.FederatedEventTarget>} pressTargetsByButton - The pressed display objects'
    *  propagation paths by each button of the pointer.
    * @property {Record.<number, object>} clicksByButton - Holds clicking data for each button of the pointer.
    * @property {PIXI.DisplayObject[]} overTargets - The DisplayObject propagation path over which the pointer is hovering.
    * @memberof PIXI
    */
  trait TrackingData extends StObject {
    
    var clicksByButton: NumberDictionary[ClickCount]
    
    var overTargets: js.Array[FederatedEventTarget]
    
    var pressTargetsByButton: NumberDictionary[js.Array[FederatedEventTarget]]
  }
  object TrackingData {
    
    inline def apply(
      clicksByButton: NumberDictionary[ClickCount],
      overTargets: js.Array[FederatedEventTarget],
      pressTargetsByButton: NumberDictionary[js.Array[FederatedEventTarget]]
    ): TrackingData = {
      val __obj = js.Dynamic.literal(clicksByButton = clicksByButton.asInstanceOf[js.Any], overTargets = overTargets.asInstanceOf[js.Any], pressTargetsByButton = pressTargetsByButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackingData]
    }
    
    extension [Self <: TrackingData](x: Self) {
      
      inline def setClicksByButton(value: NumberDictionary[ClickCount]): Self = StObject.set(x, "clicksByButton", value.asInstanceOf[js.Any])
      
      inline def setOverTargets(value: js.Array[FederatedEventTarget]): Self = StObject.set(x, "overTargets", value.asInstanceOf[js.Any])
      
      inline def setOverTargetsVarargs(value: FederatedEventTarget*): Self = StObject.set(x, "overTargets", js.Array(value*))
      
      inline def setPressTargetsByButton(value: NumberDictionary[js.Array[FederatedEventTarget]]): Self = StObject.set(x, "pressTargetsByButton", value.asInstanceOf[js.Any])
    }
  }
}
