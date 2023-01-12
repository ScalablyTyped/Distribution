package typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'className'> & {  isHorizontalConstrained :boolean | undefined,   compact :boolean | undefined,   isFixed :boolean | undefined} */
trait IDetailsListStyleProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  /** Whether the list is in compact mode */
  var compact: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the list is fixed in size */
  var isFixed: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the list is horizontally constrained */
  var isHorizontalConstrained: js.UndefOr[Boolean] = js.undefined
  
  var theme: ITheme
}
object IDetailsListStyleProps {
  
  inline def apply(theme: ITheme): IDetailsListStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListStyleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDetailsListStyleProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    inline def setIsFixedUndefined: Self = StObject.set(x, "isFixed", js.undefined)
    
    inline def setIsHorizontalConstrained(value: Boolean): Self = StObject.set(x, "isHorizontalConstrained", value.asInstanceOf[js.Any])
    
    inline def setIsHorizontalConstrainedUndefined: Self = StObject.set(x, "isHorizontalConstrained", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
