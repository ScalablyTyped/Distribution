package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedatDescription extends StObject {
  
  /** Format: date-time */
  var created_at: String | Null
  
  var description: String | Null
  
  /** @description The list of events for the GitHub app */
  var events: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52, starting with typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch_protection_rule, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_run, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_suite */ Any
    ]
  ] = js.undefined
  
  /** Format: uri */
  var external_url: String | Null
  
  /** Format: uri */
  var html_url: String
  
  /** @description Unique identifier of the GitHub app */
  var id: Double | Null
  
  /** @description The name of the GitHub app */
  var name: String
  
  var node_id: String
  
  /** User */
  var owner: Deleted | Null
  
  /** @description The set of permissions for the GitHub app */
  var permissions: js.UndefOr[Contentreferences] = js.undefined
  
  /** @description The slug name of the GitHub app */
  var slug: js.UndefOr[String] = js.undefined
  
  /** Format: date-time */
  var updated_at: String | Null
}
object CreatedatDescription {
  
  inline def apply(html_url: String, name: String, node_id: String): CreatedatDescription = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], created_at = null, description = null, external_url = null, id = null, owner = null, updated_at = null)
    __obj.asInstanceOf[CreatedatDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatedatDescription] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEvents(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52, starting with typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch_protection_rule, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_run, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_suite */ Any
        ]
    ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52, starting with typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch_protection_rule, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_run, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_suite */ Any)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    inline def setExternal_urlNull: Self = StObject.set(x, "external_url", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Deleted): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setPermissions(value: Contentreferences): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
  }
}
