package typings.passportDashAzureDashAd.commonMod

import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.error
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.info
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseStrategyOption extends js.Object {
  var clientID: String
  var clockSkew: js.UndefOr[Double] = js.undefined
  var identityMetadata: String
  var isB2C: js.UndefOr[Boolean] = js.undefined
  var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
  var loggingLevel: js.UndefOr[info | warn | error] = js.undefined
  var loggingNoPII: js.UndefOr[Boolean] = js.undefined
  var validateIssuer: js.UndefOr[Boolean] = js.undefined
}

object IBaseStrategyOption {
  @scala.inline
  def apply(
    clientID: String,
    identityMetadata: String,
    clockSkew: Int | Double = null,
    isB2C: js.UndefOr[Boolean] = js.undefined,
    issuer: String | js.Array[String] = null,
    loggingLevel: info | warn | error = null,
    loggingNoPII: js.UndefOr[Boolean] = js.undefined,
    validateIssuer: js.UndefOr[Boolean] = js.undefined
  ): IBaseStrategyOption = {
    val __obj = js.Dynamic.literal(clientID = clientID, identityMetadata = identityMetadata)
    if (clockSkew != null) __obj.updateDynamic("clockSkew")(clockSkew.asInstanceOf[js.Any])
    if (!js.isUndefined(isB2C)) __obj.updateDynamic("isB2C")(isB2C)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loggingNoPII)) __obj.updateDynamic("loggingNoPII")(loggingNoPII)
    if (!js.isUndefined(validateIssuer)) __obj.updateDynamic("validateIssuer")(validateIssuer)
    __obj.asInstanceOf[IBaseStrategyOption]
  }
}

