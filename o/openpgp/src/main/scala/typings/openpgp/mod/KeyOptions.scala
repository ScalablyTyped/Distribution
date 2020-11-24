package typings.openpgp.mod

import typings.openpgp.anon.Passphrase
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyOptions extends js.Object {
  
  /**
    * (optional) elliptic curve for ECC keys: elliptic curve for ECC keys:
    *                                         curve25519, p256, p384, p521, secp256k1,
    *                                         brainpoolP256r1, brainpoolP384r1, or brainpoolP512r1.
    */
  var curve: js.UndefOr[String] = js.native
  
  /**
    * (optional) override the creation date of the key and the key signatures
    */
  var date: js.UndefOr[Date] = js.native
  
  /**
    * (optional) The number of seconds after the key creation time that the key expires
    */
  var keyExpirationTime: js.UndefOr[Double] = js.native
  
  /**
    * (optional) number of bits for RSA keys: 2048 or 4096.
    */
  var numBits: js.UndefOr[Double] = js.native
  
  /**
    * (optional) The passphrase used to encrypt the resulting private key
    */
  var passphrase: js.UndefOr[String] = js.native
  
  /**
    * (optional) options for each subkey, default to main key options. e.g. [ {sign: true, passphrase: '123'}]
    *            sign parameter defaults to false, and indicates whether the subkey should sign rather than encrypt
    */
  var subkeys: js.UndefOr[js.Array[Passphrase]] = js.native
  
  /**
    * array of user IDs e.g. [ { name:'Phil Zimmermann', email:'phil@openpgp.org' }]
    */
  var userIds: js.Array[UserID] = js.native
}
object KeyOptions {
  
  @scala.inline
  def apply(userIds: js.Array[UserID]): KeyOptions = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOptions]
  }
  
  @scala.inline
  implicit class KeyOptionsOps[Self <: KeyOptions] (val x: Self) extends AnyVal {
    
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
    def setUserIdsVarargs(value: UserID*): Self = this.set("userIds", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: js.Array[UserID]): Self = this.set("userIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurve(value: String): Self = this.set("curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setKeyExpirationTime(value: Double): Self = this.set("keyExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyExpirationTime: Self = this.set("keyExpirationTime", js.undefined)
    
    @scala.inline
    def setNumBits(value: Double): Self = this.set("numBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumBits: Self = this.set("numBits", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setSubkeysVarargs(value: Passphrase*): Self = this.set("subkeys", js.Array(value :_*))
    
    @scala.inline
    def setSubkeys(value: js.Array[Passphrase]): Self = this.set("subkeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubkeys: Self = this.set("subkeys", js.undefined)
  }
}
