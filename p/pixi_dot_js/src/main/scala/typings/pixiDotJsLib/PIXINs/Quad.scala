package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Quad")
@js.native
class Quad protected () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext) = this()
  var gl: stdLib.WebGLRenderingContext = js.native
  var indices: js.Array[scala.Double] = js.native
  var interleaved: js.Array[scala.Double] = js.native
  var uvs: js.Array[scala.Double] = js.native
  var vao: pixiDotJsLib.PIXINs.glCoreNs.VertexArrayObject = js.native
  var vertexBuffer: stdLib.WebGLBuffer = js.native
  var vertices: js.Array[scala.Double] = js.native
  def destroy(): scala.Unit = js.native
  def initVao(shader: pixiDotJsLib.PIXINs.glCoreNs.GLShader): scala.Unit = js.native
  def map(targetTextureFrame: Rectangle, destinationFrame: Rectangle): Quad = js.native
  def upload(): Quad = js.native
}

