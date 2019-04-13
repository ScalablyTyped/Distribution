package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataNodeStreamReadableStream extends js.Object {
  var data: stdLib.Uint8Array | ReadableStream[stdLib.Uint8Array] | NodeStream
}

object Anon_DataNodeStreamReadableStream {
  @scala.inline
  def apply(data: stdLib.Uint8Array | ReadableStream[stdLib.Uint8Array] | NodeStream): Anon_DataNodeStreamReadableStream = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataNodeStreamReadableStream]
  }
}

