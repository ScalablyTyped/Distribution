package typings.passportDashAzureDashAd.passportDashAzureDashAdMod

import typings.passportDashAzureDashAd.bearerDashStrategyMod.IBearerStrategyOption
import typings.passportDashAzureDashAd.bearerDashStrategyMod.IBearerStrategyOptionWithRequest
import typings.passportDashAzureDashAd.bearerDashStrategyMod.VerifyBearerFunction
import typings.passportDashAzureDashAd.bearerDashStrategyMod.VerifyBearerFunctionWithReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-azure-ad", "BearerStrategy")
@js.native
class BearerStrategy protected ()
  extends typings.passportDashAzureDashAd.bearerDashStrategyMod.BearerStrategy {
  def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
  def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
}

