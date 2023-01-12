package typings.openui5.anon

import typings.openui5.sapBaseI18nResourceBundleMod.Configuration
import typings.openui5.sapBaseI18nResourceBundleMod.TerminologyConfiguration
import typings.openui5.sapBaseI18nResourceBundleMod.default
import typings.openui5.sapUiModelBindingModeMod.BindingMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundle extends StObject {
  
  /**
    * The list of active terminologies, e.g. `["oil", "retail"]`. This parameter is passed to the underlying
    * ResourceBundle (see {@link module:sap/base/i18n/ResourceBundle.create}). This parameter is ignored when
    * `bundle` is set. Will cause an error if `enhanceWith` contains instances of `ResourceBundle`. Supported
    * since 1.77.0.
    */
  var activeTerminologies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the language bundle should be loaded asynchronously
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A resource bundle instance; when given, this bundle is used instead of creating a bundle from the provided
    * `bundleUrl`, `bundleName` and `bundleLocale` properties. However, to support reloading the bundle when
    * the current session locale changes, the corresponding `bundleName` or `bundleUrl` should be specified
    * if known. Otherwise, the bundle is not updated on locale changes. Note: This parameter should not be
    * used when using enhancements. Terminologies require enhancements with `bundleUrl`, `bundleName` and `bundleLocale`
    * in combination with `enhanceWith` which contains a list of `ResourceBundle.Configurations`. Terminologies
    * must be defined in a declarative way, with configurations and not with instances of `ResourceBundle`.
    */
  var bundle: js.UndefOr[default] = js.undefined
  
  /**
    * A locale in "BCP-47 language tag" notation specifying the locale in which to load the bundle; when not
    * given, the current session locale of UI5 is used (recommended)
    */
  var bundleLocale: js.UndefOr[String] = js.undefined
  
  /**
    * UI5 module name in dot notation referring to the base ".properties" file; this name is resolved to a
    * path just as for normal UI5 modules, to which ".properties" is then appended (e.g. a name like "myapp.i18n.myBundle"
    * can be given); relative module names are not supported
    */
  var bundleName: js.UndefOr[String] = js.undefined
  
  /**
    * URL pointing to the base ".properties" file of a bundle (".properties" file without any locale information,
    * e.g. "../../i18n/mybundle.properties"); relative URLs are evaluated relative to the document.baseURI
    */
  var bundleUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The default binding mode to use; it can be `OneWay` or `OneTime` (only when synchronous loading is used);
    * the `TwoWay` mode is not supported
    */
  var defaultBindingMode: js.UndefOr[
    BindingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String)
  ] = js.undefined
  
  /**
    * A list of resource bundles or resource bundle configurations that enhance the texts from the main bundle;
    * intended for extensibility scenarios; see also the class documentation. ResourceBundles use the ResourceModel's
    * enhance mechanism and `ResourceBundle.Configurations` get passed to the underlying ResourceBundle (see
    * {@link module:sap/base/i18n/ResourceBundle.create}). Supported since 1.77.0.
    */
  var enhanceWith: js.UndefOr[js.Array[Configuration | default]] = js.undefined
  
  /**
    * A fallback locale to be used after all locales derived from `bundleLocale` have been tried, but before
    * the 'raw' bundle is used. Can either be a BCP47 language tag or a JDK compatible locale string (e.g.
    * "en-GB", "en_GB" or "en").
    *
    * To prevent a generic fallback, use the empty string (`""`). E.g. by providing `fallbackLocale: ""` and
    * `supportedLocales: ["en"]`, only the bundle "en" is requested without any fallback. This parameter is
    * passed to the underlying ResourceBundle (see {@link module:sap/base/i18n/ResourceBundle.create}). Supported
    * since 1.77.0.
    */
  var fallbackLocale: js.UndefOr[String] = js.undefined
  
  /**
    * List of supported locales (aka 'language tags') to restrict the fallback chain. Each entry in the array
    * can either be a BCP47 language tag or a JDK compatible locale string (e.g. "en-GB", "en_GB" or "en").
    * An empty string (`""`) represents the 'raw' bundle.
    *
    * **Note:** The given language tags can use modern or legacy ISO639 language codes. Whatever language code
    * is used in the list of supported locales will also be used when requesting a file from the server. If
    * the `bundleLocale` contains a legacy language code like "sh" and the `supportedLocales` contains [...,"sr",...],
    * "sr" will be used in the URL. This mapping works in both directions. This parameter is passed to the
    * underlying ResourceBundle (see {@link module:sap/base/i18n/ResourceBundle.create}). Supported since 1.77.0.
    */
  var supportedLocales: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An object, mapping a terminology identifier (e.g. "oil") to a `ResourceBundle.TerminologyConfiguration`.
    * A terminology is a resource bundle configuration for a specific use case (e.g. "oil"). It does neither
    * have a `fallbackLocale` nor can it be enhanced with `enhanceWith`. This parameter is passed to the underlying
    * ResourceBundle (see {@link module:sap/base/i18n/ResourceBundle.create}). This parameter is ignored when
    * `bundle` is set. Will cause an error if `enhanceWith` contains instances of `ResourceBundle`. Supported
    * since 1.77.0.
    */
  var terminologies: js.UndefOr[Record[String, TerminologyConfiguration]] = js.undefined
}
object Bundle {
  
  inline def apply(): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bundle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bundle] (val x: Self) extends AnyVal {
    
    inline def setActiveTerminologies(value: js.Array[String]): Self = StObject.set(x, "activeTerminologies", value.asInstanceOf[js.Any])
    
    inline def setActiveTerminologiesUndefined: Self = StObject.set(x, "activeTerminologies", js.undefined)
    
    inline def setActiveTerminologiesVarargs(value: String*): Self = StObject.set(x, "activeTerminologies", js.Array(value*))
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBundle(value: default): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setBundleLocale(value: String): Self = StObject.set(x, "bundleLocale", value.asInstanceOf[js.Any])
    
    inline def setBundleLocaleUndefined: Self = StObject.set(x, "bundleLocale", js.undefined)
    
    inline def setBundleName(value: String): Self = StObject.set(x, "bundleName", value.asInstanceOf[js.Any])
    
    inline def setBundleNameUndefined: Self = StObject.set(x, "bundleName", js.undefined)
    
    inline def setBundleUndefined: Self = StObject.set(x, "bundle", js.undefined)
    
    inline def setBundleUrl(value: String): Self = StObject.set(x, "bundleUrl", value.asInstanceOf[js.Any])
    
    inline def setBundleUrlUndefined: Self = StObject.set(x, "bundleUrl", js.undefined)
    
    inline def setDefaultBindingMode(
      value: BindingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String)
    ): Self = StObject.set(x, "defaultBindingMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultBindingModeUndefined: Self = StObject.set(x, "defaultBindingMode", js.undefined)
    
    inline def setEnhanceWith(value: js.Array[Configuration | default]): Self = StObject.set(x, "enhanceWith", value.asInstanceOf[js.Any])
    
    inline def setEnhanceWithUndefined: Self = StObject.set(x, "enhanceWith", js.undefined)
    
    inline def setEnhanceWithVarargs(value: (Configuration | default)*): Self = StObject.set(x, "enhanceWith", js.Array(value*))
    
    inline def setFallbackLocale(value: String): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
    
    inline def setFallbackLocaleUndefined: Self = StObject.set(x, "fallbackLocale", js.undefined)
    
    inline def setSupportedLocales(value: js.Array[String]): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
    
    inline def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
    
    inline def setSupportedLocalesVarargs(value: String*): Self = StObject.set(x, "supportedLocales", js.Array(value*))
    
    inline def setTerminologies(value: Record[String, TerminologyConfiguration]): Self = StObject.set(x, "terminologies", value.asInstanceOf[js.Any])
    
    inline def setTerminologiesUndefined: Self = StObject.set(x, "terminologies", js.undefined)
  }
}
