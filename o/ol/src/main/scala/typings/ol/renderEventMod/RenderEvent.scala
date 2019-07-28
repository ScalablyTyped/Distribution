package typings.ol.renderEventMod

import typings.ol.pluggableMapMod.FrameState
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderEvent
  extends typings.ol.eventsEventMod.default {
  var context: CanvasRenderingContext2D = js.native
  var frameState: FrameState = js.native
  var glContext: typings.ol.webglContextMod.default = js.native
  var vectorContext: typings.ol.renderVectorContextMod.default = js.native
}

