package typings.nodejsCaptcha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates Captcha in base64 format.
    *
    * @param options List of options, all of which are optional.
    * @return A captcha object.
    *
    * @example
    * import captcha = require("nodejs-captcha");
    *
    * // Create new Captcha
    * const newCaptcha = captcha();
    *
    * // Value of the captcha
    * const value = newCaptcha.value
    *
    * // Image in base64
    * const imageBase64 = newCaptcha.image;
    *
    * // Width of the image
    * const width = newCaptcha.width;
    *
    * // Height of the image
    * const height = newCaptcha.height;
    */
  inline def apply(): Captcha = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Captcha]
  inline def apply(options: Options): Captcha = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Captcha]
  
  @JSImport("nodejs-captcha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Captcha extends StObject {
    
    /**
      * The height of the captcha.
      */
    var height: Double
    
    /**
      * The image data of the captcha as a data URL.
      *
      * **Base64-encoded data URL** (contains `data:image/png;base64`)
      */
    var image: String
    
    /**
      * The text value encoded on the captcha.
      */
    var value: String
    
    /**
      * The width of the captcha.
      */
    var width: Double
  }
  object Captcha {
    
    inline def apply(height: Double, image: String, value: String, width: Double): Captcha = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Captcha]
    }
    
    extension [Self <: Captcha](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The character set to use for the captcha.
      * @default {'1234567890abcdefghijklmnoprstuvyz'.split('')}
      */
    var charset: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The height of the captcha.
      * @default 100
      * @throws {Error} If the height is less than 50.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The length of the captcha.
      * @default 6
      * @throws {Error} If the length is less than 1.
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of noise circles to add to the captcha.
      * @default {10-25} Randomly generated
      */
    var numberOfCircles: js.UndefOr[Double] = js.undefined
    
    /**
      * The value of the text to display on the captcha.
      * @throws {Error} If the length of the value is different than the length.
      */
    var value: js.UndefOr[String] = js.undefined
    
    /**
      * The width of the captcha.
      * @default 200
      * @throws {Error} If the width is less than 40.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCharset(value: js.Array[String]): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setCharsetVarargs(value: String*): Self = StObject.set(x, "charset", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setNumberOfCircles(value: Double): Self = StObject.set(x, "numberOfCircles", value.asInstanceOf[js.Any])
      
      inline def setNumberOfCirclesUndefined: Self = StObject.set(x, "numberOfCircles", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
