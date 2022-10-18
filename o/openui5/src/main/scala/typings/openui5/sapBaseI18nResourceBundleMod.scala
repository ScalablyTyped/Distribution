package typings.openui5

import typings.openui5.anon.ActiveTerminologies
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseI18nResourceBundleMod {
  
  @JSImport("sap/base/i18n/ResourceBundle", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ResourceBundle
  /* static members */
  object default {
    
    @JSImport("sap/base/i18n/ResourceBundle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new instance of {@link module:sap/base/i18n/ResourceBundle} using the given URL
      * and locale to determine what to load.
      *
      * Before loading the ResourceBundle, the locale is evaluated with a fallback chain. Sample fallback chain
      * for locale="de-DE" and fallbackLocale="fr_FR" `"de-DE" -> "de" -> "fr_FR" -> "fr" -> raw`
      *
      * Only those locales are considered for loading, which are in the supportedLocales array (if the array
      * is supplied and not empty).
      *
      * Note: The fallbackLocale should be included in the supportedLocales array.
      *
      * @returns A new resource bundle or a Promise on that bundle (in asynchronous case)
      */
    inline def create(): ResourceBundle | js.Promise[ResourceBundle] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ResourceBundle | js.Promise[ResourceBundle]]
    inline def create(/**
      * Parameters used to initialize the resource bundle
      */
    mParams: ActiveTerminologies): ResourceBundle | js.Promise[ResourceBundle] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mParams.asInstanceOf[js.Any]).asInstanceOf[ResourceBundle | js.Promise[ResourceBundle]]
  }
  
  trait Configuration extends StObject {
    
    /**
      * UI5 module name in dot notation pointing to the base .properties file of a bundle (.properties file without
      * any locale information, e.g. "i18n.mybundle")
      */
    var bundleName: js.UndefOr[String] = js.undefined
    
    /**
      * URL pointing to the base .properties file of a bundle (.properties file without any locale information,
      * e.g. "i18n/mybundle.properties")
      */
    var bundleUrl: js.UndefOr[String] = js.undefined
    
    /**
      * A fallback locale to be used after all locales derived from `locale` have been tried, but before the
      * 'raw' bundle is used. Can either be a BCP47 language tag or a JDK compatible locale string (e.g. "en-GB",
      * "en_GB" or "en"), defaults to "en" (English). To prevent a generic fallback, use the empty string (`""`).
      * E.g. by providing `fallbackLocale: ""` and `supportedLocales: ["en"]`, only the bundle "en" is requested
      * without any fallback.
      */
    var fallbackLocale: js.UndefOr[String] = js.undefined
    
    /**
      * List of supported locales (aka 'language tags') to restrict the fallback chain. Each entry in the array
      * can either be a BCP47 language tag or a JDK compatible locale string (e.g. "en-GB", "en_GB" or "en").
      * An empty string (`""`) represents the 'raw' bundle. **Note:** The given language tags can use modern
      * or legacy ISO639 language codes. Whatever language code is used in the list of supported locales will
      * also be used when requesting a file from the server. If the `locale` contains a legacy language code
      * like "sh" and the `supportedLocales` contains [...,"sr",...], "sr" will be used in the URL. This mapping
      * works in both directions.
      */
    var supportedLocales: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An object, mapping a terminology identifier (e.g. "oil") to a `ResourceBundle.TerminologyConfiguration`.
      * A terminology is a resource bundle configuration for a specific use case (e.g. "oil"). It does neither
      * have a `fallbackLocale` nor can it be enhanced with `enhanceWith`.
      */
    var terminologies: js.UndefOr[Record[String, TerminologyConfiguration]] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setBundleName(value: String): Self = StObject.set(x, "bundleName", value.asInstanceOf[js.Any])
      
      inline def setBundleNameUndefined: Self = StObject.set(x, "bundleName", js.undefined)
      
      inline def setBundleUrl(value: String): Self = StObject.set(x, "bundleUrl", value.asInstanceOf[js.Any])
      
      inline def setBundleUrlUndefined: Self = StObject.set(x, "bundleUrl", js.undefined)
      
      inline def setFallbackLocale(value: String): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
      
      inline def setFallbackLocaleUndefined: Self = StObject.set(x, "fallbackLocale", js.undefined)
      
      inline def setSupportedLocales(value: js.Array[String]): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
      
      inline def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
      
      inline def setSupportedLocalesVarargs(value: String*): Self = StObject.set(x, "supportedLocales", js.Array(value*))
      
      inline def setTerminologies(value: Record[String, TerminologyConfiguration]): Self = StObject.set(x, "terminologies", value.asInstanceOf[js.Any])
      
      inline def setTerminologiesUndefined: Self = StObject.set(x, "terminologies", js.undefined)
    }
  }
  
  @js.native
  trait ResourceBundle extends StObject {
    
    /**
      * Returns a locale-specific string value for the given key sKey.
      *
      * The text is searched in this resource bundle according to the fallback chain described in {@link module:sap/base/i18n/ResourceBundle}.
      * If no text could be found, the key itself is used as text.
      *
      * If the second parameter `aArgs` is given, then any placeholder of the form "{n}" (with n
      * being an integer) is replaced by the corresponding value from `aArgs` with index n. Note: This
      * replacement is applied to the key if no text could be found. For more details on the replacement mechanism
      * refer to {@link module:sap/base/strings/formatMessage}.
      *
      * @returns The value belonging to the key, if found; otherwise the key itself or `undefined` depending
      * on `bIgnoreKeyFallback`.
      */
    def getText(/**
      * Key to retrieve the text for
      */
    sKey: String): js.UndefOr[String] = js.native
    def getText(
      /**
      * Key to retrieve the text for
      */
    sKey: String,
      /**
      * List of parameter values which should replace the placeholders "{n}" (n is the index) in
      * the found locale-specific string value. Note that the replacement is done whenever `aArgs` is given,
      * no matter whether the text contains placeholders or not and no matter whether `aArgs` contains a value
      * for n or not.
      */
    aArgs: js.Array[Any]
    ): js.UndefOr[String] = js.native
    def getText(
      /**
      * Key to retrieve the text for
      */
    sKey: String,
      /**
      * List of parameter values which should replace the placeholders "{n}" (n is the index) in
      * the found locale-specific string value. Note that the replacement is done whenever `aArgs` is given,
      * no matter whether the text contains placeholders or not and no matter whether `aArgs` contains a value
      * for n or not.
      */
    aArgs: js.Array[Any],
      /**
      * If set, `undefined` is returned instead of the key string, when the key is not found in any bundle or
      * fallback bundle.
      */
    bIgnoreKeyFallback: Boolean
    ): js.UndefOr[String] = js.native
    def getText(
      /**
      * Key to retrieve the text for
      */
    sKey: String,
      /**
      * List of parameter values which should replace the placeholders "{n}" (n is the index) in
      * the found locale-specific string value. Note that the replacement is done whenever `aArgs` is given,
      * no matter whether the text contains placeholders or not and no matter whether `aArgs` contains a value
      * for n or not.
      */
    aArgs: Unit,
      /**
      * If set, `undefined` is returned instead of the key string, when the key is not found in any bundle or
      * fallback bundle.
      */
    bIgnoreKeyFallback: Boolean
    ): js.UndefOr[String] = js.native
    
    /**
      * Checks whether a text for the given key can be found in the first loaded resource bundle or not. Neither
      * the custom resource bundles nor the fallback chain will be processed.
      *
      * This method allows to check for the existence of a text without triggering requests for the fallback
      * locales.
      *
      * When requesting the resource bundle asynchronously this check must only be used after the resource bundle
      * has been loaded.
      *
      * @returns Whether the text has been found in the concrete bundle
      */
    def hasText(/**
      * Key to check
      */
    sKey: String): Boolean = js.native
  }
  
  trait TerminologyConfiguration extends StObject {
    
    /**
      * UI5 module name in dot notation pointing to the base .properties file of a bundle (.properties file without
      * any locale information, e.g. "i18n.mybundle")
      */
    var bundleName: js.UndefOr[String] = js.undefined
    
    /**
      * URL pointing to the base .properties file of a bundle (.properties file without any locale information,
      * e.g. "i18n/mybundle.properties")
      */
    var bundleUrl: js.UndefOr[String] = js.undefined
    
    /**
      * List of supported locales (aka 'language tags') to restrict the fallback chain. Each entry in the array
      * can either be a BCP47 language tag or a JDK compatible locale string (e.g. "en-GB", "en_GB" or "en").
      * An empty string (`""`) represents the 'raw' bundle. **Note:** The given language tags can use modern
      * or legacy ISO639 language codes. Whatever language code is used in the list of supported locales will
      * also be used when requesting a file from the server. If the `locale` contains a legacy language code
      * like "sh" and the `supportedLocales` contains [...,"sr",...], "sr" will be used in the URL. This mapping
      * works in both directions.
      */
    var supportedLocales: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TerminologyConfiguration {
    
    inline def apply(): TerminologyConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TerminologyConfiguration]
    }
    
    extension [Self <: TerminologyConfiguration](x: Self) {
      
      inline def setBundleName(value: String): Self = StObject.set(x, "bundleName", value.asInstanceOf[js.Any])
      
      inline def setBundleNameUndefined: Self = StObject.set(x, "bundleName", js.undefined)
      
      inline def setBundleUrl(value: String): Self = StObject.set(x, "bundleUrl", value.asInstanceOf[js.Any])
      
      inline def setBundleUrlUndefined: Self = StObject.set(x, "bundleUrl", js.undefined)
      
      inline def setSupportedLocales(value: js.Array[String]): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
      
      inline def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
      
      inline def setSupportedLocalesVarargs(value: String*): Self = StObject.set(x, "supportedLocales", js.Array(value*))
    }
  }
}
