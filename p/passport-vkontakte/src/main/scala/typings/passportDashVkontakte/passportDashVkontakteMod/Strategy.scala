package typings.passportDashVkontakte.passportDashVkontakteMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-vkontakte", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.passportMod.Strategy {
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  def this(options: StrategyOptions, verify: VerifyFunctionWithParams) = this()
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}

