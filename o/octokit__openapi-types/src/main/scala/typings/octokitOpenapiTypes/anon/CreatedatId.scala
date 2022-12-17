package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedatId extends StObject {
  
  /** @example 2011-01-26T19:01:12Z */
  var created_at: js.UndefOr[String] = js.undefined
  
  /** @example 2 */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The Base64 encoded public key.
    * @example hBT5WZEj8ZoOv6TYJsfWq7MxTEQopZO5/IT3ZCVQPzs=
    */
  var key: String
  
  /**
    * @description The identifier for the key.
    * @example 1234567
    */
  var key_id: String
  
  /** @example ssh-rsa AAAAB3NzaC1yc2EAAA */
  var title: js.UndefOr[String] = js.undefined
  
  /** @example https://api.github.com/user/keys/2 */
  var url: js.UndefOr[String] = js.undefined
}
object CreatedatId {
  
  inline def apply(key: String, key_id: String): CreatedatId = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedatId]
  }
  
  extension [Self <: CreatedatId](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
