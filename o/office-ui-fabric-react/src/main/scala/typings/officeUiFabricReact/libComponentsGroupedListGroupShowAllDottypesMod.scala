package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupDividerProps
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsGroupedListGroupShowAllDottypesMod {
  
  trait IGroupShowAllProps
    extends StObject
       with IGroupDividerProps {
    
    /**
      * Style function to be passed in to override the themed or default styles
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles]] = js.undefined
  }
  object IGroupShowAllProps {
    
    inline def apply(): IGroupShowAllProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupShowAllProps]
    }
    
    extension [Self <: IGroupShowAllProps](x: Self) {
      
      inline def setStyles(value: IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IGroupShowAllStyleProps => DeepPartial[IGroupShowAllStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupShowAll.types.IGroupShowAllProps, 'theme'>> */
  trait IGroupShowAllStyleProps extends StObject {
    
    var theme: ITheme
  }
  object IGroupShowAllStyleProps {
    
    inline def apply(theme: ITheme): IGroupShowAllStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupShowAllStyleProps]
    }
    
    extension [Self <: IGroupShowAllStyleProps](x: Self) {
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGroupShowAllStyles extends StObject {
    
    var root: IStyle
  }
  object IGroupShowAllStyles {
    
    inline def apply(): IGroupShowAllStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupShowAllStyles]
    }
    
    extension [Self <: IGroupShowAllStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
