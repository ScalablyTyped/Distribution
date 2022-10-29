package typings.pixiEvents

import typings.pixiCore.mod.Point
import typings.pixiEvents.libEventBoundaryMod.EventBoundary
import typings.pixiEvents.libFederatedEventTargetMod.FederatedEventTarget
import typings.std.EventTarget
import typings.std.UIEvent
import typings.std.WindowProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFederatedEventMod {
  
  @JSImport("@pixi/events/lib/FederatedEvent", "FederatedEvent")
  @js.native
  open class FederatedEvent[N /* <: UIEvent */] protected ()
    extends StObject
       with UIEvent {
    /**
      * @param manager - The event boundary which manages this event. Propagation can only occur
      *  within the boundary's jurisdiction.
      */
    def this(manager: EventBoundary) = this()
    
    /** The listeners of the event target that are being notified. */
    @JSName("currentTarget")
    var currentTarget_FederatedEvent: FederatedEventTarget = js.native
    
    /**
      * Fallback for the deprecated {@link PIXI.InteractionEvent.data}.
      * @deprecated since 7.0.0
      */
    def data: this.type = js.native
    
    /** The coordinates of the evnet relative to the nearest DOM layer. This is a non-standard property. */
    var layer: Point = js.native
    
    /** @readonly */
    def layerX: Double = js.native
    
    /** @readonly */
    def layerY: Double = js.native
    
    /** The {@link EventBoundary} that manages this event. Null for root events. */
    val manager: EventBoundary = js.native
    
    /** The native event that caused the foremost original event. */
    var nativeEvent: N = js.native
    
    /** The original event that caused this event, if any. */
    var originalEvent: FederatedEvent[N] = js.native
    
    /** The coordinates of the event relative to the DOM document. This is a non-standard property. */
    var page: Point = js.native
    
    /** @readonly */
    def pageX: Double = js.native
    
    /** @readonly */
    def pageY: Double = js.native
    
    /** The composed path of the event's propagation. The {@code target} is at the end. */
    var path: js.Array[FederatedEventTarget] = js.native
    
    /** Flags whether propagation was immediately stopped. */
    var propagationImmediatelyStopped: Boolean = js.native
    
    /** Flags whether propagation was stopped. */
    var propagationStopped: Boolean = js.native
    
    /** @deprecated since 7.0.0 */
    @JSName("srcElement")
    var srcElement_FederatedEvent: EventTarget = js.native
    
    /** The event target that this will be dispatched to. */
    @JSName("target")
    var target_FederatedEvent: FederatedEventTarget = js.native
    
    /** The timestamp of when the event was created. */
    @JSName("timeStamp")
    var timeStamp_FederatedEvent: Double = js.native
    
    /** The global Window object. */
    @JSName("view")
    var view_FederatedEvent: WindowProxy = js.native
  }
}
