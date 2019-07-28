package typings.ol.renderEventMod

import typings.ol.pluggableMapMod.FrameState
import typings.ol.renderEventTypeMod.EventType
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/Event", JSImport.Default)
@js.native
class default protected () extends RenderEvent {
  def this(`type`: EventType) = this()
  def this(`type`: EventType, opt_vectorContext: typings.ol.renderVectorContextMod.default) = this()
  def this(
    `type`: EventType,
    opt_vectorContext: typings.ol.renderVectorContextMod.default,
    opt_frameState: FrameState
  ) = this()
  def this(
    `type`: EventType,
    opt_vectorContext: typings.ol.renderVectorContextMod.default,
    opt_frameState: FrameState,
    opt_context: CanvasRenderingContext2D
  ) = this()
  def this(
    `type`: EventType,
    opt_vectorContext: typings.ol.renderVectorContextMod.default,
    opt_frameState: FrameState,
    opt_context: CanvasRenderingContext2D,
    opt_glContext: typings.ol.webglContextMod.default
  ) = this()
}

