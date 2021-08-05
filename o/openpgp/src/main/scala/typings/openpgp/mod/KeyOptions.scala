package typings.openpgp.mod

import typings.openpgp.anon.Passphrase
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyOptions extends StObject {
  
  /**
    * (optional) elliptic curve for ECC keys: elliptic curve for ECC keys:
    *                                         curve25519, p256, p384, p521, secp256k1,
    *                                         brainpoolP256r1, brainpoolP384r1, or brainpoolP512r1.
    */
  var curve: js.UndefOr[String] = js.undefined
  
  /**
    * (optional) override the creation date of the key and the key signatures
    */
  var date: js.UndefOr[Date] = js.undefined
  
  /**
    * (optional) The number of seconds after the key creation time that the key expires
    */
  var keyExpirationTime: js.UndefOr[Double] = js.undefined
  
  /**
    * (optional) number of bits for RSA keys: 2048 or 4096.
    */
  var numBits: js.UndefOr[Double] = js.undefined
  
  /**
    * (optional) The passphrase used to encrypt the resulting private key
    */
  var passphrase: js.UndefOr[String] = js.undefined
  
  /**
    * (optional) options for each subkey, default to main key options. e.g. [ {sign: true, passphrase: '123'}]
    *            sign parameter defaults to false, and indicates whether the subkey should sign rather than encrypt
    */
  var subkeys: js.UndefOr[js.Array[Passphrase]] = js.undefined
  
  /**
    * array of user IDs e.g. [ { name:'Phil Zimmermann', email:'phil@openpgp.org' }]
    */
  var userIds: js.Array[UserID]
}
object KeyOptions {
  
  inline def apply(userIds: js.Array[UserID]): KeyOptions = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOptions]
  }
  
  extension [Self <: KeyOptions](x: Self) {
    
    inline def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setKeyExpirationTime(value: Double): Self = StObject.set(x, "keyExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setKeyExpirationTimeUndefined: Self = StObject.set(x, "keyExpirationTime", js.undefined)
    
    inline def setNumBits(value: Double): Self = StObject.set(x, "numBits", value.asInstanceOf[js.Any])
    
    inline def setNumBitsUndefined: Self = StObject.set(x, "numBits", js.undefined)
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setSubkeys(value: js.Array[Passphrase]): Self = StObject.set(x, "subkeys", value.asInstanceOf[js.Any])
    
    inline def setSubkeysUndefined: Self = StObject.set(x, "subkeys", js.undefined)
    
    inline def setSubkeysVarargs(value: Passphrase*): Self = StObject.set(x, "subkeys", js.Array(value :_*))
    
    inline def setUserIds(value: js.Array[UserID]): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsVarargs(value: UserID*): Self = StObject.set(x, "userIds", js.Array(value :_*))
  }
}
