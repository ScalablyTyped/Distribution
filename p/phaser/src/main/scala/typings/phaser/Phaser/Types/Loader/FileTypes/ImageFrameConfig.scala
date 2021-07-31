package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageFrameConfig extends StObject {
  
  /**
    * The frame to stop parsing at. If not provided it will calculate the value based on the image and frame dimensions.
    */
  var endFrame: js.UndefOr[integer] = js.undefined
  
  /**
    * The height of the frame in pixels. Uses the `frameWidth` value if not provided.
    */
  var frameHeight: js.UndefOr[integer] = js.undefined
  
  /**
    * The width of the frame in pixels.
    */
  var frameWidth: integer
  
  /**
    * The margin in the image. This is the space around the edge of the frames.
    */
  var margin: js.UndefOr[integer] = js.undefined
  
  /**
    * The spacing between each frame in the image.
    */
  var spacing: js.UndefOr[integer] = js.undefined
  
  /**
    * The first frame to start parsing from.
    */
  var startFrame: js.UndefOr[integer] = js.undefined
}
object ImageFrameConfig {
  
  @scala.inline
  def apply(frameWidth: integer): ImageFrameConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFrameConfig]
  }
  
  @scala.inline
  implicit class ImageFrameConfigMutableBuilder[Self <: ImageFrameConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndFrame(value: integer): Self = StObject.set(x, "endFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndFrameUndefined: Self = StObject.set(x, "endFrame", js.undefined)
    
    @scala.inline
    def setFrameHeight(value: integer): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameHeightUndefined: Self = StObject.set(x, "frameHeight", js.undefined)
    
    @scala.inline
    def setFrameWidth(value: integer): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: integer): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setSpacing(value: integer): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setStartFrame(value: integer): Self = StObject.set(x, "startFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFrameUndefined: Self = StObject.set(x, "startFrame", js.undefined)
  }
}
