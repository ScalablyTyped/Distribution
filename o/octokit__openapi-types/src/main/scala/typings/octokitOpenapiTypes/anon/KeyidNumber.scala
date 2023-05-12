package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyidNumber extends StObject {
  
  var key_id: Double
}
object KeyidNumber {
  
  inline def apply(key_id: Double): KeyidNumber = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyidNumber] (val x: Self) extends AnyVal {
    
    inline def setKey_id(value: Double): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
