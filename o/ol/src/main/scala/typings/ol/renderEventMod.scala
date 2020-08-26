package typings.ol

import typings.ol.olMod.Transform
import typings.ol.pluggableMapMod.FrameState
import typings.ol.renderEventTypeMod.EventType
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/Event", JSImport.Namespace)
@js.native
object renderEventMod extends js.Object {
  @js.native
  trait RenderEvent
    extends typings.ol.eventMod.default {
    var context: CanvasRenderingContext2D = js.native
    var frameState: FrameState = js.native
    var inversePixelTransform: Transform = js.native
  }
  
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
  
}

