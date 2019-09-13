package typings.passportDashJwt.passportDashJwtMod

import typings.express.expressMod.Request
import typings.jsonwebtoken.jsonwebtokenMod.VerifyOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def jwtFromRequest(req: Request): String | Null = js.native
}

