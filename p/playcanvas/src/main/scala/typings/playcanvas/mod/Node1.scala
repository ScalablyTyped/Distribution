package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A animation node has a name and contains an array of keyframes.
  */
trait Node1 extends StObject {
  
  var _keys: js.Array[Any]
  
  var _name: String
}
object Node1 {
  
  inline def apply(_keys: js.Array[Any], _name: String): Node1 = {
    val __obj = js.Dynamic.literal(_keys = _keys.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node1]
  }
  
  extension [Self <: Node1](x: Self) {
    
    inline def set_keys(value: js.Array[Any]): Self = StObject.set(x, "_keys", value.asInstanceOf[js.Any])
    
    inline def set_keysVarargs(value: Any*): Self = StObject.set(x, "_keys", js.Array(value*))
    
    inline def set_name(value: String): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
  }
}
