package typings.octokitTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Membersurl extends StObject {
  
  var description: String
  
  var html_url: String
  
  var id: Double
  
  var members_url: String
  
  var name: String
  
  var node_id: String
  
  var parent: StringDictionary[js.Any]
  
  var permission: String
  
  var privacy: String
  
  var repositories_url: String
  
  var slug: String
  
  var url: String
}
object Membersurl {
  
  inline def apply(
    description: String,
    html_url: String,
    id: Double,
    members_url: String,
    name: String,
    node_id: String,
    parent: StringDictionary[js.Any],
    permission: String,
    privacy: String,
    repositories_url: String,
    slug: String,
    url: String
  ): Membersurl = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Membersurl]
  }
  
  extension [Self <: Membersurl](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setParent(value: StringDictionary[js.Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPrivacy(value: String): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
