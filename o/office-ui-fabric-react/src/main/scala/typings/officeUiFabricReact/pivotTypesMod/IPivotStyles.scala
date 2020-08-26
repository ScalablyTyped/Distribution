package typings.officeUiFabricReact.pivotTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPivotStyles extends js.Object {
  var count: IStyle = js.native
  var icon: IStyle = js.native
  var itemContainer: js.UndefOr[IStyle] = js.native
  var link: IStyle = js.native
  var linkContent: IStyle = js.native
  var linkIsSelected: IStyle = js.native
  /**
    * Style for the root element.
    */
  var root: IStyle = js.native
  var text: IStyle = js.native
}

object IPivotStyles {
  @scala.inline
  def apply(): IPivotStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPivotStyles]
  }
  @scala.inline
  implicit class IPivotStylesOps[Self <: IPivotStyles] (val x: Self) extends AnyVal {
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
    def setCount(value: IStyle): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCountNull: Self = this.set("count", null)
    @scala.inline
    def setIcon(value: IStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setItemContainer(value: IStyle): Self = this.set("itemContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemContainer: Self = this.set("itemContainer", js.undefined)
    @scala.inline
    def setItemContainerNull: Self = this.set("itemContainer", null)
    @scala.inline
    def setLink(value: IStyle): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setLinkNull: Self = this.set("link", null)
    @scala.inline
    def setLinkContent(value: IStyle): Self = this.set("linkContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkContent: Self = this.set("linkContent", js.undefined)
    @scala.inline
    def setLinkContentNull: Self = this.set("linkContent", null)
    @scala.inline
    def setLinkIsSelected(value: IStyle): Self = this.set("linkIsSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkIsSelected: Self = this.set("linkIsSelected", js.undefined)
    @scala.inline
    def setLinkIsSelectedNull: Self = this.set("linkIsSelected", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setText(value: IStyle): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
  
}

