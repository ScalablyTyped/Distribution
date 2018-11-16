package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.PolygonBatcher")
@js.native
class PolygonBatcher protected ()
  extends phaserLib.spineNs.Disposable {
  def this(context: ManagedWebGLRenderingContext) = this()
  def this(context: stdLib.WebGLRenderingContext) = this()
  def this(context: ManagedWebGLRenderingContext, twoColorTint: scala.Boolean) = this()
  def this(context: stdLib.WebGLRenderingContext, twoColorTint: scala.Boolean) = this()
  def this(context: ManagedWebGLRenderingContext, twoColorTint: scala.Boolean, maxVertices: scala.Double) = this()
  def this(context: stdLib.WebGLRenderingContext, twoColorTint: scala.Boolean, maxVertices: scala.Double) = this()
  var context: js.Any = js.native
  var drawCalls: js.Any = js.native
  var dstBlend: js.Any = js.native
  var indicesLength: js.Any = js.native
  var isDrawing: js.Any = js.native
  var lastTexture: js.Any = js.native
  var mesh: js.Any = js.native
  var shader: js.Any = js.native
  var srcBlend: js.Any = js.native
  var verticesLength: js.Any = js.native
  def begin(shader: Shader): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def draw(
    texture: GLTexture,
    vertices: phaserLib.spineNs.ArrayLike[scala.Double],
    indices: js.Array[scala.Double]
  ): scala.Unit = js.native
  def end(): scala.Unit = js.native
  /* private */ def flush(): js.Any = js.native
  def getDrawCalls(): scala.Double = js.native
  def setBlendMode(srcBlend: scala.Double, dstBlend: scala.Double): scala.Unit = js.native
}

