package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyidValid extends js.Object {
  var keyid: openpgpLib.openpgpMod.typeNs.keyidNs.Keyid
  var valid: scala.Boolean
  var verified: js.Promise[scala.Boolean]
}

object Anon_KeyidValid {
  @scala.inline
  def apply(
    keyid: openpgpLib.openpgpMod.typeNs.keyidNs.Keyid,
    valid: scala.Boolean,
    verified: js.Promise[scala.Boolean]
  ): Anon_KeyidValid = {
    val __obj = js.Dynamic.literal(keyid = keyid, valid = valid, verified = verified)
  
    __obj.asInstanceOf[Anon_KeyidValid]
  }
}

