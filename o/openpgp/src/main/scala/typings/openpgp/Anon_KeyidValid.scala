package typings.openpgp

import typings.openpgp.openpgpMod.`type`.keyid.Keyid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyidValid extends js.Object {
  var keyid: Keyid
  var valid: Boolean
  var verified: js.Promise[Boolean]
}

object Anon_KeyidValid {
  @scala.inline
  def apply(keyid: Keyid, valid: Boolean, verified: js.Promise[Boolean]): Anon_KeyidValid = {
    val __obj = js.Dynamic.literal(keyid = keyid, valid = valid, verified = verified)
  
    __obj.asInstanceOf[Anon_KeyidValid]
  }
}

