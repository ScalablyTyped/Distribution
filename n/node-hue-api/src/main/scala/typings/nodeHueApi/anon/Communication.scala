package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Communication extends StObject {
  
  var communication: String = js.native
  
  var incoming: Boolean = js.native
  
  var outgoing: Boolean = js.native
  
  var signedon: Boolean = js.native
}
object Communication {
  
  @scala.inline
  def apply(communication: String, incoming: Boolean, outgoing: Boolean, signedon: Boolean): Communication = {
    val __obj = js.Dynamic.literal(communication = communication.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], signedon = signedon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Communication]
  }
  
  @scala.inline
  implicit class CommunicationMutableBuilder[Self <: Communication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommunication(value: String): Self = StObject.set(x, "communication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncoming(value: Boolean): Self = StObject.set(x, "incoming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoing(value: Boolean): Self = StObject.set(x, "outgoing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedon(value: Boolean): Self = StObject.set(x, "signedon", value.asInstanceOf[js.Any])
  }
}
