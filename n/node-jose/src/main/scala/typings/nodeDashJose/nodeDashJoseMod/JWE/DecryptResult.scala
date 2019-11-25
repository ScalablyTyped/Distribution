package typings.nodeDashJose.nodeDashJoseMod.JWE

import typings.node.Buffer
import typings.nodeDashJose.nodeDashJoseMod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptResult extends js.Object {
  var header: js.Object
  /**
    * Key used to decrypt
    */
  var key: Key
  /**
    * Buffer of the decrypted content
    */
  var payload: Buffer
  /**
    * the decrypted content (alternate)
    */
  var plaintext: Buffer
  /**
    * an array of the member names from the "protected" member
    */
  var `protected`: js.Array[String]
}

object DecryptResult {
  @scala.inline
  def apply(header: js.Object, key: Key, payload: Buffer, plaintext: Buffer, `protected`: js.Array[String]): DecryptResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResult]
  }
}

