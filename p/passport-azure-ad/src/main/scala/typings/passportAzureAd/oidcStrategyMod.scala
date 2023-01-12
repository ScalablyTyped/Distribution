package typings.passportAzureAd

import typings.express.mod.Request_
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
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oidcStrategyMod {
  
  @JSImport("passport-azure-ad/oidc-strategy", "OIDCStrategy")
  @js.native
  open class OIDCStrategy protected ()
    extends StObject
       with Strategy {
    def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
    def this(options: IOIDCStrategyOptionWithoutRequest, verify: VerifyOIDCFunction) = this()
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: js.Object
    ): Unit = js.native
    
    @JSName("name")
    var name_OIDCStrategy: String = js.native
  }
  
  trait IOIDCStrategyOption
    extends StObject
       with IBaseStrategyOption {
    
    var allowHttpForRedirectUrl: js.UndefOr[Boolean] = js.undefined
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var cookieEncryptionKeys: js.UndefOr[js.Array[Iv]] = js.undefined
    
    var cookieSameSite: js.UndefOr[Boolean] = js.undefined
    
    var nonceLifetime: js.UndefOr[Double] = js.undefined
    
    var nonceMaxAmount: js.UndefOr[Double] = js.undefined
    
    var privatePEMKey: js.UndefOr[String] = js.undefined
    
    var redirectUrl: String
    
    var responseMode: query | form_post
    
    var responseType: code | (`code id_token`) | (`id_token code`) | id_token
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var thumbprint: js.UndefOr[String] = js.undefined
    
    var useCookieInsteadOfSession: js.UndefOr[Boolean] = js.undefined
  }
  object IOIDCStrategyOption {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IOIDCStrategyOption] (val x: Self) extends AnyVal {
      
      inline def setAllowHttpForRedirectUrl(value: Boolean): Self = StObject.set(x, "allowHttpForRedirectUrl", value.asInstanceOf[js.Any])
      
      inline def setAllowHttpForRedirectUrlUndefined: Self = StObject.set(x, "allowHttpForRedirectUrl", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setCookieEncryptionKeys(value: js.Array[Iv]): Self = StObject.set(x, "cookieEncryptionKeys", value.asInstanceOf[js.Any])
      
      inline def setCookieEncryptionKeysUndefined: Self = StObject.set(x, "cookieEncryptionKeys", js.undefined)
      
      inline def setCookieEncryptionKeysVarargs(value: Iv*): Self = StObject.set(x, "cookieEncryptionKeys", js.Array(value*))
      
      inline def setCookieSameSite(value: Boolean): Self = StObject.set(x, "cookieSameSite", value.asInstanceOf[js.Any])
      
      inline def setCookieSameSiteUndefined: Self = StObject.set(x, "cookieSameSite", js.undefined)
      
      inline def setNonceLifetime(value: Double): Self = StObject.set(x, "nonceLifetime", value.asInstanceOf[js.Any])
      
      inline def setNonceLifetimeUndefined: Self = StObject.set(x, "nonceLifetime", js.undefined)
      
      inline def setNonceMaxAmount(value: Double): Self = StObject.set(x, "nonceMaxAmount", value.asInstanceOf[js.Any])
      
      inline def setNonceMaxAmountUndefined: Self = StObject.set(x, "nonceMaxAmount", js.undefined)
      
      inline def setPrivatePEMKey(value: String): Self = StObject.set(x, "privatePEMKey", value.asInstanceOf[js.Any])
      
      inline def setPrivatePEMKeyUndefined: Self = StObject.set(x, "privatePEMKey", js.undefined)
      
      inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
      
      inline def setResponseMode(value: query | form_post): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      inline def setResponseType(value: code | (`code id_token`) | (`id_token code`) | id_token): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
      
      inline def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
      
      inline def setUseCookieInsteadOfSession(value: Boolean): Self = StObject.set(x, "useCookieInsteadOfSession", value.asInstanceOf[js.Any])
      
      inline def setUseCookieInsteadOfSessionUndefined: Self = StObject.set(x, "useCookieInsteadOfSession", js.undefined)
    }
  }
  
  trait IOIDCStrategyOptionWithRequest
    extends StObject
       with IOIDCStrategyOption {
    
    var passReqToCallback: `true`
  }
  object IOIDCStrategyOptionWithRequest {
    
    inline def apply(
      clientID: String,
      identityMetadata: String,
      redirectUrl: String,
      responseMode: query | form_post,
      responseType: code | (`code id_token`) | (`id_token code`) | id_token
    ): IOIDCStrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = true, redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOIDCStrategyOptionWithRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOIDCStrategyOptionWithRequest] (val x: Self) extends AnyVal {
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOIDCStrategyOptionWithoutRequest
    extends StObject
       with IOIDCStrategyOption {
    
    var passReqToCallback: `false`
  }
  object IOIDCStrategyOptionWithoutRequest {
    
    inline def apply(
      clientID: String,
      identityMetadata: String,
      redirectUrl: String,
      responseMode: query | form_post,
      responseType: code | (`code id_token`) | (`id_token code`) | id_token
    ): IOIDCStrategyOptionWithoutRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = false, redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOIDCStrategyOptionWithoutRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOIDCStrategyOptionWithoutRequest] (val x: Self) extends AnyVal {
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProfile extends StObject {
    
    var _json: js.UndefOr[Any] = js.undefined
    
    var _raw: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var emails: js.UndefOr[Any] = js.undefined
    
    var name: js.UndefOr[FamilyName] = js.undefined
    
    var oid: js.UndefOr[String] = js.undefined
    
    var sub: js.UndefOr[String] = js.undefined
    
    var upn: js.UndefOr[String] = js.undefined
  }
  object IProfile {
    
    inline def apply(): IProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProfile] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmails(value: Any): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      inline def setName(value: FamilyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setOidUndefined: Self = StObject.set(x, "oid", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
      
      inline def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
      
      inline def setUpnUndefined: Self = StObject.set(x, "upn", js.undefined)
      
      inline def set_json(value: Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      inline def set_jsonUndefined: Self = StObject.set(x, "_json", js.undefined)
      
      inline def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
      
      inline def set_rawUndefined: Self = StObject.set(x, "_raw", js.undefined)
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
    /* params */ Any, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function8[
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* jwtClaims */ Any, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ Any, 
    /* done */ VerifyCallback, 
    Unit
  ])
  
  type VerifyOIDCFunctionWithReq = (js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* profile */ IProfile, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function4[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* iss */ String, 
    /* sub */ String, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function5[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function7[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function8[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ Any, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function9[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* jwtClaims */ Any, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ Any, 
    /* done */ VerifyCallback, 
    Unit
  ])
}
