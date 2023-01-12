package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IOCSPRequest> */
trait OCSPRequestParameters extends StObject {
  
  var optionalSignature: js.UndefOr[Signature] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var tbsRequest: js.UndefOr[TBSRequest] = js.undefined
}
object OCSPRequestParameters {
  
  inline def apply(): OCSPRequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OCSPRequestParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OCSPRequestParameters] (val x: Self) extends AnyVal {
    
    inline def setOptionalSignature(value: Signature): Self = StObject.set(x, "optionalSignature", value.asInstanceOf[js.Any])
    
    inline def setOptionalSignatureUndefined: Self = StObject.set(x, "optionalSignature", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTbsRequest(value: TBSRequest): Self = StObject.set(x, "tbsRequest", value.asInstanceOf[js.Any])
    
    inline def setTbsRequestUndefined: Self = StObject.set(x, "tbsRequest", js.undefined)
  }
}
