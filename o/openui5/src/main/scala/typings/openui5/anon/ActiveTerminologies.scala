package typings.openui5.anon

import typings.openui5.sapBaseI18nResourceBundleMod.Configuration
import typings.openui5.sapBaseI18nResourceBundleMod.TerminologyConfiguration
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTerminologies extends StObject {
  
  /**
    * The list of active terminologies, e.g. `["oil", "retail"]`. The order in this array represents the lookup
    * order.
    */
  var activeTerminologies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the first bundle should be loaded asynchronously Note: Fallback bundles loaded by {@link #getText }
    * are always loaded synchronously.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
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
    * List of ResourceBundle configurations which enhance the current one. The order of the enhancements is
    * significant, because the lookup checks the last enhancement first. Each enhancement represents a ResourceBundle
    * with limited options ('bundleUrl', 'bundleName', 'terminologies', 'fallbackLocale', 'supportedLocales').
    * Note: supportedLocales and fallbackLocale are inherited from the parent ResourceBundle if not present.
    */
  var enhanceWith: js.UndefOr[js.Array[Configuration]] = js.undefined
  
  /**
    * A fallback locale to be used after all locales derived from `locale` have been tried, but before the
    * 'raw' bundle is used. Can either be a BCP47 language tag or a JDK compatible locale string (e.g. "en-GB",
    * "en_GB" or "en"). To prevent a generic fallback, use the empty string (`""`). E.g. by providing `fallbackLocale:
    * ""` and `supportedLocales: ["en"]`, only the bundle "en" is requested without any fallback.
    */
  var fallbackLocale: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to include origin information into the returned property values
    */
  var includeInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional locale (aka 'language tag') to load the texts for. Can either be a BCP47 language tag or a JDK
    * compatible locale string (e.g. "en-GB", "en_GB" or "en"). Defaults to the current session locale if `sap.ui.getCore`
    * is available, otherwise to the provided `fallbackLocale`
    */
  var locale: js.UndefOr[String] = js.undefined
  
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
    * map of terminologies. The key is the terminology identifier and the value is a ResourceBundle terminology
    * configuration. A terminology is a resource bundle configuration for a specific use case (e.g. "oil").
    * It does neither have a `fallbackLocale` nor can it be enhanced with `enhanceWith`.
    */
  var terminologies: js.UndefOr[Record[String, TerminologyConfiguration]] = js.undefined
  
  /**
    * URL pointing to the base .properties file of a bundle (.properties file without any locale information,
    * e.g. "mybundle.properties") if not provided, `bundleUrl` or `bundleName` can be used; if both are set,
    * `bundleName` wins
    */
  var url: js.UndefOr[String] = js.undefined
}
object ActiveTerminologies {
  
  inline def apply(): ActiveTerminologies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveTerminologies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveTerminologies] (val x: Self) extends AnyVal {
    
    inline def setActiveTerminologies(value: js.Array[String]): Self = StObject.set(x, "activeTerminologies", value.asInstanceOf[js.Any])
    
    inline def setActiveTerminologiesUndefined: Self = StObject.set(x, "activeTerminologies", js.undefined)
    
    inline def setActiveTerminologiesVarargs(value: String*): Self = StObject.set(x, "activeTerminologies", js.Array(value*))
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBundleName(value: String): Self = StObject.set(x, "bundleName", value.asInstanceOf[js.Any])
    
    inline def setBundleNameUndefined: Self = StObject.set(x, "bundleName", js.undefined)
    
    inline def setBundleUrl(value: String): Self = StObject.set(x, "bundleUrl", value.asInstanceOf[js.Any])
    
    inline def setBundleUrlUndefined: Self = StObject.set(x, "bundleUrl", js.undefined)
    
    inline def setEnhanceWith(value: js.Array[Configuration]): Self = StObject.set(x, "enhanceWith", value.asInstanceOf[js.Any])
    
    inline def setEnhanceWithUndefined: Self = StObject.set(x, "enhanceWith", js.undefined)
    
    inline def setEnhanceWithVarargs(value: Configuration*): Self = StObject.set(x, "enhanceWith", js.Array(value*))
    
    inline def setFallbackLocale(value: String): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
    
    inline def setFallbackLocaleUndefined: Self = StObject.set(x, "fallbackLocale", js.undefined)
    
    inline def setIncludeInfo(value: Boolean): Self = StObject.set(x, "includeInfo", value.asInstanceOf[js.Any])
    
    inline def setIncludeInfoUndefined: Self = StObject.set(x, "includeInfo", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setSupportedLocales(value: js.Array[String]): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
    
    inline def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
    
    inline def setSupportedLocalesVarargs(value: String*): Self = StObject.set(x, "supportedLocales", js.Array(value*))
    
    inline def setTerminologies(value: Record[String, TerminologyConfiguration]): Self = StObject.set(x, "terminologies", value.asInstanceOf[js.Any])
    
    inline def setTerminologiesUndefined: Self = StObject.set(x, "terminologies", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
