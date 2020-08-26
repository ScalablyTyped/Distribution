package typings.phin.mod

import typings.phin.phinBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamResponseOptions extends IOptionsBase {
  @JSName("stream")
  var stream_IStreamResponseOptions: `true` = js.native
}

object IStreamResponseOptions {
  @scala.inline
  def apply(stream: `true`, url: String): IStreamResponseOptions = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamResponseOptions]
  }
  @scala.inline
  implicit class IStreamResponseOptionsOps[Self <: IStreamResponseOptions] (val x: Self) extends AnyVal {
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
    def setStream(value: `true`): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
  
}

