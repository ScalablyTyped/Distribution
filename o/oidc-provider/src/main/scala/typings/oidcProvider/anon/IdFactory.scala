package typings.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.mod.CanBePromise
import typings.oidcProvider.mod.ClientMetadata
import typings.oidcProvider.mod.KoaContextWithOIDC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdFactory extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var idFactory: js.UndefOr[js.Function1[/* ctx */ KoaContextWithOIDC, String]] = js.undefined
  
  var initialAccessToken: js.UndefOr[Boolean | String] = js.undefined
  
  var policies: js.UndefOr[
    StringDictionary[
      js.Function2[
        /* ctx */ KoaContextWithOIDC, 
        /* metadata */ ClientMetadata, 
        CanBePromise[js.UndefOr[Unit]]
      ]
    ]
  ] = js.undefined
  
  var secretFactory: js.UndefOr[js.Function1[/* ctx */ KoaContextWithOIDC, String]] = js.undefined
}
object IdFactory {
  
  inline def apply(): IdFactory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdFactory] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIdFactory(value: /* ctx */ KoaContextWithOIDC => String): Self = StObject.set(x, "idFactory", js.Any.fromFunction1(value))
    
    inline def setIdFactoryUndefined: Self = StObject.set(x, "idFactory", js.undefined)
    
    inline def setInitialAccessToken(value: Boolean | String): Self = StObject.set(x, "initialAccessToken", value.asInstanceOf[js.Any])
    
    inline def setInitialAccessTokenUndefined: Self = StObject.set(x, "initialAccessToken", js.undefined)
    
    inline def setPolicies(
      value: StringDictionary[
          js.Function2[
            /* ctx */ KoaContextWithOIDC, 
            /* metadata */ ClientMetadata, 
            CanBePromise[js.UndefOr[Unit]]
          ]
        ]
    ): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setSecretFactory(value: /* ctx */ KoaContextWithOIDC => String): Self = StObject.set(x, "secretFactory", js.Any.fromFunction1(value))
    
    inline def setSecretFactoryUndefined: Self = StObject.set(x, "secretFactory", js.undefined)
  }
}
