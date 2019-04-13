package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptResult extends js.Object {
  var sessionKey: openpgpLib.Anon_AeadAlgorithm
}

object EncryptResult {
  @scala.inline
  def apply(sessionKey: openpgpLib.Anon_AeadAlgorithm): EncryptResult = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey)
  
    __obj.asInstanceOf[EncryptResult]
  }
}

