package typings.orbitUiReactComponents

import typings.react.mod.RefObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemeProviderSrcUseThemeComputedStyleMod {
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider/src/useThemeComputedStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider/src/useThemeComputedStyle", "ThemeComputedStyle")
  @js.native
  open class ThemeComputedStyle protected () extends StObject {
    def this(componentRef: RefObject[Element]) = this()
    
    /* private */ var componentRef: Any = js.native
    
    def getPropertyValue(name: String): String = js.native
    
    def getSpacingValue(name: String): String = js.native
    
    /* private */ var getThemeElement: Any = js.native
  }
  
  inline def toPixelValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPixelValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useThemeComputedStyle(componentRef: RefObject[Element]): ThemeComputedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeComputedStyle")(componentRef.asInstanceOf[js.Any]).asInstanceOf[ThemeComputedStyle]
}
