package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import typings.asn1js.mod.IntegerJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerSerialJson extends StObject {
  
  var issuer: GeneralNamesJson
  
  var issuerUID: js.UndefOr[BitStringJson] = js.undefined
  
  var serialNumber: IntegerJson
}
object IssuerSerialJson {
  
  inline def apply(issuer: GeneralNamesJson, serialNumber: IntegerJson): IssuerSerialJson = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuerSerialJson]
  }
  
  extension [Self <: IssuerSerialJson](x: Self) {
    
    inline def setIssuer(value: GeneralNamesJson): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUID(value: BitStringJson): Self = StObject.set(x, "issuerUID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUIDUndefined: Self = StObject.set(x, "issuerUID", js.undefined)
    
    inline def setSerialNumber(value: IntegerJson): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
  }
}
