package typings.photoshop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domObjectsColorsMod {
  
  @JSImport("photoshop/dom/objects/Colors", "CMYKColor")
  @js.native
  open class CMYKColor () extends StObject {
    
    /**
      * The black color value, as percentage.
      * @default
      * @range 0.0..100.0
      */
    def black: Double = js.native
    def black_=(b: Double): Unit = js.native
    
    /**
      * The cyan color value, as percentage.
      * @default
      * @range 0.0..100.0
      */
    def cyan: Double = js.native
    def cyan_=(c: Double): Unit = js.native
    
    /**
      * The magenta color value, as percentage.
      * @default
      * @range 0.0..100.0
      */
    def magenta: Double = js.native
    def magenta_=(m: Double): Unit = js.native
    
    def typename: String = js.native
    
    /**
      * The yellow color value, as percentage.
      * @default
      * @range 0.0..100.0
      */
    def yellow: Double = js.native
    def yellow_=(y: Double): Unit = js.native
  }
  
  @JSImport("photoshop/dom/objects/Colors", "GrayColor")
  @js.native
  open class GrayColor () extends StObject {
    
    /**
      * The gray value.
      *
      * @default 0
      * @range 0..100
      */
    def gray: Double = js.native
    def gray_=(g: Double): Unit = js.native
    
    def typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/Colors", "HSBColor")
  @js.native
  open class HSBColor () extends StObject {
    
    /**
      * The brightness value.
      *
      * @default 100
      * @range 0..100
      */
    def brightness: Double = js.native
    def brightness_=(b: Double): Unit = js.native
    
    /**
      * The hue value.
      *
      * @default 360
      * @range 0..360
      */
    def hue: Double = js.native
    def hue_=(h: Double): Unit = js.native
    
    /**
      * The saturation value.
      *
      * @default 0
      * @range 0..100
      */
    def saturation: Double = js.native
    def saturation_=(s: Double): Unit = js.native
    
    def typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/Colors", "LabColor")
  @js.native
  open class LabColor () extends StObject {
    
    /**
      * The a-value.
      *
      * @default 0
      * @range -128..127
      */
    def a: Double = js.native
    def a_=(a: Double): Unit = js.native
    
    /**
      * The b-value.
      *
      * @default 0
      * @range -128..127
      */
    def b: Double = js.native
    def b_=(b: Double): Unit = js.native
    
    /**
      * The L-value.
      *
      * @default 100
      * @range 0..100
      */
    def l: Double = js.native
    def l_=(l: Double): Unit = js.native
    
    def typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/Colors", "NoColor")
  @js.native
  open class NoColor () extends StObject {
    
    def typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/Colors", "RGBColor")
  @js.native
  open class RGBColor () extends StObject {
    
    /**
      * The blue color value.
      *
      * @default 255
      * @range 0..255
      */
    def blue: Double = js.native
    def blue_=(b: Double): Unit = js.native
    
    /**
      * The green color value.
      *
      * @default 255
      * @range 0..255
      */
    def green: Double = js.native
    def green_=(g: Double): Unit = js.native
    
    /**
      * The hexadecimal representation of the color in uppercase.
      */
    def hexValue: String = js.native
    def hexValue_=(value: String): Unit = js.native
    
    /**
      * The red color value.
      *
      * @default 255
      * @range 0..255
      */
    def red: Double = js.native
    def red_=(r: Double): Unit = js.native
    
    def typename: String = js.native
  }
}
