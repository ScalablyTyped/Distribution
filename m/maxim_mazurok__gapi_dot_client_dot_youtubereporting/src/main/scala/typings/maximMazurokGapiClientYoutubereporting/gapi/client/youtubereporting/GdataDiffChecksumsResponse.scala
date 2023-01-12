package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GdataDiffChecksumsResponse extends StObject {
  
  /** gdata */
  var checksumsLocation: js.UndefOr[GdataCompositeMedia] = js.undefined
  
  /** gdata */
  var chunkSizeBytes: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var objectLocation: js.UndefOr[GdataCompositeMedia] = js.undefined
  
  /** gdata */
  var objectSizeBytes: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var objectVersion: js.UndefOr[String] = js.undefined
}
object GdataDiffChecksumsResponse {
  
  inline def apply(): GdataDiffChecksumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffChecksumsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GdataDiffChecksumsResponse] (val x: Self) extends AnyVal {
    
    inline def setChecksumsLocation(value: GdataCompositeMedia): Self = StObject.set(x, "checksumsLocation", value.asInstanceOf[js.Any])
    
    inline def setChecksumsLocationUndefined: Self = StObject.set(x, "checksumsLocation", js.undefined)
    
    inline def setChunkSizeBytes(value: String): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    inline def setObjectLocation(value: GdataCompositeMedia): Self = StObject.set(x, "objectLocation", value.asInstanceOf[js.Any])
    
    inline def setObjectLocationUndefined: Self = StObject.set(x, "objectLocation", js.undefined)
    
    inline def setObjectSizeBytes(value: String): Self = StObject.set(x, "objectSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeBytesUndefined: Self = StObject.set(x, "objectSizeBytes", js.undefined)
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
