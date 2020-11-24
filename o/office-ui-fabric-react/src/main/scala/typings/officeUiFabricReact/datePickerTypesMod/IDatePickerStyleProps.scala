package typings.officeUiFabricReact.datePickerTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerStyleProps extends js.Object {
  
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var isDatePickerShown: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[Boolean] = js.native
  
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme = js.native
}
object IDatePickerStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IDatePickerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerStyleProps]
  }
  
  @scala.inline
  implicit class IDatePickerStylePropsOps[Self <: IDatePickerStyleProps] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIsDatePickerShown(value: Boolean): Self = this.set("isDatePickerShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDatePickerShown: Self = this.set("isDatePickerShown", js.undefined)
    
    @scala.inline
    def setLabel(value: Boolean): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
