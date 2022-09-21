package typings.photoshop

import typings.photoshop.constantsMod.BMPDepthType
import typings.photoshop.constantsMod.BitmapConversionType
import typings.photoshop.constantsMod.BitmapHalfToneType
import typings.photoshop.constantsMod.Dither
import typings.photoshop.constantsMod.ForcedColors
import typings.photoshop.constantsMod.JPEGFormatOptions
import typings.photoshop.constantsMod.MatteColor
import typings.photoshop.constantsMod.OperatingSystem
import typings.photoshop.constantsMod.PNGMethod
import typings.photoshop.constantsMod.Palette
import typings.photoshop.solidColorMod.SolidColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionOptionsMod {
  
  @JSImport("photoshop/dom/objects/ConversionOptions", "BMPSaveOptions")
  @js.native
  /** @ignore */
  open class BMPSaveOptions () extends StObject {
    
    /** True to save the alpha channels */
    var alphaChannels: Boolean = js.native
    
    /** The number of bits per channel */
    var depth: BMPDepthType = js.native
    
    /**
      * True to write the image from top to bottom,
      * available only when osType is OperatingSystem.WINDOWS
      */
    var flipRowOrder: Boolean = js.native
    
    /** The target OS. */
    var osType: OperatingSystem = js.native
    
    /**
      * True to use RLE compression
      */
    var rleCompression: Boolean = js.native
    
    /**
      * The class name of the referenced object
      * @default "BMPSaveOptions"
      */
    val typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/ConversionOptions", "BitmapConversionOptions")
  @js.native
  /** @ignore */
  open class BitmapConversionOptions () extends StObject {
    
    /**
      * The angle (in degrees) at which to orient individual dots. See [[shape]]
      *
      * Valid only when [[method]] is `BitmapConversionType.HALFTONESCREEN`.
      *
      * @range -180...180
      */
    var angle: Double = js.native
    
    var frequency: Double = js.native
    
    var method: BitmapConversionType = js.native
    
    var patternName: String = js.native
    
    var resolution: Double = js.native
    
    var shape: BitmapHalfToneType = js.native
    
    val typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/ConversionOptions", "GIFSaveOptions")
  @js.native
  /** @ignore */
  open class GIFSaveOptions () extends StObject {
    
    /**
      * The number of palette colors. Valid only when palette is:
      *
      * Palette.LOCALADAPTIVE, LOCALPERCEPTUAL, LOCALSELECTIVE, MACOSPALETTE, UNIFORM, WEBPALETTE; or WINDOWSPALETTE
      */
    var colors: Double = js.native
    
    /** The dither type. */
    var dither: Dither = js.native
    
    /**
      * The amount of dither.
      *
      * Valid only when dither = Dither.DIFFUSION.
      */
    var ditherAmount: Double = js.native
    
    /** The type of colors to force into the color palette. */
    var forced: ForcedColors = js.native
    
    /** True if rows should be interlaced/ */
    var interlaced: Boolean = js.native
    
    /**
      * The color to use to fill anti-aliased edges adjacent to transparent  areas of the image.
      *
      * When transparency is turned off for an image, the matte color is applied to transparent areas.
      */
    var matte: MatteColor = js.native
    
    /**
      * The type of palette to use.
      */
    var palette: Palette = js.native
    
    /**
      * True to protect colors in the image that contain entries in the color table from being dithered.
      *
      * Valid only when dither = DITHER.DIFFUSION
      */
    var preserveExactColors: Boolean = js.native
    
    /**
      * True to preserve transparent areas of the image during conversion to GIF format.
      */
    var transparency: Boolean = js.native
    
    /**
      * The class name of the referenced object
      * @default "GIFSaveOptions"
      */
    val typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/ConversionOptions", "IndexedConversionOptions")
  @js.native
  /** @ignore */
  open class IndexedConversionOptions () extends StObject {
    
    var colors: Double = js.native
    
    var dither: Dither = js.native
    
    var ditherAmount: Double = js.native
    
    var forced: ForcedColors = js.native
    
    var matte: MatteColor = js.native
    
    var palette: Palette = js.native
    
    var preserveExactColors: Boolean = js.native
    
    var transparency: Boolean = js.native
    
    val typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/ConversionOptions", "JPEGSaveOptions")
  @js.native
  /** @ignore */
  open class JPEGSaveOptions () extends StObject {
    
    /**
      * A custom color to use to fill anti-aliased edges adjacent to transparent areas of the image.
      * Mutually exclusive with 'matteColor'.
      */
    var color: SolidColor = js.native
    
    /**
      * Custom matting color; overrides matteColor
      */
    var customMatte: SolidColor = js.native
    
    /**
      * False to skip embedding the color profile in the document
      */
    var embedColorProfile: Boolean = js.native
    
    /**
      * The JPEG format option to use.
      * @default STANDARDBASELINE
      */
    var formatOptions: JPEGFormatOptions = js.native
    
    /**
      * The color to use to fill anti-aliased edges adjacent to transparent areas of the image.
      * Mutually exclusive with 'color'.
      */
    var matteColor: MatteColor = js.native
    
    /**
      * The image quality setting to use; affects file size and compression.
      *
      * @default 8
      * @range 0...12
      */
    var quality: Double = js.native
    
    /**
      * The number of scans to incrementally display the image on the page.
      * formatOptions must be JPEGFormatOptions.PROGRESSIVE.
      * @default 3
      * @range 3...5
      */
    var scans: Double = js.native
    
    /**
      * The class name of the referenced object
      * @default "JPEGSaveOptions"
      */
    val typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/ConversionOptions", "PNGSaveOptions")
  @js.native
  /** @ignore */
  open class PNGSaveOptions () extends StObject {
    
    /**
      * The compression value to be used when method = PNGMethod.QUICK
      *
      * @range 0...9
      * @default 6
      */
    var compression: Double = js.native
    
    /**
      * True to interlace rows when method = PNGMethod.QUICK
      *
      * @default false
      */
    var interlaced: Boolean = js.native
    
    /**
      * PNG File Size optimization method.
      */
    var method: PNGMethod = js.native
    
    /**
      * The class name of the referenced object
      * @default "PNGSaveOptions"
      */
    val typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/ConversionOptions", "PhotoshopSaveOptions")
  @js.native
  /** @ignore */
  open class PhotoshopSaveOptions () extends StObject {
    
    /** True to save the alpha channels */
    var alphaChannels: Boolean = js.native
    
    /** True to save the annotations */
    var annotations: Boolean = js.native
    
    /** True to embed the color profiles in the document */
    var embedColorProfile: Boolean = js.native
    
    /** True to preserve the layers */
    var layers: Boolean = js.native
    
    /**
      * Maximize Compatibility with older versions
      */
    var maximizeCompatibility: Boolean = js.native
    
    /** True to save the spot colors */
    var spotColor: Boolean = js.native
    
    /**
      * The class name of the referenced object
      * @default "PhotoshopSaveOptions"
      */
    val typename: String = js.native
  }
}
