package typings.meteorPrime8consultingOauth2

import typings.meteor.Meteor.Error
import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Mongo.Collection
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OAuth2Server {
  
  @js.native
  trait AccessToken extends StObject {
    
    var accessToken: String = js.native
    
    var clientId: String = js.native
    
    var expires: Date = js.native
    
    var userId: String = js.native
  }
  object AccessToken {
    
    @scala.inline
    def apply(accessToken: String, clientId: String, expires: Date, userId: String): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit class AccessTokenMutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthCode extends StObject {
    
    var authCode: String = js.native
    
    var clientId: String = js.native
    
    var expires: Date = js.native
    
    var userId: String = js.native
  }
  object AuthCode {
    
    @scala.inline
    def apply(authCode: String, clientId: String, expires: Date, userId: String): AuthCode = {
      val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthCode]
    }
    
    @scala.inline
    implicit class AuthCodeMutableBuilder[Self <: AuthCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthCodeGrantResult extends StObject {
    
    var authorizationCode: String = js.native
    
    var error: js.Any = js.native
    
    var redirectToUri: String = js.native
    
    var success: Boolean = js.native
  }
  object AuthCodeGrantResult {
    
    @scala.inline
    def apply(authorizationCode: String, error: js.Any, redirectToUri: String, success: Boolean): AuthCodeGrantResult = {
      val __obj = js.Dynamic.literal(authorizationCode = authorizationCode.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], redirectToUri = redirectToUri.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthCodeGrantResult]
    }
    
    @scala.inline
    implicit class AuthCodeGrantResultMutableBuilder[Self <: AuthCodeGrantResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectToUri(value: String): Self = StObject.set(x, "redirectToUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
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
    ): Unit = js.native
  }
  object CallMethod {
    
    @scala.inline
    def apply(
      authCodeGrant: (String, String, String, js.Array[String], String, js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]) => Unit
    ): CallMethod = {
      val __obj = js.Dynamic.literal(authCodeGrant = js.Any.fromFunction6(authCodeGrant))
      __obj.asInstanceOf[CallMethod]
    }
    
    @scala.inline
    implicit class CallMethodMutableBuilder[Self <: CallMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthCodeGrant(
        value: (String, String, String, js.Array[String], String, js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]) => Unit
      ): Self = StObject.set(x, "authCodeGrant", js.Any.fromFunction6(value))
    }
  }
  
  @js.native
  trait Client extends StObject {
    
    var active: Boolean = js.native
    
    var clientId: String = js.native
    
    var clientSecret: String = js.native
    
    var redirectUri: String = js.native
  }
  object Client {
    
    @scala.inline
    def apply(active: Boolean, clientId: String, clientSecret: String, redirectUri: String): Client = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Collections extends StObject {
    
    /**
      * (server only) Collection of the access tokens.
      */
    var accessToken: Collection[AccessToken, AccessToken] = js.native
    
    /**
      * Collection of the authorization codes.
      */
    var authCode: Collection[AuthCode, AuthCode] = js.native
    
    /**
      * (server only) Collection of the clients authorized to use the oauth2 service.
      */
    var client: Collection[Client, Client] = js.native
    
    /**
      * Collection of the refresh tokens.
      */
    var refreshToken: Collection[RefreshToken, RefreshToken] = js.native
  }
  object Collections {
    
    @scala.inline
    def apply(
      accessToken: Collection[AccessToken, AccessToken],
      authCode: Collection[AuthCode, AuthCode],
      client: Collection[Client, Client],
      refreshToken: Collection[RefreshToken, RefreshToken]
    ): Collections = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authCode = authCode.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collections]
    }
    
    @scala.inline
    implicit class CollectionsMutableBuilder[Self <: Collections] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: Collection[AccessToken, AccessToken]): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthCode(value: Collection[AuthCode, AuthCode]): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient(value: Collection[Client, Client]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshToken(value: Collection[RefreshToken, RefreshToken]): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MethodNames extends StObject {
    
    /**
      * Constant string representing th authCodeGran meteor method.
      */
    var authCodeGrant: String = js.native
  }
  object MethodNames {
    
    @scala.inline
    def apply(authCodeGrant: String): MethodNames = {
      val __obj = js.Dynamic.literal(authCodeGrant = authCodeGrant.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodNames]
    }
    
    @scala.inline
    implicit class MethodNamesMutableBuilder[Self <: MethodNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthCodeGrant(value: String): Self = StObject.set(x, "authCodeGrant", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OAuth2Server extends StObject {
    
    var callMethod: CallMethod = js.native
    
    var collections: Collections = js.native
    
    var methodNames: MethodNames = js.native
    
    var oauthserver: js.Any = js.native
    
    var pubSubNames: PubSubNames = js.native
    
    var subscribeTo: SubscribeTo = js.native
  }
  object OAuth2Server {
    
    @scala.inline
    def apply(
      callMethod: CallMethod,
      collections: Collections,
      methodNames: MethodNames,
      oauthserver: js.Any,
      pubSubNames: PubSubNames,
      subscribeTo: SubscribeTo
    ): typings.meteorPrime8consultingOauth2.OAuth2Server.OAuth2Server = {
      val __obj = js.Dynamic.literal(callMethod = callMethod.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], methodNames = methodNames.asInstanceOf[js.Any], oauthserver = oauthserver.asInstanceOf[js.Any], pubSubNames = pubSubNames.asInstanceOf[js.Any], subscribeTo = subscribeTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteorPrime8consultingOauth2.OAuth2Server.OAuth2Server]
    }
    
    @scala.inline
    implicit class OAuth2ServerMutableBuilder[Self <: typings.meteorPrime8consultingOauth2.OAuth2Server.OAuth2Server] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallMethod(value: CallMethod): Self = StObject.set(x, "callMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollections(value: Collections): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodNames(value: MethodNames): Self = StObject.set(x, "methodNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauthserver(value: js.Any): Self = StObject.set(x, "oauthserver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubSubNames(value: PubSubNames): Self = StObject.set(x, "pubSubNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribeTo(value: SubscribeTo): Self = StObject.set(x, "subscribeTo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PubSubNames extends StObject {
    
    /**
      * Constant string representing the auth codes pub/sub.
      */
    var authCodes: String = js.native
    
    /**
      * Constant string representing the refresh token pub/sub.
      */
    var refreshTokens: String = js.native
  }
  object PubSubNames {
    
    @scala.inline
    def apply(authCodes: String, refreshTokens: String): PubSubNames = {
      val __obj = js.Dynamic.literal(authCodes = authCodes.asInstanceOf[js.Any], refreshTokens = refreshTokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[PubSubNames]
    }
    
    @scala.inline
    implicit class PubSubNamesMutableBuilder[Self <: PubSubNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthCodes(value: String): Self = StObject.set(x, "authCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokens(value: String): Self = StObject.set(x, "refreshTokens", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RefreshToken extends StObject {
    
    var clientId: String = js.native
    
    var expires: Date = js.native
    
    var refreshToken: String = js.native
    
    var userId: String = js.native
  }
  object RefreshToken {
    
    @scala.inline
    def apply(clientId: String, expires: Date, refreshToken: String, userId: String): RefreshToken = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshToken]
    }
    
    @scala.inline
    implicit class RefreshTokenMutableBuilder[Self <: RefreshToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubscribeTo extends StObject {
    
    /**
      * Wrapper function to subscribe to the auth code subscription. Returns a standard subscription handle.
      */
    def authCode(): SubscriptionHandle = js.native
  }
  object SubscribeTo {
    
    @scala.inline
    def apply(authCode: () => SubscriptionHandle): SubscribeTo = {
      val __obj = js.Dynamic.literal(authCode = js.Any.fromFunction0(authCode))
      __obj.asInstanceOf[SubscribeTo]
    }
    
    @scala.inline
    implicit class SubscribeToMutableBuilder[Self <: SubscribeTo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthCode(value: () => SubscriptionHandle): Self = StObject.set(x, "authCode", js.Any.fromFunction0(value))
    }
  }
}
