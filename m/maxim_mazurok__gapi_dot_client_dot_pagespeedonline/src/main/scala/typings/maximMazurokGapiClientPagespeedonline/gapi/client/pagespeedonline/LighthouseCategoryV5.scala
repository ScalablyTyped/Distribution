package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LighthouseCategoryV5 extends StObject {
  
  /** An array of references to all the audit members of this category. */
  var auditRefs: js.UndefOr[js.Array[AuditRefs]] = js.undefined
  
  /** A more detailed description of the category and its importance. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The string identifier of the category. */
  var id: js.UndefOr[String] = js.undefined
  
  /** A description for the manual audits in the category. */
  var manualDescription: js.UndefOr[String] = js.undefined
  
  /** The overall score of the category, the weighted average of all its audits. (The category's score, can be null.) */
  var score: js.UndefOr[js.Any] = js.undefined
  
  /** The human-friendly name of the category. */
  var title: js.UndefOr[String] = js.undefined
}
object LighthouseCategoryV5 {
  
  @scala.inline
  def apply(): LighthouseCategoryV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LighthouseCategoryV5]
  }
  
  @scala.inline
  implicit class LighthouseCategoryV5MutableBuilder[Self <: LighthouseCategoryV5] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditRefs(value: js.Array[AuditRefs]): Self = StObject.set(x, "auditRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditRefsUndefined: Self = StObject.set(x, "auditRefs", js.undefined)
    
    @scala.inline
    def setAuditRefsVarargs(value: AuditRefs*): Self = StObject.set(x, "auditRefs", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setManualDescription(value: String): Self = StObject.set(x, "manualDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualDescriptionUndefined: Self = StObject.set(x, "manualDescription", js.undefined)
    
    @scala.inline
    def setScore(value: js.Any): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
