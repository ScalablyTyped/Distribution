package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.WebGLGraphicsData")
@js.native
class WebGLGraphicsData protected () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext, shader: pixiDotJsLib.PIXINs.glCoreNs.GLShader, attribsState: pixiDotJsLib.PIXINs.glCoreNs.AttribState) = this()
  var buffer: stdLib.WebGLBuffer = js.native
  var color: js.Array[scala.Double] = js.native
  var dirty: scala.Boolean = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var glIndices: js.Array[scala.Double] = js.native
  var glPoints: js.Array[scala.Double] = js.native
  var indexBuffer: stdLib.WebGLBuffer = js.native
  var indices: js.Array[scala.Double] = js.native
  var nativeLines: scala.Boolean = js.native
  var points: js.Array[Point] = js.native
  var shader: pixiDotJsLib.PIXINs.glCoreNs.GLShader = js.native
  var vao: pixiDotJsLib.PIXINs.glCoreNs.VertexArrayObject = js.native
  def destroy(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def upload(): scala.Unit = js.native
}

