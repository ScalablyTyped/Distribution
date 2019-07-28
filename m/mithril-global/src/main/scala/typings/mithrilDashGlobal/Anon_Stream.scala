package typings.mithrilDashGlobal

import typings.mithril.streamMod.Static
import typings.mithril.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Stream extends js.Object {
  @JSName("stream")
  var stream_Original: Static = js.native
  /** Creates a stream. */
  def stream[T](): Stream[T] = js.native
  def stream[T](value: T): Stream[T] = js.native
}

