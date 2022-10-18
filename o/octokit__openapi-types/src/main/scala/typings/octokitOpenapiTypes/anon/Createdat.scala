package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Createdat extends StObject {
  
  /** Format: uri */
  var avatar_url: String
  
  /**
    * Format: date-time
    * @example 2019-01-26T19:01:12Z
    */
  var created_at: String | Null
  
  /** @description A short description of the enterprise. */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format: uri
    * @example https://github.com/enterprises/octo-business
    */
  var html_url: String
  
  /**
    * @description Unique identifier of the enterprise
    * @example 42
    */
  var id: Double
  
  /**
    * @description The name of the enterprise.
    * @example Octo Business
    */
  var name: String
  
  /** @example MDEwOlJlcG9zaXRvcnkxMjk2MjY5 */
  var node_id: String
  
  /**
    * @description The slug url identifier for the enterprise.
    * @example octo-business
    */
  var slug: String
  
  /**
    * Format: date-time
    * @example 2019-01-26T19:14:43Z
    */
  var updated_at: String | Null
  
  /**
    * Format: uri
    * @description The enterprise's website URL.
    */
  var website_url: js.UndefOr[String | Null] = js.undefined
}
object Createdat {
  
  inline def apply(avatar_url: String, html_url: String, id: Double, name: String, node_id: String, slug: String): Createdat = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], created_at = null, updated_at = null)
    __obj.asInstanceOf[Createdat]
  }
  
  extension [Self <: Createdat](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
    
    inline def setWebsite_url(value: String): Self = StObject.set(x, "website_url", value.asInstanceOf[js.Any])
    
    inline def setWebsite_urlNull: Self = StObject.set(x, "website_url", null)
    
    inline def setWebsite_urlUndefined: Self = StObject.set(x, "website_url", js.undefined)
  }
}
