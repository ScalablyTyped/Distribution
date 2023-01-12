package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.anon.Distance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bkTreeMod {
  
  @JSImport("mnemonist/bk-tree", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with BKTree[T] {
    // Constructor
    def this(distance: DistanceFunction[T]) = this()
    
    // Methods
    /* CompleteClass */
    override def add(item: T): this.type = js.native
    
    // Members
    /* CompleteClass */
    override def distance(a: T, b: T): Double = js.native
    // Members
    /* CompleteClass */
    @JSName("distance")
    var distance_Original: DistanceFunction[T] = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    /* CompleteClass */
    override def search(n: Double, query: T): js.Array[Distance[T]] = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/bk-tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I], distance: DistanceFunction[I]): BKTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[BKTree[I]]
    inline def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): BKTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[BKTree[I]]
  }
  
  trait BKTree[T] extends StObject {
    
    // Methods
    def add(item: T): this.type
    
    // Members
    def distance(a: T, b: T): Double
    // Members
    @JSName("distance")
    var distance_Original: DistanceFunction[T]
    
    def inspect(): Any
    
    def search(n: Double, query: T): js.Array[Distance[T]]
    
    var size: Double
    
    def toJSON(): js.Object
  }
  object BKTree {
    
    inline def apply[T](
      add: T => BKTree[T],
      distance: (T, T) => Double,
      inspect: () => Any,
      search: (Double, T) => js.Array[Distance[T]],
      size: Double,
      toJSON: () => js.Object
    ): BKTree[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), distance = js.Any.fromFunction2(distance), inspect = js.Any.fromFunction0(inspect), search = js.Any.fromFunction2(search), size = size.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[BKTree[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BKTree[?], T] (val x: Self & BKTree[T]) extends AnyVal {
      
      inline def setAdd(value: T => BKTree[T]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setDistance(value: (T, T) => Double): Self = StObject.set(x, "distance", js.Any.fromFunction2(value))
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setSearch(value: (Double, T) => js.Array[Distance[T]]): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  type DistanceFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
