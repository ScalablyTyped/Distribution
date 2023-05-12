package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditResource extends StObject {
  
  // Audit resource's type.
  var auditResourceType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of modified properties.
  var modifiedProperties: js.UndefOr[NullableOption[js.Array[AuditProperty]]] = js.undefined
  
  // Audit resource's Id.
  var resourceId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AuditResource {
  
  inline def apply(): AuditResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditResource] (val x: Self) extends AnyVal {
    
    inline def setAuditResourceType(value: NullableOption[String]): Self = StObject.set(x, "auditResourceType", value.asInstanceOf[js.Any])
    
    inline def setAuditResourceTypeNull: Self = StObject.set(x, "auditResourceType", null)
    
    inline def setAuditResourceTypeUndefined: Self = StObject.set(x, "auditResourceType", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setModifiedProperties(value: NullableOption[js.Array[AuditProperty]]): Self = StObject.set(x, "modifiedProperties", value.asInstanceOf[js.Any])
    
    inline def setModifiedPropertiesNull: Self = StObject.set(x, "modifiedProperties", null)
    
    inline def setModifiedPropertiesUndefined: Self = StObject.set(x, "modifiedProperties", js.undefined)
    
    inline def setModifiedPropertiesVarargs(value: AuditProperty*): Self = StObject.set(x, "modifiedProperties", js.Array(value*))
    
    inline def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
