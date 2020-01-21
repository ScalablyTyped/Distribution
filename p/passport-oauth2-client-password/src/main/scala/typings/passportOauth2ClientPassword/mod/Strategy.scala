package typings.passportOauth2ClientPassword.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-oauth2-client-password", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.mod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: StrategyOptionsWithRequestInterface, verify: VerifyFunctionWithRequest) = this()
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

