package typings.nodemailer.base64Mod

import typings.node.streamMod.TransformOptions
import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncoderOptions extends TransformOptions {
  var lineLength: js.UndefOr[Double | `false`] = js.native
}

object EncoderOptions {
  @scala.inline
  def apply(): EncoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncoderOptions]
  }
  @scala.inline
  implicit class EncoderOptionsOps[Self <: EncoderOptions] (val x: Self) extends AnyVal {
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
    def setLineLength(value: Double | `false`): Self = this.set("lineLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineLength: Self = this.set("lineLength", js.undefined)
  }
  
}

