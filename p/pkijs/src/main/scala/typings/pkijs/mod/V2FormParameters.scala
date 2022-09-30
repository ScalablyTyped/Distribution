package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IV2Form> */
trait V2FormParameters extends StObject {
  
  var baseCertificateID: js.UndefOr[IssuerSerial] = js.undefined
  
  var issuerName: js.UndefOr[GeneralNames] = js.undefined
  
  var objectDigestInfo: js.UndefOr[ObjectDigestInfo] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object V2FormParameters {
  
  inline def apply(): V2FormParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V2FormParameters]
  }
  
  extension [Self <: V2FormParameters](x: Self) {
    
    inline def setBaseCertificateID(value: IssuerSerial): Self = StObject.set(x, "baseCertificateID", value.asInstanceOf[js.Any])
    
    inline def setBaseCertificateIDUndefined: Self = StObject.set(x, "baseCertificateID", js.undefined)
    
    inline def setIssuerName(value: GeneralNames): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameUndefined: Self = StObject.set(x, "issuerName", js.undefined)
    
    inline def setObjectDigestInfo(value: ObjectDigestInfo): Self = StObject.set(x, "objectDigestInfo", value.asInstanceOf[js.Any])
    
    inline def setObjectDigestInfoUndefined: Self = StObject.set(x, "objectDigestInfo", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
