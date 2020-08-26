package typings.preact.mod

import typings.preact.anon.Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreactDOMAttributes extends js.Object {
  var children: js.UndefOr[ComponentChildren] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
}

object PreactDOMAttributes {
  @scala.inline
  def apply(): PreactDOMAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreactDOMAttributes]
  }
  @scala.inline
  implicit class PreactDOMAttributesOps[Self <: PreactDOMAttributes] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ComponentChild*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: ComponentChildren): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
  }
  
}

