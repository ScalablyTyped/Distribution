package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canencryptcomms extends js.Object {
  var can_certify: Boolean = js.native
  var can_encrypt_comms: Boolean = js.native
  var can_encrypt_storage: Boolean = js.native
  var can_sign: Boolean = js.native
  var created_at: String = js.native
  var emails: js.Array[EmailVerified] = js.native
  var expires_at: String = js.native
  var id: Double = js.native
  var key_id: String = js.native
  var primary_key_id: String = js.native
  var public_key: String = js.native
  var subkeys: js.Array[Cancertify] = js.native
}

object Canencryptcomms {
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
  ): Canencryptcomms = {
    val __obj = js.Dynamic.literal(can_certify = can_certify.asInstanceOf[js.Any], can_encrypt_comms = can_encrypt_comms.asInstanceOf[js.Any], can_encrypt_storage = can_encrypt_storage.asInstanceOf[js.Any], can_sign = can_sign.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any], primary_key_id = primary_key_id.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], subkeys = subkeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canencryptcomms]
  }
  @scala.inline
  implicit class CanencryptcommsOps[Self <: Canencryptcomms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCan_certify(value: Boolean): Self = this.set("can_certify", value.asInstanceOf[js.Any])
    @scala.inline
    def setCan_encrypt_comms(value: Boolean): Self = this.set("can_encrypt_comms", value.asInstanceOf[js.Any])
    @scala.inline
    def setCan_encrypt_storage(value: Boolean): Self = this.set("can_encrypt_storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setCan_sign(value: Boolean): Self = this.set("can_sign", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailsVarargs(value: EmailVerified*): Self = this.set("emails", js.Array(value :_*))
    @scala.inline
    def setEmails(value: js.Array[EmailVerified]): Self = this.set("emails", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires_at(value: String): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey_id(value: String): Self = this.set("key_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimary_key_id(value: String): Self = this.set("primary_key_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic_key(value: String): Self = this.set("public_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubkeysVarargs(value: Cancertify*): Self = this.set("subkeys", js.Array(value :_*))
    @scala.inline
    def setSubkeys(value: js.Array[Cancertify]): Self = this.set("subkeys", value.asInstanceOf[js.Any])
  }
  
}

