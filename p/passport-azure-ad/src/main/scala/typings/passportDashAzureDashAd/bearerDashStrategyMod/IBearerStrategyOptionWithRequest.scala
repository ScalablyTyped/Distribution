package typings.passportDashAzureDashAd.bearerDashStrategyMod

import typings.passportDashAzureDashAd.passportDashAzureDashAdNumbers.`true`
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.error
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.info
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBearerStrategyOptionWithRequest extends IBearerStrategyOption {
  var passReqToCallback: `true`
}

object IBearerStrategyOptionWithRequest {
  @scala.inline
  def apply(
    clientID: String,
    identityMetadata: String,
    passReqToCallback: `true`,
    allowMultiAudiencesInToken: js.UndefOr[Boolean] = js.undefined,
    audience: String | js.Array[String] = null,
    clockSkew: Int | Double = null,
    isB2C: js.UndefOr[Boolean] = js.undefined,
    issuer: String | js.Array[String] = null,
    loggingLevel: info | warn | error = null,
    loggingNoPII: js.UndefOr[Boolean] = js.undefined,
    policyName: String = null,
    scope: js.Array[String] = null,
    validateIssuer: js.UndefOr[Boolean] = js.undefined
  ): IBearerStrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiAudiencesInToken)) __obj.updateDynamic("allowMultiAudiencesInToken")(allowMultiAudiencesInToken.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (clockSkew != null) __obj.updateDynamic("clockSkew")(clockSkew.asInstanceOf[js.Any])
    if (!js.isUndefined(isB2C)) __obj.updateDynamic("isB2C")(isB2C.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loggingNoPII)) __obj.updateDynamic("loggingNoPII")(loggingNoPII.asInstanceOf[js.Any])
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(validateIssuer)) __obj.updateDynamic("validateIssuer")(validateIssuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBearerStrategyOptionWithRequest]
  }
}

