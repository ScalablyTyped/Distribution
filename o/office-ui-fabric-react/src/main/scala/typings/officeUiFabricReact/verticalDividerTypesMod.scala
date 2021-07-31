package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalDividerTypesMod {
  
  trait IVerticalDividerClassNames extends StObject {
    
    /**
      * Styling for the divider.
      */
    var divider: String
    
    /**
      * Styling for the div that wraps the actual divider
      */
    var wrapper: String
  }
  object IVerticalDividerClassNames {
    
    @scala.inline
    def apply(divider: String, wrapper: String): IVerticalDividerClassNames = {
      val __obj = js.Dynamic.literal(divider = divider.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVerticalDividerClassNames]
    }
    
    @scala.inline
    implicit class IVerticalDividerClassNamesMutableBuilder[Self <: IVerticalDividerClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  trait IVerticalDividerProps extends StObject {
    
    /**
      * className that will be placed on the divider wrapper div
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Use styles instead.
      * Optional function to generate the class names for the divider for custom styling
      */
    var getClassNames: js.UndefOr[js.Function1[/* theme */ ITheme, IVerticalDividerClassNames]] = js.undefined
    
    /**
      * Optional override stylings that will get merged with the dividers styles.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles]] = js.undefined
    
    /**
      * The theme that should be used to render the vertical divider.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IVerticalDividerProps {
    
    @scala.inline
    def apply(): IVerticalDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVerticalDividerProps]
    }
    
    @scala.inline
    implicit class IVerticalDividerPropsMutableBuilder[Self <: IVerticalDividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setGetClassNames(value: /* theme */ ITheme => IVerticalDividerClassNames): Self = StObject.set(x, "getClassNames", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetClassNamesUndefined: Self = StObject.set(x, "getClassNames", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IVerticalDividerPropsStyles => DeepPartial[IVerticalDividerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Divider/VerticalDivider.types.IVerticalDividerProps, 'theme' | 'getClassNames' | 'className'> */
  trait IVerticalDividerPropsStyles extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var getClassNames: js.UndefOr[js.Function1[/* theme */ ITheme, IVerticalDividerClassNames]] = js.undefined
    
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IVerticalDividerPropsStyles {
    
    @scala.inline
    def apply(): IVerticalDividerPropsStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVerticalDividerPropsStyles]
    }
    
    @scala.inline
    implicit class IVerticalDividerPropsStylesMutableBuilder[Self <: IVerticalDividerPropsStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setGetClassNames(value: /* theme */ ITheme => IVerticalDividerClassNames): Self = StObject.set(x, "getClassNames", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetClassNamesUndefined: Self = StObject.set(x, "getClassNames", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IVerticalDividerStyles extends StObject {
    
    /**
      * Styling for the divider.
      */
    var divider: IStyle
    
    /**
      * Styling for the div that wraps the actual divider
      */
    var wrapper: IStyle
  }
  object IVerticalDividerStyles {
    
    @scala.inline
    def apply(): IVerticalDividerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVerticalDividerStyles]
    }
    
    @scala.inline
    implicit class IVerticalDividerStylesMutableBuilder[Self <: IVerticalDividerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDivider(value: IStyle): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerNull: Self = StObject.set(x, "divider", null)
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setWrapper(value: IStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperNull: Self = StObject.set(x, "wrapper", null)
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
