package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Categories extends js.Object {
  
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
  implicit class CategoriesOps[Self <: Categories] (val x: Self) extends AnyVal {
    
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
    def setAccessibility(value: LighthouseCategoryV5): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    
    @scala.inline
    def `setBest-practices`(value: LighthouseCategoryV5): Self = this.set("best-practices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBest-practices`: Self = this.set("best-practices", js.undefined)
    
    @scala.inline
    def setPerformance(value: LighthouseCategoryV5): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setPwa(value: LighthouseCategoryV5): Self = this.set("pwa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePwa: Self = this.set("pwa", js.undefined)
    
    @scala.inline
    def setSeo(value: LighthouseCategoryV5): Self = this.set("seo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeo: Self = this.set("seo", js.undefined)
  }
}
