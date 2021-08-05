package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraOptions extends StObject {
  
  var allowEdit: js.UndefOr[Boolean] = js.undefined
  
  var correctOrientation: js.UndefOr[Boolean] = js.undefined
  
  var destinationType: js.UndefOr[Double] = js.undefined
  
  var encodingType: js.UndefOr[Double] = js.undefined
  
  var mediaType: js.UndefOr[Double] = js.undefined
  
  var popoverOptions: js.UndefOr[CameraPopoverOptions] = js.undefined
  
  var quality: js.UndefOr[Double] = js.undefined
  
  var saveToPhotoAlbum: js.UndefOr[Boolean] = js.undefined
  
  var sourceType: js.UndefOr[Double] = js.undefined
  
  var targetHeight: js.UndefOr[Double] = js.undefined
  
  var targetWidth: js.UndefOr[Double] = js.undefined
}
object CameraOptions {
  
  inline def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  
  extension [Self <: CameraOptions](x: Self) {
    
    inline def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
    
    inline def setAllowEditUndefined: Self = StObject.set(x, "allowEdit", js.undefined)
    
    inline def setCorrectOrientation(value: Boolean): Self = StObject.set(x, "correctOrientation", value.asInstanceOf[js.Any])
    
    inline def setCorrectOrientationUndefined: Self = StObject.set(x, "correctOrientation", js.undefined)
    
    inline def setDestinationType(value: Double): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "destinationType", js.undefined)
    
    inline def setEncodingType(value: Double): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
    
    inline def setMediaType(value: Double): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setPopoverOptions(value: CameraPopoverOptions): Self = StObject.set(x, "popoverOptions", value.asInstanceOf[js.Any])
    
    inline def setPopoverOptionsUndefined: Self = StObject.set(x, "popoverOptions", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setSaveToPhotoAlbum(value: Boolean): Self = StObject.set(x, "saveToPhotoAlbum", value.asInstanceOf[js.Any])
    
    inline def setSaveToPhotoAlbumUndefined: Self = StObject.set(x, "saveToPhotoAlbum", js.undefined)
    
    inline def setSourceType(value: Double): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
    
    inline def setTargetHeightUndefined: Self = StObject.set(x, "targetHeight", js.undefined)
    
    inline def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
    
    inline def setTargetWidthUndefined: Self = StObject.set(x, "targetWidth", js.undefined)
  }
}
