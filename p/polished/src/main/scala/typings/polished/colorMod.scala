package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  trait ContrastScores extends StObject {
    
    var AA: Boolean
    
    var AAA: Boolean
    
    var AAALarge: Boolean
    
    var AALarge: Boolean
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
  
  trait HslColor extends StObject {
    
    var hue: Double
    
    var lightness: Double
    
    var saturation: Double
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
  
  trait HslaColor extends StObject {
    
    var alpha: Double
    
    var hue: Double
    
    var lightness: Double
    
    var saturation: Double
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
  
  trait RgbColor extends StObject {
    
    var blue: Double
    
    var green: Double
    
    var red: Double
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
  
  trait RgbaColor extends StObject {
    
    var alpha: Double
    
    var blue: Double
    
    var green: Double
    
    var red: Double
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
