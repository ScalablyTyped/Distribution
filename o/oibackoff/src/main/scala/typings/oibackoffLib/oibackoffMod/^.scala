package typings
package oibackoffLib.oibackoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oibackoff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def backoff(): BackoffInstance = js.native
  def backoff(opts: BackoffOptions): BackoffInstance = js.native
  def exponential(n: scala.Double): scala.Double = js.native
  def fibonacci(n: scala.Double): scala.Double = js.native
  def incremental(n: scala.Double): scala.Double = js.native
}

