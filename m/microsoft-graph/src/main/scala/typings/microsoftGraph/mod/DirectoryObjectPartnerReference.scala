package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryObjectPartnerReference
  extends StObject
     with DirectoryObject {
  
  // Description of the object returned. Read-only.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of directory object being returned, like group or application. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The tenant identifier for the partner tenant. Read-only.
  var externalPartnerTenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of the referenced object in the partner tenant. Read-only.
  var objectType: js.UndefOr[NullableOption[String]] = js.undefined
}
object DirectoryObjectPartnerReference {
  
  inline def apply(): DirectoryObjectPartnerReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryObjectPartnerReference]
  }
  
  extension [Self <: DirectoryObjectPartnerReference](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalPartnerTenantId(value: NullableOption[String]): Self = StObject.set(x, "externalPartnerTenantId", value.asInstanceOf[js.Any])
    
    inline def setExternalPartnerTenantIdNull: Self = StObject.set(x, "externalPartnerTenantId", null)
    
    inline def setExternalPartnerTenantIdUndefined: Self = StObject.set(x, "externalPartnerTenantId", js.undefined)
    
    inline def setObjectType(value: NullableOption[String]): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNull: Self = StObject.set(x, "objectType", null)
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
  }
}
