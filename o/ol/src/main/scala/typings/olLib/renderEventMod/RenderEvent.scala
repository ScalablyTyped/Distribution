package typings
package olLib.renderEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderEvent
  extends olLib.eventsEventMod.default {
  var context: stdLib.CanvasRenderingContext2D = js.native
  var frameState: olLib.pluggableMapMod.FrameState = js.native
  var glContext: olLib.webglContextMod.default = js.native
  var vectorContext: olLib.renderVectorContextMod.default = js.native
}

