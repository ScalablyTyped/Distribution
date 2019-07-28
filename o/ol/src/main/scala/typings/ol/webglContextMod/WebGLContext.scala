package typings.ol.webglContextMod

import typings.std.HTMLCanvasElement
import typings.std.WebGLFramebuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLContext
  extends typings.ol.disposableMod.default {
  def bindBuffer(target: Double, buf: typings.ol.webglBufferMod.default): Unit = js.native
  def deleteBuffer(buf: typings.ol.webglBufferMod.default): Unit = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def getGL(): WebGLRenderingContext = js.native
  def getHitDetectionFramebuffer(): WebGLFramebuffer = js.native
  def getProgram(
    fragmentShaderObject: typings.ol.webglFragmentMod.default,
    vertexShaderObject: typings.ol.webglVertexMod.default
  ): WebGLProgram = js.native
  def getShader(shaderObject: typings.ol.webglShaderMod.default): typings.ol.webglShaderMod.default = js.native
  def handleWebGLContextLost(): Unit = js.native
  def handleWebGLContextRestored(): Unit = js.native
  def useProgram(program: WebGLProgram): Boolean = js.native
}

