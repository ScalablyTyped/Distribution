package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkStats extends StObject {
  
  var bytesReceived: js.Array[Double]
  
  var bytesSent: js.Array[Double]
}
object NetworkStats {
  
  inline def apply(bytesReceived: js.Array[Double], bytesSent: js.Array[Double]): NetworkStats = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkStats] (val x: Self) extends AnyVal {
    
    inline def setBytesReceived(value: js.Array[Double]): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesReceivedVarargs(value: Double*): Self = StObject.set(x, "bytesReceived", js.Array(value*))
    
    inline def setBytesSent(value: js.Array[Double]): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setBytesSentVarargs(value: Double*): Self = StObject.set(x, "bytesSent", js.Array(value*))
  }
}
