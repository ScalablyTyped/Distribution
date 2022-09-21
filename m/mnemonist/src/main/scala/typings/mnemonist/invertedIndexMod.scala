package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invertedIndexMod {
  
  @JSImport("mnemonist/inverted-index", JSImport.Default)
  @js.native
  // Constructor
  open class default[D] ()
    extends StObject
       with InvertedIndex[D] {
    def this(tokenizers: TokenizersTuple) = this()
    def this(tokenizer: Tokenizer) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/inverted-index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): InvertedIndex[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[InvertedIndex[I]]
    inline def from[I](iterable: js.Iterable[I], tokenizer: Tokenizer): InvertedIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], tokenizer.asInstanceOf[js.Any])).asInstanceOf[InvertedIndex[I]]
    inline def from[I](iterable: js.Iterable[I], tokenizer: TokenizersTuple): InvertedIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], tokenizer.asInstanceOf[js.Any])).asInstanceOf[InvertedIndex[I]]
    inline def from[I](iterable: StringDictionary[I]): InvertedIndex[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[InvertedIndex[I]]
    inline def from[I](iterable: StringDictionary[I], tokenizer: Tokenizer): InvertedIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], tokenizer.asInstanceOf[js.Any])).asInstanceOf[InvertedIndex[I]]
    inline def from[I](iterable: StringDictionary[I], tokenizer: TokenizersTuple): InvertedIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], tokenizer.asInstanceOf[js.Any])).asInstanceOf[InvertedIndex[I]]
  }
  
  @js.native
  trait InvertedIndex[D]
    extends StObject
       with Iterable[D] {
    
    def add(document: D): this.type = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    // Members
    var dimension: Double = js.native
    
    def documents(): IterableIterator[D] = js.native
    
    def forEach(callback: js.Function3[/* document */ D, /* index */ Double, /* invertedIndex */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* document */ D, /* index */ Double, /* invertedIndex */ this.type, Unit],
      scope: Any
    ): Unit = js.native
    
    def get(query: Any): js.Array[D] = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_InvertedIndex: js.Function0[IterableIterator[D]] = js.native
    
    var size: Double = js.native
    
    def tokens(): IterableIterator[String] = js.native
  }
  
  type Tokenizer = js.Function1[/* key */ Any, js.Array[String]]
  
  type TokenizersTuple = js.Tuple2[Tokenizer, Tokenizer]
}
