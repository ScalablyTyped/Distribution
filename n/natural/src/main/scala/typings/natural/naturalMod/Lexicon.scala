package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "Lexicon")
@js.native
class Lexicon protected () extends js.Object {
  def this(filename: String, defaultCategory: String) = this()
  var defaultCategory: String = js.native
  def parseLexicon(data: String): Unit = js.native
  def tagWord(word: String): js.Array[String] = js.native
}

