package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupSpacerTypesMod {
  
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
    
    @scala.inline
    def apply(count: Double): IGroupSpacerProps = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupSpacerProps]
    }
    
    @scala.inline
    implicit class IGroupSpacerPropsMutableBuilder[Self <: IGroupSpacerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IGroupSpacerStyleProps, IGroupSpacerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IGroupSpacerStyleProps => DeepPartial[IGroupSpacerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupSpacer.types.IGroupSpacerProps, 'theme'>> & {  width :number | undefined} */
  trait IGroupSpacerStyleProps extends StObject {
    
    var theme: ITheme
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object IGroupSpacerStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IGroupSpacerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupSpacerStyleProps]
    }
    
    @scala.inline
    implicit class IGroupSpacerStylePropsMutableBuilder[Self <: IGroupSpacerStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IGroupSpacerStyles extends StObject {
    
    var root: IStyle
  }
  object IGroupSpacerStyles {
    
    @scala.inline
    def apply(): IGroupSpacerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupSpacerStyles]
    }
    
    @scala.inline
    implicit class IGroupSpacerStylesMutableBuilder[Self <: IGroupSpacerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
