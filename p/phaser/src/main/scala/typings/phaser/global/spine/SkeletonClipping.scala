package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SkeletonClipping")
@js.native
open class SkeletonClipping ()
  extends StObject
     with typings.phaser.spine.SkeletonClipping {
  
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
  
  /* private */ /* CompleteClass */
  var clipAttachment: Any = js.native
  
  /* CompleteClass */
  override def clipEnd(): Unit = js.native
  
  /* CompleteClass */
  override def clipEndWithSlot(slot: typings.phaser.spine.Slot): Unit = js.native
  
  /* private */ /* CompleteClass */
  var clipOutput: Any = js.native
  
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
  var clippedTriangles: js.Array[Double] = js.native
  
  /* CompleteClass */
  var clippedVertices: js.Array[Double] = js.native
  
  /* private */ /* CompleteClass */
  var clippingPolygon: Any = js.native
  
  /* private */ /* CompleteClass */
  var clippingPolygons: Any = js.native
  
  /* CompleteClass */
  override def isClipping(): Boolean = js.native
  
  /* private */ /* CompleteClass */
  var scratch: Any = js.native
  
  /* private */ /* CompleteClass */
  var triangulator: Any = js.native
}
object SkeletonClipping {
  
  @JSGlobal("spine.SkeletonClipping")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def makeClockwise(polygon: ArrayLike[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClockwise")(polygon.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
