package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
trait I18n extends StObject {
  
  /** Internationalized strings that are formatted to the locale in configSettings. */
  var rendererFormattedStrings: js.UndefOr[RendererFormattedStrings] = js.undefined
}
object I18n {
  
  inline def apply(): I18n = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18n]
  }
  
  extension [Self <: I18n](x: Self) {
    
    inline def setRendererFormattedStrings(value: RendererFormattedStrings): Self = StObject.set(x, "rendererFormattedStrings", value.asInstanceOf[js.Any])
    
    inline def setRendererFormattedStringsUndefined: Self = StObject.set(x, "rendererFormattedStrings", js.undefined)
  }
}
