package typings.nuid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuid", JSImport.Namespace)
@js.native
object nuidMod extends js.Object {
  val version: String = js.native
  def next(): String = js.native
  def reset(): Unit = js.native
}

