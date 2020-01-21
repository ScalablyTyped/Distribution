package typings.passportLinkedinOauth2.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-linkedin-oauth2", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.mod.Strategy {
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction) = this()
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

