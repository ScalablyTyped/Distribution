package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.SkeletonClipping")
@js.native
class SkeletonClipping ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.SkeletonClipping {
  
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
  var clipAttachment: js.Any = js.native
  
  /* CompleteClass */
  override def clipEnd(): Unit = js.native
  
  /* CompleteClass */
  override def clipEndWithSlot(slot: typings.pixiSpine.PIXI.spine.core.Slot): Unit = js.native
  
  /* CompleteClass */
  var clipOutput: js.Any = js.native
  
  /* CompleteClass */
  override def clipStart(
    slot: typings.pixiSpine.PIXI.spine.core.Slot,
    clip: typings.pixiSpine.PIXI.spine.core.ClippingAttachment
  ): Double = js.native
  
  /* CompleteClass */
  override def clipTriangles(
    vertices: ArrayLike[Double],
    verticesLength: Double,
    triangles: ArrayLike[Double],
    trianglesLength: Double,
    uvs: ArrayLike[Double],
    light: typings.pixiSpine.PIXI.spine.core.Color,
    dark: typings.pixiSpine.PIXI.spine.core.Color,
    twoColor: Boolean
  ): Unit = js.native
  
  /* CompleteClass */
  var clippedTriangles: js.Array[Double] = js.native
  
  /* CompleteClass */
  var clippedVertices: js.Array[Double] = js.native
  
  /* CompleteClass */
  var clippingPolygon: js.Any = js.native
  
  /* CompleteClass */
  var clippingPolygons: js.Any = js.native
  
  /* CompleteClass */
  override def isClipping(): Boolean = js.native
  
  /* CompleteClass */
  var scratch: js.Any = js.native
  
  /* CompleteClass */
  var triangulator: js.Any = js.native
}
object SkeletonClipping {
  
  @JSGlobal("PIXI.spine.core.SkeletonClipping")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def makeClockwise(polygon: ArrayLike[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClockwise")(polygon.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
