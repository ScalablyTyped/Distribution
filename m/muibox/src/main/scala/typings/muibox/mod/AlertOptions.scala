package typings.muibox.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertOptions extends js.Object {
  var message: js.UndefOr[String | ReactNode] = js.native
  var ok: js.UndefOr[DialogButtonOptions] = js.native
  var title: js.UndefOr[String] = js.native
}

object AlertOptions {
  @scala.inline
  def apply(): AlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertOptions]
  }
  @scala.inline
  implicit class AlertOptionsOps[Self <: AlertOptions] (val x: Self) extends AnyVal {
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
    def setMessage(value: String | ReactNode): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOk(value: DialogButtonOptions): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

