package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIssuerAndSerialNumber extends StObject {
  
  /**
    * Certificate issuer name
    */
  var issuer: RelativeDistinguishedNames
  
  /**
    * Certificate serial number
    */
  var serialNumber: Integer
}
object IIssuerAndSerialNumber {
  
  inline def apply(issuer: RelativeDistinguishedNames, serialNumber: Integer): IIssuerAndSerialNumber = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuerAndSerialNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIssuerAndSerialNumber] (val x: Self) extends AnyVal {
    
    inline def setIssuer(value: RelativeDistinguishedNames): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
  }
}
