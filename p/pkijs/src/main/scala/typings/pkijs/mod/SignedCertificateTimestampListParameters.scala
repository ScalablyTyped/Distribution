package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISignedCertificateTimestampList> */
trait SignedCertificateTimestampListParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var timestamps: js.UndefOr[js.Array[SignedCertificateTimestamp]] = js.undefined
}
object SignedCertificateTimestampListParameters {
  
  inline def apply(): SignedCertificateTimestampListParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignedCertificateTimestampListParameters]
  }
  
  extension [Self <: SignedCertificateTimestampListParameters](x: Self) {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTimestamps(value: js.Array[SignedCertificateTimestamp]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: SignedCertificateTimestamp*): Self = StObject.set(x, "timestamps", js.Array(value*))
  }
}
