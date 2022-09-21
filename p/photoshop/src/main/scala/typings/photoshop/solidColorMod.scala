package typings.photoshop

import typings.photoshop.colorsMod.CMYKColor
import typings.photoshop.colorsMod.GrayColor
import typings.photoshop.colorsMod.HSBColor
import typings.photoshop.colorsMod.LabColor
import typings.photoshop.colorsMod.RGBColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solidColorMod {
  
  @JSImport("photoshop/dom/objects/SolidColor", "SolidColor")
  @js.native
  open class SolidColor () extends StObject {
    
    /**
      * The color's representation in CMYK color space.
      */
    def cmyk: CMYKColor = js.native
    def cmyk_=(c: CMYKColor): Unit = js.native
    
    /**
      * The color's representation in grayscale.
      */
    def gray: GrayColor = js.native
    def gray_=(c: GrayColor): Unit = js.native
    
    /**
      * The color's representation in HSB color space.
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
      */
    def isEqual(color: SolidColor): Boolean = js.native
    
    /**
      * The color's representation in LAB color space.
      */
    def lab: LabColor = js.native
    def lab_=(c: LabColor): Unit = js.native
    
    def nearestWebColor: RGBColor = js.native
    
    /**
      * The color's representation in RGB color space.
      */
    def rgb: RGBColor = js.native
    def rgb_=(c: RGBColor): Unit = js.native
  }
}
