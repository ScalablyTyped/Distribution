package typings.mnemonist

import typings.mnemonist.utilsTypesMod.IArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdTreeMod {
  
  @JSImport("mnemonist/kd-tree", JSImport.Default)
  @js.native
  open class default[V] ()
    extends StObject
       with KDTree[V] {
    
    // Members
    /* CompleteClass */
    var dimensions: Double = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    /* CompleteClass */
    override def kNearestNeighbors(k: Double, point: js.Array[Double]): js.Array[V] = js.native
    
    /* CompleteClass */
    override def linearKNearestNeighbors(k: Double, point: js.Array[Double]): js.Array[V] = js.native
    
    // Methods
    /* CompleteClass */
    override def nearestNeighbor(point: js.Array[Double]): V = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    var visited: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/kd-tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[js.Tuple2[I, js.Array[Double]]], dimensions: Double): KDTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[KDTree[I]]
    
    inline def fromAxes(axes: IArrayLike): KDTree[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAxes")(axes.asInstanceOf[js.Any]).asInstanceOf[KDTree[Double]]
    inline def fromAxes[I](axes: IArrayLike, labels: js.Array[I]): KDTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAxes")(axes.asInstanceOf[js.Any], labels.asInstanceOf[js.Any])).asInstanceOf[KDTree[I]]
  }
  
  trait KDTree[V] extends StObject {
    
    // Members
    var dimensions: Double
    
    def inspect(): Any
    
    def kNearestNeighbors(k: Double, point: js.Array[Double]): js.Array[V]
    
    def linearKNearestNeighbors(k: Double, point: js.Array[Double]): js.Array[V]
    
    // Methods
    def nearestNeighbor(point: js.Array[Double]): V
    
    var size: Double
    
    var visited: Double
  }
  object KDTree {
    
    inline def apply[V](
      dimensions: Double,
      inspect: () => Any,
      kNearestNeighbors: (Double, js.Array[Double]) => js.Array[V],
      linearKNearestNeighbors: (Double, js.Array[Double]) => js.Array[V],
      nearestNeighbor: js.Array[Double] => V,
      size: Double,
      visited: Double
    ): KDTree[V] = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), kNearestNeighbors = js.Any.fromFunction2(kNearestNeighbors), linearKNearestNeighbors = js.Any.fromFunction2(linearKNearestNeighbors), nearestNeighbor = js.Any.fromFunction1(nearestNeighbor), size = size.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
      __obj.asInstanceOf[KDTree[V]]
    }
    
    extension [Self <: KDTree[?], V](x: Self & KDTree[V]) {
      
      inline def setDimensions(value: Double): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setKNearestNeighbors(value: (Double, js.Array[Double]) => js.Array[V]): Self = StObject.set(x, "kNearestNeighbors", js.Any.fromFunction2(value))
      
      inline def setLinearKNearestNeighbors(value: (Double, js.Array[Double]) => js.Array[V]): Self = StObject.set(x, "linearKNearestNeighbors", js.Any.fromFunction2(value))
      
      inline def setNearestNeighbor(value: js.Array[Double] => V): Self = StObject.set(x, "nearestNeighbor", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setVisited(value: Double): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
    }
  }
}
