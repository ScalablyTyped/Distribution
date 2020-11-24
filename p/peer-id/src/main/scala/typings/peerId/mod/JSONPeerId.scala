package typings.peerId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PeerId JSON format.
  */
@js.native
trait JSONPeerId extends js.Object {
  
  /**
    * String representation of PeerId.
    */
  var id: String = js.native
  
  /**
    * Private key.
    */
  var privKey: js.UndefOr[String] = js.native
  
  /**
    * Public key.
    */
  var pubKey: js.UndefOr[String] = js.native
}
object JSONPeerId {
  
  @scala.inline
  def apply(id: String): JSONPeerId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONPeerId]
  }
  
  @scala.inline
  implicit class JSONPeerIdOps[Self <: JSONPeerId] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivKey(value: String): Self = this.set("privKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivKey: Self = this.set("privKey", js.undefined)
    
    @scala.inline
    def setPubKey(value: String): Self = this.set("pubKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubKey: Self = this.set("pubKey", js.undefined)
  }
}
