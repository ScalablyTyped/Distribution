package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LighthouseResultV5 extends StObject {
  
  /** Map of audits in the LHR. */
  var audits: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.LighthouseAuditResultV5} */ js.Any
  ] = js.undefined
  
  /** Map of categories in the LHR. */
  var categories: js.UndefOr[Categories] = js.undefined
  
  /** Map of category groups in the LHR. */
  var categoryGroups: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.CategoryGroupV5} */ js.Any
  ] = js.undefined
  
  /** The configuration settings for this LHR. */
  var configSettings: js.UndefOr[ConfigSettings] = js.undefined
  
  /** Environment settings that were used when making this LHR. */
  var environment: js.UndefOr[Environment] = js.undefined
  
  /** The time that this run was fetched. */
  var fetchTime: js.UndefOr[String] = js.undefined
  
  /** The final resolved url that was audited. */
  var finalUrl: js.UndefOr[String] = js.undefined
  
  /** The internationalization strings that are required to render the LHR. */
  var i18n: js.UndefOr[I18n] = js.undefined
  
  /** The lighthouse version that was used to generate this LHR. */
  var lighthouseVersion: js.UndefOr[String] = js.undefined
  
  /** The original requested url. */
  var requestedUrl: js.UndefOr[String] = js.undefined
  
  /** List of all run warnings in the LHR. Will always output to at least `[]`. */
  var runWarnings: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** A top-level error message that, if present, indicates a serious enough problem that this Lighthouse result may need to be discarded. */
  var runtimeError: js.UndefOr[RuntimeError] = js.undefined
  
  /** The Stack Pack advice strings. */
  var stackPacks: js.UndefOr[js.Array[StackPack]] = js.undefined
  
  /** Timing information for this LHR. */
  var timing: js.UndefOr[Timing] = js.undefined
  
  /** The user agent that was used to run this LHR. */
  var userAgent: js.UndefOr[String] = js.undefined
}
object LighthouseResultV5 {
  
  inline def apply(): LighthouseResultV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LighthouseResultV5]
  }
  
  extension [Self <: LighthouseResultV5](x: Self) {
    
    inline def setAudits(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.LighthouseAuditResultV5} */ js.Any
    ): Self = StObject.set(x, "audits", value.asInstanceOf[js.Any])
    
    inline def setAuditsUndefined: Self = StObject.set(x, "audits", js.undefined)
    
    inline def setCategories(value: Categories): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoryGroups(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.CategoryGroupV5} */ js.Any
    ): Self = StObject.set(x, "categoryGroups", value.asInstanceOf[js.Any])
    
    inline def setCategoryGroupsUndefined: Self = StObject.set(x, "categoryGroups", js.undefined)
    
    inline def setConfigSettings(value: ConfigSettings): Self = StObject.set(x, "configSettings", value.asInstanceOf[js.Any])
    
    inline def setConfigSettingsUndefined: Self = StObject.set(x, "configSettings", js.undefined)
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setFetchTime(value: String): Self = StObject.set(x, "fetchTime", value.asInstanceOf[js.Any])
    
    inline def setFetchTimeUndefined: Self = StObject.set(x, "fetchTime", js.undefined)
    
    inline def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
    
    inline def setFinalUrlUndefined: Self = StObject.set(x, "finalUrl", js.undefined)
    
    inline def setI18n(value: I18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setLighthouseVersion(value: String): Self = StObject.set(x, "lighthouseVersion", value.asInstanceOf[js.Any])
    
    inline def setLighthouseVersionUndefined: Self = StObject.set(x, "lighthouseVersion", js.undefined)
    
    inline def setRequestedUrl(value: String): Self = StObject.set(x, "requestedUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestedUrlUndefined: Self = StObject.set(x, "requestedUrl", js.undefined)
    
    inline def setRunWarnings(value: js.Array[Any]): Self = StObject.set(x, "runWarnings", value.asInstanceOf[js.Any])
    
    inline def setRunWarningsUndefined: Self = StObject.set(x, "runWarnings", js.undefined)
    
    inline def setRunWarningsVarargs(value: Any*): Self = StObject.set(x, "runWarnings", js.Array(value*))
    
    inline def setRuntimeError(value: RuntimeError): Self = StObject.set(x, "runtimeError", value.asInstanceOf[js.Any])
    
    inline def setRuntimeErrorUndefined: Self = StObject.set(x, "runtimeError", js.undefined)
    
    inline def setStackPacks(value: js.Array[StackPack]): Self = StObject.set(x, "stackPacks", value.asInstanceOf[js.Any])
    
    inline def setStackPacksUndefined: Self = StObject.set(x, "stackPacks", js.undefined)
    
    inline def setStackPacksVarargs(value: StackPack*): Self = StObject.set(x, "stackPacks", js.Array(value*))
    
    inline def setTiming(value: Timing): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
