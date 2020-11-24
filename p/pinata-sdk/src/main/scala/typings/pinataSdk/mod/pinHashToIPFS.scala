package typings.pinataSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pinata-sdk", "pinHashToIPFS")
@js.native
object pinHashToIPFS extends js.Object {
  
  def apply(config: PinataConfig, hash: String): js.Promise[PinHashToIPFSResponseJS] = js.native
}
