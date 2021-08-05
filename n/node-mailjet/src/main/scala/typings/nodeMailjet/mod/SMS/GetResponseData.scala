package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponseData extends StObject {
  
  val Data: js.Array[GetResponseDataData]
}
object GetResponseData {
  
  inline def apply(Data: js.Array[GetResponseDataData]): GetResponseData = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseData]
  }
  
  extension [Self <: GetResponseData](x: Self) {
    
    inline def setData(value: js.Array[GetResponseDataData]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: GetResponseDataData*): Self = StObject.set(x, "Data", js.Array(value :_*))
  }
}
