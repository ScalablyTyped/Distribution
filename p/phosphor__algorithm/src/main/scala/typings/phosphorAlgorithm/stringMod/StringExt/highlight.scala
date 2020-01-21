package typings.phosphorAlgorithm.stringMod.StringExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/string", "StringExt.highlight")
@js.native
object highlight extends js.Object {
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
  def apply[T](source: String, indices: js.Array[Double], fn: js.Function1[/* chunk */ String, T]): js.Array[String | T] = js.native
}

