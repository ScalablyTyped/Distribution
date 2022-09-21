package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LostStreamData extends StObject {
  
  var bytes: Double
  
  var msgs: Double
}
object LostStreamData {
  
  inline def apply(bytes: Double, msgs: Double): LostStreamData = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], msgs = msgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LostStreamData]
  }
  
  extension [Self <: LostStreamData](x: Self) {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setMsgs(value: Double): Self = StObject.set(x, "msgs", value.asInstanceOf[js.Any])
  }
}
