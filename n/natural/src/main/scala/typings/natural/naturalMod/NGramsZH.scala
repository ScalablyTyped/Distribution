package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "NGramsZH")
@js.native
object NGramsZH extends js.Object {
  def bigrams(sequence: String): js.Array[js.Array[String]] = js.native
  def bigrams(sequence: String, startSymbol: String): js.Array[js.Array[String]] = js.native
  def bigrams(sequence: String, startSymbol: String, endSymbol: String): js.Array[js.Array[String]] = js.native
  def bigrams(sequence: js.Array[String]): js.Array[js.Array[String]] = js.native
  def bigrams(sequence: js.Array[String], startSymbol: String): js.Array[js.Array[String]] = js.native
  def bigrams(sequence: js.Array[String], startSymbol: String, endSymbol: String): js.Array[js.Array[String]] = js.native
  def ngrams(sequence: String, n: Double): js.Array[js.Array[String]] = js.native
  def ngrams(sequence: String, n: Double, startSymbol: String): js.Array[js.Array[String]] = js.native
  def ngrams(sequence: String, n: Double, startSymbol: String, endSymbol: String): js.Array[js.Array[String]] = js.native
  def ngrams(sequence: js.Array[String], n: Double): js.Array[js.Array[String]] = js.native
  def ngrams(sequence: js.Array[String], n: Double, startSymbol: String): js.Array[js.Array[String]] = js.native
  def ngrams(sequence: js.Array[String], n: Double, startSymbol: String, endSymbol: String): js.Array[js.Array[String]] = js.native
  def trigrams(sequence: String): js.Array[js.Array[String]] = js.native
  def trigrams(sequence: String, startSymbol: String): js.Array[js.Array[String]] = js.native
  def trigrams(sequence: String, startSymbol: String, endSymbol: String): js.Array[js.Array[String]] = js.native
  def trigrams(sequence: js.Array[String]): js.Array[js.Array[String]] = js.native
  def trigrams(sequence: js.Array[String], startSymbol: String): js.Array[js.Array[String]] = js.native
  def trigrams(sequence: js.Array[String], startSymbol: String, endSymbol: String): js.Array[js.Array[String]] = js.native
}

