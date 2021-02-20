package typings.photonui.photonui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -----------------------------------
@js.native
trait Color extends Base {
  
  var alpha: Double = js.native
  
  var blue: Double = js.native
  
  var brightness: Double = js.native
  
  def getRGB(): js.Array[Double] = js.native
  
  def getRGBA(): js.Array[Double] = js.native
  
  var green: Double = js.native
  
  var hexString: String = js.native
  
  var hue: Double = js.native
  
  // readonly
  var red: Double = js.native
  
  var rgbString: String = js.native
  
  // readonly
  var rgbaString: String = js.native
  
  var saturation: Double = js.native
  
  def setHSB(hue: Double, saturation: Double, brightness: Double): Unit = js.native
  
  def setRGB(red: Double, green: Double, blue: Double): Unit = js.native
  
  def setRGBA(red: Double, green: Double, blue: Double, alpha: Double): Unit = js.native
}
object Color {
  
  @scala.inline
  def apply(
    alpha: Double,
    blue: Double,
    brightness: Double,
    destroy: () => Unit,
    getRGB: () => js.Array[Double],
    getRGBA: () => js.Array[Double],
    green: Double,
    hexString: String,
    hue: Double,
    red: Double,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    rgbString: String,
    rgbaString: String,
    saturation: Double,
    setHSB: (Double, Double, Double) => Unit,
    setRGB: (Double, Double, Double) => Unit,
    setRGBA: (Double, Double, Double, Double) => Unit
  ): Color = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getRGB = js.Any.fromFunction0(getRGB), getRGBA = js.Any.fromFunction0(getRGBA), green = green.asInstanceOf[js.Any], hexString = hexString.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), rgbString = rgbString.asInstanceOf[js.Any], rgbaString = rgbaString.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], setHSB = js.Any.fromFunction3(setHSB), setRGB = js.Any.fromFunction3(setRGB), setRGBA = js.Any.fromFunction4(setRGBA))
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRGB(value: () => js.Array[Double]): Self = StObject.set(x, "getRGB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRGBA(value: () => js.Array[Double]): Self = StObject.set(x, "getRGBA", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexString(value: String): Self = StObject.set(x, "hexString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgbString(value: String): Self = StObject.set(x, "rgbString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgbaString(value: String): Self = StObject.set(x, "rgbaString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHSB(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setHSB", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetRGB(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setRGB", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetRGBA(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setRGBA", js.Any.fromFunction4(value))
  }
}
