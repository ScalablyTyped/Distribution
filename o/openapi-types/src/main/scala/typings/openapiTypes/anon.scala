package typings.openapiTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuthorizationCode extends StObject {
    
    var authorizationCode: js.UndefOr[Scopes] = js.undefined
    
    var clientCredentials: js.UndefOr[RefreshUrl] = js.undefined
    
    var `implicit`: js.UndefOr[AuthorizationUrl] = js.undefined
    
    var password: js.UndefOr[RefreshUrl] = js.undefined
  }
  object AuthorizationCode {
    
    inline def apply(): AuthorizationCode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationCode]
    }
    
    extension [Self <: AuthorizationCode](x: Self) {
      
      inline def setAuthorizationCode(value: Scopes): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
      
      inline def setClientCredentials(value: RefreshUrl): Self = StObject.set(x, "clientCredentials", value.asInstanceOf[js.Any])
      
      inline def setClientCredentialsUndefined: Self = StObject.set(x, "clientCredentials", js.undefined)
      
      inline def setImplicit(value: AuthorizationUrl): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
      
      inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
      
      inline def setPassword(value: RefreshUrl): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    }
  }
  
  trait AuthorizationUrl extends StObject {
    
    var authorizationUrl: String
    
    var refreshUrl: js.UndefOr[String] = js.undefined
    
    var scopes: StringDictionary[String]
  }
  object AuthorizationUrl {
    
    inline def apply(authorizationUrl: String, scopes: StringDictionary[String]): AuthorizationUrl = {
      val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationUrl]
    }
    
    extension [Self <: AuthorizationUrl](x: Self) {
      
      inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      inline def setRefreshUrl(value: String): Self = StObject.set(x, "refreshUrl", value.asInstanceOf[js.Any])
      
      inline def setRefreshUrlUndefined: Self = StObject.set(x, "refreshUrl", js.undefined)
      
      inline def setScopes(value: StringDictionary[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshUrl extends StObject {
    
    var refreshUrl: js.UndefOr[String] = js.undefined
    
    var scopes: StringDictionary[String]
    
    var tokenUrl: String
  }
  object RefreshUrl {
    
    inline def apply(scopes: StringDictionary[String], tokenUrl: String): RefreshUrl = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshUrl]
    }
    
    extension [Self <: RefreshUrl](x: Self) {
      
      inline def setRefreshUrl(value: String): Self = StObject.set(x, "refreshUrl", value.asInstanceOf[js.Any])
      
      inline def setRefreshUrlUndefined: Self = StObject.set(x, "refreshUrl", js.undefined)
      
      inline def setScopes(value: StringDictionary[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scopes extends StObject {
    
    var authorizationUrl: String
    
    var refreshUrl: js.UndefOr[String] = js.undefined
    
    var scopes: StringDictionary[String]
    
    var tokenUrl: String
  }
  object Scopes {
    
    inline def apply(authorizationUrl: String, scopes: StringDictionary[String], tokenUrl: String): Scopes = {
      val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scopes]
    }
    
    extension [Self <: Scopes](x: Self) {
      
      inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      inline def setRefreshUrl(value: String): Self = StObject.set(x, "refreshUrl", value.asInstanceOf[js.Any])
      
      inline def setRefreshUrlUndefined: Self = StObject.set(x, "refreshUrl", js.undefined)
      
      inline def setScopes(value: StringDictionary[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
    }
  }
}
