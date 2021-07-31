package typings.oidcTokenManager

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Oidc {
  
  trait DefaultHttpRequest extends StObject {
    
    def getJSON(url: String, config: js.Any): DefaultPromise
  }
  object DefaultHttpRequest {
    
    @scala.inline
    def apply(getJSON: (String, js.Any) => DefaultPromise): DefaultHttpRequest = {
      val __obj = js.Dynamic.literal(getJSON = js.Any.fromFunction2(getJSON))
      __obj.asInstanceOf[DefaultHttpRequest]
    }
    
    @scala.inline
    implicit class DefaultHttpRequestMutableBuilder[Self <: DefaultHttpRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetJSON(value: (String, js.Any) => DefaultPromise): Self = StObject.set(x, "getJSON", js.Any.fromFunction2(value))
    }
  }
  
  trait DefaultPromise extends StObject {
    
    def `catch`(errorCallback: js.Function0[Unit]): DefaultPromise
    
    def `then`(
      successCallback: js.Function1[/* value */ js.UndefOr[js.Any], Unit],
      errorCallback: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
    ): DefaultPromise
  }
  object DefaultPromise {
    
    @scala.inline
    def apply(
      `catch`: js.Function0[Unit] => DefaultPromise,
      `then`: (js.Function1[/* value */ js.UndefOr[js.Any], Unit], js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => DefaultPromise
    ): DefaultPromise = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
      __obj.asInstanceOf[DefaultPromise]
    }
    
    @scala.inline
    implicit class DefaultPromiseMutableBuilder[Self <: DefaultPromise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: js.Function0[Unit] => DefaultPromise): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThen(
        value: (js.Function1[/* value */ js.UndefOr[js.Any], Unit], js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => DefaultPromise
      ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
    }
  }
  
  trait DefaultPromiseFactory extends StObject {
    
    def create(callback: js.Any): DefaultPromise
    
    def reject(reason: js.Any): DefaultPromise
    
    def resolve(value: js.Any): DefaultPromise
  }
  object DefaultPromiseFactory {
    
    @scala.inline
    def apply(
      create: js.Any => DefaultPromise,
      reject: js.Any => DefaultPromise,
      resolve: js.Any => DefaultPromise
    ): DefaultPromiseFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[DefaultPromiseFactory]
    }
    
    @scala.inline
    implicit class DefaultPromiseFactoryMutableBuilder[Self <: DefaultPromiseFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: js.Any => DefaultPromise): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReject(value: js.Any => DefaultPromise): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: js.Any => DefaultPromise): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait OidcClient extends StObject {
    
    def createLogoutRequestAsync(id_token_hint: String): DefaultPromise
    
    def createTokenRequestAsync(): DefaultPromise
    
    var isOAuth: Boolean
    
    var isOidc: Boolean
    
    def loadAuthorizationEndpoint(): Unit
    
    def loadMetadataAsync(): DefaultPromise
    
    def loadUserProfile(access_token: String): DefaultPromise
    
    def loadX509SigningKeyAsync(): DefaultPromise
    
    def processResponseAsync(queryString: String): DefaultPromise
    
    def validateAccessTokenAsync(id_token_contents: String, access_token: String): DefaultPromise
    
    def validateIdTokenAndAccessTokenAsync(id_token: String, nonce: String, access_token: String): DefaultPromise
    
    def validateIdTokenAsync(id_token: String, nonce: String, access_token: String): DefaultPromise
  }
  object OidcClient {
    
    @scala.inline
    def apply(
      createLogoutRequestAsync: String => DefaultPromise,
      createTokenRequestAsync: () => DefaultPromise,
      isOAuth: Boolean,
      isOidc: Boolean,
      loadAuthorizationEndpoint: () => Unit,
      loadMetadataAsync: () => DefaultPromise,
      loadUserProfile: String => DefaultPromise,
      loadX509SigningKeyAsync: () => DefaultPromise,
      processResponseAsync: String => DefaultPromise,
      validateAccessTokenAsync: (String, String) => DefaultPromise,
      validateIdTokenAndAccessTokenAsync: (String, String, String) => DefaultPromise,
      validateIdTokenAsync: (String, String, String) => DefaultPromise
    ): OidcClient = {
      val __obj = js.Dynamic.literal(createLogoutRequestAsync = js.Any.fromFunction1(createLogoutRequestAsync), createTokenRequestAsync = js.Any.fromFunction0(createTokenRequestAsync), isOAuth = isOAuth.asInstanceOf[js.Any], isOidc = isOidc.asInstanceOf[js.Any], loadAuthorizationEndpoint = js.Any.fromFunction0(loadAuthorizationEndpoint), loadMetadataAsync = js.Any.fromFunction0(loadMetadataAsync), loadUserProfile = js.Any.fromFunction1(loadUserProfile), loadX509SigningKeyAsync = js.Any.fromFunction0(loadX509SigningKeyAsync), processResponseAsync = js.Any.fromFunction1(processResponseAsync), validateAccessTokenAsync = js.Any.fromFunction2(validateAccessTokenAsync), validateIdTokenAndAccessTokenAsync = js.Any.fromFunction3(validateIdTokenAndAccessTokenAsync), validateIdTokenAsync = js.Any.fromFunction3(validateIdTokenAsync))
      __obj.asInstanceOf[OidcClient]
    }
    
    @scala.inline
    implicit class OidcClientMutableBuilder[Self <: OidcClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateLogoutRequestAsync(value: String => DefaultPromise): Self = StObject.set(x, "createLogoutRequestAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateTokenRequestAsync(value: () => DefaultPromise): Self = StObject.set(x, "createTokenRequestAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOAuth(value: Boolean): Self = StObject.set(x, "isOAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOidc(value: Boolean): Self = StObject.set(x, "isOidc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadAuthorizationEndpoint(value: () => Unit): Self = StObject.set(x, "loadAuthorizationEndpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadMetadataAsync(value: () => DefaultPromise): Self = StObject.set(x, "loadMetadataAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadUserProfile(value: String => DefaultPromise): Self = StObject.set(x, "loadUserProfile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadX509SigningKeyAsync(value: () => DefaultPromise): Self = StObject.set(x, "loadX509SigningKeyAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProcessResponseAsync(value: String => DefaultPromise): Self = StObject.set(x, "processResponseAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateAccessTokenAsync(value: (String, String) => DefaultPromise): Self = StObject.set(x, "validateAccessTokenAsync", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidateIdTokenAndAccessTokenAsync(value: (String, String, String) => DefaultPromise): Self = StObject.set(x, "validateIdTokenAndAccessTokenAsync", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValidateIdTokenAsync(value: (String, String, String) => DefaultPromise): Self = StObject.set(x, "validateIdTokenAsync", js.Any.fromFunction3(value))
    }
  }
  
  trait OidcClientSettings extends StObject {
    
    var authority: js.UndefOr[String] = js.undefined
    
    var filter_protocol_claims: js.UndefOr[Boolean] = js.undefined
    
    var load_user_profile: js.UndefOr[Boolean] = js.undefined
    
    var request_state_key: js.UndefOr[String] = js.undefined
    
    var request_state_store: js.UndefOr[js.Any] = js.undefined
    
    var response_type: js.UndefOr[String] = js.undefined
  }
  object OidcClientSettings {
    
    @scala.inline
    def apply(): OidcClientSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OidcClientSettings]
    }
    
    @scala.inline
    implicit class OidcClientSettingsMutableBuilder[Self <: OidcClientSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      @scala.inline
      def setFilter_protocol_claims(value: Boolean): Self = StObject.set(x, "filter_protocol_claims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_protocol_claimsUndefined: Self = StObject.set(x, "filter_protocol_claims", js.undefined)
      
      @scala.inline
      def setLoad_user_profile(value: Boolean): Self = StObject.set(x, "load_user_profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoad_user_profileUndefined: Self = StObject.set(x, "load_user_profile", js.undefined)
      
      @scala.inline
      def setRequest_state_key(value: String): Self = StObject.set(x, "request_state_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_state_keyUndefined: Self = StObject.set(x, "request_state_key", js.undefined)
      
      @scala.inline
      def setRequest_state_store(value: js.Any): Self = StObject.set(x, "request_state_store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_state_storeUndefined: Self = StObject.set(x, "request_state_store", js.undefined)
      
      @scala.inline
      def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    }
  }
  
  @js.native
  trait OidcClientStatic
    extends StObject
       with Instantiable1[/* settings */ OidcClientSettings, OidcTokenManager]
  
  trait OidcToken extends StObject {
    
    var access_token: String
    
    var expired: Boolean
    
    var expires_at: Double
    
    var expires_in: Double
    
    var id_token: String
    
    var profile: String
    
    var scope: String
    
    var scopes: js.Array[String]
    
    var session_state: js.Any
    
    def toJSON(): String
  }
  object OidcToken {
    
    @scala.inline
    def apply(
      access_token: String,
      expired: Boolean,
      expires_at: Double,
      expires_in: Double,
      id_token: String,
      profile: String,
      scope: String,
      scopes: js.Array[String],
      session_state: js.Any,
      toJSON: () => String
    ): OidcToken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], session_state = session_state.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[OidcToken]
    }
    
    @scala.inline
    implicit class OidcTokenMutableBuilder[Self <: OidcToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      @scala.inline
      def setSession_state(value: js.Any): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OidcTokenManager extends StObject {
    
    var access_token: String = js.native
    
    def addOnSilentTokenRenewFailed(cb: js.Function0[Unit]): Unit = js.native
    
    def addOnTokenExpired(cb: js.Function0[Unit]): Unit = js.native
    
    def addOnTokenExpiring(cb: js.Function0[Unit]): Unit = js.native
    
    def addOnTokenObtained(cb: js.Function0[Unit]): Unit = js.native
    
    def addOnTokenRemoved(cb: js.Function0[Unit]): Unit = js.native
    
    var expired: Boolean = js.native
    
    var expires_at: Double = js.native
    
    var expires_in: Double = js.native
    
    var id_token: String = js.native
    
    def openPopupForTokenAsync(): DefaultPromise = js.native
    def openPopupForTokenAsync(popupSettings: PopupSettings): DefaultPromise = js.native
    
    def processTokenCallbackAsync(): DefaultPromise = js.native
    def processTokenCallbackAsync(queryString: String): DefaultPromise = js.native
    
    def processTokenCallbackSilent(): Unit = js.native
    def processTokenCallbackSilent(hash: String): Unit = js.native
    
    def processTokenPopup(): Unit = js.native
    def processTokenPopup(hash: String): Unit = js.native
    
    var profile: js.Any = js.native
    
    def redirectForLogout(): DefaultPromise = js.native
    
    def redirectForToken(): DefaultPromise = js.native
    
    def removeToken(): Unit = js.native
    
    def renewTokenSilentAsync(): DefaultPromise = js.native
    
    def saveToken(token: OidcToken): Unit = js.native
    
    var scope: String = js.native
    
    var scopes: js.Array[String] = js.native
    
    var session_state: js.Any = js.native
  }
  
  trait OidcTokenManagerSettings extends StObject {
    
    var authority: js.UndefOr[String] = js.undefined
    
    var authorization_endpoint: js.UndefOr[String] = js.undefined
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var end_session_endpoint: js.UndefOr[String] = js.undefined
    
    var jwks: js.UndefOr[js.Any] = js.undefined
    
    var jwks_uri: js.UndefOr[String] = js.undefined
    
    var load_user_profile: js.UndefOr[Boolean] = js.undefined
    
    var metadata: js.UndefOr[js.Any] = js.undefined
    
    var persist: js.UndefOr[Boolean] = js.undefined
    
    var persistKey: js.UndefOr[String] = js.undefined
    
    var popup_redirect_uri: js.UndefOr[String] = js.undefined
    
    var post_logout_redirect_uri: js.UndefOr[String] = js.undefined
    
    var redirect_uri: js.UndefOr[String] = js.undefined
    
    var request_state_key: js.UndefOr[String] = js.undefined
    
    var request_state_store: js.UndefOr[Storage] = js.undefined
    
    var response_type: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var silent_redirect_uri: js.UndefOr[String] = js.undefined
    
    var silent_renew: js.UndefOr[Boolean] = js.undefined
    
    var store: js.UndefOr[Storage] = js.undefined
    
    var userinfo_endpoint: js.UndefOr[String] = js.undefined
  }
  object OidcTokenManagerSettings {
    
    @scala.inline
    def apply(): OidcTokenManagerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OidcTokenManagerSettings]
    }
    
    @scala.inline
    implicit class OidcTokenManagerSettingsMutableBuilder[Self <: OidcTokenManagerSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      @scala.inline
      def setAuthorization_endpoint(value: String): Self = StObject.set(x, "authorization_endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorization_endpointUndefined: Self = StObject.set(x, "authorization_endpoint", js.undefined)
      
      @scala.inline
      def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      @scala.inline
      def setEnd_session_endpoint(value: String): Self = StObject.set(x, "end_session_endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd_session_endpointUndefined: Self = StObject.set(x, "end_session_endpoint", js.undefined)
      
      @scala.inline
      def setJwks(value: js.Any): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
      
      @scala.inline
      def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwks_uriUndefined: Self = StObject.set(x, "jwks_uri", js.undefined)
      
      @scala.inline
      def setLoad_user_profile(value: Boolean): Self = StObject.set(x, "load_user_profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoad_user_profileUndefined: Self = StObject.set(x, "load_user_profile", js.undefined)
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistKey(value: String): Self = StObject.set(x, "persistKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistKeyUndefined: Self = StObject.set(x, "persistKey", js.undefined)
      
      @scala.inline
      def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      @scala.inline
      def setPopup_redirect_uri(value: String): Self = StObject.set(x, "popup_redirect_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopup_redirect_uriUndefined: Self = StObject.set(x, "popup_redirect_uri", js.undefined)
      
      @scala.inline
      def setPost_logout_redirect_uri(value: String): Self = StObject.set(x, "post_logout_redirect_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPost_logout_redirect_uriUndefined: Self = StObject.set(x, "post_logout_redirect_uri", js.undefined)
      
      @scala.inline
      def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
      
      @scala.inline
      def setRequest_state_key(value: String): Self = StObject.set(x, "request_state_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_state_keyUndefined: Self = StObject.set(x, "request_state_key", js.undefined)
      
      @scala.inline
      def setRequest_state_store(value: Storage): Self = StObject.set(x, "request_state_store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_state_storeUndefined: Self = StObject.set(x, "request_state_store", js.undefined)
      
      @scala.inline
      def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSilent_redirect_uri(value: String): Self = StObject.set(x, "silent_redirect_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent_redirect_uriUndefined: Self = StObject.set(x, "silent_redirect_uri", js.undefined)
      
      @scala.inline
      def setSilent_renew(value: Boolean): Self = StObject.set(x, "silent_renew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent_renewUndefined: Self = StObject.set(x, "silent_renew", js.undefined)
      
      @scala.inline
      def setStore(value: Storage): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setUserinfo_endpoint(value: String): Self = StObject.set(x, "userinfo_endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserinfo_endpointUndefined: Self = StObject.set(x, "userinfo_endpoint", js.undefined)
    }
  }
  
  @js.native
  trait OidcTokenManagerStatic
    extends StObject
       with Instantiable0[OidcTokenManager]
       with Instantiable1[/* settings */ OidcTokenManagerSettings, OidcTokenManager] {
    
    def setHttpRequest(httpRequest: DefaultHttpRequest): Unit = js.native
    
    def setPromiseFactory(promiseFactory: DefaultPromiseFactory): Unit = js.native
  }
  
  trait PopupSettings extends StObject {
    
    var features: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object PopupSettings {
    
    @scala.inline
    def apply(): PopupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupSettings]
    }
    
    @scala.inline
    implicit class PopupSettingsMutableBuilder[Self <: PopupSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatures(value: String): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
