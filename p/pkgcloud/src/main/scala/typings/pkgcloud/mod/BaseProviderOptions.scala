package typings.pkgcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseProviderOptions extends StObject {
  
  var provider: Providers
}
object BaseProviderOptions {
  
  inline def apply(provider: Providers): BaseProviderOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProviderOptions]
  }
  
  extension [Self <: BaseProviderOptions](x: Self) {
    
    inline def setProvider(value: Providers): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
