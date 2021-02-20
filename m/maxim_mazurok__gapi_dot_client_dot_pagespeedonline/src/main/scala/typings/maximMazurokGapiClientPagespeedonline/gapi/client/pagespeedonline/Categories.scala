package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Categories extends StObject {
  
  /** The accessibility category, containing all accessibility related audits. */
  var accessibility: js.UndefOr[LighthouseCategoryV5] = js.native
  
  /** The best practices category, containing all best practices related audits. */
  var `best-practices`: js.UndefOr[LighthouseCategoryV5] = js.native
  
  /** The performance category, containing all performance related audits. */
  var performance: js.UndefOr[LighthouseCategoryV5] = js.native
  
  /** The Progressive-Web-App (PWA) category, containing all pwa related audits. */
  var pwa: js.UndefOr[LighthouseCategoryV5] = js.native
  
  /** The Search-Engine-Optimization (SEO) category, containing all seo related audits. */
  var seo: js.UndefOr[LighthouseCategoryV5] = js.native
}
object Categories {
  
  @scala.inline
  def apply(): Categories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Categories]
  }
  
  @scala.inline
  implicit class CategoriesMutableBuilder[Self <: Categories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: LighthouseCategoryV5): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def `setBest-practices`(value: LighthouseCategoryV5): Self = StObject.set(x, "best-practices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBest-practicesUndefined`: Self = StObject.set(x, "best-practices", js.undefined)
    
    @scala.inline
    def setPerformance(value: LighthouseCategoryV5): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setPwa(value: LighthouseCategoryV5): Self = StObject.set(x, "pwa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPwaUndefined: Self = StObject.set(x, "pwa", js.undefined)
    
    @scala.inline
    def setSeo(value: LighthouseCategoryV5): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeoUndefined: Self = StObject.set(x, "seo", js.undefined)
  }
}
