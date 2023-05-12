package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.utilsTypesMod.IArrayLikeConstructor
import typings.mnemonist.utilsTypesMod.TypedArray
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedStackMod {
  
  @JSImport("mnemonist/fixed-stack", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with FixedStack[T] {
    // Constructor
    def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/fixed-stack", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): FixedStack[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[FixedStack[I]]
    inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): FixedStack[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[FixedStack[I]]
    inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): FixedStack[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[FixedStack[I]]
    inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): FixedStack[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[FixedStack[I]]
  }
  
  @js.native
  trait FixedStack[T]
    extends StObject
       with Iterable[T] {
    
    // Members
    var capacity: Double = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[Double, T]] = js.native
    
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* stack */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* stack */ this.type, Unit], scope: Any): Unit = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_FixedStack: js.Function0[IterableIterator[T]] = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(item: T): Double = js.native
    
    var size: Double = js.native
    
    def toArray(): js.Array[T] | TypedArray = js.native
    
    def toJSON(): js.Iterable[T] = js.native
    
    def values(): IterableIterator[T] = js.native
  }
}
