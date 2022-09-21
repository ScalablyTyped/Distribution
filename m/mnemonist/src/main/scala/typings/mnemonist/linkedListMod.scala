package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedListMod {
  
  @JSImport("mnemonist/linked-list", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with LinkedList[T]
  /* static members */
  object default {
    
    @JSImport("mnemonist/linked-list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): LinkedList[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[LinkedList[I]]
    inline def from[I](iterable: StringDictionary[I]): LinkedList[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[LinkedList[I]]
  }
  
  @js.native
  trait LinkedList[T]
    extends StObject
       with Iterable[T] {
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[Double, T]] = js.native
    
    def first(): js.UndefOr[T] = js.native
    
    def forEach(callback: js.Function3[/* value */ T, /* index */ Double, /* list */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ T, /* index */ Double, /* list */ this.type, Unit], scope: Any): Unit = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_LinkedList: js.Function0[IterableIterator[T]] = js.native
    
    def last(): js.UndefOr[T] = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def push(value: T): Double = js.native
    
    def shift(): js.UndefOr[T] = js.native
    
    // Members
    var size: Double = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def toJSON(): js.Array[T] = js.native
    
    def unshift(value: T): Double = js.native
    
    def values(): IterableIterator[T] = js.native
  }
}
