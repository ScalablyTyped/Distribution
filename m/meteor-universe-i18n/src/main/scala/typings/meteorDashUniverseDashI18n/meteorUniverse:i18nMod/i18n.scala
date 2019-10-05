package typings.meteorDashUniverseDashI18n.`meteorUniverse:i18nMod`

import org.scalablytyped.runtime.Instantiable0
import typings.meteorDashUniverseDashI18n.meteorDashUniverseDashI18nStrings.code
import typings.meteorDashUniverseDashI18n.meteorDashUniverseDashI18nStrings.name
import typings.meteorDashUniverseDashI18n.meteorDashUniverseDashI18nStrings.nativeNames
import typings.react.reactMod.Component
import typings.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/universe:i18n", "i18n")
@js.native
object i18n extends js.Object {
  def __(key: String*): String = js.native
  def __(key: String): String = js.native
  def __(key: String, params: GetTranslationParams): String = js.native
  def __(namespace: String, key: String, params: GetTranslationParams): String = js.native
  // tslint:disable-next-line unified-signatures
  def addTranslation(locale: String, namespace: String, key: String, translation: String): Unit = js.native
  // translation setter / getter functions
  def addTranslation(locale: String, namespace: String, translation: String): Unit = js.native
  def addTranslations(locale: String, namespace: String, translationsMap: js.Object): Unit = js.native
  def addTranslations(locale: String, translationsMap: js.Object): Unit = js.native
  // component functions
  def createComponent(): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
  def createComponent(translator: Translator): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
  def createComponent(translator: Translator, locale: String): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
  def createComponent(translator: Translator, locale: String, reactjs: ReactInstance): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
  def createComponent(translator: Translator, locale: String, reactjs: ReactInstance, `type`: js.Any): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
  def createReactiveTranslator(namespace: String, locale: String): Instantiable0[Component[js.Object, js.Object, js.Any]] = js.native
  // translator functions
  def createTranslator(namespace: String): Translator = js.native
  def createTranslator(namespace: String, options: TranslaterOptions): Translator = js.native
  def getAllKeysForLocale(): js.Array[String] = js.native
  def getAllKeysForLocale(locale: String): js.Array[String] = js.native
  def getAllKeysForLocale(locale: String, excactlyThis: Boolean): js.Array[String] = js.native
  def getCurrencyCodes(): js.Array[String] = js.native
  def getCurrencyCodes(locale: String): js.Array[String] = js.native
  // currency symbols
  def getCurrencySymbol(): js.UndefOr[String] = js.native
  def getCurrencySymbol(locale: String): js.UndefOr[String] = js.native
  def getLanguageName(): String = js.native
  def getLanguageName(locale: String): String = js.native
  def getLanguageNativeName(): String = js.native
  def getLanguageNativeName(locale: String): String = js.native
  // language getters
  def getLanguages(): js.Array[String] = js.native
  @JSName("getLanguages")
  def getLanguages_code(`type`: code): js.Array[String] = js.native
  @JSName("getLanguages")
  def getLanguages_name(`type`: name): js.Array[String] = js.native
  @JSName("getLanguages")
  def getLanguages_nativeNames(`type`: nativeNames): js.Array[String] = js.native
  def getLocale(): String = js.native
  def getTranslation(key: String*): String = js.native
  def getTranslation(key: String): String = js.native
  def getTranslation(key: String, params: GetTranslationParams): String = js.native
  def getTranslation(namespace: String, key: String, params: GetTranslationParams): String = js.native
  def getTranslations(namespace: String): js.Array[String] = js.native
  def getTranslations(namespace: String, locale: String): js.Array[String] = js.native
  // others
  def isRTL(): Boolean = js.native
  def isRTL(locale: String): Boolean = js.native
  def loadLocale(locale: String): Unit = js.native
  def loadLocale(locale: String, params: LoadLocaleParams): Unit = js.native
  def offChangeLocale(callback: js.Function1[/* locale */ String, Unit]): Unit = js.native
  // events
  def onChangeLocale(callback: js.Function1[/* locale */ String, Unit]): Unit = js.native
  // number operations
  def parseNumber(number: String): String = js.native
  def parseNumber(number: String, locale: String): String = js.native
  // executes function in the locale context,
  // it means that every default locale used inside a called function will be set to a passed locale
  // keep in mind that locale must be loaded first (if it is not bundled)
  def runWithLocale(locale: String, func: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  // locale setter / getter
  def setLocale(locale: String): js.Promise[Unit] = js.native
  def setLocale(locale: String, params: LocateParams): js.Promise[Unit] = js.native
  def setLocaleOnConnection(locale: String): Unit = js.native
  def setLocaleOnConnection(locale: String, connectionId: Double): Unit = js.native
  // options setter
  def setOptions(options: i18nOptions): Unit = js.native
}

