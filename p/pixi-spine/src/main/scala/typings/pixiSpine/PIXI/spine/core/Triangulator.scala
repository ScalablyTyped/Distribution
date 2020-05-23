package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triangulator extends js.Object {
  var convexPolygons: js.Any
  var convexPolygonsIndices: js.Any
  var indicesArray: js.Any
  var isConcaveArray: js.Any
  var polygonIndicesPool: js.Any
  var polygonPool: js.Any
  var triangles: js.Any
  def decompose(verticesArray: js.Array[Double], triangles: js.Array[Double]): js.Array[js.Array[Double]]
  def triangulate(verticesArray: ArrayLike[Double]): js.Array[Double]
}

object Triangulator {
  @scala.inline
  def apply(
    convexPolygons: js.Any,
    convexPolygonsIndices: js.Any,
    decompose: (js.Array[Double], js.Array[Double]) => js.Array[js.Array[Double]],
    indicesArray: js.Any,
    isConcaveArray: js.Any,
    polygonIndicesPool: js.Any,
    polygonPool: js.Any,
    triangles: js.Any,
    triangulate: ArrayLike[Double] => js.Array[Double]
  ): Triangulator = {
    val __obj = js.Dynamic.literal(convexPolygons = convexPolygons.asInstanceOf[js.Any], convexPolygonsIndices = convexPolygonsIndices.asInstanceOf[js.Any], decompose = js.Any.fromFunction2(decompose), indicesArray = indicesArray.asInstanceOf[js.Any], isConcaveArray = isConcaveArray.asInstanceOf[js.Any], polygonIndicesPool = polygonIndicesPool.asInstanceOf[js.Any], polygonPool = polygonPool.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any], triangulate = js.Any.fromFunction1(triangulate))
    __obj.asInstanceOf[Triangulator]
  }
}

