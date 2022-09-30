package typings.pkijs.mod

import typings.asn1js.mod.IntegerJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerAndSerialNumberJson extends StObject {
  
  var issuer: RelativeDistinguishedNamesJson
  
  var serialNumber: IntegerJson
}
object IssuerAndSerialNumberJson {
  
  inline def apply(issuer: RelativeDistinguishedNamesJson, serialNumber: IntegerJson): IssuerAndSerialNumberJson = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuerAndSerialNumberJson]
  }
  
  extension [Self <: IssuerAndSerialNumberJson](x: Self) {
    
    inline def setIssuer(value: RelativeDistinguishedNamesJson): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: IntegerJson): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
  }
}
