package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleResponseJson extends StObject {
  
  var certID: CertIDJson
  
  var certStatus: Any
  
  var nextUpdate: js.UndefOr[js.Date] = js.undefined
  
  var singleExtensions: js.UndefOr[js.Array[ExtensionJson]] = js.undefined
  
  var thisUpdate: js.Date
}
object SingleResponseJson {
  
  inline def apply(certID: CertIDJson, certStatus: Any, thisUpdate: js.Date): SingleResponseJson = {
    val __obj = js.Dynamic.literal(certID = certID.asInstanceOf[js.Any], certStatus = certStatus.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleResponseJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleResponseJson] (val x: Self) extends AnyVal {
    
    inline def setCertID(value: CertIDJson): Self = StObject.set(x, "certID", value.asInstanceOf[js.Any])
    
    inline def setCertStatus(value: Any): Self = StObject.set(x, "certStatus", value.asInstanceOf[js.Any])
    
    inline def setNextUpdate(value: js.Date): Self = StObject.set(x, "nextUpdate", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateUndefined: Self = StObject.set(x, "nextUpdate", js.undefined)
    
    inline def setSingleExtensions(value: js.Array[ExtensionJson]): Self = StObject.set(x, "singleExtensions", value.asInstanceOf[js.Any])
    
    inline def setSingleExtensionsUndefined: Self = StObject.set(x, "singleExtensions", js.undefined)
    
    inline def setSingleExtensionsVarargs(value: ExtensionJson*): Self = StObject.set(x, "singleExtensions", js.Array(value*))
    
    inline def setThisUpdate(value: js.Date): Self = StObject.set(x, "thisUpdate", value.asInstanceOf[js.Any])
  }
}
