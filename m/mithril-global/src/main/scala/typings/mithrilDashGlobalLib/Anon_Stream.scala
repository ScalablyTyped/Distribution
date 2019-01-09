package typings
package mithrilDashGlobalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Stream extends js.Object {
  @JSName("stream")
  var stream_Original: mithrilLib.streamMod.StreamNs.Static = js.native
  /** Creates a stream. */
  def stream[T](): mithrilLib.streamMod.StreamNs.Stream[T] = js.native
  def stream[T](value: T): mithrilLib.streamMod.StreamNs.Stream[T] = js.native
}

