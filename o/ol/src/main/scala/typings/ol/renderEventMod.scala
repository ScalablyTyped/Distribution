package typings.ol

import typings.ol.mapMod.FrameState
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderEventMod {
  
  @JSImport("ol/render/Event", JSImport.Default)
  @js.native
  open class default protected () extends RenderEvent {
    /**
      * @param {import("./EventType.js").default} type Type.
      * @param {import("../transform.js").Transform} [inversePixelTransform] Transform for
      *     CSS pixels to rendered pixels.
      * @param {import("../Map.js").FrameState} [frameState] Frame state.
      * @param {?(CanvasRenderingContext2D|WebGLRenderingContext)} [context] Context.
      */
    def this(`type`: Any) = this()
    def this(`type`: Any, inversePixelTransform: js.Array[Double]) = this()
    def this(`type`: Any, inversePixelTransform: js.Array[Double], frameState: FrameState) = this()
    def this(`type`: Any, inversePixelTransform: Unit, frameState: FrameState) = this()
    def this(
      `type`: Any,
      inversePixelTransform: js.Array[Double],
      frameState: Unit,
      context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: Any,
      inversePixelTransform: js.Array[Double],
      frameState: Unit,
      context: WebGLRenderingContext
    ) = this()
    def this(
      `type`: Any,
      inversePixelTransform: js.Array[Double],
      frameState: FrameState,
      context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: Any,
      inversePixelTransform: js.Array[Double],
      frameState: FrameState,
      context: WebGLRenderingContext
    ) = this()
    def this(`type`: Any, inversePixelTransform: Unit, frameState: Unit, context: CanvasRenderingContext2D) = this()
    def this(`type`: Any, inversePixelTransform: Unit, frameState: Unit, context: WebGLRenderingContext) = this()
    def this(
      `type`: Any,
      inversePixelTransform: Unit,
      frameState: FrameState,
      context: CanvasRenderingContext2D
    ) = this()
    def this(`type`: Any, inversePixelTransform: Unit, frameState: FrameState, context: WebGLRenderingContext) = this()
  }
  
  @js.native
  trait RenderEvent
    extends typings.ol.eventsEventMod.default {
    
    /**
      * Canvas context. Not available when the event is dispatched by the map. For Canvas 2D layers,
      * the context will be the 2D rendering context.  For WebGL layers, the context will be the WebGL
      * context.
      * @type {CanvasRenderingContext2D|WebGLRenderingContext|undefined}
      * @api
      */
    var context: js.UndefOr[CanvasRenderingContext2D | WebGLRenderingContext] = js.native
    
    /**
      * An object representing the current render frame state.
      * @type {import("../Map.js").FrameState|undefined}
      * @api
      */
    var frameState: js.UndefOr[FrameState] = js.native
    
    /**
      * Transform from CSS pixels (relative to the top-left corner of the map viewport)
      * to rendered pixels on this event's `context`. Only available when a Canvas renderer is used, null otherwise.
      * @type {import("../transform.js").Transform|undefined}
      * @api
      */
    var inversePixelTransform: js.UndefOr[Transform] = js.native
  }
}
