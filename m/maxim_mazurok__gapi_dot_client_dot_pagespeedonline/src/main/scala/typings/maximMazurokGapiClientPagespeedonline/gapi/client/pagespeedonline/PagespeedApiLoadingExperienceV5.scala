package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagespeedApiLoadingExperienceV5 extends js.Object {
  
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
  implicit class PagespeedApiLoadingExperienceV5Ops[Self <: PagespeedApiLoadingExperienceV5] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitial_url(value: String): Self = this.set("initial_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial_url: Self = this.set("initial_url", js.undefined)
    
    @scala.inline
    def setMetrics(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.UserPageLoadMetricV5}
      */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.PagespeedApiLoadingExperienceV5 with TopLevel[js.Any]
    ): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setOrigin_fallback(value: Boolean): Self = this.set("origin_fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin_fallback: Self = this.set("origin_fallback", js.undefined)
    
    @scala.inline
    def setOverall_category(value: String): Self = this.set("overall_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverall_category: Self = this.set("overall_category", js.undefined)
  }
}
