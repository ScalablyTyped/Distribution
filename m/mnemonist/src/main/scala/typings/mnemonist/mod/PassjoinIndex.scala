package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.passjoinIndexMod.LevenshteinDistanceFunction
import typings.mnemonist.passjoinIndexMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "PassjoinIndex")
@js.native
class PassjoinIndex[T] protected () extends default[T] {
  // Constructor
  def this(levenshtein: LevenshteinDistanceFunction[T], k: Double) = this()
}

/* static members */
@JSImport("mnemonist", "PassjoinIndex")
@js.native
object PassjoinIndex extends js.Object {
  def from[I](iterable: StringDictionary[I], levenshtein: LevenshteinDistanceFunction[I], k: Double): typings.mnemonist.passjoinIndexMod.PassjoinIndex[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I], levenshtein: LevenshteinDistanceFunction[I], k: Double): typings.mnemonist.passjoinIndexMod.PassjoinIndex[I] = js.native
}

