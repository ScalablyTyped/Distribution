package typings.msgpackLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoderOptions extends js.Object {
  var codec: js.UndefOr[Codec_] = js.undefined
}

object DecoderOptions {
  @scala.inline
  def apply(codec: Codec_ = null): DecoderOptions = {
    val __obj = js.Dynamic.literal()
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoderOptions]
  }
}

