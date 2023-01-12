package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleAssignment
  extends StObject
     with Entity {
  
  /**
    * Read-only property with details of the app specific scope when the assignment scope is app specific. Containment
    * entity. Supports $expand.
    */
  var appScope: js.UndefOr[NullableOption[AppScope]] = js.undefined
  
  /**
    * Identifier of the app-specific scope when the assignment scope is app-specific. Either this property or
    * directoryScopeId is required. App scopes are scopes that are defined and understood by this application only. Use / for
    * tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example,
    * administrative units. Supports $filter (eq, in).
    */
  var appScopeId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var condition: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The directory object that is the scope of the assignment. Read-only. Supports $expand.
  var directoryScope: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  /**
    * Identifier of the directory object representing the scope of the assignment. Either this property or appScopeId is
    * required. The scope of an assignment determines the set of resources for which the principal has been granted access.
    * Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for
    * tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, in).
    */
  var directoryScopeId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Referencing the assigned principal. Read-only. Supports $expand.
  var principal: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  // Identifier of the principal to which the assignment is granted. Supports $filter (eq, in).
  var principalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The roleDefinition the assignment is for. Supports $expand. roleDefinition.Id will be auto expanded.
  var roleDefinition: js.UndefOr[NullableOption[UnifiedRoleDefinition]] = js.undefined
  
  // Identifier of the role definition the assignment is for. Read only. Supports $filter (eq, in).
  var roleDefinitionId: js.UndefOr[NullableOption[String]] = js.undefined
}
object UnifiedRoleAssignment {
  
  inline def apply(): UnifiedRoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRoleAssignment] (val x: Self) extends AnyVal {
    
    inline def setAppScope(value: NullableOption[AppScope]): Self = StObject.set(x, "appScope", value.asInstanceOf[js.Any])
    
    inline def setAppScopeId(value: NullableOption[String]): Self = StObject.set(x, "appScopeId", value.asInstanceOf[js.Any])
    
    inline def setAppScopeIdNull: Self = StObject.set(x, "appScopeId", null)
    
    inline def setAppScopeIdUndefined: Self = StObject.set(x, "appScopeId", js.undefined)
    
    inline def setAppScopeNull: Self = StObject.set(x, "appScope", null)
    
    inline def setAppScopeUndefined: Self = StObject.set(x, "appScope", js.undefined)
    
    inline def setCondition(value: NullableOption[String]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDirectoryScope(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "directoryScope", value.asInstanceOf[js.Any])
    
    inline def setDirectoryScopeId(value: NullableOption[String]): Self = StObject.set(x, "directoryScopeId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryScopeIdNull: Self = StObject.set(x, "directoryScopeId", null)
    
    inline def setDirectoryScopeIdUndefined: Self = StObject.set(x, "directoryScopeId", js.undefined)
    
    inline def setDirectoryScopeNull: Self = StObject.set(x, "directoryScope", null)
    
    inline def setDirectoryScopeUndefined: Self = StObject.set(x, "directoryScope", js.undefined)
    
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
  }
}
