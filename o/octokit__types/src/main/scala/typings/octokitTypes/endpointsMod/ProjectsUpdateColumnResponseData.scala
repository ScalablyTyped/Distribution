package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsUpdateColumnResponseData extends StObject {
  
  var cards_url: String
  
  var created_at: String
  
  var id: Double
  
  var name: String
  
  var node_id: String
  
  var project_url: String
  
  var updated_at: String
  
  var url: String
}
object ProjectsUpdateColumnResponseData {
  
  @scala.inline
  def apply(
    cards_url: String,
    created_at: String,
    id: Double,
    name: String,
    node_id: String,
    project_url: String,
    updated_at: String,
    url: String
  ): ProjectsUpdateColumnResponseData = {
    val __obj = js.Dynamic.literal(cards_url = cards_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], project_url = project_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateColumnResponseData]
  }
  
  @scala.inline
  implicit class ProjectsUpdateColumnResponseDataMutableBuilder[Self <: ProjectsUpdateColumnResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCards_url(value: String): Self = StObject.set(x, "cards_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject_url(value: String): Self = StObject.set(x, "project_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
