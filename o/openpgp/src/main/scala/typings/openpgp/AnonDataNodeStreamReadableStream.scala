package typings.openpgp

import typings.openpgp.mod.NodeStream
import typings.openpgp.mod.ReadableStream
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataNodeStreamReadableStream extends js.Object {
  var data: Uint8Array | ReadableStream[Uint8Array] | NodeStream
}

object AnonDataNodeStreamReadableStream {
  @scala.inline
  def apply(data: Uint8Array | ReadableStream[Uint8Array] | NodeStream): AnonDataNodeStreamReadableStream = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataNodeStreamReadableStream]
  }
}

