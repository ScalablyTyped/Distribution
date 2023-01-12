package typings.pgPromise.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binary extends StObject {
  
  var _types: Any
  
  var binary: Any
  
  var text: Any
}
object Binary {
  
  inline def apply(_types: Any, binary: Any, text: Any): Binary = {
    val __obj = js.Dynamic.literal(_types = _types.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Binary] (val x: Self) extends AnyVal {
    
    inline def setBinary(value: Any): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def set_types(value: Any): Self = StObject.set(x, "_types", value.asInstanceOf[js.Any])
  }
}
