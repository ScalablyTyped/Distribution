package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubAck extends StObject {
  
  def ack(): Unit
  
  var domain: js.UndefOr[String] = js.undefined
  
  var duplicate: Boolean
  
  var seq: Double
  
  var stream: String
}
object PubAck {
  
  inline def apply(ack: () => Unit, duplicate: Boolean, seq: Double, stream: String): PubAck = {
    val __obj = js.Dynamic.literal(ack = js.Any.fromFunction0(ack), duplicate = duplicate.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubAck]
  }
  
  extension [Self <: PubAck](x: Self) {
    
    inline def setAck(value: () => Unit): Self = StObject.set(x, "ack", js.Any.fromFunction0(value))
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDuplicate(value: Boolean): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
