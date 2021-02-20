package typings.officeUiFabricReact.detailsListTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'className'> & {  isHorizontalConstrained :boolean | undefined,   compact :boolean | undefined,   isFixed :boolean | undefined} */
@js.native
trait IDetailsListStyleProps extends StObject {
  
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
  implicit class IDetailsListStylePropsMutableBuilder[Self <: IDetailsListStyleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixedUndefined: Self = StObject.set(x, "isFixed", js.undefined)
    
    @scala.inline
    def setIsHorizontalConstrained(value: Boolean): Self = StObject.set(x, "isHorizontalConstrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHorizontalConstrainedUndefined: Self = StObject.set(x, "isHorizontalConstrained", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
