package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyidNumber extends StObject {
  
  /** The unique identifier of the key. */
  var key_id: Double
}
object KeyidNumber {
  
  inline def apply(key_id: Double): KeyidNumber = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyidNumber]
  }
  
  extension [Self <: KeyidNumber](x: Self) {
    
    inline def setKey_id(value: Double): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
