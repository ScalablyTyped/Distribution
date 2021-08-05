package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyUsageOptions extends StObject {
  
  /** The key may be used to sign certificates. */
  var certSign: js.UndefOr[Boolean] = js.undefined
  
  /** The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation". */
  var contentCommitment: js.UndefOr[Boolean] = js.undefined
  
  /** The key may be used sign certificate revocation lists. */
  var crlSign: js.UndefOr[Boolean] = js.undefined
  
  /** The key may be used to encipher data. */
  var dataEncipherment: js.UndefOr[Boolean] = js.undefined
  
  /** The key may be used to decipher only. */
  var decipherOnly: js.UndefOr[Boolean] = js.undefined
  
  /** The key may be used for digital signatures. */
  var digitalSignature: js.UndefOr[Boolean] = js.undefined
  
  /** The key may be used to encipher only. */
  var encipherOnly: js.UndefOr[Boolean] = js.undefined
  
  /** The key may be used in a key agreement protocol. */
  var keyAgreement: js.UndefOr[Boolean] = js.undefined
  
  /** The key may be used to encipher other keys. */
  var keyEncipherment: js.UndefOr[Boolean] = js.undefined
}
object KeyUsageOptions {
  
  inline def apply(): KeyUsageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyUsageOptions]
  }
  
  extension [Self <: KeyUsageOptions](x: Self) {
    
    inline def setCertSign(value: Boolean): Self = StObject.set(x, "certSign", value.asInstanceOf[js.Any])
    
    inline def setCertSignUndefined: Self = StObject.set(x, "certSign", js.undefined)
    
    inline def setContentCommitment(value: Boolean): Self = StObject.set(x, "contentCommitment", value.asInstanceOf[js.Any])
    
    inline def setContentCommitmentUndefined: Self = StObject.set(x, "contentCommitment", js.undefined)
    
    inline def setCrlSign(value: Boolean): Self = StObject.set(x, "crlSign", value.asInstanceOf[js.Any])
    
    inline def setCrlSignUndefined: Self = StObject.set(x, "crlSign", js.undefined)
    
    inline def setDataEncipherment(value: Boolean): Self = StObject.set(x, "dataEncipherment", value.asInstanceOf[js.Any])
    
    inline def setDataEnciphermentUndefined: Self = StObject.set(x, "dataEncipherment", js.undefined)
    
    inline def setDecipherOnly(value: Boolean): Self = StObject.set(x, "decipherOnly", value.asInstanceOf[js.Any])
    
    inline def setDecipherOnlyUndefined: Self = StObject.set(x, "decipherOnly", js.undefined)
    
    inline def setDigitalSignature(value: Boolean): Self = StObject.set(x, "digitalSignature", value.asInstanceOf[js.Any])
    
    inline def setDigitalSignatureUndefined: Self = StObject.set(x, "digitalSignature", js.undefined)
    
    inline def setEncipherOnly(value: Boolean): Self = StObject.set(x, "encipherOnly", value.asInstanceOf[js.Any])
    
    inline def setEncipherOnlyUndefined: Self = StObject.set(x, "encipherOnly", js.undefined)
    
    inline def setKeyAgreement(value: Boolean): Self = StObject.set(x, "keyAgreement", value.asInstanceOf[js.Any])
    
    inline def setKeyAgreementUndefined: Self = StObject.set(x, "keyAgreement", js.undefined)
    
    inline def setKeyEncipherment(value: Boolean): Self = StObject.set(x, "keyEncipherment", value.asInstanceOf[js.Any])
    
    inline def setKeyEnciphermentUndefined: Self = StObject.set(x, "keyEncipherment", js.undefined)
  }
}
