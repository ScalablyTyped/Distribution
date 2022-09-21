package typings.nats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: String
  
  var hdrs: String
  
  var seq: Double
  
  var subject: String
  
  var time: String
}
object Data {
  
  inline def apply(data: String, hdrs: String, seq: Double, subject: String, time: String): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hdrs = hdrs.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHdrs(value: String): Self = StObject.set(x, "hdrs", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
