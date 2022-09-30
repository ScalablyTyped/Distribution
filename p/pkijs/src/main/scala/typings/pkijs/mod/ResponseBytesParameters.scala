package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IResponseBytes> */
trait ResponseBytesParameters extends StObject {
  
  var response: js.UndefOr[OctetString] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object ResponseBytesParameters {
  
  inline def apply(): ResponseBytesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseBytesParameters]
  }
  
  extension [Self <: ResponseBytesParameters](x: Self) {
    
    inline def setResponse(value: OctetString): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
