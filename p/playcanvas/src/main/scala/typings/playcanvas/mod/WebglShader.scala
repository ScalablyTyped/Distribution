package typings.playcanvas.mod

import typings.std.WebGLProgram
import typings.std.WebGLShader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGL implementation of the Shader.
  *
  * @ignore
  */
trait WebglShader extends StObject {
  
  /**
    * Compiles an individual shader.
    *
    * @param {import('./webgl-graphics-device.js').WebglGraphicsDevice} device - The graphics device.
    * @param {string} src - The shader source code.
    * @param {boolean} isVertexShader - True if the shader is a vertex shader, false if it is a
    * fragment shader.
    * @returns {WebGLShader} The compiled shader.
    * @private
    */
  /* private */ var _compileShaderSource: Any
  
  /**
    * Check the compilation status of a shader.
    *
    * @param {import('./webgl-graphics-device.js').WebglGraphicsDevice} device - The graphics device.
    * @param {import('../shader.js').Shader} shader - The shader to query.
    * @param {WebGLShader} glShader - The WebGL shader.
    * @param {string} source - The shader source code.
    * @param {string} shaderType - The shader type. Can be 'vertex' or 'fragment'.
    * @returns {boolean} True if the shader compiled successfully, false otherwise.
    * @private
    */
  /* private */ var _isCompiled: Any
  
  /**
    * Truncate the WebGL shader compilation log to just include the error line plus the 5 lines
    * before and after it.
    *
    * @param {string} src - The shader source code.
    * @param {string} infoLog - The info log returned from WebGL on a failed shader compilation.
    * @returns {Array} An array where the first element is the 10 lines of code around the first
    * detected error, and the second element an object storing the error message, line number and
    * complete shader source.
    * @private
    */
  /* private */ var _processError: Any
  
  var attributes: js.Array[Any]
  
  /**
    * Compile shader programs.
    *
    * @param {import('./webgl-graphics-device.js').WebglGraphicsDevice} device - The graphics device.
    * @param {import('../shader.js').Shader} shader - The shader to compile.
    */
  def compile(device: WebglGraphicsDevice, shader: Shader): Unit
  
  var compileDuration: Double
  
  /**
    * Free the WebGL resources associated with a shader.
    *
    * @param {import('../shader.js').Shader} shader - The shader to free.
    */
  def destroy(shader: Shader): Unit
  
  /**
    * Link the shader, and extract its attributes and uniform information.
    *
    * @param {import('./webgl-graphics-device.js').WebglGraphicsDevice} device - The graphics device.
    * @param {import('../shader.js').Shader} shader - The shader to query.
    * @returns {boolean} True if the shader was successfully queried and false otherwise.
    */
  def finalize(device: WebglGraphicsDevice, shader: Shader): Boolean
  
  var glFragmentShader: WebGLShader
  
  var glProgram: WebGLProgram
  
  var glVertexShader: WebGLShader
  
  def init(): Unit
  
  /**
    * Link shader programs. This is called at a later stage, to allow many shaders to compile in parallel.
    *
    * @param {import('./webgl-graphics-device.js').WebglGraphicsDevice} device - The graphics device.
    * @param {import('../shader.js').Shader} shader - The shader to compile.
    */
  def link(device: WebglGraphicsDevice, shader: Shader): Unit
  
  /**
    * Dispose the shader when the context has been lost.
    */
  def loseContext(): Unit
  
  /**
    * Restore shader after the context has been obtained.
    *
    * @param {import('./webgl-graphics-device.js').WebglGraphicsDevice} device - The graphics device.
    * @param {import('../shader.js').Shader} shader - The shader to restore.
    */
  def restoreContext(device: WebglGraphicsDevice, shader: Shader): Unit
  
  var samplers: js.Array[Any]
  
  var uniforms: js.Array[Any]
}
object WebglShader {
  
  inline def apply(
    _compileShaderSource: Any,
    _isCompiled: Any,
    _processError: Any,
    attributes: js.Array[Any],
    compile: (WebglGraphicsDevice, Shader) => Unit,
    compileDuration: Double,
    destroy: Shader => Unit,
    finalize_ : (WebglGraphicsDevice, Shader) => Boolean,
    glFragmentShader: WebGLShader,
    glProgram: WebGLProgram,
    glVertexShader: WebGLShader,
    init: () => Unit,
    link: (WebglGraphicsDevice, Shader) => Unit,
    loseContext: () => Unit,
    restoreContext: (WebglGraphicsDevice, Shader) => Unit,
    samplers: js.Array[Any],
    uniforms: js.Array[Any]
  ): WebglShader = {
    val __obj = js.Dynamic.literal(_compileShaderSource = _compileShaderSource.asInstanceOf[js.Any], _isCompiled = _isCompiled.asInstanceOf[js.Any], _processError = _processError.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], compile = js.Any.fromFunction2(compile), compileDuration = compileDuration.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), glFragmentShader = glFragmentShader.asInstanceOf[js.Any], glProgram = glProgram.asInstanceOf[js.Any], glVertexShader = glVertexShader.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), link = js.Any.fromFunction2(link), loseContext = js.Any.fromFunction0(loseContext), restoreContext = js.Any.fromFunction2(restoreContext), samplers = samplers.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.updateDynamic("finalize")(js.Any.fromFunction2(finalize_))
    __obj.asInstanceOf[WebglShader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebglShader] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: Any*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCompile(value: (WebglGraphicsDevice, Shader) => Unit): Self = StObject.set(x, "compile", js.Any.fromFunction2(value))
    
    inline def setCompileDuration(value: Double): Self = StObject.set(x, "compileDuration", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Shader => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setFinalize_(value: (WebglGraphicsDevice, Shader) => Boolean): Self = StObject.set(x, "finalize", js.Any.fromFunction2(value))
    
    inline def setGlFragmentShader(value: WebGLShader): Self = StObject.set(x, "glFragmentShader", value.asInstanceOf[js.Any])
    
    inline def setGlProgram(value: WebGLProgram): Self = StObject.set(x, "glProgram", value.asInstanceOf[js.Any])
    
    inline def setGlVertexShader(value: WebGLShader): Self = StObject.set(x, "glVertexShader", value.asInstanceOf[js.Any])
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setLink(value: (WebglGraphicsDevice, Shader) => Unit): Self = StObject.set(x, "link", js.Any.fromFunction2(value))
    
    inline def setLoseContext(value: () => Unit): Self = StObject.set(x, "loseContext", js.Any.fromFunction0(value))
    
    inline def setRestoreContext(value: (WebglGraphicsDevice, Shader) => Unit): Self = StObject.set(x, "restoreContext", js.Any.fromFunction2(value))
    
    inline def setSamplers(value: js.Array[Any]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    inline def setSamplersVarargs(value: Any*): Self = StObject.set(x, "samplers", js.Array(value*))
    
    inline def setUniforms(value: js.Array[Any]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsVarargs(value: Any*): Self = StObject.set(x, "uniforms", js.Array(value*))
    
    inline def set_compileShaderSource(value: Any): Self = StObject.set(x, "_compileShaderSource", value.asInstanceOf[js.Any])
    
    inline def set_isCompiled(value: Any): Self = StObject.set(x, "_isCompiled", value.asInstanceOf[js.Any])
    
    inline def set_processError(value: Any): Self = StObject.set(x, "_processError", value.asInstanceOf[js.Any])
  }
}
