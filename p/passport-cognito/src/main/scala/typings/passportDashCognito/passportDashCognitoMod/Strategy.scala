package typings.passportDashCognito.passportDashCognitoMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-cognito", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.passportMod.Strategy {
  def this(options: CognitoStrategyOptions, verify: CognitoVerifyFunction) = this()
  @JSName("name")
  var name_Strategy: String = js.native
  def authenticate(req: Request[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}

