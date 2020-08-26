package typings.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageOptions extends js.Object {
  var keepOpen: js.UndefOr[Boolean] = js.native
}

object MessageOptions {
  @scala.inline
  def apply(): MessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOptions]
  }
  @scala.inline
  implicit class MessageOptionsOps[Self <: MessageOptions] (val x: Self) extends AnyVal {
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
    def setKeepOpen(value: Boolean): Self = this.set("keepOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepOpen: Self = this.set("keepOpen", js.undefined)
  }
  
}

