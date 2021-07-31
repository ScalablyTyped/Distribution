package typings.passportSpotify

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportSpotify.anon.Type
import typings.passportSpotify.passportSpotifyBooleans.`false`
import typings.passportSpotify.passportSpotifyBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-spotify", "Strategy")
  @js.native
  class Strategy protected () extends StObject {
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): Unit = js.native
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: js.Object): Unit = js.native
    
    var name: String = js.native
  }
  
  trait Profile extends StObject {
    
    var _json: js.Any
    
    var _raw: String
    
    var country: String
    
    var displayName: String
    
    var emails: js.UndefOr[js.Array[Type]] = js.undefined
    
    var followers: Double | Null
    
    var id: String
    
    var photos: js.Array[String] | Null
    
    var product: String | Null
    
    var profileUrl: String | Null
    
    var provider: String
    
    var username: String
  }
  object Profile {
    
    @scala.inline
    def apply(
      _json: js.Any,
      _raw: String,
      country: String,
      displayName: String,
      id: String,
      provider: String,
      username: String
    ): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], followers = null, photos = null, product = null, profileUrl = null)
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmails(value: js.Array[Type]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      @scala.inline
      def setEmailsVarargs(value: Type*): Self = StObject.set(x, "emails", js.Array(value :_*))
      
      @scala.inline
      def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowersNull: Self = StObject.set(x, "followers", null)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: js.Array[String]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotosNull: Self = StObject.set(x, "photos", null)
      
      @scala.inline
      def setPhotosVarargs(value: String*): Self = StObject.set(x, "photos", js.Array(value :_*))
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductNull: Self = StObject.set(x, "product", null)
      
      @scala.inline
      def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUrlNull: Self = StObject.set(x, "profileUrl", null)
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_json(value: js.Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrategyOptions
    extends StObject
       with StrategyOptionsBase {
    
    var passReqToCallback: js.UndefOr[`false` | Null] = js.undefined
  }
  object StrategyOptions {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackNull: Self = StObject.set(x, "passReqToCallback", null)
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  trait StrategyOptionsBase extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: String
    
    var clientID: String
    
    var clientSecret: String
    
    var scope: js.UndefOr[js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var showDialog: js.UndefOr[Boolean] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
    
    var userProfileURL: js.UndefOr[String] = js.undefined
  }
  object StrategyOptionsBase {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptionsBase = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsBase]
    }
    
    @scala.inline
    implicit class StrategyOptionsBaseMutableBuilder[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setShowDialog(value: Boolean): Self = StObject.set(x, "showDialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDialogUndefined: Self = StObject.set(x, "showDialog", js.undefined)
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
      
      @scala.inline
      def setUserProfileURL(value: String): Self = StObject.set(x, "userProfileURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProfileURLUndefined: Self = StObject.set(x, "userProfileURL", js.undefined)
    }
  }
  
  trait StrategyOptionsWithRequest
    extends StObject
       with StrategyOptionsBase {
    
    var passReqToCallback: `true`
  }
  object StrategyOptionsWithRequest {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionsWithRequestMutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyCallback = js.Function3[
    /* error */ js.UndefOr[Error | Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  
  type VerifyFunction = js.Function5[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Profile, 
    /* done */ VerifyCallback, 
    /* expires_in */ js.UndefOr[Double], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function6[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Profile, 
    /* done */ VerifyCallback, 
    /* expires_in */ js.UndefOr[Double], 
    Unit
  ]
}
