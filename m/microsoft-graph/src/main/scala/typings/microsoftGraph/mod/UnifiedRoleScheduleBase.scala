package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleScheduleBase
  extends StObject
     with Entity {
  
  /**
    * Read-only property with details of the app-specific scope when the role eligibility or assignment is scoped to an app.
    * Nullable.
    */
  var appScope: js.UndefOr[NullableOption[AppScope]] = js.undefined
  
  /**
    * Identifier of the app-specific scope when the assignment or eligibility is scoped to an app. The scope of an assignment
    * or eligibility determines the set of resources for which the principal has been granted access. App scopes are scopes
    * that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to
    * limit the scope to particular directory objects, for example, administrative units.
    */
  var appScopeId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When the schedule was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identifier of the object through which this schedule was created.
  var createdUsing: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The directory object that is the scope of the role eligibility or assignment. Read-only.
  var directoryScope: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  /**
    * Identifier of the directory object representing the scope of the assignment or eligibility. The scope of an assignment
    * or eligibility determines the set of resources for which the principal has been granted access. Directory scopes are
    * shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use
    * appScopeId to limit the scope to an application only.
    */
  var directoryScopeId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When the schedule was last modified.
  var modifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The principal that's getting a role assignment or that's eligible for a role through the request.
  var principal: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  // Identifier of the principal that has been granted the role assignment or eligibility.
  var principalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Detailed information for the roleDefinition object that is referenced through the roleDefinitionId property.
  var roleDefinition: js.UndefOr[NullableOption[UnifiedRoleDefinition]] = js.undefined
  
  /**
    * Identifier of the unifiedRoleDefinition object that is being assigned to the principal or that a principal is eligible
    * for.
    */
  var roleDefinitionId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The status of the role assignment or eligibility request.
  var status: js.UndefOr[NullableOption[String]] = js.undefined
}
object UnifiedRoleScheduleBase {
  
  inline def apply(): UnifiedRoleScheduleBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleScheduleBase]
  }
  
  extension [Self <: UnifiedRoleScheduleBase](x: Self) {
    
    inline def setAppScope(value: NullableOption[AppScope]): Self = StObject.set(x, "appScope", value.asInstanceOf[js.Any])
    
    inline def setAppScopeId(value: NullableOption[String]): Self = StObject.set(x, "appScopeId", value.asInstanceOf[js.Any])
    
    inline def setAppScopeIdNull: Self = StObject.set(x, "appScopeId", null)
    
    inline def setAppScopeIdUndefined: Self = StObject.set(x, "appScopeId", js.undefined)
    
    inline def setAppScopeNull: Self = StObject.set(x, "appScope", null)
    
    inline def setAppScopeUndefined: Self = StObject.set(x, "appScope", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setCreatedUsing(value: NullableOption[String]): Self = StObject.set(x, "createdUsing", value.asInstanceOf[js.Any])
    
    inline def setCreatedUsingNull: Self = StObject.set(x, "createdUsing", null)
    
    inline def setCreatedUsingUndefined: Self = StObject.set(x, "createdUsing", js.undefined)
    
    inline def setDirectoryScope(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "directoryScope", value.asInstanceOf[js.Any])
    
    inline def setDirectoryScopeId(value: NullableOption[String]): Self = StObject.set(x, "directoryScopeId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryScopeIdNull: Self = StObject.set(x, "directoryScopeId", null)
    
    inline def setDirectoryScopeIdUndefined: Self = StObject.set(x, "directoryScopeId", js.undefined)
    
    inline def setDirectoryScopeNull: Self = StObject.set(x, "directoryScope", null)
    
    inline def setDirectoryScopeUndefined: Self = StObject.set(x, "directoryScope", js.undefined)
    
    inline def setModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateTimeNull: Self = StObject.set(x, "modifiedDateTime", null)
    
    inline def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
    
    inline def setPrincipal(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalId(value: NullableOption[String]): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdNull: Self = StObject.set(x, "principalId", null)
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    inline def setPrincipalNull: Self = StObject.set(x, "principal", null)
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setRoleDefinition(value: NullableOption[UnifiedRoleDefinition]): Self = StObject.set(x, "roleDefinition", value.asInstanceOf[js.Any])
    
    inline def setRoleDefinitionId(value: NullableOption[String]): Self = StObject.set(x, "roleDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setRoleDefinitionIdNull: Self = StObject.set(x, "roleDefinitionId", null)
    
    inline def setRoleDefinitionIdUndefined: Self = StObject.set(x, "roleDefinitionId", js.undefined)
    
    inline def setRoleDefinitionNull: Self = StObject.set(x, "roleDefinition", null)
    
    inline def setRoleDefinitionUndefined: Self = StObject.set(x, "roleDefinition", js.undefined)
    
    inline def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
