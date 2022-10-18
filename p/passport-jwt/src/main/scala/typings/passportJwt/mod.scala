package typings.passportJwt

import typings.express.mod.Request_
import typings.jsonwebtoken.mod.VerifyOptions
import typings.node.bufferMod.global.Buffer
import typings.passport.mod.global.Express.User
import typings.passportJwt.passportJwtBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ExtractJwt {
    
    @JSImport("passport-jwt", "ExtractJwt")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromAuthHeader(): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAuthHeader")().asInstanceOf[JwtFromRequestFunction]
    
    inline def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAuthHeaderAsBearerToken")().asInstanceOf[JwtFromRequestFunction]
    
    inline def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAuthHeaderWithScheme")(auth_scheme.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    inline def fromBodyField(field_name: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyField")(field_name.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    inline def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtractors")(extractors.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    inline def fromHeader(header_name: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeader")(header_name.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    inline def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrlQueryParameter")(param_name.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
  }
  
  @JSImport("passport-jwt", "Strategy")
  @js.native
  open class Strategy protected ()
    extends typings.passportStrategy.mod.Strategy {
    def this(opt: StrategyOptions, verify: VerifyCallback) = this()
    def this(opt: StrategyOptions, verify: VerifyCallbackWithRequest) = this()
  }
  
  type JwtFromRequestFunction = js.Function1[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    String | Null
  ]
  
  type SecretOrKeyProvider = js.Function3[
    /* request */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* rawJwtToken */ Any, 
    /* done */ js.Function2[/* err */ Any, /* secretOrKey */ js.UndefOr[String | Buffer], Unit], 
    Unit
  ]
  
  trait StrategyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var audience: js.UndefOr[String] = js.undefined
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var jsonWebTokenOptions: js.UndefOr[VerifyOptions] = js.undefined
    
    def jwtFromRequest(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): String | Null
    @JSName("jwtFromRequest")
    var jwtFromRequest_Original: JwtFromRequestFunction
    
    var passReqToCallback: js.UndefOr[Boolean] = js.undefined
    
    var secretOrKey: js.UndefOr[String | Buffer] = js.undefined
    
    var secretOrKeyProvider: js.UndefOr[SecretOrKeyProvider] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(
      jwtFromRequest: /* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ] => String | Null
    ): StrategyOptions = {
      val __obj = js.Dynamic.literal(jwtFromRequest = js.Any.fromFunction1(jwtFromRequest))
      __obj.asInstanceOf[StrategyOptions]
    }
    
    extension [Self <: StrategyOptions](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setJsonWebTokenOptions(value: VerifyOptions): Self = StObject.set(x, "jsonWebTokenOptions", value.asInstanceOf[js.Any])
      
      inline def setJsonWebTokenOptionsUndefined: Self = StObject.set(x, "jsonWebTokenOptions", js.undefined)
      
      inline def setJwtFromRequest(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => String | Null
      ): Self = StObject.set(x, "jwtFromRequest", js.Any.fromFunction1(value))
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setSecretOrKey(value: String | Buffer): Self = StObject.set(x, "secretOrKey", value.asInstanceOf[js.Any])
      
      inline def setSecretOrKeyProvider(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* rawJwtToken */ Any, /* done */ js.Function2[/* err */ Any, /* secretOrKey */ js.UndefOr[String | Buffer], Unit]) => Unit
      ): Self = StObject.set(x, "secretOrKeyProvider", js.Any.fromFunction3(value))
      
      inline def setSecretOrKeyProviderUndefined: Self = StObject.set(x, "secretOrKeyProvider", js.undefined)
      
      inline def setSecretOrKeyUndefined: Self = StObject.set(x, "secretOrKey", js.undefined)
    }
  }
  
  type VerifiedCallback = js.Function3[
    /* error */ Any, 
    /* user */ js.UndefOr[User | `false`], 
    /* info */ js.UndefOr[Any], 
    Unit
  ]
  
  type VerifyCallback = js.Function2[/* payload */ Any, /* done */ VerifiedCallback, Unit]
  
  type VerifyCallbackWithRequest = js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* payload */ Any, 
    /* done */ VerifiedCallback, 
    Unit
  ]
}
