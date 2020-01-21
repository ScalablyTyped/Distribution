package typings.microtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microtime", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def now(): Double = js.native
  def nowDouble(): Double = js.native
  def nowStruct(): js.Array[Double] = js.native
}

