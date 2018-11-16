package typings
package passportDashAzureDashAdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bearerDashStrategyMod {
  type VerifyBearerFunction = js.Function2[
    /* token */ passportDashAzureDashAdLib.commonMod.ITokenPayload, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyBearerFunctionWithReq = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* token */ passportDashAzureDashAdLib.commonMod.ITokenPayload, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]
}
