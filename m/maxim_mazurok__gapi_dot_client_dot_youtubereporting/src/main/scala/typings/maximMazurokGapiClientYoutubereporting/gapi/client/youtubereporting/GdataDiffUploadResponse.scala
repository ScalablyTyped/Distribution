package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataDiffUploadResponse extends StObject {
  
  /** gdata */
  var objectVersion: js.UndefOr[String] = js.native
  
  /** gdata */
  var originalObject: js.UndefOr[GdataCompositeMedia] = js.native
}
object GdataDiffUploadResponse {
  
  @scala.inline
  def apply(): GdataDiffUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffUploadResponse]
  }
  
  @scala.inline
  implicit class GdataDiffUploadResponseMutableBuilder[Self <: GdataDiffUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
    
    @scala.inline
    def setOriginalObject(value: GdataCompositeMedia): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
  }
}
