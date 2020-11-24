package typings.passportJwt

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.jsonwebtoken.mod.VerifyOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-jwt", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object ExtractJwt extends js.Object {
    
    def fromAuthHeader(): JwtFromRequestFunction = js.native
    
    def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction = js.native
    
    def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction = js.native
    
    def fromBodyField(field_name: String): JwtFromRequestFunction = js.native
    
    def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction = js.native
    
    def fromHeader(header_name: String): JwtFromRequestFunction = js.native
    
    def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction = js.native
  }
  
  @js.native
  class Strategy protected ()
    extends typings.passportStrategy.mod.Strategy {
    def this(opt: StrategyOptions, verify: VerifyCallback) = this()
    def this(opt: StrategyOptions, verify: VerifyCallbackWithRequest) = this()
  }
  
  @js.native
  trait StrategyOptions extends js.Object {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.native
    
    var audience: js.UndefOr[String] = js.native
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.native
    
    var issuer: js.UndefOr[String] = js.native
    
    var jsonWebTokenOptions: js.UndefOr[VerifyOptions] = js.native
    
    def jwtFromRequest(req: Request_[ParamsDictionary, _, _, Query]): String | Null = js.native
    @JSName("jwtFromRequest")
    var jwtFromRequest_Original: JwtFromRequestFunction = js.native
    
    var passReqToCallback: js.UndefOr[Boolean] = js.native
    
    var secretOrKey: js.UndefOr[String | Buffer] = js.native
    
    var secretOrKeyProvider: js.UndefOr[js.Any] = js.native
  }
  
  type JwtFromRequestFunction = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], String | Null]
  
  type VerifiedCallback = js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit]
  
  type VerifyCallback = js.Function2[/* payload */ js.Any, /* done */ VerifiedCallback, Unit]
  
  type VerifyCallbackWithRequest = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* payload */ js.Any, 
    /* done */ VerifiedCallback, 
    Unit
  ]
}
