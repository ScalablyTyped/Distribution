package typings.oidcProvider.anon

import typings.oidcProvider.mod.CanBePromise
import typings.oidcProvider.mod.ClientCredentials
import typings.oidcProvider.mod.KoaContextWithOIDC
import typings.oidcProvider.mod.RefreshToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedPolicy extends StObject {
  
  var allowedPolicy: js.UndefOr[
    js.Function3[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typings.oidcProvider.mod.Client, 
      /* token */ typings.oidcProvider.mod.AccessToken | ClientCredentials | RefreshToken, 
      CanBePromise[Boolean]
    ]
  ] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AllowedPolicy {
  
  inline def apply(): AllowedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowedPolicy] (val x: Self) extends AnyVal {
    
    inline def setAllowedPolicy(
      value: (/* ctx */ KoaContextWithOIDC, /* client */ typings.oidcProvider.mod.Client, /* token */ typings.oidcProvider.mod.AccessToken | ClientCredentials | RefreshToken) => CanBePromise[Boolean]
    ): Self = StObject.set(x, "allowedPolicy", js.Any.fromFunction3(value))
    
    inline def setAllowedPolicyUndefined: Self = StObject.set(x, "allowedPolicy", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
