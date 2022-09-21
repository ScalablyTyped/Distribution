package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticIntervalTreeMod {
  
  @JSImport("mnemonist/static-interval-tree", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with StaticIntervalTree[T] {
    // Constructor
    def this(intervals: js.Array[T]) = this()
    def this(intervals: js.Array[T], getters: StaticIntervalTreeGettersTuple[T]) = this()
    
    // Members
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    // Methods
    /* CompleteClass */
    override def intervalsContainingPoint(point: Double): js.Array[T] = js.native
    
    /* CompleteClass */
    override def intervalsOverlappingInterval(interval: T): js.Array[T] = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/static-interval-tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): StaticIntervalTree[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[StaticIntervalTree[I]]
    inline def from[I](iterable: StringDictionary[I]): StaticIntervalTree[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[StaticIntervalTree[I]]
  }
  
  trait StaticIntervalTree[T] extends StObject {
    
    // Members
    var height: Double
    
    def inspect(): Any
    
    // Methods
    def intervalsContainingPoint(point: Double): js.Array[T]
    
    def intervalsOverlappingInterval(interval: T): js.Array[T]
    
    var size: Double
  }
  object StaticIntervalTree {
    
    inline def apply[T](
      height: Double,
      inspect: () => Any,
      intervalsContainingPoint: Double => js.Array[T],
      intervalsOverlappingInterval: T => js.Array[T],
      size: Double
    ): StaticIntervalTree[T] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), intervalsContainingPoint = js.Any.fromFunction1(intervalsContainingPoint), intervalsOverlappingInterval = js.Any.fromFunction1(intervalsOverlappingInterval), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticIntervalTree[T]]
    }
    
    extension [Self <: StaticIntervalTree[?], T](x: Self & StaticIntervalTree[T]) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setIntervalsContainingPoint(value: Double => js.Array[T]): Self = StObject.set(x, "intervalsContainingPoint", js.Any.fromFunction1(value))
      
      inline def setIntervalsOverlappingInterval(value: T => js.Array[T]): Self = StObject.set(x, "intervalsOverlappingInterval", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type StaticIntervalTreeGetter[T] = js.Function1[/* item */ T, Double]
  
  type StaticIntervalTreeGettersTuple[T] = js.Tuple2[StaticIntervalTreeGetter[T], StaticIntervalTreeGetter[T]]
}
