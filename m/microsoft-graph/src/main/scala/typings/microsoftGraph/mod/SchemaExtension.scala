package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtension
  extends StObject
     with Entity {
  
  // Description for the schema extension.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The appId of the application that is the owner of the schema extension. This property can be supplied on creation, to
    * set the owner. If not supplied, then the calling application's appId will be set as the owner. In either case, the
    * signed-in user must be the owner of the application. Once set, this property is read-only and cannot be changed.
    */
  var owner: js.UndefOr[String] = js.undefined
  
  // The collection of property names and types that make up the schema extension definition.
  var properties: js.UndefOr[js.Array[ExtensionSchemaProperty]] = js.undefined
  
  /**
    * The lifecycle state of the schema extension. Possible states are InDevelopment, Available, and Deprecated.
    * Automatically set to InDevelopment on creation. Schema extensions provides more information on the possible state
    * transitions and behaviors.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Set of Microsoft Graph types (that can support extensions) that the schema extension can be applied to. Select from
    * contact, device, event, group, message, organization, post, or user.
    */
  var targetTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaExtension {
  
  @scala.inline
  def apply(): SchemaExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtension]
  }
  
  @scala.inline
  implicit class SchemaExtensionMutableBuilder[Self <: SchemaExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[ExtensionSchemaProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: ExtensionSchemaProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTargetTypes(value: js.Array[String]): Self = StObject.set(x, "targetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypesUndefined: Self = StObject.set(x, "targetTypes", js.undefined)
    
    @scala.inline
    def setTargetTypesVarargs(value: String*): Self = StObject.set(x, "targetTypes", js.Array(value :_*))
  }
}
