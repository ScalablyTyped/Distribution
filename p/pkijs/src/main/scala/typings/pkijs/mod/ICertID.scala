package typings.pkijs.mod

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICertID extends StObject {
  
  /**
    * Hash algorithm used to generate the `issuerNameHash` and `issuerKeyHash` values
    */
  var hashAlgorithm: AlgorithmIdentifier
  
  /**
    * Hash of the issuer's public key. The hash shall be calculated over the value (excluding tag and length)
    * of the subject public key field in the issuer's certificate.
    */
  var issuerKeyHash: OctetString
  
  /**
    * Hash of the issuer's distinguished name (DN). The hash shall be calculated over the DER encoding
    * of the issuer's name field in the certificate being checked.
    */
  var issuerNameHash: OctetString
  
  /**
    * Serial number of the certificate for which status is being requested
    */
  var serialNumber: Integer
}
object ICertID {
  
  inline def apply(
    hashAlgorithm: AlgorithmIdentifier,
    issuerKeyHash: OctetString,
    issuerNameHash: OctetString,
    serialNumber: Integer
  ): ICertID = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], issuerKeyHash = issuerKeyHash.asInstanceOf[js.Any], issuerNameHash = issuerNameHash.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICertID] (val x: Self) extends AnyVal {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setIssuerKeyHash(value: OctetString): Self = StObject.set(x, "issuerKeyHash", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameHash(value: OctetString): Self = StObject.set(x, "issuerNameHash", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
  }
}
