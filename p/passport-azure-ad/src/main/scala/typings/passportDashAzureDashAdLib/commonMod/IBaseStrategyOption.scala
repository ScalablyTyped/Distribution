package typings
package passportDashAzureDashAdLib.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseStrategyOption extends js.Object {
  var clientID: java.lang.String
  var clockSkew: js.UndefOr[scala.Double] = js.undefined
  var identityMetadata: java.lang.String
  var isB2C: js.UndefOr[scala.Boolean] = js.undefined
  var issuer: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var loggingLevel: js.UndefOr[
    passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.info | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.warn | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.error
  ] = js.undefined
  var loggingNoPII: js.UndefOr[scala.Boolean] = js.undefined
  var validateIssuer: js.UndefOr[scala.Boolean] = js.undefined
}

object IBaseStrategyOption {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    identityMetadata: java.lang.String,
    clockSkew: scala.Int | scala.Double = null,
    isB2C: js.UndefOr[scala.Boolean] = js.undefined,
    issuer: java.lang.String | js.Array[java.lang.String] = null,
    loggingLevel: passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.info | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.warn | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.error = null,
    loggingNoPII: js.UndefOr[scala.Boolean] = js.undefined,
    validateIssuer: js.UndefOr[scala.Boolean] = js.undefined
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

