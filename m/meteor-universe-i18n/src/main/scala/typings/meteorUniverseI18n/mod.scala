package typings.meteorUniverseI18n

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.meteorUniverseI18n.anon.Partiali18nOptions
import typings.meteorUniverseI18n.meteorUniverseI18nStrings.code
import typings.meteorUniverseI18n.meteorUniverseI18nStrings.name
import typings.meteorUniverseI18n.meteorUniverseI18nStrings.nativeNames
import typings.node.httpMod.OutgoingHttpHeaders
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object mod {
  
  object i18n {
    
    @JSImport("meteor/universe:i18n", "i18n.__")
    @js.native
    def __(key: String*): String = js.native
    @JSImport("meteor/universe:i18n", "i18n.__")
    @js.native
    def __(key: String): String = js.native
    @JSImport("meteor/universe:i18n", "i18n.__")
    @js.native
    def __(key: String, params: GetTranslationParams): String = js.native
    @JSImport("meteor/universe:i18n", "i18n.__")
    @js.native
    def __(namespace: String, key: String, params: GetTranslationParams): String = js.native
    
    // tslint:disable-next-line unified-signatures
    @JSImport("meteor/universe:i18n", "i18n.addTranslation")
    @js.native
    def addTranslation(locale: String, namespace: String, key: String, translation: String): Unit = js.native
    // translation setter / getter functions
    @JSImport("meteor/universe:i18n", "i18n.addTranslation")
    @js.native
    def addTranslation(locale: String, namespace: String, translation: String): Unit = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.addTranslations")
    @js.native
    def addTranslations(locale: String, namespace: String, translationsMap: js.Object): Unit = js.native
    @JSImport("meteor/universe:i18n", "i18n.addTranslations")
    @js.native
    def addTranslations(locale: String, translationsMap: js.Object): Unit = js.native
    
    // component functions
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(
      translator: js.UndefOr[scala.Nothing],
      locale: js.UndefOr[scala.Nothing],
      reactjs: js.UndefOr[ReactInstance],
      `type`: js.Any
    ): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(translator: js.UndefOr[scala.Nothing], locale: js.UndefOr[scala.Nothing], reactjs: ReactInstance): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(translator: js.UndefOr[scala.Nothing], locale: String): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(
      translator: js.UndefOr[scala.Nothing],
      locale: String,
      reactjs: js.UndefOr[ReactInstance],
      `type`: js.Any
    ): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(translator: js.UndefOr[scala.Nothing], locale: String, reactjs: ReactInstance): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(translator: Translator): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(
      translator: Translator,
      locale: js.UndefOr[scala.Nothing],
      reactjs: js.UndefOr[ReactInstance],
      `type`: js.Any
    ): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(translator: Translator, locale: js.UndefOr[scala.Nothing], reactjs: ReactInstance): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(translator: Translator, locale: String): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(translator: Translator, locale: String, reactjs: js.UndefOr[ReactInstance], `type`: js.Any): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    @JSImport("meteor/universe:i18n", "i18n.createComponent")
    @js.native
    def createComponent(translator: Translator, locale: String, reactjs: ReactInstance): Instantiable0[Component[ReactComponentProps, js.Object, js.Any]] = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.createReactiveTranslator")
    @js.native
    def createReactiveTranslator(namespace: String, locale: String): Instantiable0[Component[js.Object, js.Object, js.Any]] = js.native
    
    // translator functions
    @JSImport("meteor/universe:i18n", "i18n.createTranslator")
    @js.native
    def createTranslator(namespace: String): Translator = js.native
    @JSImport("meteor/universe:i18n", "i18n.createTranslator")
    @js.native
    def createTranslator(namespace: String, options: TranslaterOptions): Translator = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.getAllKeysForLocale")
    @js.native
    def getAllKeysForLocale(): js.Array[String] = js.native
    @JSImport("meteor/universe:i18n", "i18n.getAllKeysForLocale")
    @js.native
    def getAllKeysForLocale(locale: js.UndefOr[scala.Nothing], excactlyThis: Boolean): js.Array[String] = js.native
    @JSImport("meteor/universe:i18n", "i18n.getAllKeysForLocale")
    @js.native
    def getAllKeysForLocale(locale: String): js.Array[String] = js.native
    @JSImport("meteor/universe:i18n", "i18n.getAllKeysForLocale")
    @js.native
    def getAllKeysForLocale(locale: String, excactlyThis: Boolean): js.Array[String] = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.getCurrencyCodes")
    @js.native
    def getCurrencyCodes(): js.Array[String] = js.native
    @JSImport("meteor/universe:i18n", "i18n.getCurrencyCodes")
    @js.native
    def getCurrencyCodes(locale: String): js.Array[String] = js.native
    
    // currency symbols
    @JSImport("meteor/universe:i18n", "i18n.getCurrencySymbol")
    @js.native
    def getCurrencySymbol(): js.UndefOr[String] = js.native
    @JSImport("meteor/universe:i18n", "i18n.getCurrencySymbol")
    @js.native
    def getCurrencySymbol(locale: String): js.UndefOr[String] = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.getLanguageName")
    @js.native
    def getLanguageName(): String = js.native
    @JSImport("meteor/universe:i18n", "i18n.getLanguageName")
    @js.native
    def getLanguageName(locale: String): String = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.getLanguageNativeName")
    @js.native
    def getLanguageNativeName(): String = js.native
    @JSImport("meteor/universe:i18n", "i18n.getLanguageNativeName")
    @js.native
    def getLanguageNativeName(locale: String): String = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.getLanguages")
    @js.native
    def getLanguages(): js.Array[String] = js.native
    @JSImport("meteor/universe:i18n", "i18n.getLanguages")
    @js.native
    def getLanguages_code(`type`: code): js.Array[String] = js.native
    @JSImport("meteor/universe:i18n", "i18n.getLanguages")
    @js.native
    def getLanguages_name(`type`: name): js.Array[String] = js.native
    @JSImport("meteor/universe:i18n", "i18n.getLanguages")
    @js.native
    def getLanguages_nativeNames(`type`: nativeNames): js.Array[String] = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.getLocale")
    @js.native
    def getLocale(): String = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.getTranslation")
    @js.native
    def getTranslation(key: String*): String = js.native
    @JSImport("meteor/universe:i18n", "i18n.getTranslation")
    @js.native
    def getTranslation(key: String): String = js.native
    @JSImport("meteor/universe:i18n", "i18n.getTranslation")
    @js.native
    def getTranslation(key: String, params: GetTranslationParams): String = js.native
    @JSImport("meteor/universe:i18n", "i18n.getTranslation")
    @js.native
    def getTranslation(namespace: String, key: String, params: GetTranslationParams): String = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.getTranslations")
    @js.native
    def getTranslations(namespace: String): js.Array[String] = js.native
    @JSImport("meteor/universe:i18n", "i18n.getTranslations")
    @js.native
    def getTranslations(namespace: String, locale: String): js.Array[String] = js.native
    
    // others
    @JSImport("meteor/universe:i18n", "i18n.isRTL")
    @js.native
    def isRTL(): Boolean = js.native
    @JSImport("meteor/universe:i18n", "i18n.isRTL")
    @js.native
    def isRTL(locale: String): Boolean = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.loadLocale")
    @js.native
    def loadLocale(locale: String): Unit = js.native
    @JSImport("meteor/universe:i18n", "i18n.loadLocale")
    @js.native
    def loadLocale(locale: String, params: LoadLocaleParams): Unit = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.normalize")
    @js.native
    def normalize(locale: String): js.UndefOr[String] = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.offChangeLocale")
    @js.native
    def offChangeLocale(callback: js.Function1[/* locale */ String, Unit]): Unit = js.native
    
    // events
    @JSImport("meteor/universe:i18n", "i18n.onChangeLocale")
    @js.native
    def onChangeLocale(callback: js.Function1[/* locale */ String, Unit]): Unit = js.native
    
    // options
    /* Inlined std.Readonly<meteor-universe-i18n.meteor/universe:i18n.i18nOptions> */
    object options {
      
      @JSImport("meteor/universe:i18n", "i18n.options.close")
      @js.native
      val close: String = js.native
      
      @JSImport("meteor/universe:i18n", "i18n.options.defaultLocale")
      @js.native
      val defaultLocale: String = js.native
      
      @JSImport("meteor/universe:i18n", "i18n.options.hideMissing")
      @js.native
      val hideMissing: Boolean = js.native
      
      @JSImport("meteor/universe:i18n", "i18n.options.hostUrl")
      @js.native
      val hostUrl: String = js.native
      
      @JSImport("meteor/universe:i18n", "i18n.options.open")
      @js.native
      val open: String = js.native
      
      @JSImport("meteor/universe:i18n", "i18n.options.purify")
      @js.native
      val purify: js.UndefOr[js.Function0[Unit]] = js.native
      
      @JSImport("meteor/universe:i18n", "i18n.options.sameLocaleOnServerConnection")
      @js.native
      val sameLocaleOnServerConnection: Boolean = js.native
      
      @JSImport("meteor/universe:i18n", "i18n.options.translationsHeaders")
      @js.native
      val translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
    }
    
    // number operations
    @JSImport("meteor/universe:i18n", "i18n.parseNumber")
    @js.native
    def parseNumber(number: String): String = js.native
    @JSImport("meteor/universe:i18n", "i18n.parseNumber")
    @js.native
    def parseNumber(number: String, locale: String): String = js.native
    
    // executes function in the locale context,
    // it means that every default locale used inside a called function will be set to a passed locale
    // keep in mind that locale must be loaded first (if it is not bundled)
    @JSImport("meteor/universe:i18n", "i18n.runWithLocale")
    @js.native
    def runWithLocale[T](locale: String, func: js.Function0[T]): T = js.native
    
    // locale setter / getter
    @JSImport("meteor/universe:i18n", "i18n.setLocale")
    @js.native
    def setLocale(locale: String): js.Promise[Unit] = js.native
    @JSImport("meteor/universe:i18n", "i18n.setLocale")
    @js.native
    def setLocale(locale: String, params: LocateParams): js.Promise[Unit] = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.setLocaleOnConnection")
    @js.native
    def setLocaleOnConnection(locale: String): Unit = js.native
    @JSImport("meteor/universe:i18n", "i18n.setLocaleOnConnection")
    @js.native
    def setLocaleOnConnection(locale: String, connectionId: Double): Unit = js.native
    
    @JSImport("meteor/universe:i18n", "i18n.setOptions")
    @js.native
    def setOptions(options: Partiali18nOptions): Unit = js.native
    
    // language getters
    /* Inlined std.Readonly<{[locale: string] : std.Readonly<meteor-universe-i18n.meteor/universe:i18n.i18nLocaleEntry>}> */
    object locales
  }
  
  @js.native
  trait GetTranslationParams
    extends /* key */ StringDictionary[js.Any] {
    
    var _locale: js.UndefOr[String] = js.native
    
    var _namespace: js.UndefOr[String] = js.native
  }
  object GetTranslationParams {
    
    @scala.inline
    def apply(): GetTranslationParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTranslationParams]
    }
    
    @scala.inline
    implicit class GetTranslationParamsMutableBuilder[Self <: GetTranslationParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_locale(value: String): Self = StObject.set(x, "_locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_localeUndefined: Self = StObject.set(x, "_locale", js.undefined)
      
      @scala.inline
      def set_namespace(value: String): Self = StObject.set(x, "_namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_namespaceUndefined: Self = StObject.set(x, "_namespace", js.undefined)
    }
  }
  
  @js.native
  trait LoadLocaleParams extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var fresh: js.UndefOr[Boolean] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var pathOnHost: js.UndefOr[String] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  object LoadLocaleParams {
    
    @scala.inline
    def apply(): LoadLocaleParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadLocaleParams]
    }
    
    @scala.inline
    implicit class LoadLocaleParamsMutableBuilder[Self <: LoadLocaleParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPathOnHost(value: String): Self = StObject.set(x, "pathOnHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathOnHostUndefined: Self = StObject.set(x, "pathOnHost", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  @js.native
  trait LocateParams extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var fresh: js.UndefOr[Boolean] = js.native
    
    var noDownload: js.UndefOr[Boolean] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  object LocateParams {
    
    @scala.inline
    def apply(): LocateParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocateParams]
    }
    
    @scala.inline
    implicit class LocateParamsMutableBuilder[Self <: LocateParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
      
      @scala.inline
      def setNoDownload(value: Boolean): Self = StObject.set(x, "noDownload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDownloadUndefined: Self = StObject.set(x, "noDownload", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  @js.native
  trait ReactComponentProps extends StObject {
    
    var _containerType: js.UndefOr[String] = js.native
    
    var _locale: js.UndefOr[String] = js.native
    
    var _namespace: js.UndefOr[String] = js.native
    
    var _props: js.UndefOr[HTMLAttributes[Component[js.Object, js.Object, _]]] = js.native
    
    var _tagType: js.UndefOr[String] = js.native
    
    var _translateProps: js.UndefOr[js.Array[String]] = js.native
  }
  object ReactComponentProps {
    
    @scala.inline
    def apply(): ReactComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactComponentProps]
    }
    
    @scala.inline
    implicit class ReactComponentPropsMutableBuilder[Self <: ReactComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_containerType(value: String): Self = StObject.set(x, "_containerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_containerTypeUndefined: Self = StObject.set(x, "_containerType", js.undefined)
      
      @scala.inline
      def set_locale(value: String): Self = StObject.set(x, "_locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_localeUndefined: Self = StObject.set(x, "_locale", js.undefined)
      
      @scala.inline
      def set_namespace(value: String): Self = StObject.set(x, "_namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_namespaceUndefined: Self = StObject.set(x, "_namespace", js.undefined)
      
      @scala.inline
      def set_props(value: HTMLAttributes[Component[js.Object, js.Object, _]]): Self = StObject.set(x, "_props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_propsUndefined: Self = StObject.set(x, "_props", js.undefined)
      
      @scala.inline
      def set_tagType(value: String): Self = StObject.set(x, "_tagType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tagTypeUndefined: Self = StObject.set(x, "_tagType", js.undefined)
      
      @scala.inline
      def set_translateProps(value: js.Array[String]): Self = StObject.set(x, "_translateProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_translatePropsUndefined: Self = StObject.set(x, "_translateProps", js.undefined)
      
      @scala.inline
      def set_translatePropsVarargs(value: String*): Self = StObject.set(x, "_translateProps", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TranslaterOptions extends StObject {
    
    var _locale: js.UndefOr[String] = js.native
    
    var _purify: js.UndefOr[Boolean] = js.native
  }
  object TranslaterOptions {
    
    @scala.inline
    def apply(): TranslaterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslaterOptions]
    }
    
    @scala.inline
    implicit class TranslaterOptionsMutableBuilder[Self <: TranslaterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_locale(value: String): Self = StObject.set(x, "_locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_localeUndefined: Self = StObject.set(x, "_locale", js.undefined)
      
      @scala.inline
      def set_purify(value: Boolean): Self = StObject.set(x, "_purify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_purifyUndefined: Self = StObject.set(x, "_purify", js.undefined)
    }
  }
  
  type Translator = js.Function1[/* repeated */ js.Any, String]
  
  type i18nLocaleEntry = js.Tuple8[
    String, 
    // code
  String, 
    // name
  String, 
    // localName
  Boolean, 
    // isRTL
  String, 
    // numberTypographic
  Double, 
    // decimal
  String, 
    js.Array[Double] | (js.Tuple2[Double, Double])
  ]
  
  @js.native
  trait i18nOptions extends StObject {
    
    var close: String = js.native
    
    var defaultLocale: String = js.native
    
    var hideMissing: Boolean = js.native
    
    var hostUrl: String = js.native
    
    var open: String = js.native
    
    var purify: js.UndefOr[js.Function0[Unit]] = js.native
    
    var sameLocaleOnServerConnection: Boolean = js.native
    
    var translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  }
  object i18nOptions {
    
    @scala.inline
    def apply(
      close: String,
      defaultLocale: String,
      hideMissing: Boolean,
      hostUrl: String,
      open: String,
      sameLocaleOnServerConnection: Boolean
    ): i18nOptions = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], hideMissing = hideMissing.asInstanceOf[js.Any], hostUrl = hostUrl.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], sameLocaleOnServerConnection = sameLocaleOnServerConnection.asInstanceOf[js.Any])
      __obj.asInstanceOf[i18nOptions]
    }
    
    @scala.inline
    implicit class i18nOptionsMutableBuilder[Self <: i18nOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideMissing(value: Boolean): Self = StObject.set(x, "hideMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUrl(value: String): Self = StObject.set(x, "hostUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurify(value: () => Unit): Self = StObject.set(x, "purify", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPurifyUndefined: Self = StObject.set(x, "purify", js.undefined)
      
      @scala.inline
      def setSameLocaleOnServerConnection(value: Boolean): Self = StObject.set(x, "sameLocaleOnServerConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "translationsHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsHeadersUndefined: Self = StObject.set(x, "translationsHeaders", js.undefined)
    }
  }
}
