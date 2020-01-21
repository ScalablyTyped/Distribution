package typings.openpgp

import typings.openpgp.mod.`type`.keyid.Keyid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyidUserid extends js.Object {
  var keyid: Keyid
  var userid: String
  var valid: Boolean
}

object AnonKeyidUserid {
  @scala.inline
  def apply(keyid: Keyid, userid: String, valid: Boolean): AnonKeyidUserid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyidUserid]
  }
}

