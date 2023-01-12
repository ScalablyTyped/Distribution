package typings.phaser.Phaser.Types

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
    var color: Double
    
    /**
      * The x-coordinate of the pixel.
      */
    var x: Double
    
    /**
      * The y-coordinate of the pixel.
      */
    var y: Double
  }
  object PixelConfig {
    
    inline def apply(alpha: Double, color: Double, x: Double, y: Double): PixelConfig = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PixelConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PixelConfig] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpriteSheetConfig extends StObject {
    
    /**
      * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
      */
    var endFrame: js.UndefOr[Double] = js.undefined
    
    /**
      * The fixed height of each frame. If not set it will use the frameWidth as the height.
      */
    var frameHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The fixed width of each frame.
      */
    var frameWidth: Double
    
    /**
      * If the frames have been drawn with a margin, specify the amount here.
      */
    var margin: js.UndefOr[Double] = js.undefined
    
    /**
      * If the frames have been drawn with spacing between them, specify the amount here.
      */
    var spacing: js.UndefOr[Double] = js.undefined
    
    /**
      * Skip a number of frames. Useful when there are multiple sprite sheets in one Texture.
      */
    var startFrame: js.UndefOr[Double] = js.undefined
  }
  object SpriteSheetConfig {
    
    inline def apply(frameWidth: Double): SpriteSheetConfig = {
      val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteSheetConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpriteSheetConfig] (val x: Self) extends AnyVal {
      
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
  
  trait SpriteSheetFromAtlasConfig extends StObject {
    
    /**
      * The key of the Texture Atlas in which this Sprite Sheet can be found.
      */
    var atlas: String
    
    /**
      * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
      */
    var endFrame: js.UndefOr[Double] = js.undefined
    
    /**
      * The key of the Texture Atlas Frame in which this Sprite Sheet can be found.
      */
    var frame: String
    
    /**
      * The fixed height of each frame. If not set it will use the frameWidth as the height.
      */
    var frameHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The fixed width of each frame.
      */
    var frameWidth: Double
    
    /**
      * If the frames have been drawn with a margin, specify the amount here.
      */
    var margin: js.UndefOr[Double] = js.undefined
    
    /**
      * If the frames have been drawn with spacing between them, specify the amount here.
      */
    var spacing: js.UndefOr[Double] = js.undefined
    
    /**
      * Skip a number of frames. Useful when there are multiple sprite sheets in one Texture.
      */
    var startFrame: js.UndefOr[Double] = js.undefined
  }
  object SpriteSheetFromAtlasConfig {
    
    inline def apply(atlas: String, frame: String, frameWidth: Double): SpriteSheetFromAtlasConfig = {
      val __obj = js.Dynamic.literal(atlas = atlas.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteSheetFromAtlasConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpriteSheetFromAtlasConfig] (val x: Self) extends AnyVal {
      
      inline def setAtlas(value: String): Self = StObject.set(x, "atlas", value.asInstanceOf[js.Any])
      
      inline def setEndFrame(value: Double): Self = StObject.set(x, "endFrame", value.asInstanceOf[js.Any])
      
      inline def setEndFrameUndefined: Self = StObject.set(x, "endFrame", js.undefined)
      
      inline def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
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
}
