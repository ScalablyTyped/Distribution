package typings.openpgp

import typings.openpgp.mod.`type`.keyid.Keyid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValid extends js.Object {
  var keyid: Keyid
  var valid: Boolean
  var verified: js.Promise[Boolean]
}

object AnonValid {
  @scala.inline
  def apply(keyid: Keyid, valid: Boolean, verified: js.Promise[Boolean]): AnonValid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValid]
  }
}

