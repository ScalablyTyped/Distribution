package typings.photoshop.domImagingModuleMod.imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSelectionResult extends StObject {
  
  var imageData: PhotoshopImageData
  
  var sourceBounds: Bounds
}
object GetSelectionResult {
  
  inline def apply(imageData: PhotoshopImageData, sourceBounds: Bounds): GetSelectionResult = {
    val __obj = js.Dynamic.literal(imageData = imageData.asInstanceOf[js.Any], sourceBounds = sourceBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSelectionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSelectionResult] (val x: Self) extends AnyVal {
    
    inline def setImageData(value: PhotoshopImageData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setSourceBounds(value: Bounds): Self = StObject.set(x, "sourceBounds", value.asInstanceOf[js.Any])
  }
}
