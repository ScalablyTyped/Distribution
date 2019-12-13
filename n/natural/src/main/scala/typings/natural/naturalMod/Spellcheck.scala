package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spellcheck extends js.Object {
  def getCorrections(word: String): js.Array[String] = js.native
  def getCorrections(word: String, maxDistance: Double): js.Array[String] = js.native
  def isCorrect(word: String): Boolean = js.native
}

