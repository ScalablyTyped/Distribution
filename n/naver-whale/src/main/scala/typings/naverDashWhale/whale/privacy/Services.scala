package typings.naverDashWhale.whale.privacy

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Services extends js.Object {
  var alternateErrorPagesEnabled: ChromeSetting
  var autofillEnabled: ChromeSetting
  /** @since Chrome 42. */
  var hotwordSearchEnabled: ChromeSetting
  var instantEnabled: ChromeSetting
  /** @since Chrome 38. */
  var passwordSavingEnabled: ChromeSetting
  var safeBrowsingEnabled: ChromeSetting
  /** @since Chrome 42. */
  var safeBrowsingExtendedReportingEnabled: ChromeSetting
  var searchSuggestEnabled: ChromeSetting
  /** since Chrome 20. */
  var spellingServiceEnabled: ChromeSetting
  var translationServiceEnabled: ChromeSetting
}

object Services {
  @scala.inline
  def apply(
    alternateErrorPagesEnabled: ChromeSetting,
    autofillEnabled: ChromeSetting,
    hotwordSearchEnabled: ChromeSetting,
    instantEnabled: ChromeSetting,
    passwordSavingEnabled: ChromeSetting,
    safeBrowsingEnabled: ChromeSetting,
    safeBrowsingExtendedReportingEnabled: ChromeSetting,
    searchSuggestEnabled: ChromeSetting,
    spellingServiceEnabled: ChromeSetting,
    translationServiceEnabled: ChromeSetting
  ): Services = {
    val __obj = js.Dynamic.literal(alternateErrorPagesEnabled = alternateErrorPagesEnabled, autofillEnabled = autofillEnabled, hotwordSearchEnabled = hotwordSearchEnabled, instantEnabled = instantEnabled, passwordSavingEnabled = passwordSavingEnabled, safeBrowsingEnabled = safeBrowsingEnabled, safeBrowsingExtendedReportingEnabled = safeBrowsingExtendedReportingEnabled, searchSuggestEnabled = searchSuggestEnabled, spellingServiceEnabled = spellingServiceEnabled, translationServiceEnabled = translationServiceEnabled)
  
    __obj.asInstanceOf[Services]
  }
}

@JSGlobal("chrome.privacy.services")
@js.native
object services
  extends TopLevel[typings.chrome.chrome.privacy.Services]

