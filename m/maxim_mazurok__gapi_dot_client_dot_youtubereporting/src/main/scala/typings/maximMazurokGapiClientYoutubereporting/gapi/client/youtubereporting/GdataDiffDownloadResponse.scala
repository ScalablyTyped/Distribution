package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataDiffDownloadResponse extends StObject {
  
  /** gdata */
  var objectLocation: js.UndefOr[GdataCompositeMedia] = js.native
}
object GdataDiffDownloadResponse {
  
  @scala.inline
  def apply(): GdataDiffDownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffDownloadResponse]
  }
  
  @scala.inline
  implicit class GdataDiffDownloadResponseMutableBuilder[Self <: GdataDiffDownloadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectLocation(value: GdataCompositeMedia): Self = StObject.set(x, "objectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLocationUndefined: Self = StObject.set(x, "objectLocation", js.undefined)
  }
}
