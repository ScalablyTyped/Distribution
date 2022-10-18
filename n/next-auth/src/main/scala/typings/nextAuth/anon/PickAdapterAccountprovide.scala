package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next-auth.next-auth/adapters.AdapterAccount, 'provider' | 'providerAccountId'> */
trait PickAdapterAccountprovide extends StObject {
  
  var provider: String
  
  var providerAccountId: String
}
object PickAdapterAccountprovide {
  
  inline def apply(provider: String, providerAccountId: String): PickAdapterAccountprovide = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], providerAccountId = providerAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAdapterAccountprovide]
  }
  
  extension [Self <: PickAdapterAccountprovide](x: Self) {
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderAccountId(value: String): Self = StObject.set(x, "providerAccountId", value.asInstanceOf[js.Any])
  }
}
