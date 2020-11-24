package typings.openpgp.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "emsa")
@js.native
object emsa extends js.Object {
  
  /**
    * Create a EMSA-PKCS1-v1_5 padded message
    * @see
    * @param algo Hash algorithm type used
    * @param hashed message to be encoded
    * @param emLen intended length in octets of the encoded message
    * @returns encoded message
    */
  def encode(algo: Integer, hashed: Uint8Array, emLen: Integer): String = js.native
}
