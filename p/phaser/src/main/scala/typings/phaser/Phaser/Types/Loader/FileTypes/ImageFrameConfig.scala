package typings.phaser.Phaser.Types.Loader.FileTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageFrameConfig extends StObject {
  
  /**
    * The frame to stop parsing at. If not provided it will calculate the value based on the image and frame dimensions.
    */
  var endFrame: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the frame in pixels. Uses the `frameWidth` value if not provided.
    */
  var frameHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the frame in pixels.
    */
  var frameWidth: Double
  
  /**
    * The margin in the image. This is the space around the edge of the frames.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * The spacing between each frame in the image.
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /**
    * The first frame to start parsing from.
    */
  var startFrame: js.UndefOr[Double] = js.undefined
}
object ImageFrameConfig {
  
  inline def apply(frameWidth: Double): ImageFrameConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFrameConfig]
  }
  
  extension [Self <: ImageFrameConfig](x: Self) {
    
    inline def setEndFrame(value: Double): Self = StObject.set(x, "endFrame", value.asInstanceOf[js.Any])
    
    inline def setEndFrameUndefined: Self = StObject.set(x, "endFrame", js.undefined)
    
    inline def setFrameHeight(value: Double): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
    
    inline def setFrameHeightUndefined: Self = StObject.set(x, "frameHeight", js.undefined)
    
    inline def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStartFrame(value: Double): Self = StObject.set(x, "startFrame", value.asInstanceOf[js.Any])
    
    inline def setStartFrameUndefined: Self = StObject.set(x, "startFrame", js.undefined)
  }
}
