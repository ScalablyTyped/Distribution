package typings.mithrilGlobal

import typings.mithril.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStream extends js.Object {
  @JSName("stream")
  var stream_Original: AnonAcc = js.native
  def stream[T](): Stream[T] = js.native
  def stream[T](value: T): Stream[T] = js.native
}

