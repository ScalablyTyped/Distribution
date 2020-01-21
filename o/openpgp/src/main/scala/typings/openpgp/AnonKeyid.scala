package typings.openpgp

import typings.openpgp.mod.`type`.keyid.Keyid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyid extends js.Object {
  var keyid: Keyid
  var valid: Boolean
}

object AnonKeyid {
  @scala.inline
  def apply(keyid: Keyid, valid: Boolean): AnonKeyid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyid]
  }
}

