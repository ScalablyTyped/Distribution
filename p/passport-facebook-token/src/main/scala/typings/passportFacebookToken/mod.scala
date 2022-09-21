package typings.passportFacebookToken

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Request_
import typings.passportFacebookToken.passportFacebookTokenBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("passport-facebook-token", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StrategyInstance {
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
  }
  @JSImport("passport-facebook-token", JSImport.Namespace)
  @js.native
  val ^ : StrategyStatic = js.native
  
  trait Profile
    extends StObject
       with typings.passport.mod.Profile {
    
    var _json: Any
    
    var _raw: String
    
    var gender: String
  }
  object Profile {
    
    inline def apply(_json: Any, _raw: String, displayName: String, gender: String, id: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def set_json(value: Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      inline def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrategyInstance extends StObject {
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Unit = js.native
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: Any
    ): Unit = js.native
    
    var name: String = js.native
  }
  
  trait StrategyOptions extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var clientID: String
    
    var clientSecret: String
    
    var enableProof: js.UndefOr[Boolean] = js.undefined
    
    var fbGraphVersion: js.UndefOr[String] = js.undefined
    
    var profileFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    extension [Self <: StrategyOptions](x: Self) {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setEnableProof(value: Boolean): Self = StObject.set(x, "enableProof", value.asInstanceOf[js.Any])
      
      inline def setEnableProofUndefined: Self = StObject.set(x, "enableProof", js.undefined)
      
      inline def setFbGraphVersion(value: String): Self = StObject.set(x, "fbGraphVersion", value.asInstanceOf[js.Any])
      
      inline def setFbGraphVersionUndefined: Self = StObject.set(x, "fbGraphVersion", js.undefined)
      
      inline def setProfileFields(value: js.Array[String]): Self = StObject.set(x, "profileFields", value.asInstanceOf[js.Any])
      
      inline def setProfileFieldsUndefined: Self = StObject.set(x, "profileFields", js.undefined)
      
      inline def setProfileFieldsVarargs(value: String*): Self = StObject.set(x, "profileFields", js.Array(value*))
      
      inline def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  trait StrategyOptionsWithRequest
    extends StObject
       with StrategyOptions {
    
    var passReqToCallback: `true`
  }
  object StrategyOptionsWithRequest {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    extension [Self <: StrategyOptionsWithRequest](x: Self) {
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrategyStatic
    extends StObject
       with Instantiable2[
          (/* options */ StrategyOptions) | (/* options */ StrategyOptionsWithRequest), 
          (/* verify */ VerifyFunction) | (/* verify */ VerifyFunctionWithRequest), 
          StrategyInstance
        ]
  
  trait ValueObject extends StObject {
    
    var value: String
  }
  object ValueObject {
    
    inline def apply(value: String): ValueObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueObject]
    }
    
    extension [Self <: ValueObject](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function4[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Profile, 
    /* done */ js.Function3[/* error */ Any, /* user */ js.UndefOr[Any], /* info */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Profile, 
    /* done */ js.Function3[/* error */ Any, /* user */ js.UndefOr[Any], /* info */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  type _To = StrategyStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: StrategyStatic = ^
}
