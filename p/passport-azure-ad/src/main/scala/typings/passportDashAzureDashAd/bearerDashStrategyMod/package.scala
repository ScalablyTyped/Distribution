package typings.passportDashAzureDashAd

import typings.express.expressMod.Request
import typings.passportDashAzureDashAd.commonMod.ITokenPayload
import typings.passportDashAzureDashAd.commonMod.VerifyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bearerDashStrategyMod {
  type VerifyBearerFunction = js.Function2[/* token */ ITokenPayload, /* done */ VerifyCallback, Unit]
  type VerifyBearerFunctionWithReq = js.Function3[/* req */ Request, /* token */ ITokenPayload, /* done */ VerifyCallback, Unit]
}
