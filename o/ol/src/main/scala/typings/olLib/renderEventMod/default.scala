package typings
package olLib.renderEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/Event", JSImport.Default)
@js.native
class default protected () extends RenderEvent {
  def this(`type`: olLib.renderEventTypeMod.EventType) = this()
  def this(`type`: olLib.renderEventTypeMod.EventType, opt_vectorContext: olLib.renderVectorContextMod.default) = this()
  def this(`type`: olLib.renderEventTypeMod.EventType, opt_vectorContext: olLib.renderVectorContextMod.default, opt_frameState: olLib.pluggableMapMod.FrameState) = this()
  def this(`type`: olLib.renderEventTypeMod.EventType, opt_vectorContext: olLib.renderVectorContextMod.default, opt_frameState: olLib.pluggableMapMod.FrameState, opt_context: stdLib.CanvasRenderingContext2D) = this()
  def this(`type`: olLib.renderEventTypeMod.EventType, opt_vectorContext: olLib.renderVectorContextMod.default, opt_frameState: olLib.pluggableMapMod.FrameState, opt_context: stdLib.CanvasRenderingContext2D, opt_glContext: olLib.webglContextMod.default) = this()
}

