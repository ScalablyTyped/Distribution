package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission extends StObject {
  
  /** The service API associated with the permission is not enabled. */
  var apiDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** The current custom role support level. */
  var customRolesSupportLevel: js.UndefOr[String] = js.undefined
  
  /** A brief description of what this Permission is used for. This permission can ONLY be used in predefined roles. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The name of this Permission. */
  var name: js.UndefOr[String] = js.undefined
  
  var onlyInPredefinedRoles: js.UndefOr[Boolean] = js.undefined
  
  /** The preferred name for this permission. If present, then this permission is an alias of, and equivalent to, the listed primary_permission. */
  var primaryPermission: js.UndefOr[String] = js.undefined
  
  /** The current launch stage of the permission. */
  var stage: js.UndefOr[String] = js.undefined
  
  /** The title of this Permission. */
  var title: js.UndefOr[String] = js.undefined
}
object Permission {
  
  inline def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  extension [Self <: Permission](x: Self) {
    
    inline def setApiDisabled(value: Boolean): Self = StObject.set(x, "apiDisabled", value.asInstanceOf[js.Any])
    
    inline def setApiDisabledUndefined: Self = StObject.set(x, "apiDisabled", js.undefined)
    
    inline def setCustomRolesSupportLevel(value: String): Self = StObject.set(x, "customRolesSupportLevel", value.asInstanceOf[js.Any])
    
    inline def setCustomRolesSupportLevelUndefined: Self = StObject.set(x, "customRolesSupportLevel", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnlyInPredefinedRoles(value: Boolean): Self = StObject.set(x, "onlyInPredefinedRoles", value.asInstanceOf[js.Any])
    
    inline def setOnlyInPredefinedRolesUndefined: Self = StObject.set(x, "onlyInPredefinedRoles", js.undefined)
    
    inline def setPrimaryPermission(value: String): Self = StObject.set(x, "primaryPermission", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPermissionUndefined: Self = StObject.set(x, "primaryPermission", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
