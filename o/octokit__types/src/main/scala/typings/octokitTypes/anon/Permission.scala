package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission extends StObject {
  
  var description: String
  
  var html_url: String
  
  var id: Double
  
  var members_url: String
  
  var name: String
  
  var node_id: String
  
  var permission: String
  
  var privacy: String
  
  var repositories_url: String
  
  var slug: String
  
  var url: String
}
object Permission {
  
  @scala.inline
  def apply(
    description: String,
    html_url: String,
    id: Double,
    members_url: String,
    name: String,
    node_id: String,
    permission: String,
    privacy: String,
    repositories_url: String,
    slug: String,
    url: String
  ): Permission = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  
  @scala.inline
  implicit class PermissionMutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacy(value: String): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
