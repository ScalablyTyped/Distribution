package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditRefs extends StObject {
  
  /** The conventional acronym for the audit/metric. */
  var acronym: js.UndefOr[String] = js.undefined
  
  /** The category group that the audit belongs to (optional). */
  var group: js.UndefOr[String] = js.undefined
  
  /** The audit ref id. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Any audit IDs closely relevant to this one. */
  var relevantAudits: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The weight this audit's score has on the overall category score. */
  var weight: js.UndefOr[Double] = js.undefined
}
object AuditRefs {
  
  inline def apply(): AuditRefs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditRefs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditRefs] (val x: Self) extends AnyVal {
    
    inline def setAcronym(value: String): Self = StObject.set(x, "acronym", value.asInstanceOf[js.Any])
    
    inline def setAcronymUndefined: Self = StObject.set(x, "acronym", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRelevantAudits(value: js.Array[String]): Self = StObject.set(x, "relevantAudits", value.asInstanceOf[js.Any])
    
    inline def setRelevantAuditsUndefined: Self = StObject.set(x, "relevantAudits", js.undefined)
    
    inline def setRelevantAuditsVarargs(value: String*): Self = StObject.set(x, "relevantAudits", js.Array(value*))
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
