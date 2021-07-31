package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagespeedApiPagespeedResponseV5 extends StObject {
  
  /** The UTC timestamp of this analysis. */
  var analysisUTCTimestamp: js.UndefOr[String] = js.undefined
  
  /** The captcha verify result */
  var captchaResult: js.UndefOr[String] = js.undefined
  
  /** Canonicalized and final URL for the document, after following page redirects (if any). */
  var id: js.UndefOr[String] = js.undefined
  
  /** Kind of result. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Lighthouse response for the audit url as an object. */
  var lighthouseResult: js.UndefOr[LighthouseResultV5] = js.undefined
  
  /** Metrics of end users' page loading experience. */
  var loadingExperience: js.UndefOr[PagespeedApiLoadingExperienceV5] = js.undefined
  
  /** Metrics of the aggregated page loading experience of the origin */
  var originLoadingExperience: js.UndefOr[PagespeedApiLoadingExperienceV5] = js.undefined
  
  /** The version of PageSpeed used to generate these results. */
  var version: js.UndefOr[PagespeedVersion] = js.undefined
}
object PagespeedApiPagespeedResponseV5 {
  
  @scala.inline
  def apply(): PagespeedApiPagespeedResponseV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagespeedApiPagespeedResponseV5]
  }
  
  @scala.inline
  implicit class PagespeedApiPagespeedResponseV5MutableBuilder[Self <: PagespeedApiPagespeedResponseV5] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisUTCTimestamp(value: String): Self = StObject.set(x, "analysisUTCTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisUTCTimestampUndefined: Self = StObject.set(x, "analysisUTCTimestamp", js.undefined)
    
    @scala.inline
    def setCaptchaResult(value: String): Self = StObject.set(x, "captchaResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptchaResultUndefined: Self = StObject.set(x, "captchaResult", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLighthouseResult(value: LighthouseResultV5): Self = StObject.set(x, "lighthouseResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighthouseResultUndefined: Self = StObject.set(x, "lighthouseResult", js.undefined)
    
    @scala.inline
    def setLoadingExperience(value: PagespeedApiLoadingExperienceV5): Self = StObject.set(x, "loadingExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingExperienceUndefined: Self = StObject.set(x, "loadingExperience", js.undefined)
    
    @scala.inline
    def setOriginLoadingExperience(value: PagespeedApiLoadingExperienceV5): Self = StObject.set(x, "originLoadingExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginLoadingExperienceUndefined: Self = StObject.set(x, "originLoadingExperience", js.undefined)
    
    @scala.inline
    def setVersion(value: PagespeedVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
