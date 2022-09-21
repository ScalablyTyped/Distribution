package typings.monacoEditor.mod.languages.css

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSDataConfiguration extends StObject {
  
  /**
    * Provides a set of custom data providers.
    */
  var dataProviders: js.UndefOr[StringDictionary[CSSDataV1]] = js.undefined
  
  /**
    * Defines whether the standard CSS properties, at-directives, pseudoClasses and pseudoElements are shown.
    */
  var useDefaultDataProvider: js.UndefOr[Boolean] = js.undefined
}
object CSSDataConfiguration {
  
  inline def apply(): CSSDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSDataConfiguration]
  }
  
  extension [Self <: CSSDataConfiguration](x: Self) {
    
    inline def setDataProviders(value: StringDictionary[CSSDataV1]): Self = StObject.set(x, "dataProviders", value.asInstanceOf[js.Any])
    
    inline def setDataProvidersUndefined: Self = StObject.set(x, "dataProviders", js.undefined)
    
    inline def setUseDefaultDataProvider(value: Boolean): Self = StObject.set(x, "useDefaultDataProvider", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultDataProviderUndefined: Self = StObject.set(x, "useDefaultDataProvider", js.undefined)
  }
}
