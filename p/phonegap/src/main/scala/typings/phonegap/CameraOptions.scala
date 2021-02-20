package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraOptions extends StObject {
  
  var allowEdit: js.UndefOr[Boolean] = js.native
  
  var correctOrientation: js.UndefOr[Boolean] = js.native
  
  var destinationType: js.UndefOr[Double] = js.native
  
  var encodingType: js.UndefOr[Double] = js.native
  
  var mediaType: js.UndefOr[Double] = js.native
  
  var popoverOptions: js.UndefOr[CameraPopoverOptions] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var saveToPhotoAlbum: js.UndefOr[Boolean] = js.native
  
  var sourceType: js.UndefOr[Double] = js.native
  
  var targetHeight: js.UndefOr[Double] = js.native
  
  var targetWidth: js.UndefOr[Double] = js.native
}
object CameraOptions {
  
  @scala.inline
  def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  
  @scala.inline
  implicit class CameraOptionsMutableBuilder[Self <: CameraOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditUndefined: Self = StObject.set(x, "allowEdit", js.undefined)
    
    @scala.inline
    def setCorrectOrientation(value: Boolean): Self = StObject.set(x, "correctOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectOrientationUndefined: Self = StObject.set(x, "correctOrientation", js.undefined)
    
    @scala.inline
    def setDestinationType(value: Double): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationTypeUndefined: Self = StObject.set(x, "destinationType", js.undefined)
    
    @scala.inline
    def setEncodingType(value: Double): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
    
    @scala.inline
    def setMediaType(value: Double): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    @scala.inline
    def setPopoverOptions(value: CameraPopoverOptions): Self = StObject.set(x, "popoverOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverOptionsUndefined: Self = StObject.set(x, "popoverOptions", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setSaveToPhotoAlbum(value: Boolean): Self = StObject.set(x, "saveToPhotoAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveToPhotoAlbumUndefined: Self = StObject.set(x, "saveToPhotoAlbum", js.undefined)
    
    @scala.inline
    def setSourceType(value: Double): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHeightUndefined: Self = StObject.set(x, "targetHeight", js.undefined)
    
    @scala.inline
    def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWidthUndefined: Self = StObject.set(x, "targetWidth", js.undefined)
  }
}
