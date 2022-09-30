package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITBSRequest extends StObject {
  
  var requestExtensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var requestList: js.Array[Request]
  
  var requestorName: js.UndefOr[GeneralName] = js.undefined
  
  var tbs: js.typedarray.ArrayBuffer
  
  var version: js.UndefOr[Double] = js.undefined
}
object ITBSRequest {
  
  inline def apply(requestList: js.Array[Request], tbs: js.typedarray.ArrayBuffer): ITBSRequest = {
    val __obj = js.Dynamic.literal(requestList = requestList.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITBSRequest]
  }
  
  extension [Self <: ITBSRequest](x: Self) {
    
    inline def setRequestExtensions(value: js.Array[Extension]): Self = StObject.set(x, "requestExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequestExtensionsUndefined: Self = StObject.set(x, "requestExtensions", js.undefined)
    
    inline def setRequestExtensionsVarargs(value: Extension*): Self = StObject.set(x, "requestExtensions", js.Array(value*))
    
    inline def setRequestList(value: js.Array[Request]): Self = StObject.set(x, "requestList", value.asInstanceOf[js.Any])
    
    inline def setRequestListVarargs(value: Request*): Self = StObject.set(x, "requestList", js.Array(value*))
    
    inline def setRequestorName(value: GeneralName): Self = StObject.set(x, "requestorName", value.asInstanceOf[js.Any])
    
    inline def setRequestorNameUndefined: Self = StObject.set(x, "requestorName", js.undefined)
    
    inline def setTbs(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
