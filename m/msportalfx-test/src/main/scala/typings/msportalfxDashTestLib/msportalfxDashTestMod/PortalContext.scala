package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalContext extends js.Object {
  var capabilities: msportalfxDashTestLib.Anon_BrowserName
  var chromeDriverPath: js.UndefOr[java.lang.String] = js.undefined
  var features: js.UndefOr[js.Array[Feature]] = js.undefined
  var portalUrl: java.lang.String
  var signInEmail: js.UndefOr[java.lang.String] = js.undefined
  var signInPassword: js.UndefOr[java.lang.String] = js.undefined
  var signInUrl: js.UndefOr[java.lang.String] = js.undefined
  var testExtensions: js.UndefOr[js.Array[TestExtension]] = js.undefined
}

object PortalContext {
  @scala.inline
  def apply(
    capabilities: msportalfxDashTestLib.Anon_BrowserName,
    portalUrl: java.lang.String,
    chromeDriverPath: java.lang.String = null,
    features: js.Array[Feature] = null,
    signInEmail: java.lang.String = null,
    signInPassword: java.lang.String = null,
    signInUrl: java.lang.String = null,
    testExtensions: js.Array[TestExtension] = null
  ): PortalContext = {
    val __obj = js.Dynamic.literal(capabilities = capabilities, portalUrl = portalUrl)
    if (chromeDriverPath != null) __obj.updateDynamic("chromeDriverPath")(chromeDriverPath)
    if (features != null) __obj.updateDynamic("features")(features)
    if (signInEmail != null) __obj.updateDynamic("signInEmail")(signInEmail)
    if (signInPassword != null) __obj.updateDynamic("signInPassword")(signInPassword)
    if (signInUrl != null) __obj.updateDynamic("signInUrl")(signInUrl)
    if (testExtensions != null) __obj.updateDynamic("testExtensions")(testExtensions)
    __obj.asInstanceOf[PortalContext]
  }
}

