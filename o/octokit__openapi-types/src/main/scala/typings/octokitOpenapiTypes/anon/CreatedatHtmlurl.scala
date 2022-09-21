package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedatHtmlurl extends StObject {
  
  /**
    * Format: date-time
    * @description The time that the environment was created, in ISO 8601 format.
    * @example 2020-11-23T22:00:40Z
    */
  var created_at: js.UndefOr[String] = js.undefined
  
  /** @example https://github.com/github/hello-world/deployments/activity_log?environments_filter=staging */
  var html_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description The id of the environment.
    * @example 56780428
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The name of the environment.
    * @example staging
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** @example MDExOkVudmlyb25tZW50NTY3ODA0Mjg= */
  var node_id: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @description The time that the environment was last updated, in ISO 8601 format.
    * @example 2020-11-23T22:00:40Z
    */
  var updated_at: js.UndefOr[String] = js.undefined
  
  /** @example https://api.github.com/repos/github/hello-world/environments/staging */
  var url: js.UndefOr[String] = js.undefined
}
object CreatedatHtmlurl {
  
  inline def apply(): CreatedatHtmlurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatedatHtmlurl]
  }
  
  extension [Self <: CreatedatHtmlurl](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
