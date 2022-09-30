package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICertificateSet> */
trait CertificateSetParameters extends StObject {
  
  var certificates: js.UndefOr[js.Array[CertificateSetItem]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object CertificateSetParameters {
  
  inline def apply(): CertificateSetParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateSetParameters]
  }
  
  extension [Self <: CertificateSetParameters](x: Self) {
    
    inline def setCertificates(value: js.Array[CertificateSetItem]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: CertificateSetItem*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
