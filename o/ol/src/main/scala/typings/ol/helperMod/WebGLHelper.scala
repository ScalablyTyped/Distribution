package typings.ol.helperMod

import typings.ol.olMod.Transform
import typings.ol.pluggableMapMod.FrameState
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import typings.std.WebGLTexture
import typings.std.WebGLUniformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLHelper
  extends typings.ol.disposableMod.default {
  
  /**
    * Just bind the buffer if it's in the cache. Otherwise create
    * the WebGL buffer, bind it, populate it, and add an entry to
    * the cache.
    */
  def bindBuffer(buffer: typings.ol.bufferMod.default): Unit = js.native
  
  /**
    * Will attempt to compile a vertex or fragment shader based on source
    * On error, the shader will be returned but
    * gl.getShaderParameter(shader, gl.COMPILE_STATUS) will return true
    * Use gl.getShaderInfoLog(shader) to have details
    */
  def compileShader(source: String, `type`: ShaderType): WebGLShader = js.native
  
  /**
    * Will create or reuse a given webgl texture and apply the given size. If no image data
    * specified, the texture will be empty, otherwise image data will be used and the size
    * parameter will be ignored.
    * Note: wrap parameters are set to clamp to edge, min filter is set to linear.
    */
  def createTexture(size: js.Array[Double]): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: js.UndefOr[scala.Nothing], opt_texture: WebGLTexture): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLCanvasElement): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLCanvasElement, opt_texture: WebGLTexture): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLImageElement): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLImageElement, opt_texture: WebGLTexture): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: ImageData): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: ImageData, opt_texture: WebGLTexture): WebGLTexture = js.native
  
  def deleteBuffer(buf: typings.ol.bufferMod.default): Unit = js.native
  
  /**
    * Execute a draw call based on the currently bound program, texture, buffers, attributes.
    */
  def drawElements(start: Double, end: Double): Unit = js.native
  
  /**
    * Will enable the following attributes to be read from the currently bound buffer,
    * i.e. tell the GPU where to read the different attributes in the buffer. An error in the
    * size/type/order of attributes will most likely break the rendering and throw a WebGL exception.
    */
  def enableAttributes(attributes: js.Array[AttributeDescription]): Unit = js.native
  
  /**
    * Apply the successive post process passes which will eventually render to the actual canvas.
    */
  def finalizeDraw(frameState: FrameState): Unit = js.native
  
  /**
    * Update the data contained in the buffer array; this is required for the
    * new data to be rendered
    */
  def flushBufferData(buffer: typings.ol.bufferMod.default): Unit = js.native
  
  /**
    * Will get the location from the shader or the cache
    */
  def getAttributeLocation(name: String): Double = js.native
  
  def getCanvas(): HTMLCanvasElement = js.native
  
  /**
    * Get the WebGL rendering context
    */
  def getGL(): WebGLRenderingContext = js.native
  
  /**
    * Create a program for a vertex and fragment shader. The shaders compilation may have failed:
    * use WebGLHelper.getShaderCompileErrors()to have details if any.
    */
  def getProgram(fragmentShaderSource: String, vertexShaderSource: String): WebGLProgram = js.native
  
  /**
    * Will return the last shader compilation errors. If no error happened, will return null;
    */
  def getShaderCompileErrors(): String | Null = js.native
  
  /**
    * Will get the location from the shader or the cache
    */
  def getUniformLocation(name: String): WebGLUniformLocation = js.native
  
  /**
    * Modifies the given transform to apply the rotation/translation/scaling of the given frame state.
    * The resulting transform can be used to convert world space coordinates to view coordinates.
    */
  def makeProjectionTransform(frameState: FrameState, transform: Transform): Transform = js.native
  
  /**
    * Clear the buffer & set the viewport to draw.
    * Post process passes will be initialized here, the first one being bound as a render target for
    * subsequent draw calls.
    */
  def prepareDraw(frameState: FrameState): Unit = js.native
  
  /**
    * Clear the render target & bind it for future draw operations.
    * This is similar to prepareDraw, only post processes will not be applied.
    * Note: the whole viewport will be drawn to the render target, regardless of its size.
    */
  def prepareDrawToRenderTarget(frameState: FrameState, renderTarget: typings.ol.renderTargetMod.default): Unit = js.native
  def prepareDrawToRenderTarget(
    frameState: FrameState,
    renderTarget: typings.ol.renderTargetMod.default,
    opt_disableAlphaBlend: Boolean
  ): Unit = js.native
  
  /**
    * Give a value for a standard float uniform
    */
  def setUniformFloatValue(uniform: String, value: Double): Unit = js.native
  
  /**
    * Give a value for a standard matrix4 uniform
    */
  def setUniformMatrixValue(uniform: String, value: js.Array[Double]): Unit = js.native
  
  /**
    * Use a program.  If the program is already in use, this will return false.
    */
  def useProgram(program: WebGLProgram): Boolean = js.native
}
