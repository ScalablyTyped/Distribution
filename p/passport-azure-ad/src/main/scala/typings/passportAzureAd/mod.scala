package typings.passportAzureAd

import typings.passportAzureAd.bearerStrategyMod.IBearerStrategyOption
import typings.passportAzureAd.bearerStrategyMod.IBearerStrategyOptionWithRequest
import typings.passportAzureAd.bearerStrategyMod.VerifyBearerFunction
import typings.passportAzureAd.bearerStrategyMod.VerifyBearerFunctionWithReq
import typings.passportAzureAd.oidcStrategyMod.IOIDCStrategyOptionWithRequest
import typings.passportAzureAd.oidcStrategyMod.IOIDCStrategyOptionWithoutRequest
import typings.passportAzureAd.oidcStrategyMod.VerifyOIDCFunction
import typings.passportAzureAd.oidcStrategyMod.VerifyOIDCFunctionWithReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-azure-ad", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class BearerStrategy protected ()
    extends typings.passportAzureAd.bearerStrategyMod.BearerStrategy {
    def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
    def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
  }
  
  @js.native
  class OIDCStrategy protected ()
    extends typings.passportAzureAd.oidcStrategyMod.OIDCStrategy {
    def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
    def this(options: IOIDCStrategyOptionWithoutRequest, verify: VerifyOIDCFunction) = this()
  }
}
