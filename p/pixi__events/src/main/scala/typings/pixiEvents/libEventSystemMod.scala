package typings.pixiEvents

import typings.pixiCore.libIrendererMod.IRenderableObject
import typings.pixiEvents.libEventBoundaryMod.EventBoundary
import typings.pixiEvents.libFederatedWheelEventMod.FederatedWheelEvent
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.libIpointdataMod.IPointData
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import typings.std.Record
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventSystemMod {
  
  @JSImport("@pixi/events/lib/EventSystem", "EventSystem")
  @js.native
  open class EventSystem protected () extends StObject {
    /**
      * @param {PIXI.Renderer} renderer
      */
    def this(renderer: Renderer) = this()
    
    /** Register event listeners on {@link PIXI.Renderer#domElement this.domElement}. */
    /* private */ var addEvents: Any = js.native
    
    /**
      * Should default browser actions automatically be prevented.
      * Does not apply to pointer events for backwards compatibility
      * preventDefault on pointer events stops mouse events from firing
      * Thus, for every pointer event, there will always be either a mouse of touch event alongside it.
      * @default true
      */
    var autoPreventDefault: Boolean = js.native
    
    /**
      * Normalizes the {@code nativeEvent} into a federateed {@code FederatedPointerEvent}.
      * @param event
      * @param nativeEvent
      */
    /* private */ var bootstrapEvent: Any = js.native
    
    /* private */ var currentCursor: Any = js.native
    
    /**
      * Dictionary of how different cursor modes are handled. Strings are handled as CSS cursor
      * values, objects are handled as dictionaries of CSS values for {@code domElement},
      * and functions are called instead of changing the CSS.
      * Default CSS cursor values are provided for 'default' and 'pointer' modes.
      */
    var cursorStyles: Record[String, String | (js.Function1[/* mode */ String, Unit]) | CSSStyleDeclaration] = js.native
    
    /** Destroys all event listeners and detaches the renderer. */
    def destroy(): Unit = js.native
    
    /**
      * The DOM element to which the root event listeners are bound. This is automatically set to
      * the renderer's {@link PIXI.Renderer#view view}.
      */
    var domElement: HTMLElement = js.native
    
    /* private */ var eventsAdded: Any = js.native
    
    /**
      * Runner init called, view is available at this point.
      * @ignore
      */
    def init(): Unit = js.native
    
    /**
      * Maps x and y coords from a DOM object and maps them correctly to the PixiJS view. The
      * resulting value is stored in the point. This takes into account the fact that the DOM
      * element could be scaled and positioned anywhere on the screen.
      * @param  {PIXI.IPointData} point - the point that the result will be stored in
      * @param  {number} x - the x coord of the position to map
      * @param  {number} y - the y coord of the position to map
      */
    def mapPositionToPoint(point: IPointData, x: Double, y: Double): Unit = js.native
    
    /**
      * Ensures that the original event object contains all data that a regular pointer event would have
      * @param event - The original event data from a touch or mouse event
      * @returns An array containing a single normalized pointer event, in the case of a pointer
      *  or mouse event, or a multiple normalized pointer events if there are multiple changed touches
      */
    /* private */ var normalizeToPointerData: Any = js.native
    
    /**
      * Normalizes the native {@link https://w3c.github.io/uievents/#interface-wheelevent WheelEvent}.
      *
      * The returned {@link PIXI.FederatedWheelEvent} is a shared instance. It will not persist across
      * multiple native wheel events.
      * @param nativeEvent - The native wheel event that occurred on the canvas.
      * @returns A federated wheel event.
      */
    /* protected */ def normalizeWheelEvent(nativeEvent: WheelEvent): FederatedWheelEvent = js.native
    
    /**
      * Event handler for pointer down events on {@link PIXI.EventSystem#domElement this.domElement}.
      * @param nativeEvent - The native mouse/pointer/touch event.
      */
    /* private */ var onPointerDown: Any = js.native
    
    /**
      * Event handler for pointer move events on on {@link PIXI.EventSystem#domElement this.domElement}.
      * @param nativeEvent - The native mouse/pointer/touch events.
      */
    /* private */ var onPointerMove: Any = js.native
    
    /**
      * Event handler for pointer over & out events on {@link PIXI.EventSystem#domElement this.domElement}.
      * @param nativeEvent - The native mouse/pointer/touch event.
      */
    /* private */ var onPointerOverOut: Any = js.native
    
    /**
      * Event handler for pointer up events on {@link PIXI.EventSystem#domElement this.domElement}.
      * @param nativeEvent - The native mouse/pointer/touch event.
      */
    /* private */ var onPointerUp: Any = js.native
    
    /**
      * Passive handler for `wheel` events on {@link EventSystem.domElement this.domElement}.
      * @param nativeEvent - The native wheel event.
      */
    /* protected */ def onWheel(nativeEvent: WheelEvent): Unit = js.native
    
    /** Unregister event listeners on {@link PIXI.EventSystem#domElement this.domElement}. */
    /* private */ var removeEvents: Any = js.native
    
    /** The renderer managing this {@link EventSystem}. */
    var renderer: Renderer = js.native
    
    /** The resolution used to convert between the DOM client space into world space. */
    var resolution: Double = js.native
    
    /**
      * The {@link PIXI.EventBoundary} for the stage.
      *
      * The {@link PIXI.EventBoundary#rootTarget rootTarget} of this root boundary is automatically set to
      * the last rendered object before any event processing is initiated. This means the main scene
      * needs to be rendered atleast once before UI events will start propagating.
      *
      * The root boundary should only be changed during initialization. Otherwise, any state held by the
      * event boundary may be lost (like hovered & pressed DisplayObjects).
      */
    val rootBoundary: EventBoundary = js.native
    
    /* private */ var rootPointerEvent: Any = js.native
    
    /* private */ var rootWheelEvent: Any = js.native
    
    /**
      * Sets the current cursor mode, handling any callbacks or CSS style changes.
      * @param mode - cursor mode, a key from the cursorStyles dictionary
      */
    def setCursor(mode: String): Unit = js.native
    
    /**
      * Sets the {@link PIXI.EventSystem#domElement domElement} and binds event listeners.
      *
      * To deregister the current DOM element without setting a new one, pass {@code null}.
      * @param element - The new DOM element.
      */
    def setTargetElement(element: HTMLElement): Unit = js.native
    
    /** Does the device support pointer events https://www.w3.org/Submission/pointer-events/ */
    val supportsPointerEvents: Boolean = js.native
    
    /** Does the device support touch events https://www.w3.org/TR/touch-events/ */
    val supportsTouchEvents: Boolean = js.native
    
    /**
      * Transfers base & mouse event data from the {@code nativeEvent} to the federated event.
      * @param event
      * @param nativeEvent
      */
    /* private */ var transferMouseData: Any = js.native
  }
  /* static members */
  object EventSystem {
    
    /** @ignore */
    @JSImport("@pixi/events/lib/EventSystem", "EventSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait Renderer extends StObject {
    
    var lastObjectRendered: IRenderableObject
    
    var plugins: Record[String, Any]
    
    var resolution: Double
    
    var view: ICanvas
  }
  object Renderer {
    
    inline def apply(
      lastObjectRendered: IRenderableObject,
      plugins: Record[String, Any],
      resolution: Double,
      view: ICanvas
    ): Renderer = {
      val __obj = js.Dynamic.literal(lastObjectRendered = lastObjectRendered.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[Renderer]
    }
    
    extension [Self <: Renderer](x: Self) {
      
      inline def setLastObjectRendered(value: IRenderableObject): Self = StObject.set(x, "lastObjectRendered", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: Record[String, Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setView(value: ICanvas): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
