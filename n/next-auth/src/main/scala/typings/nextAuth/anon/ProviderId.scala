package typings.nextAuth.anon

import typings.nextAuth.utilsParseUrlMod.InternalUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderId extends StObject {
  
  var providerId: js.UndefOr[String] = js.undefined
  
  var providers: js.Array[typings.nextAuth.providersMod.Provider]
  
  var url: InternalUrl
}
object ProviderId {
  
  inline def apply(providers: js.Array[typings.nextAuth.providersMod.Provider], url: InternalUrl): ProviderId = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderId]
  }
  
  extension [Self <: ProviderId](x: Self) {
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    
    inline def setProviders(value: js.Array[typings.nextAuth.providersMod.Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: typings.nextAuth.providersMod.Provider*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setUrl(value: InternalUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
