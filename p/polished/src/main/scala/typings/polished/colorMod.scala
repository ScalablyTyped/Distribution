package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @js.native
  trait ContrastScores extends StObject {
    
    var AA: Boolean = js.native
    
    var AAA: Boolean = js.native
    
    var AAALarge: Boolean = js.native
    
    var AALarge: Boolean = js.native
  }
  object ContrastScores {
    
    @scala.inline
    def apply(AA: Boolean, AAA: Boolean, AAALarge: Boolean, AALarge: Boolean): ContrastScores = {
      val __obj = js.Dynamic.literal(AA = AA.asInstanceOf[js.Any], AAA = AAA.asInstanceOf[js.Any], AAALarge = AAALarge.asInstanceOf[js.Any], AALarge = AALarge.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContrastScores]
    }
    
    @scala.inline
    implicit class ContrastScoresMutableBuilder[Self <: ContrastScores] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAA(value: Boolean): Self = StObject.set(x, "AA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAAA(value: Boolean): Self = StObject.set(x, "AAA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAAALarge(value: Boolean): Self = StObject.set(x, "AAALarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAALarge(value: Boolean): Self = StObject.set(x, "AALarge", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HslColor extends StObject {
    
    var hue: Double = js.native
    
    var lightness: Double = js.native
    
    var saturation: Double = js.native
  }
  object HslColor {
    
    @scala.inline
    def apply(hue: Double, lightness: Double, saturation: Double): HslColor = {
      val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
      __obj.asInstanceOf[HslColor]
    }
    
    @scala.inline
    implicit class HslColorMutableBuilder[Self <: HslColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightness(value: Double): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HslaColor extends StObject {
    
    var alpha: Double = js.native
    
    var hue: Double = js.native
    
    var lightness: Double = js.native
    
    var saturation: Double = js.native
  }
  object HslaColor {
    
    @scala.inline
    def apply(alpha: Double, hue: Double, lightness: Double, saturation: Double): HslaColor = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
      __obj.asInstanceOf[HslaColor]
    }
    
    @scala.inline
    implicit class HslaColorMutableBuilder[Self <: HslaColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightness(value: Double): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RgbColor extends StObject {
    
    var blue: Double = js.native
    
    var green: Double = js.native
    
    var red: Double = js.native
  }
  object RgbColor {
    
    @scala.inline
    def apply(blue: Double, green: Double, red: Double): RgbColor = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[RgbColor]
    }
    
    @scala.inline
    implicit class RgbColorMutableBuilder[Self <: RgbColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RgbaColor extends StObject {
    
    var alpha: Double = js.native
    
    var blue: Double = js.native
    
    var green: Double = js.native
    
    var red: Double = js.native
  }
  object RgbaColor {
    
    @scala.inline
    def apply(alpha: Double, blue: Double, green: Double, red: Double): RgbaColor = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[RgbaColor]
    }
    
    @scala.inline
    implicit class RgbaColorMutableBuilder[Self <: RgbaColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
}
