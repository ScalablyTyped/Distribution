package typings.pkijs.mod

import typings.asn1js.mod.Enumerated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IOCSPResponse> */
trait OCSPResponseParameters extends StObject {
  
  var responseBytes: js.UndefOr[ResponseBytes] = js.undefined
  
  var responseStatus: js.UndefOr[Enumerated] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object OCSPResponseParameters {
  
  inline def apply(): OCSPResponseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OCSPResponseParameters]
  }
  
  extension [Self <: OCSPResponseParameters](x: Self) {
    
    inline def setResponseBytes(value: ResponseBytes): Self = StObject.set(x, "responseBytes", value.asInstanceOf[js.Any])
    
    inline def setResponseBytesUndefined: Self = StObject.set(x, "responseBytes", js.undefined)
    
    inline def setResponseStatus(value: Enumerated): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
