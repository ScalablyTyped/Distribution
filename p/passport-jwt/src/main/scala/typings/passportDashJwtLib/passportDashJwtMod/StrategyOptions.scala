package typings
package passportDashJwtLib.passportDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptions extends js.Object {
  var algorithms: js.UndefOr[js.Array[java.lang.String]] = js.native
  var audience: js.UndefOr[java.lang.String] = js.native
  var ignoreExpiration: js.UndefOr[scala.Boolean] = js.native
  var issuer: js.UndefOr[java.lang.String] = js.native
  var jsonWebTokenOptions: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.VerifyOptions] = js.native
  @JSName("jwtFromRequest")
  var jwtFromRequest_Original: JwtFromRequestFunction = js.native
  var passReqToCallback: js.UndefOr[scala.Boolean] = js.native
  var secretOrKey: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.native
  var secretOrKeyProvider: js.UndefOr[js.Any] = js.native
  def jwtFromRequest(req: expressLib.expressMod.eNs.Request): java.lang.String = js.native
}

