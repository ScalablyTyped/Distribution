package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.ICellStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellStyleProps extends StObject {
  
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  
  var theme: ITheme
}
object CellStyleProps {
  
  inline def apply(theme: ITheme): CellStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellStyleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellStyleProps] (val x: Self) extends AnyVal {
    
    inline def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
    
    inline def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
