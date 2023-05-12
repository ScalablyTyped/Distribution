package typings.photoshop

import typings.photoshop.domConstantsMod.BMPDepthType
import typings.photoshop.domConstantsMod.Dither
import typings.photoshop.domConstantsMod.ForcedColors
import typings.photoshop.domConstantsMod.JPEGFormatOptions
import typings.photoshop.domConstantsMod.MatteColor
import typings.photoshop.domConstantsMod.OperatingSystem
import typings.photoshop.domConstantsMod.PNGMethod
import typings.photoshop.domConstantsMod.Palette
import typings.photoshop.domObjectsSolidColorMod.SolidColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domObjectsSaveOptionsMod {
  
  @JSImport("photoshop/dom/objects/SaveOptions", "BMPSaveOptions")
  @js.native
  /** @ignore */
  open class BMPSaveOptions () extends StObject {
    
    /* private */ var _alphaChannels: Any = js.native
    
    /* private */ var _depth: Any = js.native
    
    /* private */ var _flipRowOrder: Any = js.native
    
    /* private */ var _osType: Any = js.native
    
    /* private */ var _rleCompression: Any = js.native
    
    /**
      * True to save the alpha channels.
      * @minVersion 22.5
      */
    def alphaChannels: Boolean = js.native
    def alphaChannels_=(value: Boolean): Unit = js.native
    
    /**
      * The number of bits per channel.
      * @minVersion 22.5
      */
    def depth: BMPDepthType = js.native
    def depth_=(value: BMPDepthType): Unit = js.native
    
    /**
      * True to write the image from top to bottom,
      * available only when osType is OperatingSystem.WINDOWS
      * @minVersion 22.5
      */
    def flipRowOrder: Boolean = js.native
    def flipRowOrder_=(value: Boolean): Unit = js.native
    
    /**
      * The target OS.
      * @minVersion 22.5
      */
    def osType: OperatingSystem = js.native
    def osType_=(value: OperatingSystem): Unit = js.native
    
    /**
      * True to use RLE compression
      * @minVersion 22.5
      */
    def rleCompression: Boolean = js.native
    def rleCompression_=(value: Boolean): Unit = js.native
    
    /**
      * The class name of the referenced object: *"BMPSaveOptions"*.
      * @minVersion 22.5
      */
    def typename: typings.photoshop.photoshopStrings.BMPSaveOptions = js.native
  }
  
  @JSImport("photoshop/dom/objects/SaveOptions", "GIFSaveOptions")
  @js.native
  /** @ignore */
  open class GIFSaveOptions () extends StObject {
    
    /* private */ var _colors: Any = js.native
    
    /* private */ var _dither: Any = js.native
    
    /* private */ var _ditherAmount: Any = js.native
    
    /* private */ var _forced: Any = js.native
    
    /* private */ var _interlaced: Any = js.native
    
    /* private */ var _matte: Any = js.native
    
    /* private */ var _palette: Any = js.native
    
    /* private */ var _preserveExactColors: Any = js.native
    
    /* private */ var _transparency: Any = js.native
    
    /**
      * The number of palette colors. Valid only when palette is:
      *
      * Palette.LOCALADAPTIVE, LOCALPERCEPTUAL, LOCALSELECTIVE, MACOSPALETTE, UNIFORM, WEBPALETTE; or WINDOWSPALETTE
      * @minVersion 22.5
      */
    def colors: Double = js.native
    def colors_=(value: Double): Unit = js.native
    
    /**
      * The dither type.
      * @minVersion 22.5
      */
    def dither: Dither = js.native
    
    /**
      * The amount of dither.
      *
      * Valid only when dither = Dither.DIFFUSION.
      * @minVersion 22.5
      */
    def ditherAmount: Double = js.native
    def ditherAmount_=(value: Double): Unit = js.native
    
    def dither_=(value: Dither): Unit = js.native
    
    /**
      * The type of colors to force into the color palette.
      * @minVersion 22.5
      */
    def forced: ForcedColors = js.native
    def forced_=(value: ForcedColors): Unit = js.native
    
    /**
      * True if rows should be interlaced.
      * @minVersion 22.5
      */
    def interlaced: Boolean = js.native
    def interlaced_=(value: Boolean): Unit = js.native
    
    /**
      * The color to use to fill anti-aliased edges adjacent to transparent  areas of the image.
      *
      * When transparency is turned off for an image, the matte color is applied to transparent areas.
      * @minVersion 22.5
      */
    def matte: MatteColor = js.native
    def matte_=(value: MatteColor): Unit = js.native
    
    /**
      * The type of palette to use.
      * @minVersion 22.5
      */
    def palette: Palette = js.native
    def palette_=(value: Palette): Unit = js.native
    
    /**
      * True to protect colors in the image that contain entries in the color table from being dithered.
      *
      * Valid only when dither = DITHER.DIFFUSION
      * @minVersion 22.5
      */
    def preserveExactColors: Boolean = js.native
    def preserveExactColors_=(value: Boolean): Unit = js.native
    
    /**
      * True to preserve transparent areas of the image during conversion to GIF format.
      * @minVersion 22.5
      */
    def transparency: Boolean = js.native
    def transparency_=(value: Boolean): Unit = js.native
    
    /**
      * The class name of the referenced object: *"GIFSaveOptions"*.
      * @minVersion 22.5
      */
    def typename: typings.photoshop.photoshopStrings.GIFSaveOptions = js.native
  }
  
  @JSImport("photoshop/dom/objects/SaveOptions", "JPEGSaveOptions")
  @js.native
  /** @ignore */
  open class JPEGSaveOptions () extends StObject {
    
    /* private */ var _color: Any = js.native
    
    /* private */ var _customMatte: Any = js.native
    
    /* private */ var _embedColorProfile: Any = js.native
    
    /* private */ var _formatOptions: Any = js.native
    
    /* private */ var _matteColor: Any = js.native
    
    /* private */ var _quality: Any = js.native
    
    /* private */ var _scans: Any = js.native
    
    /**
      * A custom color to use to fill anti-aliased edges adjacent to transparent areas of the image.
      * Mutually exclusive with 'matteColor'.
      * @minVersion 22.5
      */
    def color: SolidColor = js.native
    def color_=(value: SolidColor): Unit = js.native
    
    /**
      * Custom matting color; overrides matteColor
      * @minVersion 22.5
      */
    def customMatte: SolidColor = js.native
    def customMatte_=(value: SolidColor): Unit = js.native
    
    /**
      * False to skip embedding the color profile in the document
      * @minVersion 22.5
      */
    def embedColorProfile: Boolean = js.native
    def embedColorProfile_=(value: Boolean): Unit = js.native
    
    /**
      * The JPEG format option to use.
      * @default STANDARDBASELINE
      * @minVersion 22.5
      */
    def formatOptions: JPEGFormatOptions = js.native
    def formatOptions_=(value: JPEGFormatOptions): Unit = js.native
    
    /**
      * The color to use to fill anti-aliased edges adjacent to transparent areas of the image.
      * Mutually exclusive with 'color'.
      * @minVersion 22.5
      */
    def matteColor: MatteColor = js.native
    def matteColor_=(value: MatteColor): Unit = js.native
    
    /**
      * The image quality setting to use; affects file size and compression.
      *
      * @default 8
      * @range 0...12
      * @minVersion 22.5
      */
    def quality: Double = js.native
    def quality_=(value: Double): Unit = js.native
    
    /**
      * The number of scans to incrementally display the image on the page.
      * formatOptions must be JPEGFormatOptions.PROGRESSIVE.
      * @default 3
      * @range 3...5
      * @minVersion 22.5
      */
    def scans: Double = js.native
    def scans_=(value: Double): Unit = js.native
    
    /**
      * The class name of the referenced object: *"JPEGSaveOptions"*.
      * @minVersion 22.5
      */
    def typename: typings.photoshop.photoshopStrings.JPEGSaveOptions = js.native
  }
  
  @JSImport("photoshop/dom/objects/SaveOptions", "PNGSaveOptions")
  @js.native
  /** @ignore */
  open class PNGSaveOptions () extends StObject {
    
    /* private */ var _compression: Any = js.native
    
    /* private */ var _interlaced: Any = js.native
    
    /* private */ var _method: Any = js.native
    
    /**
      * The compression value to be used when method = PNGMethod.QUICK
      *
      * @range 0...9
      * @default 6
      * @minVersion 22.5
      */
    def compression: Double = js.native
    def compression_=(value: Double): Unit = js.native
    
    /**
      * True to interlace rows when method = PNGMethod.QUICK
      *
      * @default false
      * @minVersion 22.5
      */
    def interlaced: Boolean = js.native
    def interlaced_=(value: Boolean): Unit = js.native
    
    /**
      * PNG File Size optimization method.
      * @minVersion 22.5
      */
    def method: PNGMethod = js.native
    def method_=(value: PNGMethod): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PNGSaveOptions"*.
      * @minVersion 22.5
      */
    def typename: typings.photoshop.photoshopStrings.PNGSaveOptions = js.native
  }
  
  @JSImport("photoshop/dom/objects/SaveOptions", "PhotoshopSaveOptions")
  @js.native
  /** @ignore */
  open class PhotoshopSaveOptions () extends StObject {
    
    /* private */ var _alphaChannels: Any = js.native
    
    /* private */ var _annotations: Any = js.native
    
    /* private */ var _embedColorProfile: Any = js.native
    
    /* private */ var _layers: Any = js.native
    
    /* private */ var _maximizeCompatibility: Any = js.native
    
    /* private */ var _spotColor: Any = js.native
    
    /**
      * True to save the alpha channels.
      * @minVersion 22.5
      */
    def alphaChannels: Boolean = js.native
    def alphaChannels_=(value: Boolean): Unit = js.native
    
    /**
      * True to save the annotations.
      * @minVersion 22.5
      */
    def annotations: Boolean = js.native
    def annotations_=(value: Boolean): Unit = js.native
    
    /**
      * True to embed the color profiles in the document.
      * @minVersion 22.5
      */
    def embedColorProfile: Boolean = js.native
    def embedColorProfile_=(value: Boolean): Unit = js.native
    
    /**
      * True to preserve the layers.
      * @minVersion 22.5
      */
    def layers: Boolean = js.native
    def layers_=(value: Boolean): Unit = js.native
    
    /**
      * Maximize Compatibility with older versions
      * @minVersion 22.5
      */
    def maximizeCompatibility: Boolean = js.native
    def maximizeCompatibility_=(value: Boolean): Unit = js.native
    
    /**
      * True to save the spot colors.
      * @minVersion 22.5
      */
    def spotColor: Boolean = js.native
    def spotColor_=(value: Boolean): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PhotoshopSaveOptions"*.
      * @minVersion 22.5
      */
    def typename: typings.photoshop.photoshopStrings.PhotoshopSaveOptions = js.native
  }
}
