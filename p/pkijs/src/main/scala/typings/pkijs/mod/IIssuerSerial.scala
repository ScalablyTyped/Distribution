package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIssuerSerial extends StObject {
  
  /**
    * Issuer name
    */
  var issuer: GeneralNames
  
  /**
    * Issuer unique identifier
    */
  var issuerUID: js.UndefOr[BitString] = js.undefined
  
  /**
    * Serial number
    */
  var serialNumber: Integer
}
object IIssuerSerial {
  
  inline def apply(issuer: GeneralNames, serialNumber: Integer): IIssuerSerial = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuerSerial]
  }
  
  extension [Self <: IIssuerSerial](x: Self) {
    
    inline def setIssuer(value: GeneralNames): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUID(value: BitString): Self = StObject.set(x, "issuerUID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUIDUndefined: Self = StObject.set(x, "issuerUID", js.undefined)
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
  }
}
