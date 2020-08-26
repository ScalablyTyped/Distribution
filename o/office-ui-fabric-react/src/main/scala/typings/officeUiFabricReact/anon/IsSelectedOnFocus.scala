package typings.officeUiFabricReact.anon

import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsSelectedOnFocus extends js.Object {
  var isSelectedOnFocus: Boolean = js.native
  var selectionMode: SelectionMode = js.native
}

object IsSelectedOnFocus {
  @scala.inline
  def apply(isSelectedOnFocus: Boolean, selectionMode: SelectionMode): IsSelectedOnFocus = {
    val __obj = js.Dynamic.literal(isSelectedOnFocus = isSelectedOnFocus.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSelectedOnFocus]
  }
  @scala.inline
  implicit class IsSelectedOnFocusOps[Self <: IsSelectedOnFocus] (val x: Self) extends AnyVal {
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
    def setIsSelectedOnFocus(value: Boolean): Self = this.set("isSelectedOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
  }
  
}

