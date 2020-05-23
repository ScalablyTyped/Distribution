package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  var identity: typings.openfin.identityMod.Identity
  var response: String
  var success: Boolean
}

object Identity {
  @scala.inline
  def apply(identity: typings.openfin.identityMod.Identity, response: String, success: Boolean): Identity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

