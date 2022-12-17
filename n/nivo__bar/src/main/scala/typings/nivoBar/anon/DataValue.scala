package typings.nivoBar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValue extends StObject {
  
  var data: Value
}
object DataValue {
  
  inline def apply(data: Value): DataValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
  
  extension [Self <: DataValue](x: Self) {
    
    inline def setData(value: Value): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
