package typings.pgPromise.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binary extends StObject {
  
  var _types: js.Any
  
  var binary: js.Any
  
  var text: js.Any
}
object Binary {
  
  inline def apply(_types: js.Any, binary: js.Any, text: js.Any): Binary = {
    val __obj = js.Dynamic.literal(_types = _types.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  
  extension [Self <: Binary](x: Self) {
    
    inline def setBinary(value: js.Any): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def set_types(value: js.Any): Self = StObject.set(x, "_types", value.asInstanceOf[js.Any])
  }
}
