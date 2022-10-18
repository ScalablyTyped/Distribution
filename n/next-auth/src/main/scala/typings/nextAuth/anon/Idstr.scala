package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Idstr extends StObject {
  
  var id: Double
  
  var id_str: String
  
  var indices: js.Array[Double]
  
  var name: String
  
  var screen_name: String
}
object Idstr {
  
  inline def apply(id: Double, id_str: String, indices: js.Array[Double], name: String, screen_name: String): Idstr = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], screen_name = screen_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idstr]
  }
  
  extension [Self <: Idstr](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
  }
}
