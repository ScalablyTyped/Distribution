package typings.node.anon

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingBufferEncoding extends js.Object {
  var encoding: BufferEncoding
  var flag: js.UndefOr[String] = js.undefined
}

object EncodingBufferEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding, flag: String = null): EncodingBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingBufferEncoding]
  }
}

