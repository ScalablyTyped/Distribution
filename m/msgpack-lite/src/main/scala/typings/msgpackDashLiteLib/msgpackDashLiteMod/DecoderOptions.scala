package typings
package msgpackDashLiteLib.msgpackDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoderOptions extends js.Object {
  var codec: js.UndefOr[Codec] = js.undefined
}

object DecoderOptions {
  @scala.inline
  def apply(codec: Codec = null): DecoderOptions = {
    val __obj = js.Dynamic.literal()
    if (codec != null) __obj.updateDynamic("codec")(codec)
    __obj.asInstanceOf[DecoderOptions]
  }
}

