package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupFooterTypesMod {
  
  trait IGroupFooterProps
    extends StObject
       with IGroupDividerProps {
    
    /**
      * Style function to be passed in to override the themed or default styles
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IGroupFooterStyleProps, IGroupFooterStyles]] = js.undefined
  }
  object IGroupFooterProps {
    
    inline def apply(): IGroupFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupFooterProps]
    }
    
    extension [Self <: IGroupFooterProps](x: Self) {
      
      inline def setStyles(value: IStyleFunctionOrObject[IGroupFooterStyleProps, IGroupFooterStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IGroupFooterStyleProps => DeepPartial[IGroupFooterStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupFooter.types.IGroupFooterProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupFooter.types.IGroupFooterProps, 'selected' | 'className'> & {  isCollapsed :boolean | undefined} */
  trait IGroupFooterStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Whether the footer is collapsed */
    var isCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
  }
  object IGroupFooterStyleProps {
    
    inline def apply(theme: ITheme): IGroupFooterStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupFooterStyleProps]
    }
    
    extension [Self <: IGroupFooterStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGroupFooterStyles extends StObject {
    
    var root: IStyle
  }
  object IGroupFooterStyles {
    
    inline def apply(): IGroupFooterStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupFooterStyles]
    }
    
    extension [Self <: IGroupFooterStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
