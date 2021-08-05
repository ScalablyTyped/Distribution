package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GdataDiffVersionResponse extends StObject {
  
  /** gdata */
  var objectSizeBytes: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var objectVersion: js.UndefOr[String] = js.undefined
}
object GdataDiffVersionResponse {
  
  inline def apply(): GdataDiffVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffVersionResponse]
  }
  
  extension [Self <: GdataDiffVersionResponse](x: Self) {
    
    inline def setObjectSizeBytes(value: String): Self = StObject.set(x, "objectSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeBytesUndefined: Self = StObject.set(x, "objectSizeBytes", js.undefined)
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
