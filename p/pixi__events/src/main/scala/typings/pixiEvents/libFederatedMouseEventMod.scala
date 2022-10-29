package typings.pixiEvents

import typings.pixiCore.mod.Point
import typings.pixiEvents.libEventBoundaryMod.EventBoundary
import typings.pixiEvents.libFederatedEventMod.FederatedEvent
import typings.std.EventTarget
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFederatedMouseEventMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Event because Already inherited
  - typings.std.UIEvent because Already inherited
  - typings.std.MouseEvent because var conflicts: AT_TARGET, BUBBLING_PHASE, CAPTURING_PHASE, NONE, bubbles, cancelBubble, currentTarget, defaultPrevented, detail, eventPhase, isTrusted, pageX, pageY, returnValue, srcElement, target, timeStamp, `type`, view, which. Inlined x, metaKey, shiftKey, screenY, y, altKey, offsetX, clientY, screenX, ctrlKey, movementY, movementX, buttons, button, offsetY, clientX, relatedTarget, getModifierState, initMouseEvent, initMouseEvent */ @JSImport("@pixi/events/lib/FederatedMouseEvent", "FederatedMouseEvent")
  @js.native
  open class FederatedMouseEvent protected () extends FederatedEvent[MouseEvent | PointerEvent | TouchEvent] {
    /**
      * @param manager - The event boundary which manages this event. Propagation can only occur
      *  within the boundary's jurisdiction.
      */
    def this(manager: EventBoundary) = this()
    
    /** Whether the "alt" key was pressed when this mouse event occurred. */
    var altKey: Boolean = js.native
    
    /** The specific button that was pressed in this mouse event. */
    var button: Double = js.native
    
    /** The button depressed when this event occurred. */
    var buttons: Double = js.native
    
    /** The coordinates of the mouse event relative to the canvas. */
    var client: Point = js.native
    
    /** @readonly */
    def clientX: Double = js.native
    /* standard dom */
    @JSName("clientX")
    val clientX_FFederatedMouseEvent: Double = js.native
    
    /** @readonly */
    def clientY: Double = js.native
    /* standard dom */
    @JSName("clientY")
    val clientY_FFederatedMouseEvent: Double = js.native
    
    /** Whether the "control" key was pressed when this mouse event occurred. */
    var ctrlKey: Boolean = js.native
    
    /**
      * Whether the modifier key was pressed when this event natively occurred.
      * @param key - The modifier key.
      */
    /* standard dom */
    def getModifierState(key: String): Boolean = js.native
    
    /** The pointer coordinates in world space. */
    var global: Point = js.native
    
    /** @readonly */
    def globalX: Double = js.native
    
    /** @readonly */
    def globalY: Double = js.native
    
    /**
      * Not supported.
      * @param _typeArg
      * @param _canBubbleArg
      * @param _cancelableArg
      * @param _viewArg
      * @param _detailArg
      * @param _screenXArg
      * @param _screenYArg
      * @param _clientXArg
      * @param _clientYArg
      * @param _ctrlKeyArg
      * @param _altKeyArg
      * @param _shiftKeyArg
      * @param _metaKeyArg
      * @param _buttonArg
      * @param _relatedTargetArg
      * @deprecated since 7.0.0
      */
    def initMouseEvent(
      _typeArg: String,
      _canBubbleArg: Boolean,
      _cancelableArg: Boolean,
      _viewArg: Window,
      _detailArg: Double,
      _screenXArg: Double,
      _screenYArg: Double,
      _clientXArg: Double,
      _clientYArg: Double,
      _ctrlKeyArg: Boolean,
      _altKeyArg: Boolean,
      _shiftKeyArg: Boolean,
      _metaKeyArg: Boolean,
      _buttonArg: Double,
      _relatedTargetArg: EventTarget
    ): Unit = js.native
    /** @deprecated */
    /* standard dom */
    def initMouseEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: Window,
      detailArg: Double,
      screenXArg: Double,
      screenYArg: Double,
      clientXArg: Double,
      clientYArg: Double,
      ctrlKeyArg: Boolean,
      altKeyArg: Boolean,
      shiftKeyArg: Boolean,
      metaKeyArg: Boolean,
      buttonArg: Double
    ): Unit = js.native
    
    /** Whether the "meta" key was pressed when this mouse event occurred. */
    var metaKey: Boolean = js.native
    
    /** The movement in this pointer relative to the last `mousemove` event. */
    var movement: Point = js.native
    
    /** @readonly */
    def movementX: Double = js.native
    /* standard dom */
    @JSName("movementX")
    val movementX_FFederatedMouseEvent: Double = js.native
    
    /** @readonly */
    def movementY: Double = js.native
    /* standard dom */
    @JSName("movementY")
    val movementY_FFederatedMouseEvent: Double = js.native
    
    /**
      * The offset of the pointer coordinates w.r.t. target DisplayObject in world space. This is
      * not supported at the moment.
      */
    var offset: Point = js.native
    
    /** @readonly */
    def offsetX: Double = js.native
    /* standard dom */
    @JSName("offsetX")
    val offsetX_FFederatedMouseEvent: Double = js.native
    
    /** @readonly */
    def offsetY: Double = js.native
    /* standard dom */
    @JSName("offsetY")
    val offsetY_FFederatedMouseEvent: Double = js.native
    
    /** This is currently not implemented in the Federated Events API. */
    var relatedTarget: EventTarget | Null = js.native
    
    /**
      * The pointer coordinates in the renderer's {@link PIXI.Renderer.screen screen}. This has slightly
      * different semantics than native PointerEvent screenX/screenY.
      */
    var screen: Point = js.native
    
    /**
      * The pointer coordinates in the renderer's screen. Alias for {@code screen.x}.
      * @readonly
      */
    def screenX: Double = js.native
    /* standard dom */
    @JSName("screenX")
    val screenX_FFederatedMouseEvent: Double = js.native
    
    /**
      * The pointer coordinates in the renderer's screen. Alias for {@code screen.y}.
      * @readonly
      */
    def screenY: Double = js.native
    /* standard dom */
    @JSName("screenY")
    val screenY_FFederatedMouseEvent: Double = js.native
    
    /** Whether the "shift" key was pressed when this mouse event occurred. */
    var shiftKey: Boolean = js.native
    
    /**
      * Alias for {@link FederatedMouseEvent.clientX this.clientX}.
      * @readonly
      */
    def x: Double = js.native
    /* standard dom */
    @JSName("x")
    val x_FFederatedMouseEvent: Double = js.native
    
    /**
      * Alias for {@link FederatedMouseEvent.clientY this.clientY}.
      * @readonly
      */
    def y: Double = js.native
    /* standard dom */
    @JSName("y")
    val y_FFederatedMouseEvent: Double = js.native
  }
}
