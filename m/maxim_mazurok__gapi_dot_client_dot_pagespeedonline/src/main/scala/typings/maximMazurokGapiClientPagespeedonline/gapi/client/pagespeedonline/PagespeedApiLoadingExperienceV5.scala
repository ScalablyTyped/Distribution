package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagespeedApiLoadingExperienceV5 extends StObject {
  
  /** The url, pattern or origin which the metrics are on. */
  var id: js.UndefOr[String] = js.native
  
  /** The requested URL, which may differ from the resolved "id". */
  var initial_url: js.UndefOr[String] = js.native
  
  /** The map of . */
  var metrics: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.UserPageLoadMetricV5}
    */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.PagespeedApiLoadingExperienceV5 with TopLevel[js.Any]
  ] = js.native
  
  /** True if the result is an origin fallback from a page, false otherwise. */
  var origin_fallback: js.UndefOr[Boolean] = js.native
  
  /** The human readable speed "category" of the id. */
  var overall_category: js.UndefOr[String] = js.native
}
object PagespeedApiLoadingExperienceV5 {
  
  @scala.inline
  def apply(): PagespeedApiLoadingExperienceV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagespeedApiLoadingExperienceV5]
  }
  
  @scala.inline
  implicit class PagespeedApiLoadingExperienceV5MutableBuilder[Self <: PagespeedApiLoadingExperienceV5] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInitial_url(value: String): Self = StObject.set(x, "initial_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial_urlUndefined: Self = StObject.set(x, "initial_url", js.undefined)
    
    @scala.inline
    def setMetrics(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.UserPageLoadMetricV5}
      */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.PagespeedApiLoadingExperienceV5 with TopLevel[js.Any]
    ): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setOrigin_fallback(value: Boolean): Self = StObject.set(x, "origin_fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin_fallbackUndefined: Self = StObject.set(x, "origin_fallback", js.undefined)
    
    @scala.inline
    def setOverall_category(value: String): Self = StObject.set(x, "overall_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverall_categoryUndefined: Self = StObject.set(x, "overall_category", js.undefined)
  }
}
