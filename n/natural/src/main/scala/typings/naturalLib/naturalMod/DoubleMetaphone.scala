package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "DoubleMetaphone")
@js.native
object DoubleMetaphone extends js.Object {
  def compare(stringA: java.lang.String, stringB: java.lang.String): scala.Boolean = js.native
  def process(token: java.lang.String): js.Array[java.lang.String] = js.native
  def process(token: java.lang.String, maxLength: scala.Double): js.Array[java.lang.String] = js.native
}

