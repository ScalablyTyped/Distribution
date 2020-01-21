package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingBufferEncoding extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
}

object AnonEncodingBufferEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding = null): AnonEncodingBufferEncoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingBufferEncoding]
  }
}

