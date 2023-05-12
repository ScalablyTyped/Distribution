package typings.mercadopagoSdkJs.bricks

import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.bootstrap
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.dark
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.default
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.flat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BricksStyle extends StObject {
  
  var customVariables: js.UndefOr[CustomVariables] = js.undefined
  
  var theme: js.UndefOr[default | dark | flat | bootstrap] = js.undefined
}
object BricksStyle {
  
  inline def apply(): BricksStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BricksStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BricksStyle] (val x: Self) extends AnyVal {
    
    inline def setCustomVariables(value: CustomVariables): Self = StObject.set(x, "customVariables", value.asInstanceOf[js.Any])
    
    inline def setCustomVariablesUndefined: Self = StObject.set(x, "customVariables", js.undefined)
    
    inline def setTheme(value: default | dark | flat | bootstrap): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
