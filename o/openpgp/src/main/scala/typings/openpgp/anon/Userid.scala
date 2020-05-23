package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Userid extends js.Object {
  var keyid: typings.openpgp.mod.`type`.keyid.Keyid
  var userid: String
  var valid: Boolean
}

object Userid {
  @scala.inline
  def apply(keyid: typings.openpgp.mod.`type`.keyid.Keyid, userid: String, valid: Boolean): Userid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userid]
  }
}

