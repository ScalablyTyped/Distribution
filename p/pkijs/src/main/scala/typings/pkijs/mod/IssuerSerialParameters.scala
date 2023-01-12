package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IIssuerSerial> */
trait IssuerSerialParameters extends StObject {
  
  var issuer: js.UndefOr[GeneralNames] = js.undefined
  
  var issuerUID: js.UndefOr[BitString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var serialNumber: js.UndefOr[Integer] = js.undefined
}
object IssuerSerialParameters {
  
  inline def apply(): IssuerSerialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerSerialParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuerSerialParameters] (val x: Self) extends AnyVal {
    
    inline def setIssuer(value: GeneralNames): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUID(value: BitString): Self = StObject.set(x, "issuerUID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUIDUndefined: Self = StObject.set(x, "issuerUID", js.undefined)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
