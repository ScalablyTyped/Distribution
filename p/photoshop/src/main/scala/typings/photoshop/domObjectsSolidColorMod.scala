package typings.photoshop

import typings.photoshop.domConstantsMod.ColorModel
import typings.photoshop.domObjectsColorsMod.CMYKColor
import typings.photoshop.domObjectsColorsMod.GrayColor
import typings.photoshop.domObjectsColorsMod.HSBColor
import typings.photoshop.domObjectsColorsMod.LabColor
import typings.photoshop.domObjectsColorsMod.RGBColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domObjectsSolidColorMod {
  
  @JSImport("photoshop/dom/objects/SolidColor", "SolidColor")
  @js.native
  /**
    * All colors default to pure white.
    *
    * ```
    * const SolidColor = require("photoshop").app.SolidColor;
    * const color = new SolidColor();
    * ```
    *
    * @param model Color model to start.
    * @minVersion 23.0
    */
  open class SolidColor () extends StObject {
    def this(model: ColorModel) = this()
    
    /**
      * The color's representation in CMYK color space.
      * @minVersion 23.0
      */
    def cmyk: CMYKColor = js.native
    def cmyk_=(c: CMYKColor): Unit = js.native
    
    /**
      * The color's representation in grayscale.
      * @minVersion 23.0
      */
    def gray: GrayColor = js.native
    def gray_=(c: GrayColor): Unit = js.native
    
    /**
      * The color's representation in HSB color space.
      * @minVersion 23.0
      */
    def hsb: HSBColor = js.native
    def hsb_=(c: HSBColor): Unit = js.native
    
    /**
      * True if the SolidColor object is visually equivalent to the specified color.
      *
      * Both colors are converted to Lab colorspace,
      * and the sum of their normalized squared Euclidian
      * distance in each space is averaged across the three
      * then compared to a small constant (3.5e-6).
      *
      * Due to differences in coverage by various color spaces and clamping,
      * a color that is converted from RGB to CMYK and back may not be visually equal.
      * @minVersion 23.0
      */
    def isEqual(color: SolidColor): Boolean = js.native
    
    /**
      * The color's representation in LAB color space.
      * @minVersion 23.0
      */
    def lab: LabColor = js.native
    def lab_=(c: LabColor): Unit = js.native
    
    /**
      * The color's nearest match within the 216 web-safe colors.
      * @minVersion 23.0
      */
    def nearestWebColor: RGBColor = js.native
    
    /**
      * The color's representation in RGB color space.
      *
      * @minVersion 23.0
      */
    def rgb: RGBColor = js.native
    def rgb_=(c: RGBColor): Unit = js.native
    
    /**
      * The class name of the referenced object: *"SolidColor"*.
      * @minVersion 24.2
      */
    def typename: typings.photoshop.photoshopStrings.SolidColor = js.native
  }
}
