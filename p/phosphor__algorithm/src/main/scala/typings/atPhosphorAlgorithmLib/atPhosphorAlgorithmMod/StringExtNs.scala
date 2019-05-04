package typings
package atPhosphorAlgorithmLib.atPhosphorAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "StringExt")
@js.native
object StringExtNs extends js.Object {
  /**
    * Find the indices of characters in a source text.
    *
    * @param source - The source text which should be searched.
    *
    * @param query - The characters to locate in the source text.
    *
    * @param start - The index to start the search.
    *
    * @returns The matched indices, or `null` if there is no match.
    *
    * #### Complexity
    * Linear on `sourceText`.
    *
    * #### Notes
    * In order for there to be a match, all of the characters in `query`
    * **must** appear in `source` in the order given by `query`.
    *
    * Characters are matched using strict `===` equality.
    */
  def findIndices(source: java.lang.String, query: java.lang.String): js.Array[scala.Double] | scala.Null = js.native
  def findIndices(source: java.lang.String, query: java.lang.String, start: scala.Double): js.Array[scala.Double] | scala.Null = js.native
  /**
    * Highlight the matched characters of a source text.
    *
    * @param source - The text which should be highlighted.
    *
    * @param indices - The indices of the matched characters. They must
    *   appear in increasing order and must be in bounds of the source.
    *
    * @param fn - The function to apply to the matched chunks.
    *
    * @returns An array of unmatched and highlighted chunks.
    */
  def highlight[T](
    source: java.lang.String,
    indices: js.Array[scala.Double],
    fn: js.Function1[/* chunk */ java.lang.String, T]
  ): js.Array[java.lang.String | T] = js.native
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
  def matchSumOfDeltas(source: java.lang.String, query: java.lang.String): atPhosphorAlgorithmLib.libStringMod.StringExtNs.IMatchResult | scala.Null = js.native
  def matchSumOfDeltas(source: java.lang.String, query: java.lang.String, start: scala.Double): atPhosphorAlgorithmLib.libStringMod.StringExtNs.IMatchResult | scala.Null = js.native
  /**
    * A string matcher which uses a sum-of-squares algorithm.
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
    * This scoring algorithm uses a sum-of-squares approach to determine
    * the score. In order for there to be a match, all of the characters
    * in `query` **must** appear in `source` in order. The index of each
    * matching character is squared and added to the score. This means
    * that early and consecutive character matches are preferred, while
    * late matches are heavily penalized.
    */
  def matchSumOfSquares(source: java.lang.String, query: java.lang.String): atPhosphorAlgorithmLib.libStringMod.StringExtNs.IMatchResult | scala.Null = js.native
  def matchSumOfSquares(source: java.lang.String, query: java.lang.String, start: scala.Double): atPhosphorAlgorithmLib.libStringMod.StringExtNs.IMatchResult | scala.Null = js.native
}

