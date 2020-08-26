package typings.officeUiFabricReact.searchBoxTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchBoxStyles extends js.Object {
  var clearButton: js.UndefOr[IStyle] = js.native
  var field: js.UndefOr[IStyle] = js.native
  var icon: js.UndefOr[IStyle] = js.native
  var iconContainer: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
}

object ISearchBoxStyles {
  @scala.inline
  def apply(): ISearchBoxStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchBoxStyles]
  }
  @scala.inline
  implicit class ISearchBoxStylesOps[Self <: ISearchBoxStyles] (val x: Self) extends AnyVal {
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
    def setClearButton(value: IStyle): Self = this.set("clearButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearButton: Self = this.set("clearButton", js.undefined)
    @scala.inline
    def setClearButtonNull: Self = this.set("clearButton", null)
    @scala.inline
    def setField(value: IStyle): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFieldNull: Self = this.set("field", null)
    @scala.inline
    def setIcon(value: IStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setIconContainer(value: IStyle): Self = this.set("iconContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconContainer: Self = this.set("iconContainer", js.undefined)
    @scala.inline
    def setIconContainerNull: Self = this.set("iconContainer", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

