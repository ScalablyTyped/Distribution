package typings.openpgp

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataNodeStreamReadableStream extends js.Object {
  var data: Uint8Array | ReadableStream[Uint8Array] | NodeStream
}

object Anon_DataNodeStreamReadableStream {
  @scala.inline
  def apply(data: Uint8Array | ReadableStream[Uint8Array] | NodeStream): Anon_DataNodeStreamReadableStream = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataNodeStreamReadableStream]
  }
}

