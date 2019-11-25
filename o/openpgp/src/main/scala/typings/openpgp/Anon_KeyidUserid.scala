package typings.openpgp

import typings.openpgp.openpgpMod.`type`.keyid.Keyid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyidUserid extends js.Object {
  var keyid: Keyid
  var userid: String
  var valid: Boolean
}

object Anon_KeyidUserid {
  @scala.inline
  def apply(keyid: Keyid, userid: String, valid: Boolean): Anon_KeyidUserid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyidUserid]
  }
}

