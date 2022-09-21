package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialIdentityProvider
  extends StObject
     with IdentityProviderBase {
  
  /**
    * The identifier for the client application obtained when registering the application with the identity provider.
    * Required.
    */
  var clientId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The client secret for the application that is obtained when the application is registered with the identity provider.
    * This is write-only. A read operation returns ****. Required.
    */
  var clientSecret: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * For a B2B scenario, possible values: Google, Facebook. For a B2C scenario, possible values: Microsoft, Google, Amazon,
    * LinkedIn, Facebook, GitHub, Twitter, Weibo, QQ, WeChat. Required.
    */
  var identityProviderType: js.UndefOr[NullableOption[String]] = js.undefined
}
object SocialIdentityProvider {
  
  inline def apply(): SocialIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialIdentityProvider]
  }
  
  extension [Self <: SocialIdentityProvider](x: Self) {
    
    inline def setClientId(value: NullableOption[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: NullableOption[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretNull: Self = StObject.set(x, "clientSecret", null)
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setIdentityProviderType(value: NullableOption[String]): Self = StObject.set(x, "identityProviderType", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderTypeNull: Self = StObject.set(x, "identityProviderType", null)
    
    inline def setIdentityProviderTypeUndefined: Self = StObject.set(x, "identityProviderType", js.undefined)
  }
}
