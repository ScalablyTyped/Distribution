package typings.ol

import typings.ol.olMod.Transform
import typings.ol.pluggableMapMod.FrameState
import typings.ol.renderEventTypeMod.EventType
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderEventMod {
  
  @JSImport("ol/render/Event", JSImport.Default)
  @js.native
  class default protected () extends RenderEvent {
    def this(`type`: EventType) = this()
    def this(`type`: EventType, opt_inversePixelTransform: Transform) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: js.UndefOr[scala.Nothing],
      opt_frameState: FrameState
    ) = this()
    def this(`type`: EventType, opt_inversePixelTransform: Transform, opt_frameState: FrameState) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: js.UndefOr[scala.Nothing],
      opt_frameState: js.UndefOr[scala.Nothing],
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: js.UndefOr[scala.Nothing],
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: Transform,
      opt_frameState: js.UndefOr[scala.Nothing],
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: Transform,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D
    ) = this()
  }
  
  @js.native
  trait RenderEvent
    extends typings.ol.eventMod.default {
    
    /**
      * Canvas context. Not available when the event is dispatched by the map. Only available
      * when a Canvas renderer is used, null otherwise.
      */
    var context: CanvasRenderingContext2D = js.native
    
    /**
      * An object representing the current render frame state.
      */
    var frameState: FrameState = js.native
    
    /**
      * Transform from CSS pixels (relative to the top-left corner of the map viewport)
      * to rendered pixels on this event's context.
      */
    var inversePixelTransform: Transform = js.native
  }
}
