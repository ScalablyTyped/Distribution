package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRequest> */
trait RequestParameters extends StObject {
  
  var reqCert: js.UndefOr[CertID] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var singleRequestExtensions: js.UndefOr[js.Array[Extension]] = js.undefined
}
object RequestParameters {
  
  inline def apply(): RequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestParameters]
  }
  
  extension [Self <: RequestParameters](x: Self) {
    
    inline def setReqCert(value: CertID): Self = StObject.set(x, "reqCert", value.asInstanceOf[js.Any])
    
    inline def setReqCertUndefined: Self = StObject.set(x, "reqCert", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSingleRequestExtensions(value: js.Array[Extension]): Self = StObject.set(x, "singleRequestExtensions", value.asInstanceOf[js.Any])
    
    inline def setSingleRequestExtensionsUndefined: Self = StObject.set(x, "singleRequestExtensions", js.undefined)
    
    inline def setSingleRequestExtensionsVarargs(value: Extension*): Self = StObject.set(x, "singleRequestExtensions", js.Array(value*))
  }
}
