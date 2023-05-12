package typings.photoshop.domImagingModuleMod.imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @optionobject
  * @targetfolder objects/options
  * @minVersion 24.4
  */
trait CreateImageDataFromBufferOptions extends StObject {
  
  /**
    * Describes pixel layout. See discussion above. The default value is true.
    * @minVersion 24.4
    */
  var chunky: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes the color profile associated with the image data. See note regarding color profiles and 32 bit
    * pixel data at the beginning of this document.
    * @minVersion 24.4
    */
  var colorProfile: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the color space associated with the image data.
    * @minVersion 24.4
    */
  var colorSpace: String
  
  /**
    * Number of components per pixel.
    * @minVersion 24.4
    */
  var components: Double
  
  /**
    * This value is only used for 16 bit data. Set to true if you are providing pixel data that use
    * the full 16 bit range [0..65535]. Set to false if data is using the reduced range: [0..32768].
    * The default value is false.
    * @minVersion 24.4
    */
  var fullRange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The height of the image.
    * @minVersion 24.4
    */
  var height: Double
  
  /**
    * The width of the image.
    * @minVersion 24.4
    */
  var width: Double
}
object CreateImageDataFromBufferOptions {
  
  inline def apply(colorSpace: String, components: Double, height: Double, width: Double): CreateImageDataFromBufferOptions = {
    val __obj = js.Dynamic.literal(colorSpace = colorSpace.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageDataFromBufferOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateImageDataFromBufferOptions] (val x: Self) extends AnyVal {
    
    inline def setChunky(value: Boolean): Self = StObject.set(x, "chunky", value.asInstanceOf[js.Any])
    
    inline def setChunkyUndefined: Self = StObject.set(x, "chunky", js.undefined)
    
    inline def setColorProfile(value: String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
    
    inline def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
    
    inline def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: Double): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setFullRange(value: Boolean): Self = StObject.set(x, "fullRange", value.asInstanceOf[js.Any])
    
    inline def setFullRangeUndefined: Self = StObject.set(x, "fullRange", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
