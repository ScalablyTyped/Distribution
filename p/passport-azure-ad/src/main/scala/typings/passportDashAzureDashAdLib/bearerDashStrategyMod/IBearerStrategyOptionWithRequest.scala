package typings
package passportDashAzureDashAdLib.bearerDashStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBearerStrategyOptionWithRequest extends IBearerStrategyOption {
  var passReqToCallback: passportDashAzureDashAdLib.passportDashAzureDashAdLibNumbers.`true`
}

object IBearerStrategyOptionWithRequest {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    identityMetadata: java.lang.String,
    passReqToCallback: passportDashAzureDashAdLib.passportDashAzureDashAdLibNumbers.`true`,
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
  ): IBearerStrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("identityMetadata")(identityMetadata)
    __obj.updateDynamic("passReqToCallback")(passReqToCallback)
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
    __obj.asInstanceOf[IBearerStrategyOptionWithRequest]
  }
}

