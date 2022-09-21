package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.srcThemeProviderMod.ColorScheme
import typings.orbitUiReactComponents.srcThemeProviderMod.ColorSchemeOrSystem
import typings.orbitUiReactComponents.srcThemeProviderMod.ThemeProviderProps
import typings.orbitUiReactComponents.themeContextMod.ThemeContextType
import typings.react.mod.Context
import typings.react.mod.RefObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderMod {
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider", "ThemeComputedStyle")
  @js.native
  open class ThemeComputedStyle protected ()
    extends typings.orbitUiReactComponents.themeProviderSrcMod.ThemeComputedStyle {
    def this(componentRef: RefObject[Element]) = this()
  }
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider", "ThemeContext")
  @js.native
  val ThemeContext: Context[ThemeContextType] = js.native
  
  inline def ThemeProvider(hasThemeColorSchemeDefaultColorSchemeChildrenAsRest: ThemeProviderProps): typings.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasThemeColorSchemeDefaultColorSchemeChildrenAsRest.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.global.JSX.Element]
  
  inline def toPixelValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPixelValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useColorScheme(colorScheme: ColorSchemeOrSystem, defaultColorScheme: ColorScheme): ColorScheme = (^.asInstanceOf[js.Dynamic].applyDynamic("useColorScheme")(colorScheme.asInstanceOf[js.Any], defaultColorScheme.asInstanceOf[js.Any])).asInstanceOf[ColorScheme]
  
  inline def useThemeComputedStyle(componentRef: RefObject[Element]): typings.orbitUiReactComponents.useThemeComputedStyleMod.ThemeComputedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeComputedStyle")(componentRef.asInstanceOf[js.Any]).asInstanceOf[typings.orbitUiReactComponents.useThemeComputedStyleMod.ThemeComputedStyle]
  
  inline def useThemeContext(): ThemeContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeContext")().asInstanceOf[ThemeContextType]
}
