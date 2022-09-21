package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.passjoinIndexMod.LevenshteinDistanceFunction
import typings.mnemonist.passjoinIndexMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "PassjoinIndex")
@js.native
open class PassjoinIndex[T] protected () extends default[T] {
  // Constructor
  def this(levenshtein: LevenshteinDistanceFunction[T], k: Double) = this()
}
/* static members */
object PassjoinIndex {
  
  @JSImport("mnemonist", "PassjoinIndex")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I], levenshtein: LevenshteinDistanceFunction[I], k: Double): typings.mnemonist.passjoinIndexMod.PassjoinIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], levenshtein.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.passjoinIndexMod.PassjoinIndex[I]]
  inline def from[I](iterable: StringDictionary[I], levenshtein: LevenshteinDistanceFunction[I], k: Double): typings.mnemonist.passjoinIndexMod.PassjoinIndex[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], levenshtein.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.passjoinIndexMod.PassjoinIndex[I]]
}
