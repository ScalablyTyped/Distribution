package typings.openpgp

import typings.openpgp.mod.`type`.keyid.Keyid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUserid extends js.Object {
  var keyid: Keyid
  var userid: String
  var valid: Boolean
}

object AnonUserid {
  @scala.inline
  def apply(keyid: Keyid, userid: String, valid: Boolean): AnonUserid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUserid]
  }
}

