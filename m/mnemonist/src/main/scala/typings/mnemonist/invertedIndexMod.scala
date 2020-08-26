package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/inverted-index", JSImport.Namespace)
@js.native
object invertedIndexMod extends js.Object {
  @js.native
  trait InvertedIndex[D] extends Iterable[D] {
    // Members
    var dimension: Double = js.native
    var size: Double = js.native
    def add(document: D): this.type = js.native
    // Methods
    def clear(): Unit = js.native
    def documents(): Iterator[D, _, js.UndefOr[scala.Nothing]] = js.native
    def forEach(callback: js.Function3[/* document */ D, /* index */ Double, /* invertedIndex */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* document */ D, /* index */ Double, /* invertedIndex */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    def get(query: js.Any): js.Array[D] = js.native
    def inspect(): js.Any = js.native
    def tokens(): Iterator[String, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  // Constructor
  class default[D] () extends InvertedIndex[D] {
    def this(tokenizers: TokenizersTuple) = this()
    def this(tokenizer: Tokenizer) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I](iterable: StringDictionary[I]): InvertedIndex[I] = js.native
    def from[I](iterable: StringDictionary[I], tokenizer: Tokenizer): InvertedIndex[I] = js.native
    def from[I](iterable: StringDictionary[I], tokenizer: TokenizersTuple): InvertedIndex[I] = js.native
    // Statics
    def from[I](iterable: Iterable[I]): InvertedIndex[I] = js.native
    def from[I](iterable: Iterable[I], tokenizer: Tokenizer): InvertedIndex[I] = js.native
    def from[I](iterable: Iterable[I], tokenizer: TokenizersTuple): InvertedIndex[I] = js.native
  }
  
  type Tokenizer = js.Function1[/* key */ js.Any, js.Array[String]]
  type TokenizersTuple = js.Tuple2[Tokenizer, Tokenizer]
}

