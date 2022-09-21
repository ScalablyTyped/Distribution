package typings.mnemonist

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trieMod {
  
  @JSImport("mnemonist/trie", JSImport.Default)
  @js.native
  // Constructor
  open class default[T] ()
    extends StObject
       with Trie[T] {
    def this(Token: Instantiable0[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/trie", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): Trie[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Trie[I]]
    inline def from[I](iterable: StringDictionary[I]): Trie[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Trie[I]]
  }
  
  @js.native
  trait Trie[T]
    extends StObject
       with Iterable[T] {
    
    def add(prefix: T): this.type = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def delete(prefix: T): Boolean = js.native
    
    def find(prefix: T): js.Array[T] = js.native
    
    def has(prefix: T): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Trie: js.Function0[IterableIterator[T]] = js.native
    
    def keys(): IterableIterator[T] = js.native
    
    def prefixes(): IterableIterator[T] = js.native
    
    // Members
    var size: Double = js.native
  }
}
