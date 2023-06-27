package typings.photoshop.domImagingModuleMod.imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @targetfolder objects/returnobjects
  * @minVersion 24.4
  */
trait GetPixelsResult extends StObject {
  
  /**
    * A `PhotoshopImageData` instance describing the returned pixel data.
    * @minVersion 24.4
    */
  var imageData: PhotoshopImageData
  
  /**
    * The pyramid level that was used when obtaining pixels.
    * @minVersion 24.4
    */
  var level: Double
  
  /**
    * The actual bounds used when obtaining pixels (see note regarding pyramid levels below).
    * @minVersion 24.4
    */
  var sourceBounds: Bounds
}
object GetPixelsResult {
  
  inline def apply(imageData: PhotoshopImageData, level: Double, sourceBounds: Bounds): GetPixelsResult = {
    val __obj = js.Dynamic.literal(imageData = imageData.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], sourceBounds = sourceBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPixelsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPixelsResult] (val x: Self) extends AnyVal {
    
    inline def setImageData(value: PhotoshopImageData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setSourceBounds(value: Bounds): Self = StObject.set(x, "sourceBounds", value.asInstanceOf[js.Any])
  }
}
