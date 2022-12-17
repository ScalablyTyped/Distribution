package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyColumnsurl extends StObject {
  
  var body: String | Null
  
  var columns_url: String
  
  var created_at: String
  
  var creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var node_id: String
  
  var number: Double
  
  /** @description The organization permission for this project. Only present when owner is an organization. */
  var organization_permission: js.UndefOr[String] = js.undefined
  
  var owner_url: String
  
  var permissions: Read
  
  /** @description Whether the project is private or not. Only present when owner is an organization. */
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var state: String
  
  var updated_at: String
  
  var url: String
}
object BodyColumnsurl {
  
  inline def apply(
    columns_url: String,
    created_at: String,
    creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    number: Double,
    owner_url: String,
    permissions: Read,
    state: String,
    updated_at: String,
    url: String
  ): BodyColumnsurl = {
    val __obj = js.Dynamic.literal(columns_url = columns_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner_url = owner_url.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], body = null)
    __obj.asInstanceOf[BodyColumnsurl]
  }
  
  extension [Self <: BodyColumnsurl](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setColumns_url(value: String): Self = StObject.set(x, "columns_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOrganization_permission(value: String): Self = StObject.set(x, "organization_permission", value.asInstanceOf[js.Any])
    
    inline def setOrganization_permissionUndefined: Self = StObject.set(x, "organization_permission", js.undefined)
    
    inline def setOwner_url(value: String): Self = StObject.set(x, "owner_url", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Read): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
