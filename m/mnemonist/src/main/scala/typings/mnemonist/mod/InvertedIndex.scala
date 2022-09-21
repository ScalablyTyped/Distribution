package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.invertedIndexMod.Tokenizer
import typings.mnemonist.invertedIndexMod.TokenizersTuple
import typings.mnemonist.invertedIndexMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "InvertedIndex")
@js.native
// Constructor
open class InvertedIndex[D] () extends default[D] {
  def this(tokenizers: TokenizersTuple) = this()
  def this(tokenizer: Tokenizer) = this()
}
/* static members */
object InvertedIndex {
  
  @JSImport("mnemonist", "InvertedIndex")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.invertedIndexMod.InvertedIndex[I]]
  inline def from[I](iterable: js.Iterable[I], tokenizer: Tokenizer): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], tokenizer.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.invertedIndexMod.InvertedIndex[I]]
  inline def from[I](iterable: js.Iterable[I], tokenizer: TokenizersTuple): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], tokenizer.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.invertedIndexMod.InvertedIndex[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.invertedIndexMod.InvertedIndex[I]]
  inline def from[I](iterable: StringDictionary[I], tokenizer: Tokenizer): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], tokenizer.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.invertedIndexMod.InvertedIndex[I]]
  inline def from[I](iterable: StringDictionary[I], tokenizer: TokenizersTuple): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], tokenizer.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.invertedIndexMod.InvertedIndex[I]]
}
