package typings.passportDashHttpDashBearer.passportDashHttpDashBearerMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-http-bearer", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.passportMod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: IStrategyOptions, verify: VerifyFunction) = this()
  def this(options: IStrategyOptions, verify: VerifyFunctionWithRequest) = this()
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}

