package typings.passportAzureAd

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.Strategy
import typings.passportAzureAd.anon.FamilyName
import typings.passportAzureAd.anon.Iv
import typings.passportAzureAd.commonMod.IBaseStrategyOption
import typings.passportAzureAd.commonMod.VerifyCallback
import typings.passportAzureAd.passportAzureAdBooleans.`false`
import typings.passportAzureAd.passportAzureAdBooleans.`true`
import typings.passportAzureAd.passportAzureAdStrings.`code id_token`
import typings.passportAzureAd.passportAzureAdStrings.`id_token code`
import typings.passportAzureAd.passportAzureAdStrings.code
import typings.passportAzureAd.passportAzureAdStrings.form_post
import typings.passportAzureAd.passportAzureAdStrings.id_token
import typings.passportAzureAd.passportAzureAdStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oidcStrategyMod {
  
  @JSImport("passport-azure-ad/oidc-strategy", "OIDCStrategy")
  @js.native
  class OIDCStrategy protected () extends Strategy {
    def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
    def this(options: IOIDCStrategyOptionWithoutRequest, verify: VerifyOIDCFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
    
    @JSName("name")
    var name_OIDCStrategy: String = js.native
  }
  
  @js.native
  trait IOIDCStrategyOption extends IBaseStrategyOption {
    
    var allowHttpForRedirectUrl: js.UndefOr[Boolean] = js.native
    
    var clientSecret: js.UndefOr[String] = js.native
    
    var cookieEncryptionKeys: js.UndefOr[js.Array[Iv]] = js.native
    
    var cookieSameSite: js.UndefOr[Boolean] = js.native
    
    var nonceLifetime: js.UndefOr[Double] = js.native
    
    var nonceMaxAmount: js.UndefOr[Double] = js.native
    
    var privatePEMKey: js.UndefOr[String] = js.native
    
    var redirectUrl: String = js.native
    
    var responseMode: query | form_post = js.native
    
    var responseType: code | (`code id_token`) | (`id_token code`) | id_token = js.native
    
    var scope: js.UndefOr[String | js.Array[String]] = js.native
    
    var thumbprint: js.UndefOr[String] = js.native
    
    var useCookieInsteadOfSession: js.UndefOr[Boolean] = js.native
  }
  object IOIDCStrategyOption {
    
    @scala.inline
    def apply(
      clientID: String,
      identityMetadata: String,
      redirectUrl: String,
      responseMode: query | form_post,
      responseType: code | (`code id_token`) | (`id_token code`) | id_token
    ): IOIDCStrategyOption = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOIDCStrategyOption]
    }
    
    @scala.inline
    implicit class IOIDCStrategyOptionMutableBuilder[Self <: IOIDCStrategyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHttpForRedirectUrl(value: Boolean): Self = StObject.set(x, "allowHttpForRedirectUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHttpForRedirectUrlUndefined: Self = StObject.set(x, "allowHttpForRedirectUrl", js.undefined)
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      @scala.inline
      def setCookieEncryptionKeys(value: js.Array[Iv]): Self = StObject.set(x, "cookieEncryptionKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieEncryptionKeysUndefined: Self = StObject.set(x, "cookieEncryptionKeys", js.undefined)
      
      @scala.inline
      def setCookieEncryptionKeysVarargs(value: Iv*): Self = StObject.set(x, "cookieEncryptionKeys", js.Array(value :_*))
      
      @scala.inline
      def setCookieSameSite(value: Boolean): Self = StObject.set(x, "cookieSameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieSameSiteUndefined: Self = StObject.set(x, "cookieSameSite", js.undefined)
      
      @scala.inline
      def setNonceLifetime(value: Double): Self = StObject.set(x, "nonceLifetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceLifetimeUndefined: Self = StObject.set(x, "nonceLifetime", js.undefined)
      
      @scala.inline
      def setNonceMaxAmount(value: Double): Self = StObject.set(x, "nonceMaxAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceMaxAmountUndefined: Self = StObject.set(x, "nonceMaxAmount", js.undefined)
      
      @scala.inline
      def setPrivatePEMKey(value: String): Self = StObject.set(x, "privatePEMKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivatePEMKeyUndefined: Self = StObject.set(x, "privatePEMKey", js.undefined)
      
      @scala.inline
      def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseMode(value: query | form_post): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseType(value: code | (`code id_token`) | (`id_token code`) | id_token): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
      
      @scala.inline
      def setUseCookieInsteadOfSession(value: Boolean): Self = StObject.set(x, "useCookieInsteadOfSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCookieInsteadOfSessionUndefined: Self = StObject.set(x, "useCookieInsteadOfSession", js.undefined)
    }
  }
  
  @js.native
  trait IOIDCStrategyOptionWithRequest extends IOIDCStrategyOption {
    
    var passReqToCallback: `true` = js.native
  }
  object IOIDCStrategyOptionWithRequest {
    
    @scala.inline
    def apply(
      clientID: String,
      identityMetadata: String,
      passReqToCallback: `true`,
      redirectUrl: String,
      responseMode: query | form_post,
      responseType: code | (`code id_token`) | (`id_token code`) | id_token
    ): IOIDCStrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOIDCStrategyOptionWithRequest]
    }
    
    @scala.inline
    implicit class IOIDCStrategyOptionWithRequestMutableBuilder[Self <: IOIDCStrategyOptionWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOIDCStrategyOptionWithoutRequest extends IOIDCStrategyOption {
    
    var passReqToCallback: `false` = js.native
  }
  object IOIDCStrategyOptionWithoutRequest {
    
    @scala.inline
    def apply(
      clientID: String,
      identityMetadata: String,
      passReqToCallback: `false`,
      redirectUrl: String,
      responseMode: query | form_post,
      responseType: code | (`code id_token`) | (`id_token code`) | id_token
    ): IOIDCStrategyOptionWithoutRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOIDCStrategyOptionWithoutRequest]
    }
    
    @scala.inline
    implicit class IOIDCStrategyOptionWithoutRequestMutableBuilder[Self <: IOIDCStrategyOptionWithoutRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProfile extends StObject {
    
    var _json: js.UndefOr[js.Any] = js.native
    
    var _raw: js.UndefOr[String] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var emails: js.UndefOr[js.Any] = js.native
    
    var name: js.UndefOr[FamilyName] = js.native
    
    var oid: js.UndefOr[String] = js.native
    
    var sub: js.UndefOr[String] = js.native
    
    var upn: js.UndefOr[String] = js.native
  }
  object IProfile {
    
    @scala.inline
    def apply(): IProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProfile]
    }
    
    @scala.inline
    implicit class IProfileMutableBuilder[Self <: IProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setEmails(value: js.Any): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      @scala.inline
      def setName(value: FamilyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOidUndefined: Self = StObject.set(x, "oid", js.undefined)
      
      @scala.inline
      def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
      
      @scala.inline
      def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpnUndefined: Self = StObject.set(x, "upn", js.undefined)
      
      @scala.inline
      def set_json(value: js.Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_jsonUndefined: Self = StObject.set(x, "_json", js.undefined)
      
      @scala.inline
      def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_rawUndefined: Self = StObject.set(x, "_raw", js.undefined)
    }
  }
  
  type VerifyOIDCFunction = (js.Function2[/* profile */ IProfile, /* done */ VerifyCallback, Unit]) | (js.Function3[/* iss */ String, /* sub */ String, /* done */ VerifyCallback, Unit]) | (js.Function4[
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function6[
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function7[
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function8[
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ])
  
  type VerifyOIDCFunctionWithReq = (js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* profile */ IProfile, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function4[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* iss */ String, 
    /* sub */ String, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function5[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function7[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function8[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function9[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ])
}
