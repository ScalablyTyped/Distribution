package typings.passportCognito.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-cognito", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.mod.Strategy {
  def this(options: CognitoStrategyOptions, verify: CognitoVerifyFunction) = this()
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

