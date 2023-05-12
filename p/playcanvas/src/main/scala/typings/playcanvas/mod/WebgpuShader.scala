package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGPU implementation of the Shader.
  *
  * @ignore
  */
@js.native
trait WebgpuShader extends StObject {
  
  /**
    * Transpiled fragment shader code.
    *
    * @type {Uint32Array | string}
    */
  var _fragmentCode: js.typedarray.Uint32Array | String = js.native
  
  /**
    * Transpiled vertex shader code.
    *
    * @type {Uint32Array | string}
    */
  var _vertexCode: js.typedarray.Uint32Array | String = js.native
  
  def createShaderModule(code: Any, shaderType: Any): Any = js.native
  
  /**
    * Free the WebGPU resources associated with a shader.
    *
    * @param {import('../shader.js').Shader} shader - The shader to free.
    */
  def destroy(shader: Shader): Unit = js.native
  
  def fragmentCode: String | js.typedarray.Uint32Array = js.native
  
  /**
    * Name of the fragment entry point function.
    */
  var fragmentEntryPoint: String = js.native
  
  def getFragmentShaderModule(): Any = js.native
  
  def getVertexShaderModule(): Any = js.native
  
  /**
    * Dispose the shader when the context has been lost.
    */
  def loseContext(): Unit = js.native
  
  def process(): Unit = js.native
  
  var processed: Any = js.native
  
  /**
    * Restore shader after the context has been obtained.
    *
    * @param {import('../graphics-device.js').GraphicsDevice} device - The graphics device.
    * @param {import('../shader.js').Shader} shader - The shader to restore.
    */
  def restoreContext(device: GraphicsDevice, shader: Shader): Unit = js.native
  
  /** @type {import('../shader.js').Shader} */
  var shader: Shader = js.native
  
  def transpile(src: Any, shaderType: Any, originalSrc: Any): Any = js.native
  
  def vertexCode: String | js.typedarray.Uint32Array = js.native
  
  /**
    * Name of the vertex entry point function.
    */
  var vertexEntryPoint: String = js.native
}
