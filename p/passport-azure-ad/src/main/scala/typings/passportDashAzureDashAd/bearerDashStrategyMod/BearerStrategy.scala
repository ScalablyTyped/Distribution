package typings.passportDashAzureDashAd.bearerDashStrategyMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.passport.passportMod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-azure-ad/bearer-strategy", "BearerStrategy")
@js.native
class BearerStrategy protected () extends Strategy {
  def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
  def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
  @JSName("name")
  var name_BearerStrategy: String = js.native
  def authenticate(req: Request[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}

