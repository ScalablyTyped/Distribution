package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Cancertify
import typings.octokitTypes.anon.EmailVerified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreateGpgKeyForAuthenticatedResponseData extends js.Object {
  var can_certify: Boolean
  var can_encrypt_comms: Boolean
  var can_encrypt_storage: Boolean
  var can_sign: Boolean
  var created_at: String
  var emails: js.Array[EmailVerified]
  var expires_at: String
  var id: Double
  var key_id: String
  var primary_key_id: String
  var public_key: String
  var subkeys: js.Array[Cancertify]
}

object UsersCreateGpgKeyForAuthenticatedResponseData {
  @scala.inline
  def apply(
    can_certify: Boolean,
    can_encrypt_comms: Boolean,
    can_encrypt_storage: Boolean,
    can_sign: Boolean,
    created_at: String,
    emails: js.Array[EmailVerified],
    expires_at: String,
    id: Double,
    key_id: String,
    primary_key_id: String,
    public_key: String,
    subkeys: js.Array[Cancertify]
  ): UsersCreateGpgKeyForAuthenticatedResponseData = {
    val __obj = js.Dynamic.literal(can_certify = can_certify.asInstanceOf[js.Any], can_encrypt_comms = can_encrypt_comms.asInstanceOf[js.Any], can_encrypt_storage = can_encrypt_storage.asInstanceOf[js.Any], can_sign = can_sign.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any], primary_key_id = primary_key_id.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], subkeys = subkeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCreateGpgKeyForAuthenticatedResponseData]
  }
}

