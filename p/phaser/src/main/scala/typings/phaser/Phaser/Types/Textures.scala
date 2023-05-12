package typings.phaser.Phaser.Types

import typings.phaser.Phaser.BlendModes
import typings.std.GLenum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Textures {
  
  /**
    * An object containing the dimensions and mipmap data for a Compressed Texture.
    */
  trait CompressedTextureData extends StObject {
    
    /**
      * Is this a compressed texture?
      */
    var compressed: Boolean
    
    /**
      * Should this texture have mipmaps generated?
      */
    var generateMipmap: Boolean
    
    /**
      * The height of the maximum size of the texture.
      */
    var height: Double
    
    /**
      * The WebGL internal texture format.
      */
    var internalFormat: GLenum
    
    /**
      * An array of MipmapType objects.
      */
    var mipmaps: js.Array[MipmapType]
    
    /**
      * The width of the maximum size of the texture.
      */
    var width: Double
  }
  object CompressedTextureData {
    
    inline def apply(
      compressed: Boolean,
      generateMipmap: Boolean,
      height: Double,
      internalFormat: GLenum,
      mipmaps: js.Array[MipmapType],
      width: Double
    ): CompressedTextureData = {
      val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], generateMipmap = generateMipmap.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], internalFormat = internalFormat.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompressedTextureData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompressedTextureData] (val x: Self) extends AnyVal {
      
      inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setGenerateMipmap(value: Boolean): Self = StObject.set(x, "generateMipmap", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInternalFormat(value: GLenum): Self = StObject.set(x, "internalFormat", value.asInstanceOf[js.Any])
      
      inline def setMipmaps(value: js.Array[MipmapType]): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
      
      inline def setMipmapsVarargs(value: MipmapType*): Self = StObject.set(x, "mipmaps", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A Mipmap Data entry for a Compressed Texture.
    */
  trait MipmapType extends StObject {
    
    /**
      * The decoded pixel data.
      */
    var data: js.typedarray.Uint8Array
    
    /**
      * The height of this level of the mipmap.
      */
    var height: Double
    
    /**
      * The width of this level of the mipmap.
      */
    var width: Double
  }
  object MipmapType {
    
    inline def apply(data: js.typedarray.Uint8Array, height: Double, width: Double): MipmapType = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MipmapType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MipmapType] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  /**
    * An object containing the position and color data for a single pixel in a CanvasTexture.
    */
  trait StampConfig extends StObject {
    
    /**
      * The alpha value used by the stamp.
      */
    var alpha: js.UndefOr[Double] = js.undefined
    
    /**
      * The angle of the stamp in degrees. Rotation takes place around its origin.
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /**
      * The blend mode used when drawing the stamp. Defaults to 0 (normal).
      */
    var blendMode: js.UndefOr[String | BlendModes | Double] = js.undefined
    
    /**
      * Erase this stamp from the texture?
      */
    var erase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The horizontal origin of the stamp. 0 is the left, 0.5 is the center and 1 is the right.
      */
    var originX: js.UndefOr[Double] = js.undefined
    
    /**
      * The vertical origin of the stamp. 0 is the top, 0.5 is the center and 1 is the bottom.
      */
    var originY: js.UndefOr[Double] = js.undefined
    
    /**
      * The rotation of the stamp in radians. Rotation takes place around its origin.
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets both the horizontal and vertical scale of the stamp with a single value.
      */
    var scale: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the horizontal scale of the stamp. Overrides the scale property, if provided.
      */
    var scaleX: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the vertical scale of the stamp. Overrides the scale property, if provided.
      */
    var scaleY: js.UndefOr[Double] = js.undefined
    
    /**
      * Skip beginning and ending a batch with this call. Use if this is part of a bigger batched draw.
      */
    var skipBatch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The tint color value used by the stamp. WebGL only.
      */
    var tint: js.UndefOr[Double] = js.undefined
  }
  object StampConfig {
    
    inline def apply(): StampConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StampConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StampConfig] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setBlendMode(value: String | BlendModes | Double): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
      
      inline def setErase(value: Boolean): Self = StObject.set(x, "erase", value.asInstanceOf[js.Any])
      
      inline def setEraseUndefined: Self = StObject.set(x, "erase", js.undefined)
      
      inline def setOriginX(value: Double): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      inline def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
      
      inline def setOriginY(value: Double): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
      
      inline def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setSkipBatch(value: Boolean): Self = StObject.set(x, "skipBatch", value.asInstanceOf[js.Any])
      
      inline def setSkipBatchUndefined: Self = StObject.set(x, "skipBatch", js.undefined)
      
      inline def setTint(value: Double): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      inline def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
    }
  }
}
