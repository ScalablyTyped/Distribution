package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Number extends StObject {
  
  var body: String = js.native
  
  var columns_url: String = js.native
  
  var created_at: String = js.native
  
  var creator: Avatarurl = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var node_id: String = js.native
  
  var number: Double = js.native
  
  var organization_permission: String = js.native
  
  var owner_url: String = js.native
  
  var permissions: Read = js.native
  
  var `private`: Boolean = js.native
  
  var state: String = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
}
object Number {
  
  @scala.inline
  def apply(
    body: String,
    columns_url: String,
    created_at: String,
    creator: Avatarurl,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    number: Double,
    organization_permission: String,
    owner_url: String,
    permissions: Read,
    `private`: Boolean,
    state: String,
    updated_at: String,
    url: String
  ): Number = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], columns_url = columns_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], organization_permission = organization_permission.asInstanceOf[js.Any], owner_url = owner_url.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
  
  @scala.inline
  implicit class NumberMutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns_url(value: String): Self = StObject.set(x, "columns_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Avatarurl): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_permission(value: String): Self = StObject.set(x, "organization_permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner_url(value: String): Self = StObject.set(x, "owner_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Read): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
