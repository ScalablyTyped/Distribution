package typings.officeUiFabricReact.dialogContentTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogContentStyles extends js.Object {
  var button: IStyle = js.native
  /**
    * Style for the content element.
    */
  var content: IStyle = js.native
  var header: IStyle = js.native
  var inner: IStyle = js.native
  var innerContent: IStyle = js.native
  var subText: IStyle = js.native
  var title: IStyle = js.native
  var topButton: IStyle = js.native
}

object IDialogContentStyles {
  @scala.inline
  def apply(): IDialogContentStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogContentStyles]
  }
  @scala.inline
  implicit class IDialogContentStylesOps[Self <: IDialogContentStyles] (val x: Self) extends AnyVal {
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
    def setButton(value: IStyle): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setButtonNull: Self = this.set("button", null)
    @scala.inline
    def setContent(value: IStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    @scala.inline
    def setHeader(value: IStyle): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    @scala.inline
    def setInner(value: IStyle): Self = this.set("inner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInner: Self = this.set("inner", js.undefined)
    @scala.inline
    def setInnerNull: Self = this.set("inner", null)
    @scala.inline
    def setInnerContent(value: IStyle): Self = this.set("innerContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerContent: Self = this.set("innerContent", js.undefined)
    @scala.inline
    def setInnerContentNull: Self = this.set("innerContent", null)
    @scala.inline
    def setSubText(value: IStyle): Self = this.set("subText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubText: Self = this.set("subText", js.undefined)
    @scala.inline
    def setSubTextNull: Self = this.set("subText", null)
    @scala.inline
    def setTitle(value: IStyle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
    @scala.inline
    def setTopButton(value: IStyle): Self = this.set("topButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopButton: Self = this.set("topButton", js.undefined)
    @scala.inline
    def setTopButtonNull: Self = this.set("topButton", null)
  }
  
}

