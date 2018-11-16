package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "Spellcheck")
@js.native
class Spellcheck protected () extends js.Object {
  def this(wordlist: js.Array[java.lang.String]) = this()
  def getCorrections(word: java.lang.String): js.Array[java.lang.String] = js.native
  def getCorrections(word: java.lang.String, maxDistance: scala.Double): js.Array[java.lang.String] = js.native
  def isCorrect(word: java.lang.String): scala.Boolean = js.native
}

