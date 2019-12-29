package typings.passportDashJwt

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.jsonwebtoken.jsonwebtokenMod.VerifyOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-jwt", JSImport.Namespace)
@js.native
object passportDashJwtMod extends js.Object {
  @js.native
  class Strategy protected ()
    extends typings.passportDashStrategy.passportDashStrategyMod.Strategy {
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
    @JSName("jwtFromRequest")
    var jwtFromRequest_Original: JwtFromRequestFunction = js.native
    var passReqToCallback: js.UndefOr[Boolean] = js.native
    var secretOrKey: js.UndefOr[String | Buffer] = js.native
    var secretOrKeyProvider: js.UndefOr[js.Any] = js.native
    def jwtFromRequest(req: Request[ParamsDictionary]): String | Null = js.native
  }
  
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
  
  type JwtFromRequestFunction = js.Function1[/* req */ Request[ParamsDictionary], String | Null]
  type VerifiedCallback = js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit]
  type VerifyCallback = js.Function2[/* payload */ js.Any, /* done */ VerifiedCallback, Unit]
  type VerifyCallbackWithRequest = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* payload */ js.Any, 
    /* done */ VerifiedCallback, 
    Unit
  ]
}

