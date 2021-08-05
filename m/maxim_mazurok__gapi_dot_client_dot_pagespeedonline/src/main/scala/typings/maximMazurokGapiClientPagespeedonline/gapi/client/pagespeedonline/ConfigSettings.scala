package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSettings extends StObject {
  
  /** How Lighthouse was run, e.g. from the Chrome extension or from the npm module. */
  var channel: js.UndefOr[String] = js.undefined
  
  /** The form factor the emulation should use. */
  var emulatedFormFactor: js.UndefOr[String] = js.undefined
  
  /** The locale setting. */
  var locale: js.UndefOr[String] = js.undefined
  
  /** List of categories of audits the run should conduct. */
  var onlyCategories: js.UndefOr[js.Any] = js.undefined
}
object ConfigSettings {
  
  inline def apply(): ConfigSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigSettings]
  }
  
  extension [Self <: ConfigSettings](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setEmulatedFormFactor(value: String): Self = StObject.set(x, "emulatedFormFactor", value.asInstanceOf[js.Any])
    
    inline def setEmulatedFormFactorUndefined: Self = StObject.set(x, "emulatedFormFactor", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOnlyCategories(value: js.Any): Self = StObject.set(x, "onlyCategories", value.asInstanceOf[js.Any])
    
    inline def setOnlyCategoriesUndefined: Self = StObject.set(x, "onlyCategories", js.undefined)
  }
}
