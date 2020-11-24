package typings.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofReadyState extends js.Object {
  
  /**
    * The connection has been closed or could not be opened.
    */
  var CLOSED: js.Any = js.native
  
  /**
    * The connection is going through the closing handshake.
    */
  var CLOSING: js.Any = js.native
  
  /**
    * The connection has not yet been established.
    */
  var CONNECTING: js.Any = js.native
  
  /**
    * The WebSocket connection is established and communication is possible.
    */
  var OPEN: js.Any = js.native
}
object TypeofReadyState {
  
  @scala.inline
  def apply(CLOSED: js.Any, CLOSING: js.Any, CONNECTING: js.Any, OPEN: js.Any): TypeofReadyState = {
    val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReadyState]
  }
  
  @scala.inline
  implicit class TypeofReadyStateOps[Self <: TypeofReadyState] (val x: Self) extends AnyVal {
    
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
    def setCLOSED(value: js.Any): Self = this.set("CLOSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLOSING(value: js.Any): Self = this.set("CLOSING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONNECTING(value: js.Any): Self = this.set("CONNECTING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPEN(value: js.Any): Self = this.set("OPEN", value.asInstanceOf[js.Any])
  }
}
