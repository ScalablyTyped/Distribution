package typings.passportDashOauth2DashClientDashPassword.passportDashOauth2DashClientDashPasswordMod

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-oauth2-client-password", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.passportMod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: StrategyOptionsWithRequestInterface, verify: VerifyFunctionWithRequest) = this()
  @JSName("name")
  var name_Strategy: String = js.native
  def authenticate(req: Request): Unit = js.native
  def authenticate(req: Request, options: js.Object): Unit = js.native
}

