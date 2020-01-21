package typings.pinataSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinHashToIPFSResponseJS extends js.Object {
  var ipfsHash: String
}

object PinHashToIPFSResponseJS {
  @scala.inline
  def apply(ipfsHash: String): PinHashToIPFSResponseJS = {
    val __obj = js.Dynamic.literal(ipfsHash = ipfsHash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PinHashToIPFSResponseJS]
  }
}

