package typings.officeUiFabricReact.dialogContentTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogContentStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The classname for when the header is draggable
    */
  var draggableHeaderClassName: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var isClose: js.UndefOr[Boolean] = js.native
  var isLargeHeader: js.UndefOr[Boolean] = js.native
  /**
    * Is inside a multiline wrapper
    */
  var isMultiline: js.UndefOr[Boolean] = js.native
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}

object IDialogContentStyleProps {
  @scala.inline
  def apply(theme: ITheme): IDialogContentStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogContentStyleProps]
  }
  @scala.inline
  implicit class IDialogContentStylePropsOps[Self <: IDialogContentStyleProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDraggableHeaderClassName(value: String): Self = this.set("draggableHeaderClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggableHeaderClassName: Self = this.set("draggableHeaderClassName", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIsClose(value: Boolean): Self = this.set("isClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsClose: Self = this.set("isClose", js.undefined)
    @scala.inline
    def setIsLargeHeader(value: Boolean): Self = this.set("isLargeHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLargeHeader: Self = this.set("isLargeHeader", js.undefined)
    @scala.inline
    def setIsMultiline(value: Boolean): Self = this.set("isMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMultiline: Self = this.set("isMultiline", js.undefined)
  }
  
}

