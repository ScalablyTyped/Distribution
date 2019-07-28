package typings.passportDashAzureDashAd.passportDashAzureDashAdMod

import typings.passportDashAzureDashAd.oidcDashStrategyMod.IOIDCStrategyOption
import typings.passportDashAzureDashAd.oidcDashStrategyMod.IOIDCStrategyOptionWithRequest
import typings.passportDashAzureDashAd.oidcDashStrategyMod.VerifyOIDCFunction
import typings.passportDashAzureDashAd.oidcDashStrategyMod.VerifyOIDCFunctionWithReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-azure-ad", "OIDCStrategy")
@js.native
class OIDCStrategy protected ()
  extends typings.passportDashAzureDashAd.oidcDashStrategyMod.OIDCStrategy {
  def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
  def this(options: IOIDCStrategyOption, verify: VerifyOIDCFunction) = this()
}

