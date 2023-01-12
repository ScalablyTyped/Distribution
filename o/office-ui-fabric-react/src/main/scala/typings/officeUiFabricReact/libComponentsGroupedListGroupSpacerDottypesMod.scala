package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsGroupedListGroupSpacerDottypesMod {
  
  trait IGroupSpacerProps extends StObject {
    
    /** Count of spacer(s) */
    var count: Double
    
    /** How much to indent */
    var indentWidth: js.UndefOr[Double] = js.undefined
    
    /** Override the default role (presentation) */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Style function to be passed in to override the themed or default styles
      *
      * @deprecated unused, to be removed in 7.0
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IGroupSpacerStyleProps, IGroupSpacerStyles]] = js.undefined
    
    /**
      * Theme from Higher Order Component
      *
      * @deprecated unused, to be removed in 7.0
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IGroupSpacerProps {
    
    inline def apply(count: Double): IGroupSpacerProps = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupSpacerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGroupSpacerProps] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      inline def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IGroupSpacerStyleProps, IGroupSpacerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IGroupSpacerStyleProps => DeepPartial[IGroupSpacerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupSpacer.types.IGroupSpacerProps, 'theme'>> & {  width :number | undefined} */
  trait IGroupSpacerStyleProps extends StObject {
    
    var theme: ITheme
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object IGroupSpacerStyleProps {
    
    inline def apply(theme: ITheme): IGroupSpacerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupSpacerStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGroupSpacerStyleProps] (val x: Self) extends AnyVal {
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IGroupSpacerStyles extends StObject {
    
    var root: IStyle
  }
  object IGroupSpacerStyles {
    
    inline def apply(): IGroupSpacerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupSpacerStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGroupSpacerStyles] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
