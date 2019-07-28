package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "Metaphone")
@js.native
object Metaphone extends js.Object {
  def compare(stringA: String, stringB: String): Boolean = js.native
  def process(token: String): String = js.native
  def process(token: String, maxLength: Double): String = js.native
}

