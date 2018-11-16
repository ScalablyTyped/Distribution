package typings
package photonuiLib.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Translation")
@js.native
class Translation () extends Base {
  var locale: java.lang.String = js.native
  def addCatalogs(catalogs: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def enableDomScan(enable: scala.Boolean): scala.Unit = js.native
  def gettext(string: java.lang.String): java.lang.String = js.native
  def gettext(string: java.lang.String, replacements: ScalablyTyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def guessUserLanguage(): java.lang.String = js.native
  def lazyGettext(string: java.lang.String): java.lang.String = js.native
  def lazyGettext(string: java.lang.String, replacements: ScalablyTyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def updateDomTranslation(): scala.Unit = js.native
}

