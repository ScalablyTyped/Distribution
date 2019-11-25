package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingBufferEncoding extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
}

object Anon_EncodingBufferEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding = null): Anon_EncodingBufferEncoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingBufferEncoding]
  }
}

