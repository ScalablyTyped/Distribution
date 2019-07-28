package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.glCoreNs.AttribState
import typings.pixiDotJs.PIXINs.glCoreNs.GLShader
import typings.pixiDotJs.PIXINs.glCoreNs.VertexArrayObject
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

