package typings.officeUiFabricReact.dialogTypesMod

import typings.uifabricMergeStyles.irawstylebaseMod.ICSSPixelUnitRule
import typings.uifabricMergeStyles.irawstylebaseMod.ICSSRule
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional override for container class
    * @deprecated Pass through via `modalProps.className` instead.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Optional override content class
    * @deprecated Pass through via `dialogContentProps` instead as `className`.
    */
  var contentClassName: js.UndefOr[String] = js.native
  /**
    * Default max-width for the dialog box.
    * @defaultvalue '340px'
    */
  var dialogDefaultMaxWidth: js.UndefOr[String | ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Default min-width for the dialog box.
    * @defaultvalue '288px'
    */
  var dialogDefaultMinWidth: js.UndefOr[String | ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Whether the dialog is hidden.
    * @defaultvalue false
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}

object IDialogStyleProps {
  @scala.inline
  def apply(theme: ITheme): IDialogStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogStyleProps]
  }
  @scala.inline
  implicit class IDialogStylePropsOps[Self <: IDialogStyleProps] (val x: Self) extends AnyVal {
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
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    @scala.inline
    def setDialogDefaultMaxWidth(value: String | ICSSRule | ICSSPixelUnitRule): Self = this.set("dialogDefaultMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogDefaultMaxWidth: Self = this.set("dialogDefaultMaxWidth", js.undefined)
    @scala.inline
    def setDialogDefaultMinWidth(value: String | ICSSRule | ICSSPixelUnitRule): Self = this.set("dialogDefaultMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogDefaultMinWidth: Self = this.set("dialogDefaultMinWidth", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
  }
  
}

