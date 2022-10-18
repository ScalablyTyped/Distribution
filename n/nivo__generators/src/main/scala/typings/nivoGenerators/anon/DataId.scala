package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataId extends StObject {
  
  var data: js.Array[XY]
  
  var id: String
}
object DataId {
  
  inline def apply(data: js.Array[XY], id: String): DataId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataId]
  }
  
  extension [Self <: DataId](x: Self) {
    
    inline def setData(value: js.Array[XY]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: XY*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
