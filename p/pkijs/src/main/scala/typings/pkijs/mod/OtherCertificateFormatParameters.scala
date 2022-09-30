package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IOtherCertificateFormat> */
trait OtherCertificateFormatParameters extends StObject {
  
  var otherCert: js.UndefOr[Any] = js.undefined
  
  var otherCertFormat: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object OtherCertificateFormatParameters {
  
  inline def apply(): OtherCertificateFormatParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherCertificateFormatParameters]
  }
  
  extension [Self <: OtherCertificateFormatParameters](x: Self) {
    
    inline def setOtherCert(value: Any): Self = StObject.set(x, "otherCert", value.asInstanceOf[js.Any])
    
    inline def setOtherCertFormat(value: String): Self = StObject.set(x, "otherCertFormat", value.asInstanceOf[js.Any])
    
    inline def setOtherCertFormatUndefined: Self = StObject.set(x, "otherCertFormat", js.undefined)
    
    inline def setOtherCertUndefined: Self = StObject.set(x, "otherCert", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
