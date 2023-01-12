package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Communication extends StObject {
  
  var communication: String
  
  var incoming: Boolean
  
  var outgoing: Boolean
  
  var signedon: Boolean
}
object Communication {
  
  inline def apply(communication: String, incoming: Boolean, outgoing: Boolean, signedon: Boolean): Communication = {
    val __obj = js.Dynamic.literal(communication = communication.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], signedon = signedon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Communication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Communication] (val x: Self) extends AnyVal {
    
    inline def setCommunication(value: String): Self = StObject.set(x, "communication", value.asInstanceOf[js.Any])
    
    inline def setIncoming(value: Boolean): Self = StObject.set(x, "incoming", value.asInstanceOf[js.Any])
    
    inline def setOutgoing(value: Boolean): Self = StObject.set(x, "outgoing", value.asInstanceOf[js.Any])
    
    inline def setSignedon(value: Boolean): Self = StObject.set(x, "signedon", value.asInstanceOf[js.Any])
  }
}
