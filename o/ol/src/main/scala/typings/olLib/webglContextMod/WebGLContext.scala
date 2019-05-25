package typings
package olLib.webglContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLContext
  extends olLib.disposableMod.default {
  def bindBuffer(target: scala.Double, buf: olLib.webglBufferMod.default): scala.Unit = js.native
  def deleteBuffer(buf: olLib.webglBufferMod.default): scala.Unit = js.native
  def getCanvas(): stdLib.HTMLCanvasElement = js.native
  def getGL(): stdLib.WebGLRenderingContext = js.native
  def getHitDetectionFramebuffer(): stdLib.WebGLFramebuffer = js.native
  def getProgram(
    fragmentShaderObject: olLib.webglFragmentMod.default,
    vertexShaderObject: olLib.webglVertexMod.default
  ): stdLib.WebGLProgram = js.native
  def getShader(shaderObject: olLib.webglShaderMod.default): olLib.webglShaderMod.default = js.native
  def handleWebGLContextLost(): scala.Unit = js.native
  def handleWebGLContextRestored(): scala.Unit = js.native
  def useProgram(program: stdLib.WebGLProgram): scala.Boolean = js.native
}

