package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "Lexicon")
@js.native
class Lexicon protected () extends js.Object {
  def this(filename: java.lang.String, defaultCategory: java.lang.String) = this()
  var defaultCategory: java.lang.String = js.native
  def parseLexicon(data: java.lang.String): scala.Unit = js.native
  def tagWord(word: java.lang.String): js.Array[java.lang.String] = js.native
}

