package typings.naverWhale.whale.privacy

import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Websites_ extends js.Object {
  /** @since Chrome 65. */
  var doNotTrackEnabled: ChromeSetting
  var hyperlinkAuditingEnabled: ChromeSetting
  /** @since Chrome 21. Available on Windows and ChromeOS only. */
  var protectedContentEnabled: ChromeSetting
  var referrersEnabled: ChromeSetting
  var thirdPartyCookiesAllowed: ChromeSetting
}

object Websites_ {
  @scala.inline
  def apply(
    doNotTrackEnabled: ChromeSetting,
    hyperlinkAuditingEnabled: ChromeSetting,
    protectedContentEnabled: ChromeSetting,
    referrersEnabled: ChromeSetting,
    thirdPartyCookiesAllowed: ChromeSetting
  ): Websites_ = {
    val __obj = js.Dynamic.literal(doNotTrackEnabled = doNotTrackEnabled.asInstanceOf[js.Any], hyperlinkAuditingEnabled = hyperlinkAuditingEnabled.asInstanceOf[js.Any], protectedContentEnabled = protectedContentEnabled.asInstanceOf[js.Any], referrersEnabled = referrersEnabled.asInstanceOf[js.Any], thirdPartyCookiesAllowed = thirdPartyCookiesAllowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Websites_]
  }
}

