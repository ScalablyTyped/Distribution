package typings
package naverDashWhaleLib.whaleNs.privacyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Services extends js.Object {
  var alternateErrorPagesEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var autofillEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 42. */
  var hotwordSearchEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var instantEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 38. */
  var passwordSavingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var safeBrowsingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 42. */
  var safeBrowsingExtendedReportingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var searchSuggestEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** since Chrome 20. */
  var spellingServiceEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var translationServiceEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
}

object Services {
  @scala.inline
  def apply(
    alternateErrorPagesEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    autofillEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    hotwordSearchEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    instantEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    passwordSavingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    safeBrowsingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    safeBrowsingExtendedReportingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    searchSuggestEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    spellingServiceEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    translationServiceEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  ): Services = {
    val __obj = js.Dynamic.literal(alternateErrorPagesEnabled = alternateErrorPagesEnabled, autofillEnabled = autofillEnabled, hotwordSearchEnabled = hotwordSearchEnabled, instantEnabled = instantEnabled, passwordSavingEnabled = passwordSavingEnabled, safeBrowsingEnabled = safeBrowsingEnabled, safeBrowsingExtendedReportingEnabled = safeBrowsingExtendedReportingEnabled, searchSuggestEnabled = searchSuggestEnabled, spellingServiceEnabled = spellingServiceEnabled, translationServiceEnabled = translationServiceEnabled)
  
    __obj.asInstanceOf[Services]
  }
}

