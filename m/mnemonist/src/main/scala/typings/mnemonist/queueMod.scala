package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("mnemonist/queue", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with Queue[T]
  /* static members */
  object default {
    
    @JSImport("mnemonist/queue", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): Queue[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Queue[I]]
    inline def from[I](iterable: StringDictionary[I]): Queue[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Queue[I]]
    
    inline def of[I](items: I*): Queue[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Queue[I]]
  }
  
  @js.native
  trait Queue[T]
    extends StObject
       with Iterable[T] {
    
    // Methods
    def clear(): Unit = js.native
    
    def dequeue(): js.UndefOr[T] = js.native
    
    def enqueue(item: T): Double = js.native
    
    def entries(): IterableIterator[js.Tuple2[Double, T]] = js.native
    
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* queue */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* queue */ this.type, Unit], scope: Any): Unit = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Queue: js.Function0[IterableIterator[T]] = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    // Members
    var size: Double = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def toJSON(): js.Array[T] = js.native
    
    def values(): IterableIterator[T] = js.native
  }
}
