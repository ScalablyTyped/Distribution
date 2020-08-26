package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLinkOptions extends js.Object {
  var buttonClass: js.UndefOr[String] = js.native
  var target: js.UndefOr[String] = js.native
  var value: String = js.native
}

object CreateLinkOptions {
  @scala.inline
  def apply(value: String): CreateLinkOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLinkOptions]
  }
  @scala.inline
  implicit class CreateLinkOptionsOps[Self <: CreateLinkOptions] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonClass(value: String): Self = this.set("buttonClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonClass: Self = this.set("buttonClass", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

