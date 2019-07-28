package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListGpgKeysResponseItem extends js.Object {
  var can_certify: Boolean
  var can_encrypt_comms: Boolean
  var can_encrypt_storage: Boolean
  var can_sign: Boolean
  var created_at: String
  var emails: js.Array[UsersListGpgKeysResponseItemEmailsItem]
  var expires_at: Null
  var id: Double
  var key_id: String
  var primary_key_id: Null
  var public_key: String
  var subkeys: js.Array[UsersListGpgKeysResponseItemSubkeysItem]
}

object UsersListGpgKeysResponseItem {
  @scala.inline
  def apply(
    can_certify: Boolean,
    can_encrypt_comms: Boolean,
    can_encrypt_storage: Boolean,
    can_sign: Boolean,
    created_at: String,
    emails: js.Array[UsersListGpgKeysResponseItemEmailsItem],
    expires_at: Null,
    id: Double,
    key_id: String,
    primary_key_id: Null,
    public_key: String,
    subkeys: js.Array[UsersListGpgKeysResponseItemSubkeysItem]
  ): UsersListGpgKeysResponseItem = {
    val __obj = js.Dynamic.literal(can_certify = can_certify, can_encrypt_comms = can_encrypt_comms, can_encrypt_storage = can_encrypt_storage, can_sign = can_sign, created_at = created_at, emails = emails, expires_at = expires_at, id = id, key_id = key_id, primary_key_id = primary_key_id, public_key = public_key, subkeys = subkeys)
  
    __obj.asInstanceOf[UsersListGpgKeysResponseItem]
  }
}

