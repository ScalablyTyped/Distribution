package typings.nats.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsgArg extends StObject {
  
  var hdr: Double
  
  var reply: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var sid: Double
  
  var size: Double
  
  var subject: js.typedarray.Uint8Array
}
object MsgArg {
  
  inline def apply(hdr: Double, sid: Double, size: Double, subject: js.typedarray.Uint8Array): MsgArg = {
    val __obj = js.Dynamic.literal(hdr = hdr.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgArg]
  }
  
  extension [Self <: MsgArg](x: Self) {
    
    inline def setHdr(value: Double): Self = StObject.set(x, "hdr", value.asInstanceOf[js.Any])
    
    inline def setReply(value: js.typedarray.Uint8Array): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    
    inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
    
    inline def setSid(value: Double): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: js.typedarray.Uint8Array): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
