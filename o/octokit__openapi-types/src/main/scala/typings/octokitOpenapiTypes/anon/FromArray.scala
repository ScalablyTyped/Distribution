package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromArray extends StObject {
  
  var from: js.Array[String]
}
object FromArray {
  
  inline def apply(from: js.Array[String]): FromArray = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromArray] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
  }
}
