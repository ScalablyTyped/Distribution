package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IIssuerAndSerialNumber> */
trait IssuerAndSerialNumberParameters extends StObject {
  
  var issuer: js.UndefOr[RelativeDistinguishedNames] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var serialNumber: js.UndefOr[Integer] = js.undefined
}
object IssuerAndSerialNumberParameters {
  
  inline def apply(): IssuerAndSerialNumberParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerAndSerialNumberParameters]
  }
  
  extension [Self <: IssuerAndSerialNumberParameters](x: Self) {
    
    inline def setIssuer(value: RelativeDistinguishedNames): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
