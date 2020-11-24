package typings.peerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerConnectOption extends js.Object {
  
  var label: js.UndefOr[String] = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var reliable: js.UndefOr[Boolean] = js.native
  
  var serialization: js.UndefOr[String] = js.native
}
object PeerConnectOption {
  
  @scala.inline
  def apply(): PeerConnectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerConnectOption]
  }
  
  @scala.inline
  implicit class PeerConnectOptionOps[Self <: PeerConnectOption] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setReliable(value: Boolean): Self = this.set("reliable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReliable: Self = this.set("reliable", js.undefined)
    
    @scala.inline
    def setSerialization(value: String): Self = this.set("serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialization: Self = this.set("serialization", js.undefined)
  }
}
