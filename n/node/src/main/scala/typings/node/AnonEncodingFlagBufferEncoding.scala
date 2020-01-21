package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingFlagBufferEncoding extends js.Object {
  var encoding: BufferEncoding
  var flag: js.UndefOr[java.lang.String | Double] = js.undefined
}

object AnonEncodingFlagBufferEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding, flag: java.lang.String | Double = null): AnonEncodingFlagBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingFlagBufferEncoding]
  }
}

