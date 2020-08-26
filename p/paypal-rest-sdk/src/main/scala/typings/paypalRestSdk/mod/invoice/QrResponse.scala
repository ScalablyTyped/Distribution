package typings.paypalRestSdk.mod.invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QrResponse extends js.Object {
  var image: String = js.native
}

object QrResponse {
  @scala.inline
  def apply(image: String): QrResponse = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[QrResponse]
  }
  @scala.inline
  implicit class QrResponseOps[Self <: QrResponse] (val x: Self) extends AnyVal {
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
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
  }
  
}

