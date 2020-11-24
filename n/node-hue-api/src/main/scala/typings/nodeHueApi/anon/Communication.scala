package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Communication extends js.Object {
  
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
  implicit class CommunicationOps[Self <: Communication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommunication(value: String): Self = this.set("communication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncoming(value: Boolean): Self = this.set("incoming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoing(value: Boolean): Self = this.set("outgoing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedon(value: Boolean): Self = this.set("signedon", value.asInstanceOf[js.Any])
  }
}
