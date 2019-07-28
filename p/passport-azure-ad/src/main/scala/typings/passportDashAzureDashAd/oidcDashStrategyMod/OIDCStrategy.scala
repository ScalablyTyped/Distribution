package typings.passportDashAzureDashAd.oidcDashStrategyMod

import typings.express.expressMod.Request
import typings.passport.passportMod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-azure-ad/oidc-strategy", "OIDCStrategy")
@js.native
class OIDCStrategy protected () extends Strategy {
  def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
  def this(options: IOIDCStrategyOption, verify: VerifyOIDCFunction) = this()
  @JSName("name")
  var name_OIDCStrategy: String = js.native
  def authenticate(req: Request): Unit = js.native
  def authenticate(req: Request, options: js.Object): Unit = js.native
}

