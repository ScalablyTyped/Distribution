package typings.officeUiFabricReact.detailsRowCheckTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRowCheck.types.IDetailsRowCheckProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRowCheck.types.IDetailsRowCheckProps, 'compact' | 'isHeader' | 'selected' | 'anySelected' | 'canSelect' | 'className'> & {  isVisible :boolean | undefined} */
@js.native
trait IDetailsRowCheckStyleProps extends js.Object {
  
  var anySelected: js.UndefOr[Boolean] = js.native
  
  var canSelect: Boolean = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var isHeader: js.UndefOr[Boolean] = js.native
  
  /** Is checkbox visible */
  var isVisible: js.UndefOr[Boolean] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var theme: ITheme = js.native
}
object IDetailsRowCheckStyleProps {
  
  @scala.inline
  def apply(canSelect: Boolean, theme: ITheme): IDetailsRowCheckStyleProps = {
    val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowCheckStyleProps]
  }
  
  @scala.inline
  implicit class IDetailsRowCheckStylePropsOps[Self <: IDetailsRowCheckStyleProps] (val x: Self) extends AnyVal {
    
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
    def setCanSelect(value: Boolean): Self = this.set("canSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnySelected(value: Boolean): Self = this.set("anySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnySelected: Self = this.set("anySelected", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setIsHeader(value: Boolean): Self = this.set("isHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHeader: Self = this.set("isHeader", js.undefined)
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
