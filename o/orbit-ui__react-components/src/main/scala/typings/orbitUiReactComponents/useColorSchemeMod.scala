package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.srcThemeProviderMod.ColorScheme
import typings.orbitUiReactComponents.srcThemeProviderMod.ColorSchemeOrSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useColorSchemeMod {
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider/src/useColorScheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useColorScheme(colorScheme: ColorSchemeOrSystem, defaultColorScheme: ColorScheme): ColorScheme = (^.asInstanceOf[js.Dynamic].applyDynamic("useColorScheme")(colorScheme.asInstanceOf[js.Any], defaultColorScheme.asInstanceOf[js.Any])).asInstanceOf[ColorScheme]
}
