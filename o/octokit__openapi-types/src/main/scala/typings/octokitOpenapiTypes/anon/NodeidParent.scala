package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeidParent extends StObject {
  
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** @description Description of the team */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /** Format: uri */
  var html_url: js.UndefOr[String] = js.undefined
  
  /** @description Unique identifier of the team */
  var id: Double
  
  /** Format: uri-template */
  var members_url: js.UndefOr[String] = js.undefined
  
  /** @description Name of the team */
  var name: String
  
  var node_id: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[IdMembersurl | Null] = js.undefined
  
  /** @description Permission that the team will have for its repositories */
  var permission: js.UndefOr[String] = js.undefined
  
  /** @enum {string} */
  var privacy: js.UndefOr[open | closed | secret] = js.undefined
  
  /** Format: uri */
  var repositories_url: js.UndefOr[String] = js.undefined
  
  var slug: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @description URL for the team
    */
  var url: js.UndefOr[String] = js.undefined
}
object NodeidParent {
  
  inline def apply(id: Double, name: String): NodeidParent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeidParent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeidParent] (val x: Self) extends AnyVal {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    inline def setMembers_urlUndefined: Self = StObject.set(x, "members_url", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setParent(value: IdMembersurl): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPrivacy(value: open | closed | secret): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    inline def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    inline def setRepositories_urlUndefined: Self = StObject.set(x, "repositories_url", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
