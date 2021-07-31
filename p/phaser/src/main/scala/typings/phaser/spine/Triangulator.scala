package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Triangulator extends StObject {
  
  var convexPolygons: js.Any
  
  var convexPolygonsIndices: js.Any
  
  def decompose(verticesArray: js.Array[Double], triangles: js.Array[Double]): js.Array[js.Array[Double]]
  
  var indicesArray: js.Any
  
  var isConcaveArray: js.Any
  
  var polygonIndicesPool: js.Any
  
  var polygonPool: js.Any
  
  var triangles: js.Any
  
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
  
  @scala.inline
  implicit class TriangulatorMutableBuilder[Self <: Triangulator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvexPolygons(value: js.Any): Self = StObject.set(x, "convexPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvexPolygonsIndices(value: js.Any): Self = StObject.set(x, "convexPolygonsIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecompose(value: (js.Array[Double], js.Array[Double]) => js.Array[js.Array[Double]]): Self = StObject.set(x, "decompose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndicesArray(value: js.Any): Self = StObject.set(x, "indicesArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConcaveArray(value: js.Any): Self = StObject.set(x, "isConcaveArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonIndicesPool(value: js.Any): Self = StObject.set(x, "polygonIndicesPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonPool(value: js.Any): Self = StObject.set(x, "polygonPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangles(value: js.Any): Self = StObject.set(x, "triangles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangulate(value: ArrayLike[Double] => js.Array[Double]): Self = StObject.set(x, "triangulate", js.Any.fromFunction1(value))
  }
}
