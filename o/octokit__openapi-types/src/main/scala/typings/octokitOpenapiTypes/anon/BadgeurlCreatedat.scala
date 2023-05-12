package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.active
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deleted_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disabled_fork
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disabled_inactivity
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disabled_manually
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeurlCreatedat extends StObject {
  
  /** @example https://github.com/actions/setup-ruby/workflows/CI/badge.svg */
  var badge_url: String
  
  /**
    * Format: date-time
    * @example 2019-12-06T14:20:20.000Z
    */
  var created_at: String
  
  /**
    * Format: date-time
    * @example 2019-12-06T14:20:20.000Z
    */
  var deleted_at: js.UndefOr[String] = js.undefined
  
  /** @example https://github.com/actions/setup-ruby/blob/master/.github/workflows/ruby.yaml */
  var html_url: String
  
  /** @example 5 */
  var id: Double
  
  /** @example CI */
  var name: String
  
  /** @example MDg6V29ya2Zsb3cxMg== */
  var node_id: String
  
  /** @example ruby.yaml */
  var path: String
  
  /**
    * @example active
    * @enum {string}
    */
  var state: active | deleted_ | disabled_fork | disabled_inactivity | disabled_manually
  
  /**
    * Format: date-time
    * @example 2019-12-06T14:20:20.000Z
    */
  var updated_at: String
  
  /** @example https://api.github.com/repos/actions/setup-ruby/workflows/5 */
  var url: String
}
object BadgeurlCreatedat {
  
  inline def apply(
    badge_url: String,
    created_at: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    path: String,
    state: active | deleted_ | disabled_fork | disabled_inactivity | disabled_manually,
    updated_at: String,
    url: String
  ): BadgeurlCreatedat = {
    val __obj = js.Dynamic.literal(badge_url = badge_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeurlCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BadgeurlCreatedat] (val x: Self) extends AnyVal {
    
    inline def setBadge_url(value: String): Self = StObject.set(x, "badge_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDeleted_at(value: String): Self = StObject.set(x, "deleted_at", value.asInstanceOf[js.Any])
    
    inline def setDeleted_atUndefined: Self = StObject.set(x, "deleted_at", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setState(value: active | deleted_ | disabled_fork | disabled_inactivity | disabled_manually): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
