package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembersurlName extends StObject {
  
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** @description Description of the team */
  var description: String | Null
  
  /** Format: uri */
  var html_url: String
  
  /** @description Unique identifier of the team */
  var id: Double
  
  /** Format: uri-template */
  var members_url: String
  
  /** @description Name of the team */
  var name: String
  
  var node_id: String
  
  var parent: js.UndefOr[IdMembersurl | Null] = js.undefined
  
  /** @description Permission that the team will have for its repositories */
  var permission: String
  
  /** @enum {string} */
  var privacy: open | closed | secret
  
  /** Format: uri */
  var repositories_url: String
  
  var slug: String
  
  /**
    * Format: uri
    * @description URL for the team
    */
  var url: String
}
object MembersurlName {
  
  inline def apply(
    html_url: String,
    id: Double,
    members_url: String,
    name: String,
    node_id: String,
    permission: String,
    privacy: open | closed | secret,
    repositories_url: String,
    slug: String,
    url: String
  ): MembersurlName = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[MembersurlName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MembersurlName] (val x: Self) extends AnyVal {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setParent(value: IdMembersurl): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPrivacy(value: open | closed | secret): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
