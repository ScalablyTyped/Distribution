package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.invertedIndexMod.Tokenizer
import typings.mnemonist.invertedIndexMod.TokenizersTuple
import typings.mnemonist.invertedIndexMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "InvertedIndex")
@js.native
// Constructor
class InvertedIndex[D] () extends default[D] {
  def this(tokenizers: TokenizersTuple) = this()
  def this(tokenizer: Tokenizer) = this()
}

/* static members */
@JSImport("mnemonist", "InvertedIndex")
@js.native
object InvertedIndex extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
  def from[I](iterable: StringDictionary[I], tokenizer: Tokenizer): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
  def from[I](iterable: StringDictionary[I], tokenizer: TokenizersTuple): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
  def from[I](iterable: Iterable[I], tokenizer: Tokenizer): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
  def from[I](iterable: Iterable[I], tokenizer: TokenizersTuple): typings.mnemonist.invertedIndexMod.InvertedIndex[I] = js.native
}

