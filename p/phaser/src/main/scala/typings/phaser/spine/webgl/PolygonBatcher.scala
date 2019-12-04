package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Disposable
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.PolygonBatcher")
@js.native
class PolygonBatcher protected () extends Disposable {
  def this(context: ManagedWebGLRenderingContext) = this()
  def this(context: WebGLRenderingContext) = this()
  def this(context: ManagedWebGLRenderingContext, twoColorTint: Boolean) = this()
  def this(context: WebGLRenderingContext, twoColorTint: Boolean) = this()
  def this(context: ManagedWebGLRenderingContext, twoColorTint: Boolean, maxVertices: Double) = this()
  def this(context: WebGLRenderingContext, twoColorTint: Boolean, maxVertices: Double) = this()
  var context: js.Any = js.native
  var drawCalls: js.Any = js.native
  var dstBlend: js.Any = js.native
  var flush: js.Any = js.native
  var indicesLength: js.Any = js.native
  var isDrawing: js.Any = js.native
  var lastTexture: js.Any = js.native
  var mesh: js.Any = js.native
  var shader: js.Any = js.native
  var srcBlend: js.Any = js.native
  var verticesLength: js.Any = js.native
  def begin(shader: Shader): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def draw(texture: GLTexture, vertices: ArrayLike[Double], indices: js.Array[Double]): Unit = js.native
  def end(): Unit = js.native
  def getDrawCalls(): Double = js.native
  def setBlendMode(srcBlend: Double, dstBlend: Double): Unit = js.native
}

