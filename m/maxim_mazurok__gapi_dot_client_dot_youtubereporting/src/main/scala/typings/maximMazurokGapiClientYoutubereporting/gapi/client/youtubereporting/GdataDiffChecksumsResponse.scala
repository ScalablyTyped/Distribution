package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataDiffChecksumsResponse extends StObject {
  
  /** gdata */
  var checksumsLocation: js.UndefOr[GdataCompositeMedia] = js.native
  
  /** gdata */
  var chunkSizeBytes: js.UndefOr[String] = js.native
  
  /** gdata */
  var objectLocation: js.UndefOr[GdataCompositeMedia] = js.native
  
  /** gdata */
  var objectSizeBytes: js.UndefOr[String] = js.native
  
  /** gdata */
  var objectVersion: js.UndefOr[String] = js.native
}
object GdataDiffChecksumsResponse {
  
  @scala.inline
  def apply(): GdataDiffChecksumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffChecksumsResponse]
  }
  
  @scala.inline
  implicit class GdataDiffChecksumsResponseMutableBuilder[Self <: GdataDiffChecksumsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksumsLocation(value: GdataCompositeMedia): Self = StObject.set(x, "checksumsLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumsLocationUndefined: Self = StObject.set(x, "checksumsLocation", js.undefined)
    
    @scala.inline
    def setChunkSizeBytes(value: String): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    @scala.inline
    def setObjectLocation(value: GdataCompositeMedia): Self = StObject.set(x, "objectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLocationUndefined: Self = StObject.set(x, "objectLocation", js.undefined)
    
    @scala.inline
    def setObjectSizeBytes(value: String): Self = StObject.set(x, "objectSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectSizeBytesUndefined: Self = StObject.set(x, "objectSizeBytes", js.undefined)
    
    @scala.inline
    def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
