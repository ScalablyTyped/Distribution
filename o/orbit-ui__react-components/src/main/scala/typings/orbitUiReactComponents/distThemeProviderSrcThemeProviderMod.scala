package typings.orbitUiReactComponents

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemeProviderSrcThemeProviderMod {
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider/src/ThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ThemeProvider(hasThemeColorSchemeDefaultColorSchemeChildrenAsRest: ThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasThemeColorSchemeDefaultColorSchemeChildrenAsRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.light
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dark
  */
  trait ColorScheme extends StObject
  object ColorScheme {
    
    inline def dark: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dark = "dark".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dark]
    
    inline def light: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.light = "light".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.light]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.system
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.light
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dark
  */
  trait ColorSchemeOrSystem extends StObject
  object ColorSchemeOrSystem {
    
    inline def dark: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dark = "dark".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dark]
    
    inline def light: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.light = "light".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.light]
    
    inline def system: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.system = "system".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.system]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.apricot
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.desktop
  */
  trait Theme extends StObject
  object Theme {
    
    inline def apricot: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.apricot = "apricot".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.apricot]
    
    inline def desktop: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.desktop = "desktop".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.desktop]
  }
  
  trait ThemeProviderProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * @ignore
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The color scheme to use.
      */
    var colorScheme: ColorSchemeOrSystem
    
    /**
      * Default color scheme to use when a user prefered color scheme (system) is not available.
      */
    var defaultColorScheme: js.UndefOr[ColorScheme] = js.undefined
    
    /**
      * The theme to use.
      */
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object ThemeProviderProps {
    
    inline def apply(colorScheme: ColorSchemeOrSystem): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColorScheme(value: ColorSchemeOrSystem): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      inline def setDefaultColorScheme(value: ColorScheme): Self = StObject.set(x, "defaultColorScheme", value.asInstanceOf[js.Any])
      
      inline def setDefaultColorSchemeUndefined: Self = StObject.set(x, "defaultColorScheme", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
