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

object IBearerStrategyOption {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    identityMetadata: java.lang.String,
    allowMultiAudiencesInToken: js.UndefOr[scala.Boolean] = js.undefined,
    audience: java.lang.String | js.Array[java.lang.String] = null,
    clockSkew: scala.Int | scala.Double = null,
    isB2C: js.UndefOr[scala.Boolean] = js.undefined,
    issuer: java.lang.String | js.Array[java.lang.String] = null,
    loggingLevel: passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.info | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.warn | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.error = null,
    loggingNoPII: js.UndefOr[scala.Boolean] = js.undefined,
    policyName: nodeLib.String = null,
    scope: js.Array[java.lang.String] = null,
    validateIssuer: js.UndefOr[scala.Boolean] = js.undefined
  ): IBearerStrategyOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("identityMetadata")(identityMetadata)
    if (!js.isUndefined(allowMultiAudiencesInToken)) __obj.updateDynamic("allowMultiAudiencesInToken")(allowMultiAudiencesInToken)
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (clockSkew != null) __obj.updateDynamic("clockSkew")(clockSkew.asInstanceOf[js.Any])
    if (!js.isUndefined(isB2C)) __obj.updateDynamic("isB2C")(isB2C)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loggingNoPII)) __obj.updateDynamic("loggingNoPII")(loggingNoPII)
    if (policyName != null) __obj.updateDynamic("policyName")(policyName)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(validateIssuer)) __obj.updateDynamic("validateIssuer")(validateIssuer)
    __obj.asInstanceOf[IBearerStrategyOption]
  }
}

