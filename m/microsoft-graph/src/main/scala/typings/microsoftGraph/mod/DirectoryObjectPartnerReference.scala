package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryObjectPartnerReference extends DirectoryObject {
  
  // Description of the object returned. Read-only.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of directory object being returned, like group or application. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The tenant identifier for the partner tenant. Read-only.
  var externalPartnerTenantId: js.UndefOr[NullableOption[String]] = js.native
  
  // The type of the referenced object in the partner tenant. Read-only.
  var objectType: js.UndefOr[NullableOption[String]] = js.native
}
object DirectoryObjectPartnerReference {
  
  @scala.inline
  def apply(): DirectoryObjectPartnerReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryObjectPartnerReference]
  }
  
  @scala.inline
  implicit class DirectoryObjectPartnerReferenceMutableBuilder[Self <: DirectoryObjectPartnerReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExternalPartnerTenantId(value: NullableOption[String]): Self = StObject.set(x, "externalPartnerTenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalPartnerTenantIdNull: Self = StObject.set(x, "externalPartnerTenantId", null)
    
    @scala.inline
    def setExternalPartnerTenantIdUndefined: Self = StObject.set(x, "externalPartnerTenantId", js.undefined)
    
    @scala.inline
    def setObjectType(value: NullableOption[String]): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeNull: Self = StObject.set(x, "objectType", null)
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
  }
}
