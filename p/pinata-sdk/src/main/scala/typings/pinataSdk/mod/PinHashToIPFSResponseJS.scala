package typings.pinataSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinHashToIPFSResponseJS extends js.Object {
  
  var ipfsHash: String = js.native
}
object PinHashToIPFSResponseJS {
  
  @scala.inline
  def apply(ipfsHash: String): PinHashToIPFSResponseJS = {
    val __obj = js.Dynamic.literal(ipfsHash = ipfsHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinHashToIPFSResponseJS]
  }
  
  @scala.inline
  implicit class PinHashToIPFSResponseJSOps[Self <: PinHashToIPFSResponseJS] (val x: Self) extends AnyVal {
    
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
    def setIpfsHash(value: String): Self = this.set("ipfsHash", value.asInstanceOf[js.Any])
  }
}
