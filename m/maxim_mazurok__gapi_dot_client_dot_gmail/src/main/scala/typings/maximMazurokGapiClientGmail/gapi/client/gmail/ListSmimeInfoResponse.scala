package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSmimeInfoResponse extends StObject {
  
  /** List of SmimeInfo. */
  var smimeInfo: js.UndefOr[js.Array[SmimeInfo]] = js.undefined
}
object ListSmimeInfoResponse {
  
  inline def apply(): ListSmimeInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSmimeInfoResponse]
  }
  
  extension [Self <: ListSmimeInfoResponse](x: Self) {
    
    inline def setSmimeInfo(value: js.Array[SmimeInfo]): Self = StObject.set(x, "smimeInfo", value.asInstanceOf[js.Any])
    
    inline def setSmimeInfoUndefined: Self = StObject.set(x, "smimeInfo", js.undefined)
    
    inline def setSmimeInfoVarargs(value: SmimeInfo*): Self = StObject.set(x, "smimeInfo", js.Array(value :_*))
  }
}
