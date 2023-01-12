package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedPermissionClassification
  extends StObject
     with Entity {
  
  // The classification value being given. Possible value: low. Does not support $filter.
  var classification: js.UndefOr[NullableOption[PermissionClassificationType]] = js.undefined
  
  /**
    * The unique identifier (id) for the delegated permission listed in the oauth2PermissionScopes collection of the
    * servicePrincipal. Required on create. Does not support $filter.
    */
  var permissionId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The claim value (value) for the delegated permission listed in the oauth2PermissionScopes collection of the
    * servicePrincipal. Does not support $filter.
    */
  var permissionName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DelegatedPermissionClassification {
  
  inline def apply(): DelegatedPermissionClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedPermissionClassification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedPermissionClassification] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: NullableOption[PermissionClassificationType]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationNull: Self = StObject.set(x, "classification", null)
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setPermissionId(value: NullableOption[String]): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdNull: Self = StObject.set(x, "permissionId", null)
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    inline def setPermissionName(value: NullableOption[String]): Self = StObject.set(x, "permissionName", value.asInstanceOf[js.Any])
    
    inline def setPermissionNameNull: Self = StObject.set(x, "permissionName", null)
    
    inline def setPermissionNameUndefined: Self = StObject.set(x, "permissionName", js.undefined)
  }
}
