package typings
package numbroLib.numbroMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numbro", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  val version: java.lang.String = js.native
  def defaultCurrencyFormat(newFormat: java.lang.String): js.Object = js.native
  def defaultFormat(): js.Object = js.native
  def isNumbro(value: js.Any): /* is numbro.numbro.numbro.Numbro */ scala.Boolean = js.native
  def language(): java.lang.String = js.native
  def languageData(): numbroLib.numbroMod.numbroNs.NumbroLanguage = js.native
  def languageData(tag: java.lang.String): numbroLib.numbroMod.numbroNs.NumbroLanguage = js.native
  def languages(): org.scalablytyped.runtime.StringDictionary[numbroLib.numbroMod.numbroNs.NumbroLanguage] = js.native
  def loadLanguagesInNode(): scala.Unit = js.native
  def registerLanguage(tag: numbroLib.numbroMod.numbroNs.NumbroLanguage): java.lang.String = js.native
  def registerLanguage(tag: numbroLib.numbroMod.numbroNs.NumbroLanguage, useLanguage: scala.Boolean): java.lang.String = js.native
  def setLanguage(tag: java.lang.String): scala.Unit = js.native
  def setLanguage(tag: java.lang.String, fallbackTag: java.lang.String): scala.Unit = js.native
  def unformat(input: java.lang.String): scala.Double = js.native
  def unformat(input: java.lang.String, format: java.lang.String): scala.Double = js.native
  def unformat(input: java.lang.String, format: js.Object): scala.Double = js.native
  def validate(value: java.lang.String, format: java.lang.String): scala.Boolean = js.native
  def validate(value: java.lang.String, format: js.Object): scala.Boolean = js.native
  def zeroFormat(newFormat: java.lang.String): scala.Unit = js.native
}

