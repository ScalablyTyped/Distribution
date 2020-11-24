package typings.officeUiFabricReact.detailsListTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'className'> & {  isHorizontalConstrained :boolean | undefined,   compact :boolean | undefined,   isFixed :boolean | undefined} */
@js.native
trait IDetailsListStyleProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  /** Whether the list is in compact mode */
  var compact: js.UndefOr[Boolean] = js.native
  
  /** Whether the list is fixed in size */
  var isFixed: js.UndefOr[Boolean] = js.native
  
  /** Whether the list is horizontally constrained */
  var isHorizontalConstrained: js.UndefOr[Boolean] = js.native
  
  var theme: ITheme = js.native
}
object IDetailsListStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IDetailsListStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListStyleProps]
  }
  
  @scala.inline
  implicit class IDetailsListStylePropsOps[Self <: IDetailsListStyleProps] (val x: Self) extends AnyVal {
    
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
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setIsFixed(value: Boolean): Self = this.set("isFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFixed: Self = this.set("isFixed", js.undefined)
    
    @scala.inline
    def setIsHorizontalConstrained(value: Boolean): Self = this.set("isHorizontalConstrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHorizontalConstrained: Self = this.set("isHorizontalConstrained", js.undefined)
  }
}
