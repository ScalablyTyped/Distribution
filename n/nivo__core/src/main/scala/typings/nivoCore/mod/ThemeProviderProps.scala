package typings.nivoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeProviderProps extends StObject {
  
  var theme: js.UndefOr[Theme] = js.undefined
}
object ThemeProviderProps {
  
  inline def apply(): ThemeProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProviderProps]
  }
  
  extension [Self <: ThemeProviderProps](x: Self) {
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
