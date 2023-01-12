package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpTreeMod {
  
  @JSImport("mnemonist/vp-tree", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with VPTree[T] {
    // Constructor
    def this(distance: DistanceFunction[T], items: js.Iterable[T]) = this()
    
    /* CompleteClass */
    var D: Double = js.native
    
    // Members
    /* CompleteClass */
    override def distance(a: T, b: T): Double = js.native
    // Members
    /* CompleteClass */
    @JSName("distance")
    var distance_Original: DistanceFunction[T] = js.native
    
    // Methods
    /* CompleteClass */
    override def nearestNeighbors(k: Double, query: T): js.Array[QueryMatch[T]] = js.native
    
    /* CompleteClass */
    override def neighbors(radius: Double, query: T): js.Array[QueryMatch[T]] = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/vp-tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I], distance: DistanceFunction[I]): VPTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[VPTree[I]]
    inline def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): VPTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[VPTree[I]]
  }
  
  type DistanceFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  trait QueryMatch[T] extends StObject {
    
    var distance: Double
    
    var item: T
  }
  object QueryMatch {
    
    inline def apply[T](distance: Double, item: T): QueryMatch[T] = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryMatch[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryMatch[?], T] (val x: Self & QueryMatch[T]) extends AnyVal {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait VPTree[T] extends StObject {
    
    var D: Double
    
    // Members
    def distance(a: T, b: T): Double
    // Members
    @JSName("distance")
    var distance_Original: DistanceFunction[T]
    
    // Methods
    def nearestNeighbors(k: Double, query: T): js.Array[QueryMatch[T]]
    
    def neighbors(radius: Double, query: T): js.Array[QueryMatch[T]]
    
    var size: Double
  }
  object VPTree {
    
    inline def apply[T](
      D: Double,
      distance: (T, T) => Double,
      nearestNeighbors: (Double, T) => js.Array[QueryMatch[T]],
      neighbors: (Double, T) => js.Array[QueryMatch[T]],
      size: Double
    ): VPTree[T] = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], distance = js.Any.fromFunction2(distance), nearestNeighbors = js.Any.fromFunction2(nearestNeighbors), neighbors = js.Any.fromFunction2(neighbors), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[VPTree[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VPTree[?], T] (val x: Self & VPTree[T]) extends AnyVal {
      
      inline def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: (T, T) => Double): Self = StObject.set(x, "distance", js.Any.fromFunction2(value))
      
      inline def setNearestNeighbors(value: (Double, T) => js.Array[QueryMatch[T]]): Self = StObject.set(x, "nearestNeighbors", js.Any.fromFunction2(value))
      
      inline def setNeighbors(value: (Double, T) => js.Array[QueryMatch[T]]): Self = StObject.set(x, "neighbors", js.Any.fromFunction2(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
