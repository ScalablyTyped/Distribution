package typings.openpgp

import typings.openpgp.openpgpMod.`type`.keyid.Keyid
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
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Keyid]
  }
}

