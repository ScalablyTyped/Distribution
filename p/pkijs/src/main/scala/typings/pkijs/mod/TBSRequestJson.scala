package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TBSRequestJson extends StObject {
  
  var requestExtensions: js.UndefOr[js.Array[ExtensionJson]] = js.undefined
  
  var requestList: js.Array[RequestJson]
  
  var requestorName: js.UndefOr[GeneralNameJson] = js.undefined
  
  var tbs: String
  
  var version: js.UndefOr[Double] = js.undefined
}
object TBSRequestJson {
  
  inline def apply(requestList: js.Array[RequestJson], tbs: String): TBSRequestJson = {
    val __obj = js.Dynamic.literal(requestList = requestList.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TBSRequestJson]
  }
  
  extension [Self <: TBSRequestJson](x: Self) {
    
    inline def setRequestExtensions(value: js.Array[ExtensionJson]): Self = StObject.set(x, "requestExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequestExtensionsUndefined: Self = StObject.set(x, "requestExtensions", js.undefined)
    
    inline def setRequestExtensionsVarargs(value: ExtensionJson*): Self = StObject.set(x, "requestExtensions", js.Array(value*))
    
    inline def setRequestList(value: js.Array[RequestJson]): Self = StObject.set(x, "requestList", value.asInstanceOf[js.Any])
    
    inline def setRequestListVarargs(value: RequestJson*): Self = StObject.set(x, "requestList", js.Array(value*))
    
    inline def setRequestorName(value: GeneralNameJson): Self = StObject.set(x, "requestorName", value.asInstanceOf[js.Any])
    
    inline def setRequestorNameUndefined: Self = StObject.set(x, "requestorName", js.undefined)
    
    inline def setTbs(value: String): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
