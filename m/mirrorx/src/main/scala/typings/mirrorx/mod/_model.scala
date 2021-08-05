package typings.mirrorx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _model extends StObject {
  
  var name: String
  
  var reducers: js.Any
}
object _model {
  
  inline def apply(name: String, reducers: js.Any): _model = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_model]
  }
  
  extension [Self <: _model](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReducers(value: js.Any): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
  }
}
