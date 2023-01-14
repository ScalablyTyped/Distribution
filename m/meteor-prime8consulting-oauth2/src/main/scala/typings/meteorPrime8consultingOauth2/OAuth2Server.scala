package typings.meteorPrime8consultingOauth2

import typings.meteor.Meteor.Error
import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Mongo.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OAuth2Server {
  
  trait AccessToken extends StObject {
    
    var accessToken: String
    
    var clientId: String
    
    var expires: js.Date
    
    var userId: String
  }
  object AccessToken {
    
    inline def apply(accessToken: String, clientId: String, expires: js.Date, userId: String): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthCode extends StObject {
    
    var authCode: String
    
    var clientId: String
    
    var expires: js.Date
    
    var userId: String
  }
  object AuthCode {
    
    inline def apply(authCode: String, clientId: String, expires: js.Date, userId: String): AuthCode = {
      val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthCode] (val x: Self) extends AnyVal {
      
      inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthCodeGrantResult extends StObject {
    
    var authorizationCode: String
    
    var error: Any
    
    var redirectToUri: String
    
    var success: Boolean
  }
  object AuthCodeGrantResult {
    
    inline def apply(authorizationCode: String, error: Any, redirectToUri: String, success: Boolean): AuthCodeGrantResult = {
      val __obj = js.Dynamic.literal(authorizationCode = authorizationCode.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], redirectToUri = redirectToUri.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthCodeGrantResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthCodeGrantResult] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setRedirectToUri(value: String): Self = StObject.set(x, "redirectToUri", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallMethod extends StObject {
    
    /**
      * Wrapper for Meteor.method to create an authorization code. This is an async function and a callback must be provided to be of any use.
      */
    def authCodeGrant(
      client_id: String,
      redirect_uri: String,
      response_type: String,
      scope: js.Array[String],
      state: String,
      callback: js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]
    ): Unit
  }
  object CallMethod {
    
    inline def apply(
      authCodeGrant: (String, String, String, js.Array[String], String, js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]) => Unit
    ): CallMethod = {
      val __obj = js.Dynamic.literal(authCodeGrant = js.Any.fromFunction6(authCodeGrant))
      __obj.asInstanceOf[CallMethod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallMethod] (val x: Self) extends AnyVal {
      
      inline def setAuthCodeGrant(
        value: (String, String, String, js.Array[String], String, js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]) => Unit
      ): Self = StObject.set(x, "authCodeGrant", js.Any.fromFunction6(value))
    }
  }
  
  trait Client extends StObject {
    
    var active: Boolean
    
    var clientId: String
    
    var clientSecret: String
    
    var redirectUri: String
  }
  object Client {
    
    inline def apply(active: Boolean, clientId: String, clientSecret: String, redirectUri: String): Client = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Collections extends StObject {
    
    /**
      * (server only) Collection of the access tokens.
      */
    var accessToken: Collection[AccessToken, AccessToken]
    
    /**
      * Collection of the authorization codes.
      */
    var authCode: Collection[AuthCode, AuthCode]
    
    /**
      * (server only) Collection of the clients authorized to use the oauth2 service.
      */
    var client: Collection[Client, Client]
    
    /**
      * Collection of the refresh tokens.
      */
    var refreshToken: Collection[RefreshToken, RefreshToken]
  }
  object Collections {
    
    inline def apply(
      accessToken: Collection[AccessToken, AccessToken],
      authCode: Collection[AuthCode, AuthCode],
      client: Collection[Client, Client],
      refreshToken: Collection[RefreshToken, RefreshToken]
    ): Collections = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authCode = authCode.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collections]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Collections] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: Collection[AccessToken, AccessToken]): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAuthCode(value: Collection[AuthCode, AuthCode]): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
      
      inline def setClient(value: Collection[Client, Client]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: Collection[RefreshToken, RefreshToken]): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodNames extends StObject {
    
    /**
      * Constant string representing th authCodeGran meteor method.
      */
    var authCodeGrant: String
  }
  object MethodNames {
    
    inline def apply(authCodeGrant: String): MethodNames = {
      val __obj = js.Dynamic.literal(authCodeGrant = authCodeGrant.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MethodNames] (val x: Self) extends AnyVal {
      
      inline def setAuthCodeGrant(value: String): Self = StObject.set(x, "authCodeGrant", value.asInstanceOf[js.Any])
    }
  }
  
  trait OAuth2Server extends StObject {
    
    var callMethod: CallMethod
    
    var collections: Collections
    
    var methodNames: MethodNames
    
    var oauthserver: Any
    
    var pubSubNames: PubSubNames
    
    var subscribeTo: SubscribeTo
  }
  object OAuth2Server {
    
    inline def apply(
      callMethod: CallMethod,
      collections: Collections,
      methodNames: MethodNames,
      oauthserver: Any,
      pubSubNames: PubSubNames,
      subscribeTo: SubscribeTo
    ): typings.meteorPrime8consultingOauth2.OAuth2Server.OAuth2Server = {
      val __obj = js.Dynamic.literal(callMethod = callMethod.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], methodNames = methodNames.asInstanceOf[js.Any], oauthserver = oauthserver.asInstanceOf[js.Any], pubSubNames = pubSubNames.asInstanceOf[js.Any], subscribeTo = subscribeTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteorPrime8consultingOauth2.OAuth2Server.OAuth2Server]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.meteorPrime8consultingOauth2.OAuth2Server.OAuth2Server] (val x: Self) extends AnyVal {
      
      inline def setCallMethod(value: CallMethod): Self = StObject.set(x, "callMethod", value.asInstanceOf[js.Any])
      
      inline def setCollections(value: Collections): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      inline def setMethodNames(value: MethodNames): Self = StObject.set(x, "methodNames", value.asInstanceOf[js.Any])
      
      inline def setOauthserver(value: Any): Self = StObject.set(x, "oauthserver", value.asInstanceOf[js.Any])
      
      inline def setPubSubNames(value: PubSubNames): Self = StObject.set(x, "pubSubNames", value.asInstanceOf[js.Any])
      
      inline def setSubscribeTo(value: SubscribeTo): Self = StObject.set(x, "subscribeTo", value.asInstanceOf[js.Any])
    }
  }
  
  trait PubSubNames extends StObject {
    
    /**
      * Constant string representing the auth codes pub/sub.
      */
    var authCodes: String
    
    /**
      * Constant string representing the refresh token pub/sub.
      */
    var refreshTokens: String
  }
  object PubSubNames {
    
    inline def apply(authCodes: String, refreshTokens: String): PubSubNames = {
      val __obj = js.Dynamic.literal(authCodes = authCodes.asInstanceOf[js.Any], refreshTokens = refreshTokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[PubSubNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PubSubNames] (val x: Self) extends AnyVal {
      
      inline def setAuthCodes(value: String): Self = StObject.set(x, "authCodes", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokens(value: String): Self = StObject.set(x, "refreshTokens", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshToken extends StObject {
    
    var clientId: String
    
    var expires: js.Date
    
    var refreshToken: String
    
    var userId: String
  }
  object RefreshToken {
    
    inline def apply(clientId: String, expires: js.Date, refreshToken: String, userId: String): RefreshToken = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefreshToken] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscribeTo extends StObject {
    
    /**
      * Wrapper function to subscribe to the auth code subscription. Returns a standard subscription handle.
      */
    def authCode(): SubscriptionHandle
  }
  object SubscribeTo {
    
    inline def apply(authCode: () => SubscriptionHandle): SubscribeTo = {
      val __obj = js.Dynamic.literal(authCode = js.Any.fromFunction0(authCode))
      __obj.asInstanceOf[SubscribeTo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscribeTo] (val x: Self) extends AnyVal {
      
      inline def setAuthCode(value: () => SubscriptionHandle): Self = StObject.set(x, "authCode", js.Any.fromFunction0(value))
    }
  }
}
