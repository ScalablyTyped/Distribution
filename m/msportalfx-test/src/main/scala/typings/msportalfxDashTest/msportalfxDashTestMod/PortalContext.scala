package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.msportalfxDashTest.Anon_BrowserName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalContext extends js.Object {
  var capabilities: Anon_BrowserName
  var chromeDriverPath: js.UndefOr[String] = js.undefined
  var features: js.UndefOr[js.Array[Feature]] = js.undefined
  var portalUrl: String
  var signInEmail: js.UndefOr[String] = js.undefined
  var signInPassword: js.UndefOr[String] = js.undefined
  var signInUrl: js.UndefOr[String] = js.undefined
  var testExtensions: js.UndefOr[js.Array[TestExtension]] = js.undefined
}

object PortalContext {
  @scala.inline
  def apply(
    capabilities: Anon_BrowserName,
    portalUrl: String,
    chromeDriverPath: String = null,
    features: js.Array[Feature] = null,
    signInEmail: String = null,
    signInPassword: String = null,
    signInUrl: String = null,
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

