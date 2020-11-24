package typings.officeUiFabricReact.groupFooterTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupFooter.types.IGroupFooterProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupFooter.types.IGroupFooterProps, 'selected' | 'className'> & {  isCollapsed :boolean | undefined} */
@js.native
trait IGroupFooterStyleProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  /** Whether the footer is collapsed */
  var isCollapsed: js.UndefOr[Boolean] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var theme: ITheme = js.native
}
object IGroupFooterStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IGroupFooterStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupFooterStyleProps]
  }
  
  @scala.inline
  implicit class IGroupFooterStylePropsOps[Self <: IGroupFooterStyleProps] (val x: Self) extends AnyVal {
    
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
    def setIsCollapsed(value: Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCollapsed: Self = this.set("isCollapsed", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
