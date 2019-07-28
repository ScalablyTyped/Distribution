package typings.oibackoff.oibackoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oibackoff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def backoff(): BackoffInstance = js.native
  def backoff(opts: BackoffOptions): BackoffInstance = js.native
  def exponential(n: Double): Double = js.native
  def fibonacci(n: Double): Double = js.native
  def incremental(n: Double): Double = js.native
}

