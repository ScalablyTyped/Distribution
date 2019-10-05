package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Translation")
@js.native
class Translation () extends Base {
  var locale: String = js.native
  def addCatalogs(catalogs: StringDictionary[js.Any]): Unit = js.native
  def enableDomScan(enable: Boolean): Unit = js.native
  def gettext(string: String): String = js.native
  def gettext(string: String, replacements: StringDictionary[String]): String = js.native
  def guessUserLanguage(): String = js.native
  def lazyGettext(string: String): String = js.native
  def lazyGettext(string: String, replacements: StringDictionary[String]): String = js.native
  def updateDomTranslation(): Unit = js.native
}

