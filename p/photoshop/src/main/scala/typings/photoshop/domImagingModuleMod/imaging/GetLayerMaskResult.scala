package typings.photoshop.domImagingModuleMod.imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayerMaskResult extends StObject {
  
  var imageData: PhotoshopImageData
  
  var sourceBounds: Bounds
}
object GetLayerMaskResult {
  
  inline def apply(imageData: PhotoshopImageData, sourceBounds: Bounds): GetLayerMaskResult = {
    val __obj = js.Dynamic.literal(imageData = imageData.asInstanceOf[js.Any], sourceBounds = sourceBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerMaskResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLayerMaskResult] (val x: Self) extends AnyVal {
    
    inline def setImageData(value: PhotoshopImageData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setSourceBounds(value: Bounds): Self = StObject.set(x, "sourceBounds", value.asInstanceOf[js.Any])
  }
}
