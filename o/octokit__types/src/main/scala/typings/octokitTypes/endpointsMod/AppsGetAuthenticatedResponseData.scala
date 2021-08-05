package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Description
import typings.octokitTypes.anon.Issues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsGetAuthenticatedResponseData extends StObject {
  
  var created_at: String
  
  var description: String
  
  var events: js.Array[String]
  
  var external_url: String
  
  var html_url: String
  
  var id: Double
  
  var installations_count: Double
  
  var name: String
  
  var node_id: String
  
  var owner: Description
  
  var permissions: Issues
  
  var slug: String
  
  var updated_at: String
}
object AppsGetAuthenticatedResponseData {
  
  inline def apply(
    created_at: String,
    description: String,
    events: js.Array[String],
    external_url: String,
    html_url: String,
    id: Double,
    installations_count: Double,
    name: String,
    node_id: String,
    owner: Description,
    permissions: Issues,
    slug: String,
    updated_at: String
  ): AppsGetAuthenticatedResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installations_count = installations_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetAuthenticatedResponseData]
  }
  
  extension [Self <: AppsGetAuthenticatedResponseData](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstallations_count(value: Double): Self = StObject.set(x, "installations_count", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Description): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Issues): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
