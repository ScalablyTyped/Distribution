package typings.phosphorAlgorithm.stringMod.StringExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/string", "StringExt.matchSumOfDeltas")
@js.native
object matchSumOfDeltas extends js.Object {
  /**
    * A string matcher which uses a sum-of-deltas algorithm.
    *
    * @param source - The source text which should be searched.
    *
    * @param query - The characters to locate in the source text.
    *
    * @param start - The index to start the search.
    *
    * @returns The match result, or `null` if there is no match.
    *   A lower `score` represents a stronger match.
    *
    * #### Complexity
    * Linear on `sourceText`.
    *
    * #### Notes
    * This scoring algorithm uses a sum-of-deltas approach to determine
    * the score. In order for there to be a match, all of the characters
    * in `query` **must** appear in `source` in order. The delta between
    * the indices are summed to create the score. This means that groups
    * of matched characters are preferred, while fragmented matches are
    * penalized.
    */
  def apply(source: String, query: String): IMatchResult | Null = js.native
  def apply(source: String, query: String, start: Double): IMatchResult | Null = js.native
}

