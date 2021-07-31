package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.end
import typings.officeUiFabricReact.officeUiFabricReactStrings.start
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object separatorTypesMod {
  
  trait ISeparator extends StObject
  
  trait ISeparatorProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    /**
      * Where the content should be aligned in the separator.
      * @defaultValue 'center'
      */
    var alignContent: js.UndefOr[start | center | end] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ISeparatorStyleProps, ISeparatorStyles]] = js.undefined
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Whether the element is a vertical separator.
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ISeparatorProps {
    
    @scala.inline
    def apply(): ISeparatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISeparatorProps]
    }
    
    @scala.inline
    implicit class ISeparatorPropsMutableBuilder[Self <: ISeparatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignContent(value: start | center | end): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ISeparatorStyleProps, ISeparatorStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ISeparatorStyleProps => DeepPartial[ISeparatorStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Separator/Separator.types.ISeparatorProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Separator/Separator.types.ISeparatorProps, 'className' | 'alignContent' | 'vertical'> */
  trait ISeparatorStyleProps extends StObject {
    
    var alignContent: js.UndefOr[start | center | end] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var theme: ITheme
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ISeparatorStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ISeparatorStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISeparatorStyleProps]
    }
    
    @scala.inline
    implicit class ISeparatorStylePropsMutableBuilder[Self <: ISeparatorStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignContent(value: start | center | end): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait ISeparatorStyles extends StObject {
    
    /**
      * Style for the content
      */
    var content: IStyle
    
    /**
      * Style for the root element
      */
    var root: IStyle
  }
  object ISeparatorStyles {
    
    @scala.inline
    def apply(): ISeparatorStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISeparatorStyles]
    }
    
    @scala.inline
    implicit class ISeparatorStylesMutableBuilder[Self <: ISeparatorStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: IStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
