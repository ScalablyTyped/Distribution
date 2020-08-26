package typings.msgpackLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoderOptions extends js.Object {
  var codec: js.UndefOr[Codec_] = js.native
}

object DecoderOptions {
  @scala.inline
  def apply(): DecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecoderOptions]
  }
  @scala.inline
  implicit class DecoderOptionsOps[Self <: DecoderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCodec(value: Codec_): Self = this.set("codec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec: Self = this.set("codec", js.undefined)
  }
  
}

