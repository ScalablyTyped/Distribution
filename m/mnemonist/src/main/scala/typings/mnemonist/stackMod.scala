package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("mnemonist/stack", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with Stack[T]
  /* static members */
  object default {
    
    @JSImport("mnemonist/stack", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): Stack[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Stack[I]]
    inline def from[I](iterable: StringDictionary[I]): Stack[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Stack[I]]
    
    inline def of[I](items: I*): Stack[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stack[I]]
  }
  
  @js.native
  trait Stack[T]
    extends StObject
       with Iterable[T] {
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[Double, T]] = js.native
    
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* stack */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* stack */ this.type, Unit], scope: Any): Unit = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Stack: js.Function0[IterableIterator[T]] = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(item: T): Double = js.native
    
    // Members
    var size: Double = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def toJSON(): js.Array[T] = js.native
    
    def values(): IterableIterator[T] = js.native
  }
}
