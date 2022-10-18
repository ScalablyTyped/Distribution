package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var color: String
  
  var data: js.Array[X]
  
  var id: String
}
object Data {
  
  inline def apply(color: String, data: js.Array[X], id: String): Data = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[X]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: X*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
