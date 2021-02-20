package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsGetCardResponseData extends StObject {
  
  var archived: Boolean = js.native
  
  var column_url: String = js.native
  
  var content_url: String = js.native
  
  var created_at: String = js.native
  
  var creator: Avatarurl = js.native
  
  var id: Double = js.native
  
  var node_id: String = js.native
  
  var note: String = js.native
  
  var project_url: String = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
}
object ProjectsGetCardResponseData {
  
  @scala.inline
  def apply(
    archived: Boolean,
    column_url: String,
    content_url: String,
    created_at: String,
    creator: Avatarurl,
    id: Double,
    node_id: String,
    note: String,
    project_url: String,
    updated_at: String,
    url: String
  ): ProjectsGetCardResponseData = {
    val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], column_url = column_url.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], project_url = project_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetCardResponseData]
  }
  
  @scala.inline
  implicit class ProjectsGetCardResponseDataMutableBuilder[Self <: ProjectsGetCardResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_url(value: String): Self = StObject.set(x, "column_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_url(value: String): Self = StObject.set(x, "content_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Avatarurl): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject_url(value: String): Self = StObject.set(x, "project_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
