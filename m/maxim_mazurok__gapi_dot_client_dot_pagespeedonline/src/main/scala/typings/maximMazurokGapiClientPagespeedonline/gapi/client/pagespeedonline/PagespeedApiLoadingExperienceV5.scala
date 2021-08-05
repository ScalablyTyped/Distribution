package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagespeedApiLoadingExperienceV5 extends StObject {
  
  /** The url, pattern or origin which the metrics are on. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The requested URL, which may differ from the resolved "id". */
  var initial_url: js.UndefOr[String] = js.undefined
  
  /** The map of . */
  var metrics: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.UserPageLoadMetricV5}
    */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.PagespeedApiLoadingExperienceV5 & TopLevel[js.Any]
  ] = js.undefined
  
  /** True if the result is an origin fallback from a page, false otherwise. */
  var origin_fallback: js.UndefOr[Boolean] = js.undefined
  
  /** The human readable speed "category" of the id. */
  var overall_category: js.UndefOr[String] = js.undefined
}
object PagespeedApiLoadingExperienceV5 {
  
  inline def apply(): PagespeedApiLoadingExperienceV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagespeedApiLoadingExperienceV5]
  }
  
  extension [Self <: PagespeedApiLoadingExperienceV5](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitial_url(value: String): Self = StObject.set(x, "initial_url", value.asInstanceOf[js.Any])
    
    inline def setInitial_urlUndefined: Self = StObject.set(x, "initial_url", js.undefined)
    
    inline def setMetrics(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.UserPageLoadMetricV5}
      */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.PagespeedApiLoadingExperienceV5 & TopLevel[js.Any]
    ): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setOrigin_fallback(value: Boolean): Self = StObject.set(x, "origin_fallback", value.asInstanceOf[js.Any])
    
    inline def setOrigin_fallbackUndefined: Self = StObject.set(x, "origin_fallback", js.undefined)
    
    inline def setOverall_category(value: String): Self = StObject.set(x, "overall_category", value.asInstanceOf[js.Any])
    
    inline def setOverall_categoryUndefined: Self = StObject.set(x, "overall_category", js.undefined)
  }
}
