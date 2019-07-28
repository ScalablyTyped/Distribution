package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.glCoreNs.GLShader
import typings.pixiDotJs.PIXINs.glCoreNs.VertexArrayObject
import typings.std.WebGLBuffer
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Quad")
@js.native
class Quad protected () extends js.Object {
  def this(gl: WebGLRenderingContext) = this()
  var gl: WebGLRenderingContext = js.native
  var indices: js.Array[Double] = js.native
  var interleaved: js.Array[Double] = js.native
  var uvs: js.Array[Double] = js.native
  var vao: VertexArrayObject = js.native
  var vertexBuffer: WebGLBuffer = js.native
  var vertices: js.Array[Double] = js.native
  def destroy(): Unit = js.native
  def initVao(shader: GLShader): Unit = js.native
  def map(targetTextureFrame: Rectangle, destinationFrame: Rectangle): Quad = js.native
  def upload(): Quad = js.native
}

