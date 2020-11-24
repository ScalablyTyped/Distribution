package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Triangulator extends js.Object {
  
  var convexPolygons: js.Any = js.native
  
  var convexPolygonsIndices: js.Any = js.native
  
  def decompose(verticesArray: js.Array[Double], triangles: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  
  var indicesArray: js.Any = js.native
  
  var isConcaveArray: js.Any = js.native
  
  var polygonIndicesPool: js.Any = js.native
  
  var polygonPool: js.Any = js.native
  
  var triangles: js.Any = js.native
  
  def triangulate(verticesArray: ArrayLike[Double]): js.Array[Double] = js.native
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
  
  @scala.inline
  implicit class TriangulatorOps[Self <: Triangulator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConvexPolygons(value: js.Any): Self = this.set("convexPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvexPolygonsIndices(value: js.Any): Self = this.set("convexPolygonsIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecompose(value: (js.Array[Double], js.Array[Double]) => js.Array[js.Array[Double]]): Self = this.set("decompose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndicesArray(value: js.Any): Self = this.set("indicesArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConcaveArray(value: js.Any): Self = this.set("isConcaveArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonIndicesPool(value: js.Any): Self = this.set("polygonIndicesPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonPool(value: js.Any): Self = this.set("polygonPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangles(value: js.Any): Self = this.set("triangles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangulate(value: ArrayLike[Double] => js.Array[Double]): Self = this.set("triangulate", js.Any.fromFunction1(value))
  }
}
