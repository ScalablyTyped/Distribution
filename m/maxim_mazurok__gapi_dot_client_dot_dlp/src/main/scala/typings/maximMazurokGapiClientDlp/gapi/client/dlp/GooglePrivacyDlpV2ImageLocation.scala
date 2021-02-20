package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ImageLocation extends StObject {
  
  /** Bounding boxes locating the pixels within the image containing the finding. */
  var boundingBoxes: js.UndefOr[js.Array[GooglePrivacyDlpV2BoundingBox]] = js.native
}
object GooglePrivacyDlpV2ImageLocation {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ImageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ImageLocation]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ImageLocationMutableBuilder[Self <: GooglePrivacyDlpV2ImageLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBoxes(value: js.Array[GooglePrivacyDlpV2BoundingBox]): Self = StObject.set(x, "boundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxesUndefined: Self = StObject.set(x, "boundingBoxes", js.undefined)
    
    @scala.inline
    def setBoundingBoxesVarargs(value: GooglePrivacyDlpV2BoundingBox*): Self = StObject.set(x, "boundingBoxes", js.Array(value :_*))
  }
}
