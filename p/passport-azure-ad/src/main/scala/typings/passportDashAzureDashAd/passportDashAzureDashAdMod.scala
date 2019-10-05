package typings.passportDashAzureDashAd

import typings.passportDashAzureDashAd.bearerDashStrategyMod.IBearerStrategyOption
import typings.passportDashAzureDashAd.bearerDashStrategyMod.IBearerStrategyOptionWithRequest
import typings.passportDashAzureDashAd.bearerDashStrategyMod.VerifyBearerFunction
import typings.passportDashAzureDashAd.bearerDashStrategyMod.VerifyBearerFunctionWithReq
import typings.passportDashAzureDashAd.oidcDashStrategyMod.IOIDCStrategyOptionWithRequest
import typings.passportDashAzureDashAd.oidcDashStrategyMod.IOIDCStrategyOptionWithoutRequest
import typings.passportDashAzureDashAd.oidcDashStrategyMod.VerifyOIDCFunction
import typings.passportDashAzureDashAd.oidcDashStrategyMod.VerifyOIDCFunctionWithReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-azure-ad", JSImport.Namespace)
@js.native
object passportDashAzureDashAdMod extends js.Object {
  @js.native
  class BearerStrategy protected ()
    extends typings.passportDashAzureDashAd.bearerDashStrategyMod.BearerStrategy {
    def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
    def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
  }
  
  @js.native
  class OIDCStrategy protected ()
    extends typings.passportDashAzureDashAd.oidcDashStrategyMod.OIDCStrategy {
    def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
    def this(options: IOIDCStrategyOptionWithoutRequest, verify: VerifyOIDCFunction) = this()
  }
  
}

