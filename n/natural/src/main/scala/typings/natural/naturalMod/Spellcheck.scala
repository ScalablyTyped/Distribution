package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "Spellcheck")
@js.native
class Spellcheck protected () extends js.Object {
  def this(wordlist: js.Array[String]) = this()
  def getCorrections(word: String): js.Array[String] = js.native
  def getCorrections(word: String, maxDistance: Double): js.Array[String] = js.native
  def isCorrect(word: String): Boolean = js.native
}

