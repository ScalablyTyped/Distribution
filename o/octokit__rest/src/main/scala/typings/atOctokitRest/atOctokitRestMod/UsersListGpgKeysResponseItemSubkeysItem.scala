package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListGpgKeysResponseItemSubkeysItem extends js.Object {
  var can_certify: Boolean
  var can_encrypt_comms: Boolean
  var can_encrypt_storage: Boolean
  var can_sign: Boolean
  var created_at: String
  var emails: js.Array[_]
  var expires_at: Null
  var id: Double
  var key_id: String
  var primary_key_id: Double
  var public_key: String
  var subkeys: js.Array[_]
}

object UsersListGpgKeysResponseItemSubkeysItem {
  @scala.inline
  def apply(
    can_certify: Boolean,
    can_encrypt_comms: Boolean,
    can_encrypt_storage: Boolean,
    can_sign: Boolean,
    created_at: String,
    emails: js.Array[_],
    expires_at: Null,
    id: Double,
    key_id: String,
    primary_key_id: Double,
    public_key: String,
    subkeys: js.Array[_]
  ): UsersListGpgKeysResponseItemSubkeysItem = {
    val __obj = js.Dynamic.literal(can_certify = can_certify, can_encrypt_comms = can_encrypt_comms, can_encrypt_storage = can_encrypt_storage, can_sign = can_sign, created_at = created_at, emails = emails, expires_at = expires_at, id = id, key_id = key_id, primary_key_id = primary_key_id, public_key = public_key, subkeys = subkeys)
  
    __obj.asInstanceOf[UsersListGpgKeysResponseItemSubkeysItem]
  }
}

