package typings.openpgp

import typings.openpgp.openpgpMod.typeNs.keyidNs.Keyid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Keyid extends js.Object {
  var keyid: Keyid
  var valid: Boolean
}

object Anon_Keyid {
  @scala.inline
  def apply(keyid: Keyid, valid: Boolean): Anon_Keyid = {
    val __obj = js.Dynamic.literal(keyid = keyid, valid = valid)
  
    __obj.asInstanceOf[Anon_Keyid]
  }
}

