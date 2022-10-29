package typings.pixiEvents

import typings.pixiDisplay.mod.DisplayObject
import typings.pixiEvents.libEventSystemMod.Renderer
import typings.pixiEvents.libFederatedEventTargetMod.IFederatedDisplayObject
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/events", "EventBoundary")
  @js.native
  /**
    * @param rootTarget - The holder of the event boundary.
    */
  open class EventBoundary ()
    extends typings.pixiEvents.libEventBoundaryMod.EventBoundary {
    def this(rootTarget: DisplayObject) = this()
  }
  
  @JSImport("@pixi/events", "EventSystem")
  @js.native
  open class EventSystem protected ()
    extends typings.pixiEvents.libEventSystemMod.EventSystem {
    /**
      * @param {PIXI.Renderer} renderer
      */
    def this(renderer: Renderer) = this()
  }
  /* static members */
  object EventSystem {
    
    /** @ignore */
    @JSImport("@pixi/events", "EventSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  @JSImport("@pixi/events", "FederatedDisplayObject")
  @js.native
  val FederatedDisplayObject: IFederatedDisplayObject = js.native
  
  @JSImport("@pixi/events", "FederatedEvent")
  @js.native
  open class FederatedEvent[N /* <: UIEvent */] protected ()
    extends typings.pixiEvents.libFederatedEventMod.FederatedEvent[N] {
    /**
      * @param manager - The event boundary which manages this event. Propagation can only occur
      *  within the boundary's jurisdiction.
      */
    def this(manager: typings.pixiEvents.libEventBoundaryMod.EventBoundary) = this()
  }
  
  @JSImport("@pixi/events", "FederatedMouseEvent")
  @js.native
  open class FederatedMouseEvent protected ()
    extends typings.pixiEvents.libFederatedMouseEventMod.FederatedMouseEvent {
    /**
      * @param manager - The event boundary which manages this event. Propagation can only occur
      *  within the boundary's jurisdiction.
      */
    def this(manager: typings.pixiEvents.libEventBoundaryMod.EventBoundary) = this()
  }
  
  @JSImport("@pixi/events", "FederatedPointerEvent")
  @js.native
  open class FederatedPointerEvent protected ()
    extends typings.pixiEvents.libFederatedPointerEventMod.FederatedPointerEvent {
    /**
      * @param manager - The event boundary which manages this event. Propagation can only occur
      *  within the boundary's jurisdiction.
      */
    def this(manager: typings.pixiEvents.libEventBoundaryMod.EventBoundary) = this()
  }
  
  @JSImport("@pixi/events", "FederatedWheelEvent")
  @js.native
  open class FederatedWheelEvent protected ()
    extends typings.pixiEvents.libFederatedWheelEventMod.FederatedWheelEvent {
    /**
      * @param manager - The event boundary which manages this event. Propagation can only occur
      *  within the boundary's jurisdiction.
      */
    def this(manager: typings.pixiEvents.libEventBoundaryMod.EventBoundary) = this()
  }
}
