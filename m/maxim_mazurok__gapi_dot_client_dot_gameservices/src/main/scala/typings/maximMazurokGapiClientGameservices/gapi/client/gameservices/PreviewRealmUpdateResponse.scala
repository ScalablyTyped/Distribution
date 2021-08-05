package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewRealmUpdateResponse extends StObject {
  
  /** ETag of the realm. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The target state. */
  var targetState: js.UndefOr[TargetState] = js.undefined
}
object PreviewRealmUpdateResponse {
  
  inline def apply(): PreviewRealmUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewRealmUpdateResponse]
  }
  
  extension [Self <: PreviewRealmUpdateResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setTargetState(value: TargetState): Self = StObject.set(x, "targetState", value.asInstanceOf[js.Any])
    
    inline def setTargetStateUndefined: Self = StObject.set(x, "targetState", js.undefined)
  }
}
