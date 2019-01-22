package typings
package passportDashSamlLib.passportDashSamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamlConfig extends js.Object {
  var acceptedClockSkewMs: js.UndefOr[scala.Double] = js.undefined
  var additionalAuthorizeParams: js.UndefOr[js.Any] = js.undefined
  var additionalLogoutParams: js.UndefOr[js.Any] = js.undefined
  // Additional SAML behaviors
  var additionalParams: js.UndefOr[js.Any] = js.undefined
  var attributeConsumingServiceIndex: js.UndefOr[java.lang.String] = js.undefined
  var authnContext: js.UndefOr[java.lang.String] = js.undefined
  var authnRequestBinding: js.UndefOr[java.lang.String] = js.undefined
  var cacheProvider: js.UndefOr[CacheProvider] = js.undefined
  // Core
  var callbackUrl: js.UndefOr[java.lang.String] = js.undefined
  var cert: js.UndefOr[java.lang.String | js.Array[java.lang.String] | CertCallback] = js.undefined
  var decryptionPvk: js.UndefOr[java.lang.String] = js.undefined
  var disableRequestedAuthnContext: js.UndefOr[scala.Boolean] = js.undefined
  var entryPoint: java.lang.String
  var forceAuthn: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var identifierFormat: js.UndefOr[java.lang.String] = js.undefined
  var issuer: java.lang.String
  var logoutCallbackUrl: js.UndefOr[java.lang.String] = js.undefined
  // Logout
  var logoutUrl: js.UndefOr[java.lang.String] = js.undefined
  // Passport
  var name: js.UndefOr[java.lang.String] = js.undefined
  var passReqToCallback: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var privateCert: js.UndefOr[java.lang.String] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var requestIdExpirationPeriodMs: js.UndefOr[scala.Double] = js.undefined
  var signatureAlgorithm: js.UndefOr[
    passportDashSamlLib.passportDashSamlLibStrings.sha1 | passportDashSamlLib.passportDashSamlLibStrings.sha256 | passportDashSamlLib.passportDashSamlLibStrings.sha512
  ] = js.undefined
  var skipRequestCompression: js.UndefOr[scala.Boolean] = js.undefined
  // InResponseTo Validation
  var validateInResponseTo: js.UndefOr[scala.Boolean] = js.undefined
}

