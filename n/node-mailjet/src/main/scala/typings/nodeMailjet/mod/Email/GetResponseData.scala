package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponseData extends StObject {
  
  val Count: Double
  
  val Data: js.Array[js.Object]
  
  val Total: Double
}
object GetResponseData {
  
  inline def apply(Count: Double, Data: js.Array[js.Object], Total: Double): GetResponseData = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Total = Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseData]
  }
  
  extension [Self <: GetResponseData](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "Data", js.Array(value :_*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
  }
}
