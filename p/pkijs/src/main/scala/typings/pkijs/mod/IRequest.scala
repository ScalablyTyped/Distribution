package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRequest extends StObject {
  
  var reqCert: CertID
  
  var singleRequestExtensions: js.UndefOr[js.Array[Extension]] = js.undefined
}
object IRequest {
  
  inline def apply(reqCert: CertID): IRequest = {
    val __obj = js.Dynamic.literal(reqCert = reqCert.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequest]
  }
  
  extension [Self <: IRequest](x: Self) {
    
    inline def setReqCert(value: CertID): Self = StObject.set(x, "reqCert", value.asInstanceOf[js.Any])
    
    inline def setSingleRequestExtensions(value: js.Array[Extension]): Self = StObject.set(x, "singleRequestExtensions", value.asInstanceOf[js.Any])
    
    inline def setSingleRequestExtensionsUndefined: Self = StObject.set(x, "singleRequestExtensions", js.undefined)
    
    inline def setSingleRequestExtensionsVarargs(value: Extension*): Self = StObject.set(x, "singleRequestExtensions", js.Array(value*))
  }
}
