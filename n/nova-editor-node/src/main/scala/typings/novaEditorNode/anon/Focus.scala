package typings.novaEditorNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Focus extends js.Object {
  var focus: js.UndefOr[Boolean] = js.native
  var reveal: js.UndefOr[Double] = js.native
  var select: js.UndefOr[Boolean] = js.native
}

object Focus {
  @scala.inline
  def apply(): Focus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Focus]
  }
  @scala.inline
  implicit class FocusOps[Self <: Focus] (val x: Self) extends AnyVal {
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
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setReveal(value: Double): Self = this.set("reveal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReveal: Self = this.set("reveal", js.undefined)
    @scala.inline
    def setSelect(value: Boolean): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
  
}

