package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Triangulator extends StObject {
  
  /* private */ var convexPolygons: Any
  
  /* private */ var convexPolygonsIndices: Any
  
  def decompose(verticesArray: js.Array[Double], triangles: js.Array[Double]): js.Array[js.Array[Double]]
  
  /* private */ var indicesArray: Any
  
  /* private */ var isConcaveArray: Any
  
  /* private */ var polygonIndicesPool: Any
  
  /* private */ var polygonPool: Any
  
  /* private */ var triangles: Any
  
  def triangulate(verticesArray: ArrayLike[Double]): js.Array[Double]
}
object Triangulator {
  
  inline def apply(
    convexPolygons: Any,
    convexPolygonsIndices: Any,
    decompose: (js.Array[Double], js.Array[Double]) => js.Array[js.Array[Double]],
    indicesArray: Any,
    isConcaveArray: Any,
    polygonIndicesPool: Any,
    polygonPool: Any,
    triangles: Any,
    triangulate: ArrayLike[Double] => js.Array[Double]
  ): Triangulator = {
    val __obj = js.Dynamic.literal(convexPolygons = convexPolygons.asInstanceOf[js.Any], convexPolygonsIndices = convexPolygonsIndices.asInstanceOf[js.Any], decompose = js.Any.fromFunction2(decompose), indicesArray = indicesArray.asInstanceOf[js.Any], isConcaveArray = isConcaveArray.asInstanceOf[js.Any], polygonIndicesPool = polygonIndicesPool.asInstanceOf[js.Any], polygonPool = polygonPool.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any], triangulate = js.Any.fromFunction1(triangulate))
    __obj.asInstanceOf[Triangulator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Triangulator] (val x: Self) extends AnyVal {
    
    inline def setConvexPolygons(value: Any): Self = StObject.set(x, "convexPolygons", value.asInstanceOf[js.Any])
    
    inline def setConvexPolygonsIndices(value: Any): Self = StObject.set(x, "convexPolygonsIndices", value.asInstanceOf[js.Any])
    
    inline def setDecompose(value: (js.Array[Double], js.Array[Double]) => js.Array[js.Array[Double]]): Self = StObject.set(x, "decompose", js.Any.fromFunction2(value))
    
    inline def setIndicesArray(value: Any): Self = StObject.set(x, "indicesArray", value.asInstanceOf[js.Any])
    
    inline def setIsConcaveArray(value: Any): Self = StObject.set(x, "isConcaveArray", value.asInstanceOf[js.Any])
    
    inline def setPolygonIndicesPool(value: Any): Self = StObject.set(x, "polygonIndicesPool", value.asInstanceOf[js.Any])
    
    inline def setPolygonPool(value: Any): Self = StObject.set(x, "polygonPool", value.asInstanceOf[js.Any])
    
    inline def setTriangles(value: Any): Self = StObject.set(x, "triangles", value.asInstanceOf[js.Any])
    
    inline def setTriangulate(value: ArrayLike[Double] => js.Array[Double]): Self = StObject.set(x, "triangulate", js.Any.fromFunction1(value))
  }
}
