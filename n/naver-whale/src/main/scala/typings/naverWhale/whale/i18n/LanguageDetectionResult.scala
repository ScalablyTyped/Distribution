package typings.naverWhale.whale.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageDetectionResult extends js.Object {
  /** CLD detected language reliability */
  var isReliable: Boolean
  /** Array of detectedLanguage */
  var languages: js.Array[typings.chrome.chrome.i18n.DetectedLanguage]
}

object LanguageDetectionResult {
  @scala.inline
  def apply(isReliable: Boolean, languages: js.Array[typings.chrome.chrome.i18n.DetectedLanguage]): LanguageDetectionResult = {
    val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectionResult]
  }
}

