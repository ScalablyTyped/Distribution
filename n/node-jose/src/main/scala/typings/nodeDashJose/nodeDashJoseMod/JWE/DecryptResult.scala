package typings.nodeDashJose.nodeDashJoseMod.JWE

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptResult extends js.Object {
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
  def apply(plaintext: Buffer, `protected`: js.Array[String]): DecryptResult = {
    val __obj = js.Dynamic.literal(plaintext = plaintext)
    __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[DecryptResult]
  }
}

