package typings.pixiDotJs.PIXI

import typings.pixiDotJs.PIXI.glCore.AttribState
import typings.pixiDotJs.PIXI.glCore.GLShader
import typings.pixiDotJs.PIXI.glCore.VertexArrayObject
import typings.std.WebGLBuffer
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.WebGLGraphicsData")
@js.native
class WebGLGraphicsData protected () extends js.Object {
  def this(gl: WebGLRenderingContext, shader: GLShader, attribsState: AttribState) = this()
  var buffer: WebGLBuffer = js.native
  var color: js.Array[Double] = js.native
  var dirty: Boolean = js.native
  var gl: WebGLRenderingContext = js.native
  var glIndices: js.Array[Double] = js.native
  var glPoints: js.Array[Double] = js.native
  var indexBuffer: WebGLBuffer = js.native
  var indices: js.Array[Double] = js.native
  var nativeLines: Boolean = js.native
  var points: js.Array[Point] = js.native
  var shader: GLShader = js.native
  var vao: VertexArrayObject = js.native
  def destroy(): Unit = js.native
  def reset(): Unit = js.native
  def upload(): Unit = js.native
}

