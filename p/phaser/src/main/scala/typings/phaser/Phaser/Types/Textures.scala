package typings.phaser.Phaser.Types

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Textures {
  
  /**
    * An object containing the position and color data for a single pixel in a CanvasTexture.
    */
  @js.native
  trait PixelConfig extends StObject {
    
    /**
      * The alpha of the pixel, between 0 and 1.
      */
    var alpha: Double = js.native
    
    /**
      * The color of the pixel, not including the alpha channel.
      */
    var color: integer = js.native
    
    /**
      * The x-coordinate of the pixel.
      */
    var x: integer = js.native
    
    /**
      * The y-coordinate of the pixel.
      */
    var y: integer = js.native
  }
  object PixelConfig {
    
    @scala.inline
    def apply(alpha: Double, color: integer, x: integer, y: integer): PixelConfig = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PixelConfig]
    }
    
    @scala.inline
    implicit class PixelConfigMutableBuilder[Self <: PixelConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: integer): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SpriteSheetConfig extends StObject {
    
    /**
      * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
      */
    var endFrame: js.UndefOr[integer] = js.native
    
    /**
      * The fixed height of each frame. If not set it will use the frameWidth as the height.
      */
    var frameHeight: js.UndefOr[integer] = js.native
    
    /**
      * The fixed width of each frame.
      */
    var frameWidth: integer = js.native
    
    /**
      * If the frames have been drawn with a margin, specify the amount here.
      */
    var margin: js.UndefOr[integer] = js.native
    
    /**
      * If the frames have been drawn with spacing between them, specify the amount here.
      */
    var spacing: js.UndefOr[integer] = js.native
    
    /**
      * Skip a number of frames. Useful when there are multiple sprite sheets in one Texture.
      */
    var startFrame: js.UndefOr[integer] = js.native
  }
  object SpriteSheetConfig {
    
    @scala.inline
    def apply(frameWidth: integer): SpriteSheetConfig = {
      val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteSheetConfig]
    }
    
    @scala.inline
    implicit class SpriteSheetConfigMutableBuilder[Self <: SpriteSheetConfig] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait SpriteSheetFromAtlasConfig extends StObject {
    
    /**
      * The key of the Texture Atlas in which this Sprite Sheet can be found.
      */
    var atlas: String = js.native
    
    /**
      * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
      */
    var endFrame: js.UndefOr[integer] = js.native
    
    /**
      * The key of the Texture Atlas Frame in which this Sprite Sheet can be found.
      */
    var frame: String = js.native
    
    /**
      * The fixed height of each frame. If not set it will use the frameWidth as the height.
      */
    var frameHeight: js.UndefOr[integer] = js.native
    
    /**
      * The fixed width of each frame.
      */
    var frameWidth: integer = js.native
    
    /**
      * If the frames have been drawn with a margin, specify the amount here.
      */
    var margin: js.UndefOr[integer] = js.native
    
    /**
      * If the frames have been drawn with spacing between them, specify the amount here.
      */
    var spacing: js.UndefOr[integer] = js.native
    
    /**
      * Skip a number of frames. Useful when there are multiple sprite sheets in one Texture.
      */
    var startFrame: js.UndefOr[integer] = js.native
  }
  object SpriteSheetFromAtlasConfig {
    
    @scala.inline
    def apply(atlas: String, frame: String, frameWidth: integer): SpriteSheetFromAtlasConfig = {
      val __obj = js.Dynamic.literal(atlas = atlas.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteSheetFromAtlasConfig]
    }
    
    @scala.inline
    implicit class SpriteSheetFromAtlasConfigMutableBuilder[Self <: SpriteSheetFromAtlasConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtlas(value: String): Self = StObject.set(x, "atlas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFrame(value: integer): Self = StObject.set(x, "endFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFrameUndefined: Self = StObject.set(x, "endFrame", js.undefined)
      
      @scala.inline
      def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
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
}
