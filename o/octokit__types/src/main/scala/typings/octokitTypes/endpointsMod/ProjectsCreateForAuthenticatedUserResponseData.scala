package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsCreateForAuthenticatedUserResponseData extends StObject {
  
  var body: String
  
  var columns_url: String
  
  var created_at: String
  
  var creator: Avatarurl
  
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var node_id: String
  
  var number: Double
  
  var owner_url: String
  
  var state: String
  
  var updated_at: String
  
  var url: String
}
object ProjectsCreateForAuthenticatedUserResponseData {
  
  inline def apply(
    body: String,
    columns_url: String,
    created_at: String,
    creator: Avatarurl,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    number: Double,
    owner_url: String,
    state: String,
    updated_at: String,
    url: String
  ): ProjectsCreateForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], columns_url = columns_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner_url = owner_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForAuthenticatedUserResponseData]
  }
  
  extension [Self <: ProjectsCreateForAuthenticatedUserResponseData](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setColumns_url(value: String): Self = StObject.set(x, "columns_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Avatarurl): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOwner_url(value: String): Self = StObject.set(x, "owner_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
