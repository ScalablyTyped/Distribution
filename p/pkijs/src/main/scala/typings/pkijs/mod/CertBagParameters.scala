package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICertBag> */
trait CertBagParameters extends StObject {
  
  var certId: js.UndefOr[String] = js.undefined
  
  var certValue: js.UndefOr[OctetString | PkiObject] = js.undefined
  
  var parsedValue: js.UndefOr[Any] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object CertBagParameters {
  
  inline def apply(): CertBagParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertBagParameters]
  }
  
  extension [Self <: CertBagParameters](x: Self) {
    
    inline def setCertId(value: String): Self = StObject.set(x, "certId", value.asInstanceOf[js.Any])
    
    inline def setCertIdUndefined: Self = StObject.set(x, "certId", js.undefined)
    
    inline def setCertValue(value: OctetString | PkiObject): Self = StObject.set(x, "certValue", value.asInstanceOf[js.Any])
    
    inline def setCertValueUndefined: Self = StObject.set(x, "certValue", js.undefined)
    
    inline def setParsedValue(value: Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
