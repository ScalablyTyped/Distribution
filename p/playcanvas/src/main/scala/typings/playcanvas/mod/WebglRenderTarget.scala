package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGL implementation of the RenderTarget.
  *
  * @ignore
  */
@js.native
trait WebglRenderTarget extends StObject {
  
  /**
    * Checks the completeness status of the currently bound WebGLFramebuffer object.
    *
    * @private
    */
  /* private */ var _checkFbo: Any = js.native
  
  def _createMsaaMrtFramebuffers(device: Any, target: Any, colorBufferCount: Any): Unit = js.native
  
  var _glDepthBuffer: Any = js.native
  
  var _glFrameBuffer: Any = js.native
  
  var _glMsaaColorBuffers: js.Array[Any] = js.native
  
  var _glMsaaDepthBuffer: Any = js.native
  
  var _glResolveFrameBuffer: Any = js.native
  
  /**
    * A list of framebuffers created When MSAA and MRT are used together, one for each color buffer.
    * This allows color buffers to be resolved separately.
    *
    * @type {FramebufferPair[]}
    */
  var colorMrtFramebuffers: js.Array[FramebufferPair] = js.native
  
  def destroy(device: Any): Unit = js.native
  
  def init(device: Any, target: Any): Unit = js.native
  
  def initialized: Boolean = js.native
  
  def internalResolve(device: Any, src: Any, dst: Any, target: Any, mask: Any): Unit = js.native
  
  def loseContext(): Unit = js.native
  
  def resolve(device: Any, target: Any, color: Any, depth: Any): Unit = js.native
}
