package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.end
import typings.officeUiFabricReact.officeUiFabricReactStrings.start
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSeparatorSeparatorDottypesMod {
  
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
    
    inline def apply(): ISeparatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISeparatorProps]
    }
    
    extension [Self <: ISeparatorProps](x: Self) {
      
      inline def setAlignContent(value: start | center | end): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[ISeparatorStyleProps, ISeparatorStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: ISeparatorStyleProps => DeepPartial[ISeparatorStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
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
    
    inline def apply(theme: ITheme): ISeparatorStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISeparatorStyleProps]
    }
    
    extension [Self <: ISeparatorStyleProps](x: Self) {
      
      inline def setAlignContent(value: start | center | end): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
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
    
    inline def apply(): ISeparatorStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISeparatorStyles]
    }
    
    extension [Self <: ISeparatorStyles](x: Self) {
      
      inline def setContent(value: IStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
