package typings.phaser.Phaser.Types

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Textures {
  
  /**
    * An object containing the position and color data for a single pixel in a CanvasTexture.
    */
  trait PixelConfig extends StObject {
    
    /**
      * The alpha of the pixel, between 0 and 1.
      */
    var alpha: Double
    
    /**
      * The color of the pixel, not including the alpha channel.
      */
    var color: integer
    
    /**
      * The x-coordinate of the pixel.
      */
    var x: integer
    
    /**
      * The y-coordinate of the pixel.
      */
    var y: integer
  }
  object PixelConfig {
    
    inline def apply(alpha: Double, color: integer, x: integer, y: integer): PixelConfig = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PixelConfig]
    }
    
    extension [Self <: PixelConfig](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setColor(value: integer): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setX(value: integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpriteSheetConfig extends StObject {
    
    /**
      * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
      */
    var endFrame: js.UndefOr[integer] = js.undefined
    
    /**
      * The fixed height of each frame. If not set it will use the frameWidth as the height.
      */
    var frameHeight: js.UndefOr[integer] = js.undefined
    
    /**
      * The fixed width of each frame.
      */
    var frameWidth: integer
    
    /**
      * If the frames have been drawn with a margin, specify the amount here.
      */
    var margin: js.UndefOr[integer] = js.undefined
    
    /**
      * If the frames have been drawn with spacing between them, specify the amount here.
      */
    var spacing: js.UndefOr[integer] = js.undefined
    
    /**
      * Skip a number of frames. Useful when there are multiple sprite sheets in one Texture.
      */
    var startFrame: js.UndefOr[integer] = js.undefined
  }
  object SpriteSheetConfig {
    
    inline def apply(frameWidth: integer): SpriteSheetConfig = {
      val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteSheetConfig]
    }
    
    extension [Self <: SpriteSheetConfig](x: Self) {
      
      inline def setEndFrame(value: integer): Self = StObject.set(x, "endFrame", value.asInstanceOf[js.Any])
      
      inline def setEndFrameUndefined: Self = StObject.set(x, "endFrame", js.undefined)
      
      inline def setFrameHeight(value: integer): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
      
      inline def setFrameHeightUndefined: Self = StObject.set(x, "frameHeight", js.undefined)
      
      inline def setFrameWidth(value: integer): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: integer): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setSpacing(value: integer): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setStartFrame(value: integer): Self = StObject.set(x, "startFrame", value.asInstanceOf[js.Any])
      
      inline def setStartFrameUndefined: Self = StObject.set(x, "startFrame", js.undefined)
    }
  }
  
  trait SpriteSheetFromAtlasConfig extends StObject {
    
    /**
      * The key of the Texture Atlas in which this Sprite Sheet can be found.
      */
    var atlas: String
    
    /**
      * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
      */
    var endFrame: js.UndefOr[integer] = js.undefined
    
    /**
      * The key of the Texture Atlas Frame in which this Sprite Sheet can be found.
      */
    var frame: String
    
    /**
      * The fixed height of each frame. If not set it will use the frameWidth as the height.
      */
    var frameHeight: js.UndefOr[integer] = js.undefined
    
    /**
      * The fixed width of each frame.
      */
    var frameWidth: integer
    
    /**
      * If the frames have been drawn with a margin, specify the amount here.
      */
    var margin: js.UndefOr[integer] = js.undefined
    
    /**
      * If the frames have been drawn with spacing between them, specify the amount here.
      */
    var spacing: js.UndefOr[integer] = js.undefined
    
    /**
      * Skip a number of frames. Useful when there are multiple sprite sheets in one Texture.
      */
    var startFrame: js.UndefOr[integer] = js.undefined
  }
  object SpriteSheetFromAtlasConfig {
    
    inline def apply(atlas: String, frame: String, frameWidth: integer): SpriteSheetFromAtlasConfig = {
      val __obj = js.Dynamic.literal(atlas = atlas.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteSheetFromAtlasConfig]
    }
    
    extension [Self <: SpriteSheetFromAtlasConfig](x: Self) {
      
      inline def setAtlas(value: String): Self = StObject.set(x, "atlas", value.asInstanceOf[js.Any])
      
      inline def setEndFrame(value: integer): Self = StObject.set(x, "endFrame", value.asInstanceOf[js.Any])
      
      inline def setEndFrameUndefined: Self = StObject.set(x, "endFrame", js.undefined)
      
      inline def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameHeight(value: integer): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
      
      inline def setFrameHeightUndefined: Self = StObject.set(x, "frameHeight", js.undefined)
      
      inline def setFrameWidth(value: integer): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: integer): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setSpacing(value: integer): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setStartFrame(value: integer): Self = StObject.set(x, "startFrame", value.asInstanceOf[js.Any])
      
      inline def setStartFrameUndefined: Self = StObject.set(x, "startFrame", js.undefined)
    }
  }
}
