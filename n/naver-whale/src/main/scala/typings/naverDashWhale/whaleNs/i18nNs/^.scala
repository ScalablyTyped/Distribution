package typings.naverDashWhale.whaleNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.i18n")
@js.native
object ^ extends js.Object {
  def detectLanguage(
    text: String,
    callback: js.Function1[/* result */ typings.chrome.chromeNs.i18nNs.LanguageDetectionResult, Unit]
  ): Unit = js.native
  def getAcceptLanguages(callback: js.Function1[/* languages */ js.Array[String], Unit]): Unit = js.native
  def getMessage(messageName: String): String = js.native
  def getMessage(messageName: String, substitutions: js.Any): String = js.native
  def getUILanguage(): String = js.native
}

