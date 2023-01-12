package typings.mirrorx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _model extends StObject {
  
  var name: String
  
  var reducers: Any
}
object _model {
  
  inline def apply(name: String, reducers: Any): _model = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_model]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _model] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReducers(value: Any): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
  }
}
