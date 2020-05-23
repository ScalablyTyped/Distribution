package typings.phaser.global.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.PolygonBatcher")
@js.native
class PolygonBatcher protected ()
  extends typings.phaser.spine.webgl.PolygonBatcher {
  def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
  def this(context: WebGLRenderingContext) = this()
  def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, twoColorTint: Boolean) = this()
  def this(context: WebGLRenderingContext, twoColorTint: Boolean) = this()
  def this(
    context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
    twoColorTint: Boolean,
    maxVertices: Double
  ) = this()
  def this(context: WebGLRenderingContext, twoColorTint: Boolean, maxVertices: Double) = this()
  /* CompleteClass */
  override var context: js.Any = js.native
  /* CompleteClass */
  override var drawCalls: js.Any = js.native
  /* CompleteClass */
  override var dstBlend: js.Any = js.native
  /* CompleteClass */
  override var flush: js.Any = js.native
  /* CompleteClass */
  override var indicesLength: js.Any = js.native
  /* CompleteClass */
  override var isDrawing: js.Any = js.native
  /* CompleteClass */
  override var lastTexture: js.Any = js.native
  /* CompleteClass */
  override var mesh: js.Any = js.native
  /* CompleteClass */
  override var shader: js.Any = js.native
  /* CompleteClass */
  override var srcBlend: js.Any = js.native
  /* CompleteClass */
  override var verticesLength: js.Any = js.native
  /* CompleteClass */
  override def begin(shader: typings.phaser.spine.webgl.Shader): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def draw(
    texture: typings.phaser.spine.webgl.GLTexture,
    vertices: ArrayLike[Double],
    indices: js.Array[Double]
  ): Unit = js.native
  /* CompleteClass */
  override def end(): Unit = js.native
  /* CompleteClass */
  override def getDrawCalls(): Double = js.native
  /* CompleteClass */
  override def setBlendMode(srcBlend: Double, dstBlend: Double): Unit = js.native
}

