package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaExtension extends Entity {
  
  // Description for the schema extension.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The appId of the application that is the owner of the schema extension. This property can be supplied on creation, to
    * set the owner. If not supplied, then the calling application's appId will be set as the owner. In either case, the
    * signed-in user must be the owner of the application. Once set, this property is read-only and cannot be changed.
    */
  var owner: js.UndefOr[String] = js.native
  
  // The collection of property names and types that make up the schema extension definition.
  var properties: js.UndefOr[js.Array[ExtensionSchemaProperty]] = js.native
  
  /**
    * The lifecycle state of the schema extension. Possible states are InDevelopment, Available, and Deprecated.
    * Automatically set to InDevelopment on creation. Schema extensions provides more information on the possible state
    * transitions and behaviors.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Set of Microsoft Graph types (that can support extensions) that the schema extension can be applied to. Select from
    * contact, device, event, group, message, organization, post, or user.
    */
  var targetTypes: js.UndefOr[js.Array[String]] = js.native
}
object SchemaExtension {
  
  @scala.inline
  def apply(): SchemaExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtension]
  }
  
  @scala.inline
  implicit class SchemaExtensionOps[Self <: SchemaExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: ExtensionSchemaProperty*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[ExtensionSchemaProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTargetTypesVarargs(value: String*): Self = this.set("targetTypes", js.Array(value :_*))
    
    @scala.inline
    def setTargetTypes(value: js.Array[String]): Self = this.set("targetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTypes: Self = this.set("targetTypes", js.undefined)
  }
}
