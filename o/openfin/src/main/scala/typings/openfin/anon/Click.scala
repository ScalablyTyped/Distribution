package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Click extends js.Object {
  var click: String = js.native
  var close: String = js.native
  var error: String = js.native
  var message: String = js.native
  var show: String = js.native
}

object Click {
  @scala.inline
  def apply(click: String, close: String, error: String, message: String, show: String): Click = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Click]
  }
  @scala.inline
  implicit class ClickOps[Self <: Click] (val x: Self) extends AnyVal {
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
    def setClick(value: String): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: String): Self = this.set("show", value.asInstanceOf[js.Any])
  }
  
}

