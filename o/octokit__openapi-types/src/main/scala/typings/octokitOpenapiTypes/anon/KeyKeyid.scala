package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyKeyid extends StObject {
  
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
}
object KeyKeyid {
  
  inline def apply(key: String, key_id: String): KeyKeyid = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyKeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyKeyid] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
