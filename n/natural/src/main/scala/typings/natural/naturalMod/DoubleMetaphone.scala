package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "DoubleMetaphone")
@js.native
object DoubleMetaphone extends js.Object {
  def compare(stringA: String, stringB: String): Boolean = js.native
  def process(token: String): js.Array[String] = js.native
  def process(token: String, maxLength: Double): js.Array[String] = js.native
}

