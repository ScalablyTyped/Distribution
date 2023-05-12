package typings.photoshop

import typings.photoshop.domConstantsMod.BitmapConversionType
import typings.photoshop.domConstantsMod.BitmapHalfToneType
import typings.photoshop.domConstantsMod.Dither
import typings.photoshop.domConstantsMod.ForcedColors
import typings.photoshop.domConstantsMod.MatteColor
import typings.photoshop.domConstantsMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domObjectsConversionOptionsMod {
  
  @JSImport("photoshop/dom/objects/ConversionOptions", "BitmapConversionOptions")
  @js.native
  /** @ignore */
  open class BitmapConversionOptions () extends StObject {
    
    /* private */ var _angle: Any = js.native
    
    /* private */ var _frequency: Any = js.native
    
    /* private */ var _method: Any = js.native
    
    /* private */ var _patternName: Any = js.native
    
    /* private */ var _resolution: Any = js.native
    
    /* private */ var _shape: Any = js.native
    
    /**
      * The angle (in degrees) at which to orient individual dots. See shape property below.
      * Valid only when the method property is set to `BitmapConversionType.HALFTONESCREEN`.
      *
      * @default -
      * @range -180...180
      * @minVersion 23.0
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    /**
      * The number of dots (per inch) to use.
      * Valid only when the method property is set to `BitmapConversionType.HALFTONESCREEN`.
      *
      * @default -
      * @range 1.0..999.99
      * @minVersion 23.0
      */
    def frequency: Double = js.native
    def frequency_=(value: Double): Unit = js.native
    
    /**
      * The conversion method.
      *
      * @default DIFFUSIONDITHER
      * @range -
      * @minVersion 23.0
      */
    def method: BitmapConversionType = js.native
    def method_=(value: BitmapConversionType): Unit = js.native
    
    /**
      * The name of the pattern to use.
      * Valid only when the method property is set to BitmapConversionType.CUSTOMPATTERN.
      *
      * @default
      * @range -
      * @minVersion 23.0
      */
    def patternName: String = js.native
    def patternName_=(value: String): Unit = js.native
    
    /**
      * The output resolution (in pixels per inch).
      *
      * @default 72
      * @range -
      * @minVersion 23.0
      */
    def resolution: Double = js.native
    def resolution_=(value: Double): Unit = js.native
    
    /**
      * The dot shape.
      * Valid only when the method property is set to BitmapConversionType.HALFTONESCREEN.
      *
      * @default -
      * @range -
      * @minVersion 23.0
      */
    def shape: BitmapHalfToneType = js.native
    def shape_=(value: BitmapHalfToneType): Unit = js.native
    
    /**
      * The class name of the referenced object: *"BitmapConversionOptions"*.
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.BitmapConversionOptions = js.native
  }
  
  @JSImport("photoshop/dom/objects/ConversionOptions", "IndexedConversionOptions")
  @js.native
  /** @ignore */
  open class IndexedConversionOptions () extends StObject {
    
    /* private */ var _colors: Any = js.native
    
    /* private */ var _dither: Any = js.native
    
    /* private */ var _ditherAmount: Any = js.native
    
    /* private */ var _forced: Any = js.native
    
    /* private */ var _matte: Any = js.native
    
    /* private */ var _palette: Any = js.native
    
    /* private */ var _preserveExactColors: Any = js.native
    
    /* private */ var _transparency: Any = js.native
    
    /**
      * The number of palette colors.
      *
      * Valid only with palette types: LOCALADAPTIVE, LOCALPERCEPTUAL,
      * LOCALSELECTIVE, MACOSPALETTE, UNIFORM, WEBPALETTE, or WINDOWSPALETTE.
      *
      * @minVersion 23.0
      */
    def colors: Double = js.native
    def colors_=(value: Double): Unit = js.native
    
    /**
      * The type of dithering to be done.
      *
      * @minVersion 23.0
      */
    def dither: Dither = js.native
    
    /**
      * The amount of dithering to be done.
      *
      * Valid only when dither typ is DIFFUSION.
      * @minVersion 23.0
      */
    def ditherAmount: Double = js.native
    def ditherAmount_=(value: Double): Unit = js.native
    
    def dither_=(value: Dither): Unit = js.native
    
    /**
      * The set of colors to force into the color palette.
      *
      * @minVersion 23.0
      */
    def forced: ForcedColors = js.native
    def forced_=(value: ForcedColors): Unit = js.native
    
    /**
      * The color to use to fill anti-aliased edges adjacent to transparent areas of the image.
      *
      * When transparency is false, the matte color is applied to transparent areas.
      *
      * @default WHITE
      * @minVersion 23.0
      */
    def matte: MatteColor = js.native
    def matte_=(value: MatteColor): Unit = js.native
    
    /**
      * The palette type.
      *
      * @minVersion 23.0
      */
    def palette: Palette = js.native
    def palette_=(value: Palette): Unit = js.native
    
    /**
      * When true, the image colors matching entries in the color table will not be dithered.
      *
      * @minVersion 23.0
      */
    def preserveExactColors: Boolean = js.native
    def preserveExactColors_=(value: Boolean): Unit = js.native
    
    /**
      * When true, transparent areas of the image are preserved during conversion to GIF format.
      *
      * @minVersion 23.0
      */
    def transparency: Boolean = js.native
    def transparency_=(value: Boolean): Unit = js.native
    
    /**
      * The class name of the referenced object: *"IndexedConversionOptions"*.
      *
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.IndexedConversionOptions = js.native
  }
}
