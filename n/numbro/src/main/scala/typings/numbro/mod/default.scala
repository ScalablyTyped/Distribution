package typings.numbro.mod

import org.scalablytyped.runtime.StringDictionary
import typings.numbro.mod.numbro.Format
import typings.numbro.mod.numbro.Numbro
import typings.numbro.mod.numbro.NumbroLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numbro", JSImport.Default)
@js.native
object default extends js.Object {
  val version: String = js.native
  def apply(): Numbro = js.native
  def apply(value: js.Any): Numbro = js.native
  def defaultCurrencyFormat(newFormat: String): js.Object = js.native
  def defaultFormat(): js.Object = js.native
  def isNumbro(value: js.Any): /* is numbro.numbro.numbro.Numbro */ Boolean = js.native
  def language(): String = js.native
  def languageData(): NumbroLanguage = js.native
  def languageData(tag: String): NumbroLanguage = js.native
  def languages(): StringDictionary[NumbroLanguage] = js.native
  def loadLanguagesInNode(): Unit = js.native
  def registerLanguage(tag: NumbroLanguage): String = js.native
  def registerLanguage(tag: NumbroLanguage, useLanguage: Boolean): String = js.native
  def setDefaults(format: String): Unit = js.native
  def setDefaults(format: Format): Unit = js.native
  def setLanguage(tag: String): Unit = js.native
  def setLanguage(tag: String, fallbackTag: String): Unit = js.native
  def unformat(input: String): Double = js.native
  def unformat(input: String, format: String): Double = js.native
  def unformat(input: String, format: Format): Double = js.native
  def validate(value: String, format: String): Boolean = js.native
  def validate(value: String, format: Format): Boolean = js.native
  def zeroFormat(newFormat: String): Unit = js.native
}

