package typings.passportJwt

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.jsonwebtoken.mod.VerifyOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ExtractJwt {
    
    @JSImport("passport-jwt", "ExtractJwt")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromAuthHeader(): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAuthHeader")().asInstanceOf[JwtFromRequestFunction]
    
    @scala.inline
    def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAuthHeaderAsBearerToken")().asInstanceOf[JwtFromRequestFunction]
    
    @scala.inline
    def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAuthHeaderWithScheme")(auth_scheme.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    @scala.inline
    def fromBodyField(field_name: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyField")(field_name.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    @scala.inline
    def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtractors")(extractors.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    @scala.inline
    def fromHeader(header_name: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeader")(header_name.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    @scala.inline
    def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrlQueryParameter")(param_name.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
  }
  
  @JSImport("passport-jwt", "Strategy")
  @js.native
  class Strategy protected ()
    extends typings.passportStrategy.mod.Strategy {
    def this(opt: StrategyOptions, verify: VerifyCallback) = this()
    def this(opt: StrategyOptions, verify: VerifyCallbackWithRequest) = this()
  }
  
  type JwtFromRequestFunction = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], String | Null]
  
  trait StrategyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var audience: js.UndefOr[String] = js.undefined
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var jsonWebTokenOptions: js.UndefOr[VerifyOptions] = js.undefined
    
    def jwtFromRequest(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): String | Null
    @JSName("jwtFromRequest")
    var jwtFromRequest_Original: JwtFromRequestFunction
    
    var passReqToCallback: js.UndefOr[Boolean] = js.undefined
    
    var secretOrKey: js.UndefOr[String | Buffer] = js.undefined
    
    var secretOrKeyProvider: js.UndefOr[js.Any] = js.undefined
  }
  object StrategyOptions {
    
    @scala.inline
    def apply(jwtFromRequest: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String | Null): StrategyOptions = {
      val __obj = js.Dynamic.literal(jwtFromRequest = js.Any.fromFunction1(jwtFromRequest))
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setJsonWebTokenOptions(value: VerifyOptions): Self = StObject.set(x, "jsonWebTokenOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonWebTokenOptionsUndefined: Self = StObject.set(x, "jsonWebTokenOptions", js.undefined)
      
      @scala.inline
      def setJwtFromRequest(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String | Null): Self = StObject.set(x, "jwtFromRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setSecretOrKey(value: String | Buffer): Self = StObject.set(x, "secretOrKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretOrKeyProvider(value: js.Any): Self = StObject.set(x, "secretOrKeyProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretOrKeyProviderUndefined: Self = StObject.set(x, "secretOrKeyProvider", js.undefined)
      
      @scala.inline
      def setSecretOrKeyUndefined: Self = StObject.set(x, "secretOrKey", js.undefined)
    }
  }
  
  type VerifiedCallback = js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit]
  
  type VerifyCallback = js.Function2[/* payload */ js.Any, /* done */ VerifiedCallback, Unit]
  
  type VerifyCallbackWithRequest = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* payload */ js.Any, 
    /* done */ VerifiedCallback, 
    Unit
  ]
}
