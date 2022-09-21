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
  
  var _glDepthBuffer: Any = js.native
  
  var _glFrameBuffer: Any = js.native
  
  var _glMsaaColorBuffer: Any = js.native
  
  var _glMsaaDepthBuffer: Any = js.native
  
  var _glResolveFrameBuffer: Any = js.native
  
  def destroy(device: Any): Unit = js.native
  
  def init(device: Any, target: Any): Unit = js.native
  
  def initialized: Boolean = js.native
  
  def loseContext(): Unit = js.native
  
  def resolve(device: Any, target: Any, color: Any, depth: Any): Unit = js.native
}
