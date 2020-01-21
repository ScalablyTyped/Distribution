package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Triangulator")
@js.native
class Triangulator () extends js.Object {
  var convexPolygons: js.Any = js.native
  var convexPolygonsIndices: js.Any = js.native
  var indicesArray: js.Any = js.native
  var isConcaveArray: js.Any = js.native
  var polygonIndicesPool: js.Any = js.native
  var polygonPool: js.Any = js.native
  var triangles: js.Any = js.native
  def decompose(verticesArray: js.Array[Double], triangles: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  def triangulate(verticesArray: ArrayLike[Double]): js.Array[Double] = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Triangulator")
@js.native
object Triangulator extends js.Object {
  var isConcave: js.Any = js.native
  var positiveArea: js.Any = js.native
  var winding: js.Any = js.native
}

