package typings.nats.typesMod

import typings.nats.headersMod.MsgHdrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoredMsg extends StObject {
  
  var data: js.typedarray.Uint8Array
  
  var header: MsgHdrs
  
  var seq: Double
  
  var subject: String
  
  var time: js.Date
}
object StoredMsg {
  
  inline def apply(data: js.typedarray.Uint8Array, header: MsgHdrs, seq: Double, subject: String, time: js.Date): StoredMsg = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoredMsg]
  }
  
  extension [Self <: StoredMsg](x: Self) {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: MsgHdrs): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
