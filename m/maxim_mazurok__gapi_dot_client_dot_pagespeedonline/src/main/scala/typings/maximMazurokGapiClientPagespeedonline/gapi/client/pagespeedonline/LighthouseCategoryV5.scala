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
  
  inline def apply(): LighthouseCategoryV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LighthouseCategoryV5]
  }
  
  extension [Self <: LighthouseCategoryV5](x: Self) {
    
    inline def setAuditRefs(value: js.Array[AuditRefs]): Self = StObject.set(x, "auditRefs", value.asInstanceOf[js.Any])
    
    inline def setAuditRefsUndefined: Self = StObject.set(x, "auditRefs", js.undefined)
    
    inline def setAuditRefsVarargs(value: AuditRefs*): Self = StObject.set(x, "auditRefs", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setManualDescription(value: String): Self = StObject.set(x, "manualDescription", value.asInstanceOf[js.Any])
    
    inline def setManualDescriptionUndefined: Self = StObject.set(x, "manualDescription", js.undefined)
    
    inline def setScore(value: js.Any): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
