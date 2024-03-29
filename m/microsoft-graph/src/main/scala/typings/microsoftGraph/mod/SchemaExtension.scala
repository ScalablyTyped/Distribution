package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtension
  extends StObject
     with Entity {
  
  // Description for the schema extension. Supports $filter (eq).
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The appId of the application that is the owner of the schema extension. The owner of the schema definition must be
    * explicitly specified during the Create and Update operations, or it will be implied and auto-assigned by Azure AD as
    * follows: In delegated access: The signed-in user must be the owner of the app that calls Microsoft Graph to create the
    * schema extension definition. If the signed-in user isn't the owner of the calling app, they must explicitly specify the
    * owner property, and assign it the appId of an app that they own. In app-only access: The owner property isn't required
    * in the request body. Instead, the calling app is assigned ownership of the schema extension. So, for example, if
    * creating a new schema extension definition using Graph Explorer, you must supply the owner property. Once set, this
    * property is read-only and cannot be changed. Supports $filter (eq).
    */
  var owner: js.UndefOr[String] = js.undefined
  
  // The collection of property names and types that make up the schema extension definition.
  var properties: js.UndefOr[js.Array[ExtensionSchemaProperty]] = js.undefined
  
  /**
    * The lifecycle state of the schema extension. Possible states are InDevelopment, Available, and Deprecated.
    * Automatically set to InDevelopment on creation. For more information about the possible state transitions and
    * behaviors, see Schema extensions lifecycle. Supports $filter (eq).
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Set of Microsoft Graph types (that can support extensions) that the schema extension can be applied to. Select from
    * administrativeUnit, contact, device, event, group, message, organization, post, todoTask, todoTaskList, or user.
    */
  var targetTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaExtension {
  
  inline def apply(): SchemaExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaExtension] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setProperties(value: js.Array[ExtensionSchemaProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: ExtensionSchemaProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetTypes(value: js.Array[String]): Self = StObject.set(x, "targetTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetTypesUndefined: Self = StObject.set(x, "targetTypes", js.undefined)
    
    inline def setTargetTypesVarargs(value: String*): Self = StObject.set(x, "targetTypes", js.Array(value*))
  }
}
