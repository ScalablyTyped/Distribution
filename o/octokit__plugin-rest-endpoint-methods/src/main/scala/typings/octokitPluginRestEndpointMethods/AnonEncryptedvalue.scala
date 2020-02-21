package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncryptedvalue extends js.Object {
  var encrypted_value: AnonType
  var key_id: AnonType
  var name: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonEncryptedvalue {
  @scala.inline
  def apply(
    encrypted_value: AnonType,
    key_id: AnonType,
    name: AnonRequired,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonEncryptedvalue = {
    val __obj = js.Dynamic.literal(encrypted_value = encrypted_value.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEncryptedvalue]
  }
}

