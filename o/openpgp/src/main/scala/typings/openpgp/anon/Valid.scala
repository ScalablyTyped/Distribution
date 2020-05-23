package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Valid extends js.Object {
  var keyid: typings.openpgp.mod.`type`.keyid.Keyid
  var valid: Boolean
  var verified: js.Promise[Boolean]
}

object Valid {
  @scala.inline
  def apply(keyid: typings.openpgp.mod.`type`.keyid.Keyid, valid: Boolean, verified: js.Promise[Boolean]): Valid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Valid]
  }
}

