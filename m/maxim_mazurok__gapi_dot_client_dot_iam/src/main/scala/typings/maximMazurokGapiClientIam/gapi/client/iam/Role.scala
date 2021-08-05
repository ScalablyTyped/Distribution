package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Role extends StObject {
  
  /** The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. A human-readable description for the role. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The names of the permissions this role grants when bound in an IAM policy. */
  var includedPermissions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete
    * path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role. */
  var stage: js.UndefOr[String] = js.undefined
  
  /** Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes. */
  var title: js.UndefOr[String] = js.undefined
}
object Role {
  
  inline def apply(): Role = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Role]
  }
  
  extension [Self <: Role](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setIncludedPermissions(value: js.Array[String]): Self = StObject.set(x, "includedPermissions", value.asInstanceOf[js.Any])
    
    inline def setIncludedPermissionsUndefined: Self = StObject.set(x, "includedPermissions", js.undefined)
    
    inline def setIncludedPermissionsVarargs(value: String*): Self = StObject.set(x, "includedPermissions", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
