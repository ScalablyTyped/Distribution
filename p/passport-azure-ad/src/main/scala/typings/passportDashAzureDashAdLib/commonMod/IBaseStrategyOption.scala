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

