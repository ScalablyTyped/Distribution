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
import scala.scalajs.js.annotation._

@js.native
trait WebGLHelper
  extends typings.ol.disposableMod.default {
  def bindBuffer(buffer: typings.ol.bufferMod.default): Unit = js.native
  def compileShader(source: String, `type`: ShaderType): WebGLShader = js.native
  def createTexture(size: js.Array[Double]): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLCanvasElement): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLCanvasElement, opt_texture: WebGLTexture): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLImageElement): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLImageElement, opt_texture: WebGLTexture): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: ImageData): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: ImageData, opt_texture: WebGLTexture): WebGLTexture = js.native
  def deleteBuffer(buf: typings.ol.bufferMod.default): Unit = js.native
  def drawElements(start: Double, end: Double): Unit = js.native
  def enableAttributes(attributes: js.Array[AttributeDescription]): Unit = js.native
  def finalizeDraw(frameState: FrameState): Unit = js.native
  def flushBufferData(buffer: typings.ol.bufferMod.default): Unit = js.native
  def getAttributeLocation(name: String): Double = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def getGL(): WebGLRenderingContext = js.native
  def getProgram(fragmentShaderSource: String, vertexShaderSource: String): WebGLProgram = js.native
  def getShaderCompileErrors(): String = js.native
  def getUniformLocation(name: String): WebGLUniformLocation = js.native
  def makeProjectionTransform(frameState: FrameState, transform: Transform): Transform = js.native
  def prepareDraw(frameState: FrameState): Unit = js.native
  def prepareDrawToRenderTarget(frameState: FrameState, renderTarget: typings.ol.renderTargetMod.default): Unit = js.native
  def prepareDrawToRenderTarget(
    frameState: FrameState,
    renderTarget: typings.ol.renderTargetMod.default,
    opt_disableAlphaBlend: Boolean
  ): Unit = js.native
  def setUniformFloatValue(uniform: String, value: Double): Unit = js.native
  def setUniformMatrixValue(uniform: String, value: js.Array[Double]): Unit = js.native
  def useProgram(program: WebGLProgram): Boolean = js.native
}

