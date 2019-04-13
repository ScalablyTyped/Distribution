package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreateGpgKeyResponse extends js.Object {
  var can_certify: scala.Boolean
  var can_encrypt_comms: scala.Boolean
  var can_encrypt_storage: scala.Boolean
  var can_sign: scala.Boolean
  var created_at: java.lang.String
  var emails: js.Array[UsersCreateGpgKeyResponseEmailsItem]
  var expires_at: scala.Null
  var id: scala.Double
  var key_id: java.lang.String
  var primary_key_id: scala.Null
  var public_key: java.lang.String
  var subkeys: js.Array[UsersCreateGpgKeyResponseSubkeysItem]
}

object UsersCreateGpgKeyResponse {
  @scala.inline
  def apply(
    can_certify: scala.Boolean,
    can_encrypt_comms: scala.Boolean,
    can_encrypt_storage: scala.Boolean,
    can_sign: scala.Boolean,
    created_at: java.lang.String,
    emails: js.Array[UsersCreateGpgKeyResponseEmailsItem],
    expires_at: scala.Null,
    id: scala.Double,
    key_id: java.lang.String,
    primary_key_id: scala.Null,
    public_key: java.lang.String,
    subkeys: js.Array[UsersCreateGpgKeyResponseSubkeysItem]
  ): UsersCreateGpgKeyResponse = {
    val __obj = js.Dynamic.literal(can_certify = can_certify, can_encrypt_comms = can_encrypt_comms, can_encrypt_storage = can_encrypt_storage, can_sign = can_sign, created_at = created_at, emails = emails, expires_at = expires_at, id = id, key_id = key_id, primary_key_id = primary_key_id, public_key = public_key, subkeys = subkeys)
  
    __obj.asInstanceOf[UsersCreateGpgKeyResponse]
  }
}

