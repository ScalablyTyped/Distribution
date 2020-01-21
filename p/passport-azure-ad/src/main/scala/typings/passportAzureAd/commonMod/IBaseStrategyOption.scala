package typings.passportAzureAd.commonMod

import typings.passportAzureAd.passportAzureAdStrings.error
import typings.passportAzureAd.passportAzureAdStrings.info
import typings.passportAzureAd.passportAzureAdStrings.warn
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
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any])
    if (clockSkew != null) __obj.updateDynamic("clockSkew")(clockSkew.asInstanceOf[js.Any])
    if (!js.isUndefined(isB2C)) __obj.updateDynamic("isB2C")(isB2C.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loggingNoPII)) __obj.updateDynamic("loggingNoPII")(loggingNoPII.asInstanceOf[js.Any])
    if (!js.isUndefined(validateIssuer)) __obj.updateDynamic("validateIssuer")(validateIssuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseStrategyOption]
  }
}

