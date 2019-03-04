package typings
package meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/universe:i18n", "i18n")
@js.native
object i18nNs extends js.Object {
  def __(key: java.lang.String*): java.lang.String = js.native
  def __(key: java.lang.String): java.lang.String = js.native
  def __(
    key: java.lang.String,
    params: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.GetTranslationParams
  ): java.lang.String = js.native
  def __(
    namespace: java.lang.String,
    key: java.lang.String,
    params: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.GetTranslationParams
  ): java.lang.String = js.native
  // tslint:disable-next-line unified-signatures
  def addTranslation(
    locale: java.lang.String,
    namespace: java.lang.String,
    key: java.lang.String,
    translation: java.lang.String
  ): scala.Unit = js.native
  // translation setter / getter functions
  def addTranslation(locale: java.lang.String, namespace: java.lang.String, translation: java.lang.String): scala.Unit = js.native
  def addTranslations(locale: java.lang.String, namespace: java.lang.String, translationsMap: js.Object): scala.Unit = js.native
  def addTranslations(locale: java.lang.String, translationsMap: js.Object): scala.Unit = js.native
  // component functions
  def createComponent(): org.scalablytyped.runtime.Instantiable0[
    reactLib.reactMod.Component[
      meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.ReactComponentProps, 
      js.Object, 
      js.Any
    ]
  ] = js.native
  def createComponent(translator: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.Translator): org.scalablytyped.runtime.Instantiable0[
    reactLib.reactMod.Component[
      meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.ReactComponentProps, 
      js.Object, 
      js.Any
    ]
  ] = js.native
  def createComponent(
    translator: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.Translator,
    locale: java.lang.String
  ): org.scalablytyped.runtime.Instantiable0[
    reactLib.reactMod.Component[
      meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.ReactComponentProps, 
      js.Object, 
      js.Any
    ]
  ] = js.native
  def createComponent(
    translator: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.Translator,
    locale: java.lang.String,
    reactjs: reactLib.reactMod.ReactNs.ReactInstance
  ): org.scalablytyped.runtime.Instantiable0[
    reactLib.reactMod.Component[
      meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.ReactComponentProps, 
      js.Object, 
      js.Any
    ]
  ] = js.native
  def createComponent(
    translator: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.Translator,
    locale: java.lang.String,
    reactjs: reactLib.reactMod.ReactNs.ReactInstance,
    `type`: js.Any
  ): org.scalablytyped.runtime.Instantiable0[
    reactLib.reactMod.Component[
      meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.ReactComponentProps, 
      js.Object, 
      js.Any
    ]
  ] = js.native
  def createReactiveTranslator(namespace: java.lang.String, locale: java.lang.String): org.scalablytyped.runtime.Instantiable0[reactLib.reactMod.Component[js.Object, js.Object, js.Any]] = js.native
  // translator functions
  def createTranslator(namespace: java.lang.String): meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.Translator = js.native
  def createTranslator(
    namespace: java.lang.String,
    options: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.TranslaterOptions
  ): meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.Translator = js.native
  def getAllKeysForLocale(): js.Array[java.lang.String] = js.native
  def getAllKeysForLocale(locale: java.lang.String): js.Array[java.lang.String] = js.native
  def getAllKeysForLocale(locale: java.lang.String, excactlyThis: scala.Boolean): js.Array[java.lang.String] = js.native
  def getCurrencyCodes(): js.Array[java.lang.String] = js.native
  def getCurrencyCodes(locale: java.lang.String): js.Array[java.lang.String] = js.native
  // currency symbols
  def getCurrencySymbol(): js.UndefOr[java.lang.String] = js.native
  def getCurrencySymbol(locale: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getLanguageName(): java.lang.String = js.native
  def getLanguageName(locale: java.lang.String): java.lang.String = js.native
  def getLanguageNativeName(): java.lang.String = js.native
  def getLanguageNativeName(locale: java.lang.String): java.lang.String = js.native
  // language getters
  def getLanguages(): js.Array[java.lang.String] = js.native
  @JSName("getLanguages")
  def getLanguages_code(`type`: meteorDashUniverseDashI18nLib.meteorDashUniverseDashI18nLibStrings.code): js.Array[java.lang.String] = js.native
  @JSName("getLanguages")
  def getLanguages_name(`type`: meteorDashUniverseDashI18nLib.meteorDashUniverseDashI18nLibStrings.name): js.Array[java.lang.String] = js.native
  @JSName("getLanguages")
  def getLanguages_nativeNames(`type`: meteorDashUniverseDashI18nLib.meteorDashUniverseDashI18nLibStrings.nativeNames): js.Array[java.lang.String] = js.native
  def getLocale(): java.lang.String = js.native
  def getTranslation(key: java.lang.String*): java.lang.String = js.native
  def getTranslation(key: java.lang.String): java.lang.String = js.native
  def getTranslation(
    key: java.lang.String,
    params: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.GetTranslationParams
  ): java.lang.String = js.native
  def getTranslation(
    namespace: java.lang.String,
    key: java.lang.String,
    params: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.GetTranslationParams
  ): java.lang.String = js.native
  def getTranslations(namespace: java.lang.String): js.Array[java.lang.String] = js.native
  def getTranslations(namespace: java.lang.String, locale: java.lang.String): js.Array[java.lang.String] = js.native
  // others
  def isRTL(): scala.Boolean = js.native
  def isRTL(locale: java.lang.String): scala.Boolean = js.native
  def loadLocale(locale: java.lang.String): scala.Unit = js.native
  def loadLocale(
    locale: java.lang.String,
    params: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.LoadLocaleParams
  ): scala.Unit = js.native
  def offChangeLocale(callback: js.Function1[/* locale */ java.lang.String, scala.Unit]): scala.Unit = js.native
  // events
  def onChangeLocale(callback: js.Function1[/* locale */ java.lang.String, scala.Unit]): scala.Unit = js.native
  // number operations
  def parseNumber(number: java.lang.String): java.lang.String = js.native
  def parseNumber(number: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  // executes function in the locale context,
  // it means that every default locale used inside a called function will be set to a passed locale
  // keep in mind that locale must be loaded first (if it is not bundled)
  def runWithLocale(locale: java.lang.String, func: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  // locale setter / getter
  def setLocale(locale: java.lang.String): js.Promise[scala.Unit] = js.native
  def setLocale(
    locale: java.lang.String,
    params: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.LocateParams
  ): js.Promise[scala.Unit] = js.native
  def setLocaleOnConnection(locale: java.lang.String): scala.Unit = js.native
  def setLocaleOnConnection(locale: java.lang.String, connectionId: scala.Double): scala.Unit = js.native
  // options setter
  def setOptions(options: meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`.i18nOptions): scala.Unit = js.native
}

