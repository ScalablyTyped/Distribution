package typings.ol.webglPostProcessingPassMod

import typings.ol.pluggableMapMod.FrameState
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLPostProcessingPass extends js.Object {
  @JSName("apply")
  def apply(frameState: FrameState): Unit = js.native
  @JSName("apply")
  def apply(frameState: FrameState, nextPass: WebGLPostProcessingPass): Unit = js.native
  def getFrameBuffer(): WebGLFramebuffer = js.native
  def getGL(): WebGLRenderingContext = js.native
  def init(frameState: FrameState): Unit = js.native
}

