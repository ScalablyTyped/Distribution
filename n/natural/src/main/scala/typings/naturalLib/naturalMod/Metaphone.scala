package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "Metaphone")
@js.native
object Metaphone extends js.Object {
  def compare(stringA: java.lang.String, stringB: java.lang.String): scala.Boolean = js.native
  def process(token: java.lang.String): java.lang.String = js.native
  def process(token: java.lang.String, maxLength: scala.Double): java.lang.String = js.native
}

