package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestJson extends StObject {
  
  var reqCert: CertIDJson
  
  var singleRequestExtensions: js.UndefOr[js.Array[ExtensionJson]] = js.undefined
}
object RequestJson {
  
  inline def apply(reqCert: CertIDJson): RequestJson = {
    val __obj = js.Dynamic.literal(reqCert = reqCert.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestJson]
  }
  
  extension [Self <: RequestJson](x: Self) {
    
    inline def setReqCert(value: CertIDJson): Self = StObject.set(x, "reqCert", value.asInstanceOf[js.Any])
    
    inline def setSingleRequestExtensions(value: js.Array[ExtensionJson]): Self = StObject.set(x, "singleRequestExtensions", value.asInstanceOf[js.Any])
    
    inline def setSingleRequestExtensionsUndefined: Self = StObject.set(x, "singleRequestExtensions", js.undefined)
    
    inline def setSingleRequestExtensionsVarargs(value: ExtensionJson*): Self = StObject.set(x, "singleRequestExtensions", js.Array(value*))
  }
}
