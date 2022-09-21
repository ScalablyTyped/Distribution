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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object mod {
  
  object i18n {
    
    @JSImport("meteor/universe:i18n", "i18n")
    @js.native
    val ^ : js.Any = js.native
    
    inline def __(key: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("__")(key.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    inline def __(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("__")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def __(key: String, params: GetTranslationParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def __(namespace: String, key: String, params: GetTranslationParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__")(namespace.asInstanceOf[js.Any], key.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    // tslint:disable-next-line unified-signatures
    inline def addTranslation(locale: String, namespace: String, key: String, translation: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTranslation")(locale.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], key.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[Unit]
    // translation setter / getter functions
    inline def addTranslation(locale: String, namespace: String, translation: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTranslation")(locale.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addTranslations(locale: String, namespace: String, translationsMap: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTranslations")(locale.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], translationsMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addTranslations(locale: String, translationsMap: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTranslations")(locale.asInstanceOf[js.Any], translationsMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    // component functions
    inline def createComponent(): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")().asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Unit, locale: String): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Unit, locale: String, reactjs: Unit, `type`: Any): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Unit, locale: String, reactjs: ReactInstance): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Unit, locale: String, reactjs: ReactInstance, `type`: Any): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Unit, locale: Unit, reactjs: Unit, `type`: Any): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Unit, locale: Unit, reactjs: ReactInstance): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Unit, locale: Unit, reactjs: ReactInstance, `type`: Any): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Translator): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any]).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Translator, locale: String): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Translator, locale: String, reactjs: Unit, `type`: Any): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Translator, locale: String, reactjs: ReactInstance): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Translator, locale: String, reactjs: ReactInstance, `type`: Any): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Translator, locale: Unit, reactjs: Unit, `type`: Any): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Translator, locale: Unit, reactjs: ReactInstance): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    inline def createComponent(translator: Translator, locale: Unit, reactjs: ReactInstance, `type`: Any): Instantiable0[Component[ReactComponentProps, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(translator.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], reactjs.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[ReactComponentProps, js.Object, Any]]]
    
    inline def createReactiveTranslator(namespace: String, locale: String): Instantiable0[Component[js.Object, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReactiveTranslator")(namespace.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[Component[js.Object, js.Object, Any]]]
    
    // translator functions
    inline def createTranslator(namespace: String): Translator = ^.asInstanceOf[js.Dynamic].applyDynamic("createTranslator")(namespace.asInstanceOf[js.Any]).asInstanceOf[Translator]
    inline def createTranslator(namespace: String, options: TranslaterOptions): Translator = (^.asInstanceOf[js.Dynamic].applyDynamic("createTranslator")(namespace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Translator]
    
    inline def getAllKeysForLocale(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeysForLocale")().asInstanceOf[js.Array[String]]
    inline def getAllKeysForLocale(locale: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeysForLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def getAllKeysForLocale(locale: String, excactlyThis: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeysForLocale")(locale.asInstanceOf[js.Any], excactlyThis.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def getAllKeysForLocale(locale: Unit, excactlyThis: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeysForLocale")(locale.asInstanceOf[js.Any], excactlyThis.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def getCurrencyCodes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencyCodes")().asInstanceOf[js.Array[String]]
    inline def getCurrencyCodes(locale: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencyCodes")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    // currency symbols
    inline def getCurrencySymbol(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")().asInstanceOf[js.UndefOr[String]]
    inline def getCurrencySymbol(locale: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(locale.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    inline def getLanguageName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageName")().asInstanceOf[String]
    inline def getLanguageName(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageName")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getLanguageNativeName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageNativeName")().asInstanceOf[String]
    inline def getLanguageNativeName(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageNativeName")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[js.Array[String]]
    inline def getLanguages(`type`: code | name | nativeNames): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")().asInstanceOf[String]
    
    inline def getTranslation(key: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslation")(key.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    inline def getTranslation(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslation")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getTranslation(key: String, params: GetTranslationParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslation")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getTranslation(namespace: String, key: String, params: GetTranslationParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslation")(namespace.asInstanceOf[js.Any], key.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getTranslations(namespace: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslations")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def getTranslations(namespace: String, locale: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslations")(namespace.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    // others
    inline def isRTL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")().asInstanceOf[Boolean]
    inline def isRTL(locale: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")(locale.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def loadLocale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loadLocale(locale: String, params: LoadLocaleParams): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLocale")(locale.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def normalize(locale: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(locale.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    inline def offChangeLocale(callback: js.Function1[/* locale */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offChangeLocale")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // events
    inline def onChangeLocale(callback: js.Function1[/* locale */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChangeLocale")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def parseNumber(number: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(number.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def parseNumber(number: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(number.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    // executes function in the locale context,
    // it means that every default locale used inside a called function will be set to a passed locale
    // keep in mind that locale must be loaded first (if it is not bundled)
    inline def runWithLocale[T](locale: String, func: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runWithLocale")(locale.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
    
    // locale setter / getter
    inline def setLocale(locale: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def setLocale(locale: String, params: LocateParams): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def setLocaleOnConnection(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocaleOnConnection")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setLocaleOnConnection(locale: String, connectionId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocaleOnConnection")(locale.asInstanceOf[js.Any], connectionId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setOptions(options: Partiali18nOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait GetTranslationParams
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var _locale: js.UndefOr[String] = js.undefined
    
    var _namespace: js.UndefOr[String] = js.undefined
  }
  object GetTranslationParams {
    
    inline def apply(): GetTranslationParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTranslationParams]
    }
    
    extension [Self <: GetTranslationParams](x: Self) {
      
      inline def set_locale(value: String): Self = StObject.set(x, "_locale", value.asInstanceOf[js.Any])
      
      inline def set_localeUndefined: Self = StObject.set(x, "_locale", js.undefined)
      
      inline def set_namespace(value: String): Self = StObject.set(x, "_namespace", value.asInstanceOf[js.Any])
      
      inline def set_namespaceUndefined: Self = StObject.set(x, "_namespace", js.undefined)
    }
  }
  
  trait LoadLocaleParams extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var fresh: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var pathOnHost: js.UndefOr[String] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object LoadLocaleParams {
    
    inline def apply(): LoadLocaleParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadLocaleParams]
    }
    
    extension [Self <: LoadLocaleParams](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
      
      inline def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPathOnHost(value: String): Self = StObject.set(x, "pathOnHost", value.asInstanceOf[js.Any])
      
      inline def setPathOnHostUndefined: Self = StObject.set(x, "pathOnHost", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait LocateParams extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var fresh: js.UndefOr[Boolean] = js.undefined
    
    var noDownload: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object LocateParams {
    
    inline def apply(): LocateParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocateParams]
    }
    
    extension [Self <: LocateParams](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
      
      inline def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
      
      inline def setNoDownload(value: Boolean): Self = StObject.set(x, "noDownload", value.asInstanceOf[js.Any])
      
      inline def setNoDownloadUndefined: Self = StObject.set(x, "noDownload", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait ReactComponentProps extends StObject {
    
    var _containerType: js.UndefOr[String] = js.undefined
    
    var _locale: js.UndefOr[String] = js.undefined
    
    var _namespace: js.UndefOr[String] = js.undefined
    
    var _props: js.UndefOr[HTMLAttributes[Component[js.Object, js.Object, Any]]] = js.undefined
    
    var _tagType: js.UndefOr[String] = js.undefined
    
    var _translateProps: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ReactComponentProps {
    
    inline def apply(): ReactComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactComponentProps]
    }
    
    extension [Self <: ReactComponentProps](x: Self) {
      
      inline def set_containerType(value: String): Self = StObject.set(x, "_containerType", value.asInstanceOf[js.Any])
      
      inline def set_containerTypeUndefined: Self = StObject.set(x, "_containerType", js.undefined)
      
      inline def set_locale(value: String): Self = StObject.set(x, "_locale", value.asInstanceOf[js.Any])
      
      inline def set_localeUndefined: Self = StObject.set(x, "_locale", js.undefined)
      
      inline def set_namespace(value: String): Self = StObject.set(x, "_namespace", value.asInstanceOf[js.Any])
      
      inline def set_namespaceUndefined: Self = StObject.set(x, "_namespace", js.undefined)
      
      inline def set_props(value: HTMLAttributes[Component[js.Object, js.Object, Any]]): Self = StObject.set(x, "_props", value.asInstanceOf[js.Any])
      
      inline def set_propsUndefined: Self = StObject.set(x, "_props", js.undefined)
      
      inline def set_tagType(value: String): Self = StObject.set(x, "_tagType", value.asInstanceOf[js.Any])
      
      inline def set_tagTypeUndefined: Self = StObject.set(x, "_tagType", js.undefined)
      
      inline def set_translateProps(value: js.Array[String]): Self = StObject.set(x, "_translateProps", value.asInstanceOf[js.Any])
      
      inline def set_translatePropsUndefined: Self = StObject.set(x, "_translateProps", js.undefined)
      
      inline def set_translatePropsVarargs(value: String*): Self = StObject.set(x, "_translateProps", js.Array(value*))
    }
  }
  
  trait TranslaterOptions extends StObject {
    
    var _locale: js.UndefOr[String] = js.undefined
    
    var _purify: js.UndefOr[Boolean] = js.undefined
  }
  object TranslaterOptions {
    
    inline def apply(): TranslaterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslaterOptions]
    }
    
    extension [Self <: TranslaterOptions](x: Self) {
      
      inline def set_locale(value: String): Self = StObject.set(x, "_locale", value.asInstanceOf[js.Any])
      
      inline def set_localeUndefined: Self = StObject.set(x, "_locale", js.undefined)
      
      inline def set_purify(value: Boolean): Self = StObject.set(x, "_purify", value.asInstanceOf[js.Any])
      
      inline def set_purifyUndefined: Self = StObject.set(x, "_purify", js.undefined)
    }
  }
  
  @js.native
  trait Translator extends StObject {
    
    def apply(args: Any*): String = js.native
  }
  
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
  
  trait i18nOptions extends StObject {
    
    var close: String
    
    var defaultLocale: String
    
    var hideMissing: Boolean
    
    var hostUrl: String
    
    var open: String
    
    var purify: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var sameLocaleOnServerConnection: Boolean
    
    var translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  }
  object i18nOptions {
    
    inline def apply(
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
    
    extension [Self <: i18nOptions](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setHideMissing(value: Boolean): Self = StObject.set(x, "hideMissing", value.asInstanceOf[js.Any])
      
      inline def setHostUrl(value: String): Self = StObject.set(x, "hostUrl", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPurify(value: () => Unit): Self = StObject.set(x, "purify", js.Any.fromFunction0(value))
      
      inline def setPurifyUndefined: Self = StObject.set(x, "purify", js.undefined)
      
      inline def setSameLocaleOnServerConnection(value: Boolean): Self = StObject.set(x, "sameLocaleOnServerConnection", value.asInstanceOf[js.Any])
      
      inline def setTranslationsHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "translationsHeaders", value.asInstanceOf[js.Any])
      
      inline def setTranslationsHeadersUndefined: Self = StObject.set(x, "translationsHeaders", js.undefined)
    }
  }
}
