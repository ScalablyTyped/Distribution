package typings
package passportDashAzureDashAdLib.oidcDashStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOIDCStrategyOption
  extends passportDashAzureDashAdLib.commonMod.IBaseStrategyOption {
  var allowHttpForRedirectUrl: js.UndefOr[scala.Boolean] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var cookieEncryptionKeys: js.UndefOr[js.Array[passportDashAzureDashAdLib.Anon_Key]] = js.undefined
  var nonceLifetime: js.UndefOr[scala.Double] = js.undefined
  var nonceMaxAmount: js.UndefOr[scala.Double] = js.undefined
  var privatePEMKey: js.UndefOr[java.lang.String] = js.undefined
  var redirectUrl: java.lang.String
  var responseMode: passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.query | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.form_post
  var responseType: passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.code | (passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`code id_token`) | (passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`id_token code`) | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.id_token
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var thumbprint: js.UndefOr[java.lang.String] = js.undefined
  var useCookieInsteadOfSession: js.UndefOr[scala.Boolean] = js.undefined
}

