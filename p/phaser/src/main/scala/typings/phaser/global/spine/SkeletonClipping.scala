package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SkeletonClipping")
@js.native
class SkeletonClipping ()
  extends typings.phaser.spine.SkeletonClipping {
  /* CompleteClass */
  override var clipAttachment: js.Any = js.native
  /* CompleteClass */
  override var clipOutput: js.Any = js.native
  /* CompleteClass */
  override var clippedTriangles: js.Array[Double] = js.native
  /* CompleteClass */
  override var clippedVertices: js.Array[Double] = js.native
  /* CompleteClass */
  override var clippingPolygon: js.Any = js.native
  /* CompleteClass */
  override var clippingPolygons: js.Any = js.native
  /* CompleteClass */
  override var scratch: js.Any = js.native
  /* CompleteClass */
  override var triangulator: js.Any = js.native
  /* CompleteClass */
  override def clip(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    clippingArea: js.Array[Double],
    output: js.Array[Double]
  ): Boolean = js.native
  /* CompleteClass */
  override def clipEnd(): Unit = js.native
  /* CompleteClass */
  override def clipEndWithSlot(slot: typings.phaser.spine.Slot): Unit = js.native
  /* CompleteClass */
  override def clipStart(slot: typings.phaser.spine.Slot, clip: typings.phaser.spine.ClippingAttachment): Double = js.native
  /* CompleteClass */
  override def clipTriangles(
    vertices: ArrayLike[Double],
    verticesLength: Double,
    triangles: ArrayLike[Double],
    trianglesLength: Double,
    uvs: ArrayLike[Double],
    light: typings.phaser.spine.Color,
    dark: typings.phaser.spine.Color,
    twoColor: Boolean
  ): Unit = js.native
  /* CompleteClass */
  override def isClipping(): Boolean = js.native
}

/* static members */
@JSGlobal("spine.SkeletonClipping")
@js.native
object SkeletonClipping extends js.Object {
  def makeClockwise(polygon: ArrayLike[Double]): Unit = js.native
}

