package typings.ol.postProcessingPassMod

import typings.ol.pluggableMapMod.FrameState
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLPostProcessingPass extends js.Object {
  
  /**
    * Render to the next postprocessing pass (or to the canvas if final pass).
    */
  @JSName("apply")
  def apply(frameState: FrameState): Unit = js.native
  @JSName("apply")
  def apply(frameState: FrameState, nextPass: WebGLPostProcessingPass): Unit = js.native
  
  def getFrameBuffer(): WebGLFramebuffer = js.native
  
  /**
    * Get the WebGL rendering context
    */
  def getGL(): WebGLRenderingContext = js.native
  
  /**
    * Initialize the render target texture of the post process, make sure it is at the
    * right size and bind it as a render target for the next draw calls.
    * The last step to be initialized will be the one where the primitives are rendered.
    */
  def init(frameState: FrameState): Unit = js.native
}
