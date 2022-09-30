package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISingleResponse extends StObject {
  
  var certID: CertID
  
  var certStatus: Any
  
  var nextUpdate: js.UndefOr[js.Date] = js.undefined
  
  var singleExtensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var thisUpdate: js.Date
}
object ISingleResponse {
  
  inline def apply(certID: CertID, certStatus: Any, thisUpdate: js.Date): ISingleResponse = {
    val __obj = js.Dynamic.literal(certID = certID.asInstanceOf[js.Any], certStatus = certStatus.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISingleResponse]
  }
  
  extension [Self <: ISingleResponse](x: Self) {
    
    inline def setCertID(value: CertID): Self = StObject.set(x, "certID", value.asInstanceOf[js.Any])
    
    inline def setCertStatus(value: Any): Self = StObject.set(x, "certStatus", value.asInstanceOf[js.Any])
    
    inline def setNextUpdate(value: js.Date): Self = StObject.set(x, "nextUpdate", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateUndefined: Self = StObject.set(x, "nextUpdate", js.undefined)
    
    inline def setSingleExtensions(value: js.Array[Extension]): Self = StObject.set(x, "singleExtensions", value.asInstanceOf[js.Any])
    
    inline def setSingleExtensionsUndefined: Self = StObject.set(x, "singleExtensions", js.undefined)
    
    inline def setSingleExtensionsVarargs(value: Extension*): Self = StObject.set(x, "singleExtensions", js.Array(value*))
    
    inline def setThisUpdate(value: js.Date): Self = StObject.set(x, "thisUpdate", value.asInstanceOf[js.Any])
  }
}
