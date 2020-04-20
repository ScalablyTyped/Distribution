package typings.naverWhale.whale.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedLanguage extends js.Object {
  /** An ISO language code such as 'en' or 'fr'.
    * For a complete list of languages supported by this method, see  [kLanguageInfoTable]{@link https://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc}.
    * For an unknown language, 'und' will be returned, which means that [percentage] of the text is unknown to CLD */
  var language: String
  /** The percentage of the detected language */
  var percentage: Double
}

object DetectedLanguage {
  @scala.inline
  def apply(language: String, percentage: Double): DetectedLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedLanguage]
  }
}

