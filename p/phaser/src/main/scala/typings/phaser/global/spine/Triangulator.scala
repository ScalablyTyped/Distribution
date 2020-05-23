package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Triangulator")
@js.native
class Triangulator ()
  extends typings.phaser.spine.Triangulator {
  /* CompleteClass */
  override var convexPolygons: js.Any = js.native
  /* CompleteClass */
  override var convexPolygonsIndices: js.Any = js.native
  /* CompleteClass */
  override var indicesArray: js.Any = js.native
  /* CompleteClass */
  override var isConcaveArray: js.Any = js.native
  /* CompleteClass */
  override var polygonIndicesPool: js.Any = js.native
  /* CompleteClass */
  override var polygonPool: js.Any = js.native
  /* CompleteClass */
  override var triangles: js.Any = js.native
  /* CompleteClass */
  override def decompose(verticesArray: js.Array[Double], triangles: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  /* CompleteClass */
  override def triangulate(verticesArray: ArrayLike[Double]): js.Array[Double] = js.native
}

/* static members */
@JSGlobal("spine.Triangulator")
@js.native
object Triangulator extends js.Object {
  var isConcave: js.Any = js.native
  var positiveArea: js.Any = js.native
  var winding: js.Any = js.native
}

