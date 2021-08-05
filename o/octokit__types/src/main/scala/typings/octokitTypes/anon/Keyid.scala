package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyid extends StObject {
  
  var key: String
  
  var key_id: String
}
object Keyid {
  
  inline def apply(key: String, key_id: String): Keyid = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyid]
  }
  
  extension [Self <: Keyid](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
