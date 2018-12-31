package typings
package passportDashAzureDashAdLib.bearerDashStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBearerStrategyOption
  extends passportDashAzureDashAdLib.commonMod.IBaseStrategyOption {
  var allowMultiAudiencesInToken: js.UndefOr[scala.Boolean] = js.undefined
  var audience: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var policyName: js.UndefOr[nodeLib.String] = js.undefined
  var scope: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

