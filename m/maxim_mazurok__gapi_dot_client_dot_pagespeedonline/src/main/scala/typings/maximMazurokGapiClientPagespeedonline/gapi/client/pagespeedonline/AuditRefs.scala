package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditRefs extends StObject {
  
  /** The category group that the audit belongs to (optional). */
  var group: js.UndefOr[String] = js.undefined
  
  /** The audit ref id. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The weight this audit's score has on the overall category score. */
  var weight: js.UndefOr[Double] = js.undefined
}
object AuditRefs {
  
  inline def apply(): AuditRefs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditRefs]
  }
  
  extension [Self <: AuditRefs](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
