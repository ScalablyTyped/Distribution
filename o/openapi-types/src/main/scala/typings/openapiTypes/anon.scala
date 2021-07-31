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
    
    @scala.inline
    def apply(): AuthorizationCode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationCode]
    }
    
    @scala.inline
    implicit class AuthorizationCodeMutableBuilder[Self <: AuthorizationCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationCode(value: Scopes): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
      
      @scala.inline
      def setClientCredentials(value: RefreshUrl): Self = StObject.set(x, "clientCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCredentialsUndefined: Self = StObject.set(x, "clientCredentials", js.undefined)
      
      @scala.inline
      def setImplicit(value: AuthorizationUrl): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
      
      @scala.inline
      def setPassword(value: RefreshUrl): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    }
  }
  
  trait AuthorizationUrl extends StObject {
    
    var authorizationUrl: String
    
    var refreshUrl: js.UndefOr[String] = js.undefined
    
    var scopes: StringDictionary[String]
  }
  object AuthorizationUrl {
    
    @scala.inline
    def apply(authorizationUrl: String, scopes: StringDictionary[String]): AuthorizationUrl = {
      val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationUrl]
    }
    
    @scala.inline
    implicit class AuthorizationUrlMutableBuilder[Self <: AuthorizationUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshUrl(value: String): Self = StObject.set(x, "refreshUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshUrlUndefined: Self = StObject.set(x, "refreshUrl", js.undefined)
      
      @scala.inline
      def setScopes(value: StringDictionary[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshUrl extends StObject {
    
    var refreshUrl: js.UndefOr[String] = js.undefined
    
    var scopes: StringDictionary[String]
    
    var tokenUrl: String
  }
  object RefreshUrl {
    
    @scala.inline
    def apply(scopes: StringDictionary[String], tokenUrl: String): RefreshUrl = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshUrl]
    }
    
    @scala.inline
    implicit class RefreshUrlMutableBuilder[Self <: RefreshUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefreshUrl(value: String): Self = StObject.set(x, "refreshUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshUrlUndefined: Self = StObject.set(x, "refreshUrl", js.undefined)
      
      @scala.inline
      def setScopes(value: StringDictionary[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scopes extends StObject {
    
    var authorizationUrl: String
    
    var refreshUrl: js.UndefOr[String] = js.undefined
    
    var scopes: StringDictionary[String]
    
    var tokenUrl: String
  }
  object Scopes {
    
    @scala.inline
    def apply(authorizationUrl: String, scopes: StringDictionary[String], tokenUrl: String): Scopes = {
      val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scopes]
    }
    
    @scala.inline
    implicit class ScopesMutableBuilder[Self <: Scopes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshUrl(value: String): Self = StObject.set(x, "refreshUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshUrlUndefined: Self = StObject.set(x, "refreshUrl", js.undefined)
      
      @scala.inline
      def setScopes(value: StringDictionary[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
    }
  }
}
