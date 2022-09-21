package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  var inBytes: Double
  
  var inMsgs: Double
  
  var outBytes: Double
  
  var outMsgs: Double
}
object Stats {
  
  inline def apply(inBytes: Double, inMsgs: Double, outBytes: Double, outMsgs: Double): Stats = {
    val __obj = js.Dynamic.literal(inBytes = inBytes.asInstanceOf[js.Any], inMsgs = inMsgs.asInstanceOf[js.Any], outBytes = outBytes.asInstanceOf[js.Any], outMsgs = outMsgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  extension [Self <: Stats](x: Self) {
    
    inline def setInBytes(value: Double): Self = StObject.set(x, "inBytes", value.asInstanceOf[js.Any])
    
    inline def setInMsgs(value: Double): Self = StObject.set(x, "inMsgs", value.asInstanceOf[js.Any])
    
    inline def setOutBytes(value: Double): Self = StObject.set(x, "outBytes", value.asInstanceOf[js.Any])
    
    inline def setOutMsgs(value: Double): Self = StObject.set(x, "outMsgs", value.asInstanceOf[js.Any])
  }
}
